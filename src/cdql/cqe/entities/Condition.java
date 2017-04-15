package cdql.cqe.entities;

import cdql.cqe.CDQLParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Created by ali on 14/02/2017.
 */
public class Condition {

    private static Map<String, Integer> ops = new HashMap<String, Integer>() {
        {
            put("=", 0);
            put("<", 0);
            put("<=", 0);
            put(">", 0);
            put(">=", 0);
            put("and", 2);
            put("or", 2);
            put("not", 1);
        }
    };

    private Queue<String> RPNCondition;
    private HashMap<String, List<String>> dependency;

    public Condition(ParseTree infix) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> operators = new Stack<>();
        dependency = new HashMap<>();
        traversTree(infix, queue, operators);
        while (!operators.isEmpty()) {
            queue.add(operators.pop());
        }
        RPNCondition = queue;

    }

    private void traversTree(ParseTree tree, Queue<String> queue, Stack<String> stack) {

        if (tree.getChildCount() == 0) {
            String token = tree.getText();
            System.out.println(token);
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    queue.add(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && isHigerPrec(token, stack.peek())) {
                    queue.add(stack.pop());
                }
                stack.push(token);
            }
            return;
        } else if (tree.getClass().equals(CDQLParser.OperandContext.class)) {
            addDependentEntities(tree);
            System.out.println(tree.getText());
            queue.add(tree.getText());
            return;
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            traversTree(tree.getChild(i), queue, stack);
        }
    }

    private void addDependentEntities(ParseTree op) {
        String text = op.getText();
        int indexOf = text.indexOf(".");
        if (indexOf == -1) {
            return;
        }
        if (text.contains("(")) {
            int indexOf1 = text.indexOf("(");
            text = text.substring(indexOf1 + 1);
            text=text.replace(")", "");
            String[] split = text.split(",");
            for (String newToken : split) {
                int indexOf3 = newToken.indexOf(".");
                if (indexOf3 == -1) {
                    continue;
                }
                String dependentEntity = newToken.substring(0, indexOf3);
                String attribute = newToken.substring(indexOf3 + 1);
                if (dependency.containsKey(dependentEntity)) {
                    dependency.get(dependentEntity).add(attribute);
                } else {
                    List<String> attrs = new ArrayList<>();
                    attrs.add(attribute);
                    dependency.put(dependentEntity, attrs);
                }
            }
        } else {
            String dependentEntity = text.substring(0, indexOf);
            String attribute = text.substring(indexOf + 1);
            if (dependency.containsKey(dependentEntity)) {
                dependency.get(dependentEntity).add(attribute);
            } else {
                List<String> attrs = new ArrayList<>();
                attrs.add(attribute);
                dependency.put(dependentEntity, attrs);
            }
        }
    }

    private boolean isHigerPrec(String op, String sub) {
        return (ops.containsKey(sub) && ops.get(sub) < ops.get(op));
    }

    public Queue<String> getRPNCondition() {
        return RPNCondition;
    }

    public void setRPNCondition(Queue<String> RPNCondition) {
        this.RPNCondition = RPNCondition;
    }

    public HashMap<String, List<String>> getDependency() {
        return dependency;
    }

    public void setDependency(HashMap<String, List<String>> dependency) {
        this.dependency = dependency;
    }

    public String toJPAWhereClause() {
        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (String token : RPNCondition) {
            if (ops.containsKey(token)) {
                if (token.equals("not")) {
                    res.append("(");
                    res.append(token);
                    res.append(stack.pop());
                    res.append(")");
                } else {
                    res.append("(");
                    String op2 = stack.pop();
                    res.append(stack.pop());
                    res.append(token);
                    res.append(op2);
                    res.append(")");
                }
            } else {
                stack.push(token);
            }
        }
        return res.toString();
    }
}
