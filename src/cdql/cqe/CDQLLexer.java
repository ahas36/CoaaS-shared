package cdql.cqe;

// Generated from CDQL.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CDQLLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BETWEEN", "RELATION_TYPE", 
		"WS", "WHEN", "LCURLY", "RCURLY", "PUSH", "PULL", "WHERE", "DEFINE", "COMMA", 
		"LPAREN", "RPAREN", "DOT", "COLON", "AS", "INT", "PERSON", "Organization", 
		"Location", "Event", "Device", "LBRACK", "RBRACK", "CONTEXT_ENTITY", "CONTEXT_FUNCTION", 
		"TO", "ENTITY", "IS_FROM", "IS_ON", "RELATIONAL_FUNCTION", "SITUATIONS", 
		"SITUATION", "SITUATIONAL_FUNCTION", "AGGREGATION_FUNCTION", "LIFETIME", 
		"DATE", "EVERY", "UNTIL", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", 
		"GET", "AND", "OR", "XOR", "IS", "NULL", "ID", "DIGITS"
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


	public CDQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CDQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u01df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00b3\n\n\3\13\6\13\u00b6\n\13\r\13\16\13\u00b7\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\6\31\u00ea\n\31\r\31\16\31\u00eb\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u01c0\n\67\38\38\38\38\58\u01c6\n8\39\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3<\3<\7<\u01d6\n<\f<\16<\u01d9\13<\3=\6=\u01dc"+
		"\n=\r=\16=\u01dd\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\u01e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u0085\3\2\2\2\t\u008e\3\2"+
		"\2\2\13\u0090\3\2\2\2\r\u0092\3\2\2\2\17\u0094\3\2\2\2\21\u0096\3\2\2"+
		"\2\23\u00b2\3\2\2\2\25\u00b5\3\2\2\2\27\u00bb\3\2\2\2\31\u00c0\3\2\2\2"+
		"\33\u00c2\3\2\2\2\35\u00c4\3\2\2\2\37\u00c9\3\2\2\2!\u00ce\3\2\2\2#\u00d4"+
		"\3\2\2\2%\u00db\3\2\2\2\'\u00dd\3\2\2\2)\u00df\3\2\2\2+\u00e1\3\2\2\2"+
		"-\u00e3\3\2\2\2/\u00e5\3\2\2\2\61\u00e9\3\2\2\2\63\u00ed\3\2\2\2\65\u00f5"+
		"\3\2\2\2\67\u0103\3\2\2\29\u010c\3\2\2\2;\u0113\3\2\2\2=\u011b\3\2\2\2"+
		"?\u011d\3\2\2\2A\u011f\3\2\2\2C\u0130\3\2\2\2E\u0142\3\2\2\2G\u0145\3"+
		"\2\2\2I\u014c\3\2\2\2K\u0154\3\2\2\2M\u015a\3\2\2\2O\u0164\3\2\2\2Q\u016f"+
		"\3\2\2\2S\u0179\3\2\2\2U\u0183\3\2\2\2W\u018d\3\2\2\2Y\u0196\3\2\2\2["+
		"\u019b\3\2\2\2]\u01a1\3\2\2\2_\u01a7\3\2\2\2a\u01a9\3\2\2\2c\u01ab\3\2"+
		"\2\2e\u01ad\3\2\2\2g\u01b0\3\2\2\2i\u01b4\3\2\2\2k\u01b7\3\2\2\2m\u01bf"+
		"\3\2\2\2o\u01c5\3\2\2\2q\u01c7\3\2\2\2s\u01cb\3\2\2\2u\u01ce\3\2\2\2w"+
		"\u01d3\3\2\2\2y\u01db\3\2\2\2{|\7)\2\2|\4\3\2\2\2}~\7j\2\2~\177\7v\2\2"+
		"\177\u0080\7v\2\2\u0080\u0081\7r\2\2\u0081\u0082\7<\2\2\u0082\u0083\7"+
		"\61\2\2\u0083\u0084\7\61\2\2\u0084\6\3\2\2\2\u0085\u0086\7j\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7v\2\2\u0088\u0089\7r\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008b\7<\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d\b"+
		"\3\2\2\2\u008e\u008f\7\61\2\2\u008f\n\3\2\2\2\u0090\u0091\7A\2\2\u0091"+
		"\f\3\2\2\2\u0092\u0093\7(\2\2\u0093\16\3\2\2\2\u0094\u0095\7B\2\2\u0095"+
		"\20\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7y\2\2\u009a\u009b\7g\2\2\u009b\u009c\7g\2\2\u009c\u009d\7p\2\2"+
		"\u009d\22\3\2\2\2\u009e\u009f\7&\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7"+
		"y\2\2\u00a1\u00b3\7p\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4\7m\2\2\u00a4\u00a5"+
		"\7p\2\2\u00a5\u00a6\7q\2\2\u00a6\u00b3\7y\2\2\u00a7\u00a8\7&\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7c\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7f\2\2\u00af\u00b0"+
		"\7/\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b3\7p\2\2\u00b2\u009e\3\2\2\2\u00b2"+
		"\u00a2\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b3\24\3\2\2\2\u00b4\u00b6\t\2\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\13\2\2\u00ba\26\3\2\2\2\u00bb"+
		"\u00bc\7y\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\30\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7\177"+
		"\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7j\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb"+
		"\7w\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7n\2\2\u00cd \3\2\2\2\u00ce\u00cf"+
		"\7y\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7g\2\2"+
		"\u00da$\3\2\2\2\u00db\u00dc\7.\2\2\u00dc&\3\2\2\2\u00dd\u00de\7*\2\2\u00de"+
		"(\3\2\2\2\u00df\u00e0\7+\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2"+
		",\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\60\3\2\2\2\u00e8\u00ea\4\62;\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\62\3\2\2"+
		"\2\u00ed\u00ee\7&\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\64\3\2\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7i\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7|\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102\66\3\2\2\2\u0103\u0104"+
		"\7&\2\2\u0104\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7k\2\2\u0109\u010a\7q\2\2\u010a\u010b\7p\2\2"+
		"\u010b8\3\2\2\2\u010c\u010d\7&\2\2\u010d\u010e\7g\2\2\u010e\u010f\7x\2"+
		"\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112:\3\2"+
		"\2\2\u0113\u0114\7&\2\2\u0114\u0115\7f\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7x\2\2\u0117\u0118\7k\2\2\u0118\u0119\7e\2\2\u0119\u011a\7g\2\2\u011a"+
		"<\3\2\2\2\u011b\u011c\7]\2\2\u011c>\3\2\2\2\u011d\u011e\7_\2\2\u011e@"+
		"\3\2\2\2\u011f\u0120\7e\2\2\u0120\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122"+
		"\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124\u0125\7z\2\2\u0125\u0126\7v\2\2"+
		"\u0126\u0127\7\"\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a"+
		"\7v\2\2\u012a\u012b\7k\2\2\u012b\u012c\7v\2\2\u012c\u012d\7k\2\2\u012d"+
		"\u012e\7g\2\2\u012e\u012f\7u\2\2\u012fB\3\2\2\2\u0130\u0131\7e\2\2\u0131"+
		"\u0132\7q\2\2\u0132\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2"+
		"\u0135\u0136\7z\2\2\u0136\u0137\7v\2\2\u0137\u0138\7\"\2\2\u0138\u0139"+
		"\7h\2\2\u0139\u013a\7w\2\2\u013a\u013b\7p\2\2\u013b\u013c\7e\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7k\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2"+
		"\u0140\u0141\7u\2\2\u0141D\3\2\2\2\u0142\u0143\7\60\2\2\u0143\u0144\7"+
		"\60\2\2\u0144F\3\2\2\2\u0145\u0146\7g\2\2\u0146\u0147\7p\2\2\u0147\u0148"+
		"\7v\2\2\u0148\u0149\7k\2\2\u0149\u014a\7v\2\2\u014a\u014b\7{\2\2\u014b"+
		"H\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7u\2\2\u014e\u014f\7\"\2\2\u014f"+
		"\u0150\7h\2\2\u0150\u0151\7t\2\2\u0151\u0152\7q\2\2\u0152\u0153\7o\2\2"+
		"\u0153J\3\2\2\2\u0154\u0155\7k\2\2\u0155\u0156\7u\2\2\u0156\u0157\7\""+
		"\2\2\u0157\u0158\7q\2\2\u0158\u0159\7p\2\2\u0159L\3\2\2\2\u015a\u015b"+
		"\7t\2\2\u015b\u015c\7H\2\2\u015c\u015d\7w\2\2\u015d\u015e\7p\2\2\u015e"+
		"\u015f\7e\2\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7q\2\2"+
		"\u0162\u0163\7p\2\2\u0163N\3\2\2\2\u0164\u0165\7u\2\2\u0165\u0166\7k\2"+
		"\2\u0166\u0167\7v\2\2\u0167\u0168\7w\2\2\u0168\u0169\7c\2\2\u0169\u016a"+
		"\7v\2\2\u016a\u016b\7k\2\2\u016b\u016c\7q\2\2\u016c\u016d\7p\2\2\u016d"+
		"\u016e\7u\2\2\u016eP\3\2\2\2\u016f\u0170\7u\2\2\u0170\u0171\7k\2\2\u0171"+
		"\u0172\7v\2\2\u0172\u0173\7w\2\2\u0173\u0174\7c\2\2\u0174\u0175\7v\2\2"+
		"\u0175\u0176\7k\2\2\u0176\u0177\7q\2\2\u0177\u0178\7p\2\2\u0178R\3\2\2"+
		"\2\u0179\u017a\7u\2\2\u017a\u017b\7H\2\2\u017b\u017c\7w\2\2\u017c\u017d"+
		"\7p\2\2\u017d\u017e\7e\2\2\u017e\u017f\7v\2\2\u017f\u0180\7k\2\2\u0180"+
		"\u0181\7q\2\2\u0181\u0182\7p\2\2\u0182T\3\2\2\2\u0183\u0184\7c\2\2\u0184"+
		"\u0185\7H\2\2\u0185\u0186\7w\2\2\u0186\u0187\7p\2\2\u0187\u0188\7e\2\2"+
		"\u0188\u0189\7v\2\2\u0189\u018a\7k\2\2\u018a\u018b\7q\2\2\u018b\u018c"+
		"\7p\2\2\u018cV\3\2\2\2\u018d\u018e\7n\2\2\u018e\u018f\7k\2\2\u018f\u0190"+
		"\7h\2\2\u0190\u0191\7g\2\2\u0191\u0192\7v\2\2\u0192\u0193\7k\2\2\u0193"+
		"\u0194\7o\2\2\u0194\u0195\7g\2\2\u0195X\3\2\2\2\u0196\u0197\7f\2\2\u0197"+
		"\u0198\7c\2\2\u0198\u0199\7v\2\2\u0199\u019a\7g\2\2\u019aZ\3\2\2\2\u019b"+
		"\u019c\7g\2\2\u019c\u019d\7x\2\2\u019d\u019e\7g\2\2\u019e\u019f\7t\2\2"+
		"\u019f\u01a0\7{\2\2\u01a0\\\3\2\2\2\u01a1\u01a2\7w\2\2\u01a2\u01a3\7p"+
		"\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7n\2\2\u01a6^\3"+
		"\2\2\2\u01a7\u01a8\7?\2\2\u01a8`\3\2\2\2\u01a9\u01aa\7>\2\2\u01aab\3\2"+
		"\2\2\u01ab\u01ac\7@\2\2\u01acd\3\2\2\2\u01ad\u01ae\7#\2\2\u01ae\u01af"+
		"\7?\2\2\u01aff\3\2\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3"+
		"\7v\2\2\u01b3h\3\2\2\2\u01b4\u01b5\7>\2\2\u01b5\u01b6\7?\2\2\u01b6j\3"+
		"\2\2\2\u01b7\u01b8\7@\2\2\u01b8\u01b9\7?\2\2\u01b9l\3\2\2\2\u01ba\u01bb"+
		"\7c\2\2\u01bb\u01bc\7p\2\2\u01bc\u01c0\7f\2\2\u01bd\u01be\7(\2\2\u01be"+
		"\u01c0\7(\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0n\3\2\2\2\u01c1"+
		"\u01c2\7q\2\2\u01c2\u01c6\7t\2\2\u01c3\u01c4\7~\2\2\u01c4\u01c6\7~\2\2"+
		"\u01c5\u01c1\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6p\3\2\2\2\u01c7\u01c8\7"+
		"z\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7t\2\2\u01car\3\2\2\2\u01cb\u01cc"+
		"\7k\2\2\u01cc\u01cd\7u\2\2\u01cdt\3\2\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0"+
		"\7w\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7n\2\2\u01d2v\3\2\2\2\u01d3\u01d7"+
		"\t\3\2\2\u01d4\u01d6\t\4\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8x\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01da\u01dc\t\5\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01dez\3\2\2\2\n\2\u00b2\u00b7\u00eb\u01bf"+
		"\u01c5\u01d7\u01dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}