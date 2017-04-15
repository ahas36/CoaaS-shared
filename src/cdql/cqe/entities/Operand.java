package cdql.cqe.entities;

/**
 * Created by ali on 13/02/2017.
 */
public class Operand {
    private OperandType type;
    private String value;

    public OperandType getType() {
        return type;
    }

    public void setType(OperandType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public Operand(){};
    public Operand(OperandType type, String value) {
        this.type = type;
        this.value = value;
    }
}
