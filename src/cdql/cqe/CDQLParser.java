package cdql.cqe;

// Generated from CDQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CDQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BETWEEN=8, RELATION_TYPE=9, 
		WS=10, WHEN=11, LCURLY=12, RCURLY=13, PUSH=14, PULL=15, WHERE=16, DEFINE=17, 
		COMMA=18, LPAREN=19, RPAREN=20, DOT=21, COLON=22, AS=23, INT=24, PERSON=25, 
		Organization=26, Location=27, Event=28, Device=29, LBRACK=30, RBRACK=31, 
		CONTEXT_ENTITY=32, CONTEXT_FUNCTION=33, TO=34, ENTITY=35, IS_FROM=36, 
		IS_ON=37, RELATIONAL_FUNCTION=38, SITUATIONS=39, SITUATION=40, SITUATIONAL_FUNCTION=41, 
		AGGREGATION_FUNCTION=42, LIFETIME=43, DATE=44, EVERY=45, UNTIL=46, EQ=47, 
		LTH=48, GTH=49, NOT_EQ=50, NOT=51, LET=52, GET=53, AND=54, OR=55, XOR=56, 
		IS=57, NULL=58, ID=59, DIGITS=60;
	public static final int
		RULE_cdql = 0, RULE_pull_clause = 1, RULE_select_clause = 2, RULE_select_context_attribute = 3, 
		RULE_context_attribute = 4, RULE_entity_title = 5, RULE_attribute_title = 6, 
		RULE_function_call = 7, RULE_function_title = 8, RULE_operand = 9, RULE_context_value = 10, 
		RULE_push_clause = 11, RULE_subscriber_clause = 12, RULE_context_requester = 13, 
		RULE_when_clause = 14, RULE_occurrence_clause = 15, RULE_condition_clause = 16, 
		RULE_condition_and = 17, RULE_condition_not = 18, RULE_constraint_clause = 19, 
		RULE_left_element = 20, RULE_right_element = 21, RULE_target_element = 22, 
		RULE_relational_op = 23, RULE_between_op = 24, RULE_is_or_is_not = 25, 
		RULE_define_clause = 26, RULE_context_entity = 27, RULE_entity_id = 28, 
		RULE_context_function = 29, RULE_aggregation_function = 30, RULE_relational_function = 31, 
		RULE_situational_function = 32, RULE_function_id = 33, RULE_situation = 34, 
		RULE_situation_id = 35, RULE_range = 36, RULE_entitiy_type = 37, RULE_url = 38, 
		RULE_host = 39, RULE_hostname = 40, RULE_hostnumber = 41, RULE_port = 42, 
		RULE_path = 43, RULE_search = 44, RULE_searchparameter = 45, RULE_user = 46, 
		RULE_login = 47, RULE_password = 48;
	public static final String[] ruleNames = {
		"cdql", "pull_clause", "select_clause", "select_context_attribute", "context_attribute", 
		"entity_title", "attribute_title", "function_call", "function_title", 
		"operand", "context_value", "push_clause", "subscriber_clause", "context_requester", 
		"when_clause", "occurrence_clause", "condition_clause", "condition_and", 
		"condition_not", "constraint_clause", "left_element", "right_element", 
		"target_element", "relational_op", "between_op", "is_or_is_not", "define_clause", 
		"context_entity", "entity_id", "context_function", "aggregation_function", 
		"relational_function", "situational_function", "function_id", "situation", 
		"situation_id", "range", "entitiy_type", "url", "host", "hostname", "hostnumber", 
		"port", "path", "search", "searchparameter", "user", "login", "password"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'http://'", "'https://'", "'/'", "'?'", "'&'", "'@'", "'between'", 
		null, null, "'when'", "'{'", "'}'", "'push'", "'pull'", "'where'", "'define'", 
		"','", "'('", "')'", "'.'", "':'", "'as'", null, "'$person'", "'$organization'", 
		"'$loation'", "'$event'", "'$device'", "'['", "']'", "'context entities'", 
		"'context functions'", "'..'", "'entity'", "'is from'", "'is on'", "'rFunction'", 
		"'situations'", "'situation'", "'sFunction'", "'aFunction'", "'lifetime'", 
		"'date'", "'every'", "'until'", "'='", "'<'", "'>'", "'!='", "'not'", 
		"'<='", "'>='", null, null, "'xor'", "'is'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BETWEEN", "RELATION_TYPE", 
		"WS", "WHEN", "LCURLY", "RCURLY", "PUSH", "PULL", "WHERE", "DEFINE", "COMMA", 
		"LPAREN", "RPAREN", "DOT", "COLON", "AS", "INT", "PERSON", "Organization", 
		"Location", "Event", "Device", "LBRACK", "RBRACK", "CONTEXT_ENTITY", "CONTEXT_FUNCTION", 
		"TO", "ENTITY", "IS_FROM", "IS_ON", "RELATIONAL_FUNCTION", "SITUATIONS", 
		"SITUATION", "SITUATIONAL_FUNCTION", "AGGREGATION_FUNCTION", "LIFETIME", 
		"DATE", "EVERY", "UNTIL", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", 
		"GET", "AND", "OR", "XOR", "IS", "NULL", "ID", "DIGITS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CDQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CdqlContext extends ParserRuleContext {
		public Define_clauseContext define_clause() {
			return getRuleContext(Define_clauseContext.class,0);
		}
		public Pull_clauseContext pull_clause() {
			return getRuleContext(Pull_clauseContext.class,0);
		}
		public Push_clauseContext push_clause() {
			return getRuleContext(Push_clauseContext.class,0);
		}
		public When_clauseContext when_clause() {
			return getRuleContext(When_clauseContext.class,0);
		}
		public CdqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdql; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitCdql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdqlContext cdql() throws RecognitionException {
		CdqlContext _localctx = new CdqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cdql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PULL:
				{
				setState(98);
				pull_clause();
				}
				break;
			case PUSH:
				{
				setState(99);
				push_clause();
				setState(100);
				when_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			define_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pull_clauseContext extends ParserRuleContext {
		public TerminalNode PULL() { return getToken(CDQLParser.PULL, 0); }
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public Pull_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitPull_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_clauseContext pull_clause() throws RecognitionException {
		Pull_clauseContext _localctx = new Pull_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pull_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PULL);
			setState(107);
			select_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public List<Select_context_attributeContext> select_context_attribute() {
			return getRuleContexts(Select_context_attributeContext.class);
		}
		public Select_context_attributeContext select_context_attribute(int i) {
			return getRuleContext(Select_context_attributeContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LPAREN);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(110);
				select_context_attribute();
				}
				break;
			case 2:
				{
				setState(111);
				function_call();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(115);
					select_context_attribute();
					}
					break;
				case 2:
					{
					setState(116);
					function_call();
					}
					break;
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_context_attributeContext extends ParserRuleContext {
		public Context_attributeContext context_attribute() {
			return getRuleContext(Context_attributeContext.class,0);
		}
		public Select_context_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_context_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSelect_context_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_context_attributeContext select_context_attribute() throws RecognitionException {
		Select_context_attributeContext _localctx = new Select_context_attributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_context_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			context_attribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_attributeContext extends ParserRuleContext {
		public Entity_titleContext entity_title() {
			return getRuleContext(Entity_titleContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CDQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CDQLParser.DOT, i);
		}
		public List<Attribute_titleContext> attribute_title() {
			return getRuleContexts(Attribute_titleContext.class);
		}
		public Attribute_titleContext attribute_title(int i) {
			return getRuleContext(Attribute_titleContext.class,i);
		}
		public Context_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitContext_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_attributeContext context_attribute() throws RecognitionException {
		Context_attributeContext _localctx = new Context_attributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_context_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			entity_title();
			setState(129);
			match(DOT);
			setState(130);
			attribute_title();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(131);
				match(DOT);
				setState(132);
				attribute_title();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_titleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Entity_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitEntity_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_titleContext entity_title() throws RecognitionException {
		Entity_titleContext _localctx = new Entity_titleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entity_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_titleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Attribute_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitAttribute_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_titleContext attribute_title() throws RecognitionException {
		Attribute_titleContext _localctx = new Attribute_titleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_titleContext function_title() {
			return getRuleContext(Function_titleContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(CDQLParser.AS, 0); }
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			function_title();
			setState(143);
			match(LPAREN);
			setState(144);
			operand();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				operand();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RPAREN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(153);
				match(AS);
				setState(154);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_titleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Function_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitFunction_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_titleContext function_title() throws RecognitionException {
		Function_titleContext _localctx = new Function_titleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public Entity_titleContext entity_title() {
			return getRuleContext(Entity_titleContext.class,0);
		}
		public Context_attributeContext context_attribute() {
			return getRuleContext(Context_attributeContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Context_valueContext context_value() {
			return getRuleContext(Context_valueContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operand);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				entity_title();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				context_attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				context_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CDQLParser.INT, 0); }
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Context_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitContext_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_valueContext context_value() throws RecognitionException {
		Context_valueContext _localctx = new Context_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_context_value);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(INT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__0);
				setState(167);
				match(ID);
				setState(168);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Push_clauseContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(CDQLParser.PUSH, 0); }
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public Subscriber_clauseContext subscriber_clause() {
			return getRuleContext(Subscriber_clauseContext.class,0);
		}
		public Push_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitPush_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_clauseContext push_clause() throws RecognitionException {
		Push_clauseContext _localctx = new Push_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_push_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PUSH);
			setState(172);
			select_clause();
			setState(173);
			subscriber_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscriber_clauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(CDQLParser.TO, 0); }
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public Context_requesterContext context_requester() {
			return getRuleContext(Context_requesterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public Subscriber_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriber_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSubscriber_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscriber_clauseContext subscriber_clause() throws RecognitionException {
		Subscriber_clauseContext _localctx = new Subscriber_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subscriber_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(TO);
			setState(176);
			match(LPAREN);
			setState(177);
			context_requester();
			setState(178);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_requesterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Context_requesterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_requester; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitContext_requester(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_requesterContext context_requester() throws RecognitionException {
		Context_requesterContext _localctx = new Context_requesterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_context_requester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CDQLParser.WHEN, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(CDQLParser.EVERY, 0); }
		public TerminalNode INT() { return getToken(CDQLParser.INT, 0); }
		public TerminalNode UNTIL() { return getToken(CDQLParser.UNTIL, 0); }
		public Occurrence_clauseContext occurrence_clause() {
			return getRuleContext(Occurrence_clauseContext.class,0);
		}
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitWhen_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_when_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(WHEN);
			setState(183);
			condition_clause();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(184);
				match(EVERY);
				setState(185);
				match(INT);
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(188);
				match(UNTIL);
				setState(189);
				occurrence_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Occurrence_clauseContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(CDQLParser.DATE, 0); }
		public TerminalNode INT() { return getToken(CDQLParser.INT, 0); }
		public TerminalNode LIFETIME() { return getToken(CDQLParser.LIFETIME, 0); }
		public Occurrence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_occurrence_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitOccurrence_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Occurrence_clauseContext occurrence_clause() throws RecognitionException {
		Occurrence_clauseContext _localctx = new Occurrence_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_occurrence_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LIFETIME) | (1L << DATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_clauseContext extends ParserRuleContext {
		public List<Condition_andContext> condition_and() {
			return getRuleContexts(Condition_andContext.class);
		}
		public Condition_andContext condition_and(int i) {
			return getRuleContext(Condition_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CDQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CDQLParser.OR, i);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(194);
			condition_and();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(195);
				match(OR);
				setState(196);
				condition_and();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_andContext extends ParserRuleContext {
		public List<Condition_notContext> condition_not() {
			return getRuleContexts(Condition_notContext.class);
		}
		public Condition_notContext condition_not(int i) {
			return getRuleContext(Condition_notContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CDQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CDQLParser.AND, i);
		}
		public Condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitCondition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_andContext condition_and() throws RecognitionException {
		Condition_andContext _localctx = new Condition_andContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			condition_not();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(203);
				match(AND);
				setState(204);
				condition_not();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_notContext extends ParserRuleContext {
		public Constraint_clauseContext constraint_clause() {
			return getRuleContext(Constraint_clauseContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CDQLParser.NOT, 0); }
		public Condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitCondition_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_notContext condition_not() throws RecognitionException {
		Condition_notContext _localctx = new Condition_notContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(210);
				match(NOT);
				}
			}

			setState(213);
			constraint_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_clauseContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(CDQLParser.AND, 0); }
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(CDQLParser.NULL, 0); }
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public Constraint_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitConstraint_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraint_clauseContext constraint_clause() throws RecognitionException {
		Constraint_clauseContext _localctx = new Constraint_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraint_clause);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				left_element();
				setState(216);
				relational_op();
				setState(217);
				right_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				target_element();
				setState(220);
				between_op();
				setState(221);
				left_element();
				setState(222);
				match(AND);
				setState(223);
				right_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				target_element();
				setState(226);
				is_or_is_not();
				setState(227);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(LPAREN);
				setState(230);
				condition_clause();
				setState(231);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_elementContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_elementContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_elementContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitTarget_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public List<TerminalNode> EQ() { return getTokens(CDQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CDQLParser.EQ, i);
		}
		public TerminalNode LTH() { return getToken(CDQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(CDQLParser.GTH, 0); }
		public TerminalNode LET() { return getToken(CDQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(CDQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << LET) | (1L << GET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(CDQLParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitBetween_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(BETWEEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(CDQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CDQLParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_is_or_is_not);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(IS);
				setState(247);
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_clauseContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(CDQLParser.DEFINE, 0); }
		public TerminalNode CONTEXT_ENTITY() { return getToken(CDQLParser.CONTEXT_ENTITY, 0); }
		public List<Context_entityContext> context_entity() {
			return getRuleContexts(Context_entityContext.class);
		}
		public Context_entityContext context_entity(int i) {
			return getRuleContext(Context_entityContext.class,i);
		}
		public TerminalNode AND() { return getToken(CDQLParser.AND, 0); }
		public TerminalNode CONTEXT_FUNCTION() { return getToken(CDQLParser.CONTEXT_FUNCTION, 0); }
		public List<Context_functionContext> context_function() {
			return getRuleContexts(Context_functionContext.class);
		}
		public Context_functionContext context_function(int i) {
			return getRuleContext(Context_functionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public Define_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitDefine_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_clauseContext define_clause() throws RecognitionException {
		Define_clauseContext _localctx = new Define_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_define_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DEFINE);
			setState(251);
			match(CONTEXT_ENTITY);
			{
			setState(252);
			context_entity();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				context_entity();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(260);
				match(AND);
				setState(261);
				match(CONTEXT_FUNCTION);
				setState(262);
				context_function();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					context_function();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_entityContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public Entity_idContext entity_id() {
			return getRuleContext(Entity_idContext.class,0);
		}
		public TerminalNode IS_FROM() { return getToken(CDQLParser.IS_FROM, 0); }
		public Entitiy_typeContext entitiy_type() {
			return getRuleContext(Entitiy_typeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CDQLParser.WHERE, 0); }
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Context_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_entity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitContext_entity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_entityContext context_entity() throws RecognitionException {
		Context_entityContext _localctx = new Context_entityContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_context_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LPAREN);
			setState(273);
			entity_id();
			setState(274);
			match(IS_FROM);
			setState(275);
			entitiy_type();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(276);
				match(WHERE);
				setState(277);
				condition_clause();
				}
			}

			setState(280);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Entity_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitEntity_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_idContext entity_id() throws RecognitionException {
		Entity_idContext _localctx = new Entity_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_entity_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_functionContext extends ParserRuleContext {
		public Aggregation_functionContext aggregation_function() {
			return getRuleContext(Aggregation_functionContext.class,0);
		}
		public Relational_functionContext relational_function() {
			return getRuleContext(Relational_functionContext.class,0);
		}
		public Situational_functionContext situational_function() {
			return getRuleContext(Situational_functionContext.class,0);
		}
		public Context_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitContext_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_functionContext context_function() throws RecognitionException {
		Context_functionContext _localctx = new Context_functionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_context_function);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGGREGATION_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				aggregation_function();
				}
				break;
			case RELATIONAL_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				relational_function();
				}
				break;
			case SITUATIONAL_FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				situational_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_functionContext extends ParserRuleContext {
		public TerminalNode AGGREGATION_FUNCTION() { return getToken(CDQLParser.AGGREGATION_FUNCTION, 0); }
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public TerminalNode IS_FROM() { return getToken(CDQLParser.IS_FROM, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public Aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitAggregation_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_functionContext aggregation_function() throws RecognitionException {
		Aggregation_functionContext _localctx = new Aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aggregation_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(AGGREGATION_FUNCTION);
			setState(290);
			function_id();
			setState(291);
			match(IS_FROM);
			setState(292);
			url();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_functionContext extends ParserRuleContext {
		public TerminalNode RELATIONAL_FUNCTION() { return getToken(CDQLParser.RELATIONAL_FUNCTION, 0); }
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public TerminalNode IS() { return getToken(CDQLParser.IS, 0); }
		public TerminalNode RELATION_TYPE() { return getToken(CDQLParser.RELATION_TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public List<Entitiy_typeContext> entitiy_type() {
			return getRuleContexts(Entitiy_typeContext.class);
		}
		public Entitiy_typeContext entitiy_type(int i) {
			return getRuleContext(Entitiy_typeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public Relational_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitRelational_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_functionContext relational_function() throws RecognitionException {
		Relational_functionContext _localctx = new Relational_functionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relational_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RELATIONAL_FUNCTION);
			setState(295);
			function_id();
			setState(296);
			match(IS);
			setState(297);
			match(RELATION_TYPE);
			setState(298);
			match(LPAREN);
			setState(299);
			entitiy_type();
			setState(302); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				entitiy_type();
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(306);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Situational_functionContext extends ParserRuleContext {
		public TerminalNode SITUATIONAL_FUNCTION() { return getToken(CDQLParser.SITUATIONAL_FUNCTION, 0); }
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public TerminalNode IS_ON() { return getToken(CDQLParser.IS_ON, 0); }
		public Entitiy_typeContext entitiy_type() {
			return getRuleContext(Entitiy_typeContext.class,0);
		}
		public TerminalNode SITUATIONS() { return getToken(CDQLParser.SITUATIONS, 0); }
		public List<SituationContext> situation() {
			return getRuleContexts(SituationContext.class);
		}
		public SituationContext situation(int i) {
			return getRuleContext(SituationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public Situational_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_situational_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSituational_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Situational_functionContext situational_function() throws RecognitionException {
		Situational_functionContext _localctx = new Situational_functionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_situational_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SITUATIONAL_FUNCTION);
			setState(309);
			function_id();
			setState(310);
			match(IS_ON);
			setState(311);
			entitiy_type();
			setState(312);
			match(SITUATIONS);
			setState(313);
			situation();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(COMMA);
					setState(315);
					situation();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SituationContext extends ParserRuleContext {
		public TerminalNode SITUATION() { return getToken(CDQLParser.SITUATION, 0); }
		public Situation_idContext situation_id() {
			return getRuleContext(Situation_idContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CDQLParser.LPAREN, 0); }
		public List<Context_attributeContext> context_attribute() {
			return getRuleContexts(Context_attributeContext.class);
		}
		public Context_attributeContext context_attribute(int i) {
			return getRuleContext(Context_attributeContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CDQLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CDQLParser.COLON, i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CDQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public SituationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_situation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSituation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SituationContext situation() throws RecognitionException {
		SituationContext _localctx = new SituationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_situation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SITUATION);
			setState(324);
			situation_id();
			setState(325);
			match(LPAREN);
			setState(326);
			context_attribute();
			setState(327);
			match(COLON);
			setState(328);
			range();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				context_attribute();
				setState(331);
				match(COLON);
				setState(332);
				range();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Situation_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public Situation_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_situation_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSituation_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Situation_idContext situation_id() throws RecognitionException {
		Situation_idContext _localctx = new Situation_idContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_situation_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CDQLParser.LBRACK, 0); }
		public List<TerminalNode> INT() { return getTokens(CDQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CDQLParser.INT, i);
		}
		public TerminalNode TO() { return getToken(CDQLParser.TO, 0); }
		public TerminalNode RBRACK() { return getToken(CDQLParser.RBRACK, 0); }
		public TerminalNode LCURLY() { return getToken(CDQLParser.LCURLY, 0); }
		public List<Context_valueContext> context_value() {
			return getRuleContexts(Context_valueContext.class);
		}
		public Context_valueContext context_value(int i) {
			return getRuleContext(Context_valueContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(CDQLParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CDQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDQLParser.COMMA, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_range);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(LBRACK);
				setState(344);
				match(INT);
				setState(345);
				match(TO);
				setState(346);
				match(INT);
				setState(347);
				match(RBRACK);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(LCURLY);
				setState(349);
				context_value();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					context_value();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				match(RCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entitiy_typeContext extends ParserRuleContext {
		public TerminalNode PERSON() { return getToken(CDQLParser.PERSON, 0); }
		public TerminalNode Organization() { return getToken(CDQLParser.Organization, 0); }
		public TerminalNode Location() { return getToken(CDQLParser.Location, 0); }
		public TerminalNode Event() { return getToken(CDQLParser.Event, 0); }
		public TerminalNode Device() { return getToken(CDQLParser.Device, 0); }
		public Entitiy_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entitiy_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitEntitiy_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entitiy_typeContext entitiy_type() throws RecognitionException {
		Entitiy_typeContext _localctx = new Entitiy_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_entitiy_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSON) | (1L << Organization) | (1L << Location) | (1L << Event) | (1L << Device))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(366);
				login();
				}
				break;
			}
			setState(369);
			host();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(370);
				match(COLON);
				setState(371);
				port();
				}
			}

			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(374);
				match(T__3);
				setState(375);
				path();
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(378);
				match(T__4);
				setState(379);
				search();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public HostnumberContext hostnumber() {
			return getRuleContext(HostnumberContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_host);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				hostname();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				hostnumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostnameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CDQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CDQLParser.ID, i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ID);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(387);
				match(DOT);
				setState(388);
				match(ID);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostnumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(CDQLParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(CDQLParser.DIGITS, i);
		}
		public HostnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostnumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitHostnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnumberContext hostnumber() throws RecognitionException {
		HostnumberContext _localctx = new HostnumberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hostnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(DIGITS);
			setState(395);
			match(DOT);
			setState(396);
			match(DIGITS);
			setState(397);
			match(DOT);
			setState(398);
			match(DIGITS);
			setState(399);
			match(DOT);
			setState(400);
			match(DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CDQLParser.INT, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CDQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CDQLParser.ID, i);
		}
		public List<TerminalNode> LCURLY() { return getTokens(CDQLParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(CDQLParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(CDQLParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(CDQLParser.RCURLY, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(404);
				match(ID);
				}
				break;
			case LCURLY:
				{
				{
				setState(405);
				match(LCURLY);
				setState(406);
				match(ID);
				setState(407);
				match(RCURLY);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(410);
				match(T__3);
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(411);
					match(ID);
					}
					break;
				case LCURLY:
					{
					{
					setState(412);
					match(LCURLY);
					setState(413);
					match(ID);
					setState(414);
					match(RCURLY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchContext extends ParserRuleContext {
		public List<SearchparameterContext> searchparameter() {
			return getRuleContexts(SearchparameterContext.class);
		}
		public SearchparameterContext searchparameter(int i) {
			return getRuleContext(SearchparameterContext.class,i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			searchparameter();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(423);
				match(T__5);
				setState(424);
				searchparameter();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchparameterContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CDQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CDQLParser.ID, i);
		}
		public TerminalNode DIGITS() { return getToken(CDQLParser.DIGITS, 0); }
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitSearchparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ID);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(431);
				match(EQ);
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==DIGITS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoginContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			user();
			setState(438);
			match(COLON);
			setState(439);
			password();
			setState(440);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CDQLParser.ID, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ICDQLVisitor ) return ((ICDQLVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\5"+
		"\2i\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4s\n\4\3\4\3\4\3\4\5\4x\n\4"+
		"\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0088"+
		"\n\6\f\6\16\6\u008b\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0096"+
		"\n\t\f\t\16\t\u0099\13\t\3\t\3\t\3\t\5\t\u009e\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00bd\n\20"+
		"\3\20\3\20\5\20\u00c1\n\20\3\21\3\21\3\22\3\22\3\22\7\22\u00c8\n\22\f"+
		"\22\16\22\u00cb\13\22\3\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3"+
		"\13\23\3\24\5\24\u00d6\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ec"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\5\33\u00fb\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u010c\n\34\f\34\16\34\u010f\13\34"+
		"\5\34\u0111\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0119\n\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\5\37\u0122\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\6!\u0131\n!\r!\16!\u0132\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u013f\n\"\f\"\16\"\u0142\13\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u0151\n$\f$\16$\u0154\13$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u0163\n&\f&\16&\u0166\13&\3&\3&\5&\u016a\n&\3\'\3\'\3(\5"+
		"(\u016f\n(\3(\5(\u0172\n(\3(\3(\3(\5(\u0177\n(\3(\3(\5(\u017b\n(\3(\3"+
		"(\5(\u017f\n(\3)\3)\5)\u0183\n)\3*\3*\3*\7*\u0188\n*\f*\16*\u018b\13*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\5-\u019b\n-\3-\3-\3-\3-\3-"+
		"\5-\u01a2\n-\7-\u01a4\n-\f-\16-\u01a7\13-\3.\3.\3.\7.\u01ac\n.\f.\16."+
		"\u01af\13.\3/\3/\3/\5/\u01b4\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\7\4\2\32\32-.\4\2\61\63\66\67\3\2\33\37"+
		"\3\2\4\5\3\2=>\u01b8\2h\3\2\2\2\4l\3\2\2\2\6o\3\2\2\2\b\u0080\3\2\2\2"+
		"\n\u0082\3\2\2\2\f\u008c\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22"+
		"\u009f\3\2\2\2\24\u00a5\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00c2\3\2\2\2\"\u00c4\3\2"+
		"\2\2$\u00cc\3\2\2\2&\u00d5\3\2\2\2(\u00eb\3\2\2\2*\u00ed\3\2\2\2,\u00ef"+
		"\3\2\2\2.\u00f1\3\2\2\2\60\u00f3\3\2\2\2\62\u00f5\3\2\2\2\64\u00fa\3\2"+
		"\2\2\66\u00fc\3\2\2\28\u0112\3\2\2\2:\u011c\3\2\2\2<\u0121\3\2\2\2>\u0123"+
		"\3\2\2\2@\u0128\3\2\2\2B\u0136\3\2\2\2D\u0143\3\2\2\2F\u0145\3\2\2\2H"+
		"\u0157\3\2\2\2J\u0169\3\2\2\2L\u016b\3\2\2\2N\u016e\3\2\2\2P\u0182\3\2"+
		"\2\2R\u0184\3\2\2\2T\u018c\3\2\2\2V\u0194\3\2\2\2X\u019a\3\2\2\2Z\u01a8"+
		"\3\2\2\2\\\u01b0\3\2\2\2^\u01b5\3\2\2\2`\u01b7\3\2\2\2b\u01bc\3\2\2\2"+
		"di\5\4\3\2ef\5\30\r\2fg\5\36\20\2gi\3\2\2\2hd\3\2\2\2he\3\2\2\2ij\3\2"+
		"\2\2jk\5\66\34\2k\3\3\2\2\2lm\7\21\2\2mn\5\6\4\2n\5\3\2\2\2or\7\25\2\2"+
		"ps\5\b\5\2qs\5\20\t\2rp\3\2\2\2rq\3\2\2\2s{\3\2\2\2tw\7\24\2\2ux\5\b\5"+
		"\2vx\5\20\t\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\26\2\2\177\7\3\2\2\2\u0080\u0081"+
		"\5\n\6\2\u0081\t\3\2\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\27\2\2\u0084"+
		"\u0089\5\16\b\2\u0085\u0086\7\27\2\2\u0086\u0088\5\16\b\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\13\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7=\2\2\u008d\r\3\2\2\2\u008e"+
		"\u008f\7=\2\2\u008f\17\3\2\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\25\2"+
		"\2\u0092\u0097\5\24\13\2\u0093\u0094\7\24\2\2\u0094\u0096\5\24\13\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009d\7\26\2\2\u009b"+
		"\u009c\7\31\2\2\u009c\u009e\7=\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\21\3\2\2\2\u009f\u00a0\7=\2\2\u00a0\23\3\2\2\2\u00a1\u00a6"+
		"\5\f\7\2\u00a2\u00a6\5\n\6\2\u00a3\u00a6\5\20\t\2\u00a4\u00a6\5\26\f\2"+
		"\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00ac\7\32\2\2\u00a8\u00a9\7\3\2\2\u00a9"+
		"\u00aa\7=\2\2\u00aa\u00ac\7\3\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2"+
		"\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0"+
		"\5\32\16\2\u00b0\31\3\2\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\7\25\2\2\u00b3"+
		"\u00b4\5\34\17\2\u00b4\u00b5\7\26\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7="+
		"\2\2\u00b7\35\3\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00bc\5\"\22\2\u00ba\u00bb"+
		"\7/\2\2\u00bb\u00bd\7\32\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf\u00c1\5 \21\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00c9\5$\23\2\u00c5\u00c6\79\2\2\u00c6\u00c8\5$\23\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca#\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\5&\24\2\u00cd\u00ce"+
		"\78\2\2\u00ce\u00d0\5&\24\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d4\u00d6\7\65\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\5(\25\2\u00d8\'\3\2\2\2\u00d9\u00da\5*\26\2\u00da"+
		"\u00db\5\60\31\2\u00db\u00dc\5,\27\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\5"+
		".\30\2\u00de\u00df\5\62\32\2\u00df\u00e0\5*\26\2\u00e0\u00e1\78\2\2\u00e1"+
		"\u00e2\5,\27\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\5\64"+
		"\33\2\u00e5\u00e6\7<\2\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8"+
		"\u00e9\5\"\22\2\u00e9\u00ea\7\26\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00d9\3"+
		"\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec"+
		")\3\2\2\2\u00ed\u00ee\5\24\13\2\u00ee+\3\2\2\2\u00ef\u00f0\5\24\13\2\u00f0"+
		"-\3\2\2\2\u00f1\u00f2\5\24\13\2\u00f2/\3\2\2\2\u00f3\u00f4\t\3\2\2\u00f4"+
		"\61\3\2\2\2\u00f5\u00f6\7\n\2\2\u00f6\63\3\2\2\2\u00f7\u00fb\7;\2\2\u00f8"+
		"\u00f9\7;\2\2\u00f9\u00fb\7\65\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\65\3\2\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\7\"\2\2\u00fe\u0103"+
		"\58\35\2\u00ff\u0100\7\24\2\2\u0100\u0102\58\35\2\u0101\u00ff\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0110"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\78\2\2\u0107\u0108\7#\2\2\u0108"+
		"\u010d\5<\37\2\u0109\u010a\7\24\2\2\u010a\u010c\5<\37\2\u010b\u0109\3"+
		"\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\67\3\2\2\2\u0112\u0113\7\25\2\2\u0113\u0114\5:\36\2\u0114\u0115"+
		"\7&\2\2\u0115\u0118\5L\'\2\u0116\u0117\7\22\2\2\u0117\u0119\5\"\22\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\26"+
		"\2\2\u011b9\3\2\2\2\u011c\u011d\7=\2\2\u011d;\3\2\2\2\u011e\u0122\5> "+
		"\2\u011f\u0122\5@!\2\u0120\u0122\5B\"\2\u0121\u011e\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122=\3\2\2\2\u0123\u0124\7,\2\2\u0124\u0125"+
		"\5D#\2\u0125\u0126\7&\2\2\u0126\u0127\5N(\2\u0127?\3\2\2\2\u0128\u0129"+
		"\7(\2\2\u0129\u012a\5D#\2\u012a\u012b\7;\2\2\u012b\u012c\7\13\2\2\u012c"+
		"\u012d\7\25\2\2\u012d\u0130\5L\'\2\u012e\u012f\7\24\2\2\u012f\u0131\5"+
		"L\'\2\u0130\u012e\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\26\2\2\u0135A\3\2\2\2"+
		"\u0136\u0137\7+\2\2\u0137\u0138\5D#\2\u0138\u0139\7\'\2\2\u0139\u013a"+
		"\5L\'\2\u013a\u013b\7)\2\2\u013b\u0140\5F$\2\u013c\u013d\7\24\2\2\u013d"+
		"\u013f\5F$\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2"+
		"\2\u0140\u0141\3\2\2\2\u0141C\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7=\2\2\u0144E\3\2\2\2\u0145\u0146\7*\2\2\u0146\u0147\5H%\2\u0147\u0148"+
		"\7\25\2\2\u0148\u0149\5\n\6\2\u0149\u014a\7\30\2\2\u014a\u0152\5J&\2\u014b"+
		"\u014c\7\24\2\2\u014c\u014d\5\n\6\2\u014d\u014e\7\30\2\2\u014e\u014f\5"+
		"J&\2\u014f\u0151\3\2\2\2\u0150\u014b\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0156\7\26\2\2\u0156G\3\2\2\2\u0157\u0158\7=\2\2\u0158I\3\2"+
		"\2\2\u0159\u015a\7 \2\2\u015a\u015b\7\32\2\2\u015b\u015c\7$\2\2\u015c"+
		"\u015d\7\32\2\2\u015d\u016a\7!\2\2\u015e\u015f\7\16\2\2\u015f\u0164\5"+
		"\26\f\2\u0160\u0161\7\24\2\2\u0161\u0163\5\26\f\2\u0162\u0160\3\2\2\2"+
		"\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\17\2\2\u0168\u016a\3\2\2\2"+
		"\u0169\u0159\3\2\2\2\u0169\u015e\3\2\2\2\u016aK\3\2\2\2\u016b\u016c\t"+
		"\4\2\2\u016cM\3\2\2\2\u016d\u016f\t\5\2\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5`\61\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\5P)\2\u0174\u0175\7\30"+
		"\2\2\u0175\u0177\5V,\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0179\7\6\2\2\u0179\u017b\5X-\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\7\7\2\2\u017d\u017f\5Z"+
		".\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fO\3\2\2\2\u0180\u0183"+
		"\5R*\2\u0181\u0183\5T+\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"Q\3\2\2\2\u0184\u0189\7=\2\2\u0185\u0186\7\27\2\2\u0186\u0188\7=\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018aS\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7>\2\2\u018d\u018e"+
		"\7\27\2\2\u018e\u018f\7>\2\2\u018f\u0190\7\27\2\2\u0190\u0191\7>\2\2\u0191"+
		"\u0192\7\27\2\2\u0192\u0193\7>\2\2\u0193U\3\2\2\2\u0194\u0195\7\32\2\2"+
		"\u0195W\3\2\2\2\u0196\u019b\7=\2\2\u0197\u0198\7\16\2\2\u0198\u0199\7"+
		"=\2\2\u0199\u019b\7\17\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019b"+
		"\u01a5\3\2\2\2\u019c\u01a1\7\6\2\2\u019d\u01a2\7=\2\2\u019e\u019f\7\16"+
		"\2\2\u019f\u01a0\7=\2\2\u01a0\u01a2\7\17\2\2\u01a1\u019d\3\2\2\2\u01a1"+
		"\u019e\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6Y\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ad\5\\/\2\u01a9\u01aa\7\b\2\2\u01aa\u01ac\5\\/\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae[\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\7=\2\2\u01b1\u01b2"+
		"\7\61\2\2\u01b2\u01b4\t\6\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2"+
		"\u01b4]\3\2\2\2\u01b5\u01b6\7=\2\2\u01b6_\3\2\2\2\u01b7\u01b8\5^\60\2"+
		"\u01b8\u01b9\7\30\2\2\u01b9\u01ba\5b\62\2\u01ba\u01bb\7\t\2\2\u01bba\3"+
		"\2\2\2\u01bc\u01bd\7=\2\2\u01bdc\3\2\2\2(hrw{\u0089\u0097\u009d\u00a5"+
		"\u00ab\u00bc\u00c0\u00c9\u00d1\u00d5\u00eb\u00fa\u0103\u010d\u0110\u0118"+
		"\u0121\u0132\u0140\u0152\u0164\u0169\u016e\u0171\u0176\u017a\u017e\u0182"+
		"\u0189\u019a\u01a1\u01a5\u01ad\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}