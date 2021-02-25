// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DATA=8, CODE=9, 
		PRINT=10, INT=11, FLOAT=12, LITENT=13, LITREAL=14, IDENT=15, PLUS=16, 
		MULT=17, SUB=18, DIV=19, SEMICOLON=20, ASSIGN=21, OPEN_PAREN=22, CLOSE_PAREN=23, 
		LINE_COMMENT=24, MULTILINE_COMMENT=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DATA", "CODE", 
			"PRINT", "INT", "FLOAT", "LITENT", "LITREAL", "IDENT", "PLUS", "MULT", 
			"SUB", "DIV", "SEMICOLON", "ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "'char'", "'['", "']'", "'F'", "'S'", "'DATA'", 
			"'CODE'", "'print'", "'int'", "'float'", null, null, null, "'+'", "'*'", 
			"'-'", "'/'", "';'", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DATA", "CODE", "PRINT", 
			"INT", "FLOAT", "LITENT", "LITREAL", "IDENT", "PLUS", "MULT", "SUB", 
			"DIV", "SEMICOLON", "ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\6\16f\n\16\r\16\16\16g\3\17\6\17k\n\17\r\17\16\17l\3\17\3\17\6"+
		"\17q\n\17\r\17\16\17r\3\20\3\20\7\20w\n\20\f\20\16\20z\13\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0090\n\31\f\31\16\31\u0093\13\31\3\31\5\31"+
		"\u0096\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u009e\n\32\f\32\16\32\u00a1"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00a9\n\33\r\33\16\33\u00aa"+
		"\3\33\3\33\4\u0091\u009f\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\3\2\7\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f"+
		"\17\17\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\5;\3\2\2\2\7=\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21"+
		"J\3\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27Z\3\2\2\2\31^\3\2\2\2\33e\3\2\2\2"+
		"\35j\3\2\2\2\37t\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2"+
		"\2\2)\u0083\3\2\2\2+\u0085\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u00a8\3\2\2\2\678\7x\2\289\7c\2\29:\7t\2"+
		"\2:\4\3\2\2\2;<\7<\2\2<\6\3\2\2\2=>\7e\2\2>?\7j\2\2?@\7c\2\2@A\7t\2\2"+
		"A\b\3\2\2\2BC\7]\2\2C\n\3\2\2\2DE\7_\2\2E\f\3\2\2\2FG\7H\2\2G\16\3\2\2"+
		"\2HI\7U\2\2I\20\3\2\2\2JK\7F\2\2KL\7C\2\2LM\7V\2\2MN\7C\2\2N\22\3\2\2"+
		"\2OP\7E\2\2PQ\7Q\2\2QR\7F\2\2RS\7G\2\2S\24\3\2\2\2TU\7r\2\2UV\7t\2\2V"+
		"W\7k\2\2WX\7p\2\2XY\7v\2\2Y\26\3\2\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]\30"+
		"\3\2\2\2^_\7h\2\2_`\7n\2\2`a\7q\2\2ab\7c\2\2bc\7v\2\2c\32\3\2\2\2df\t"+
		"\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\34\3\2\2\2ik\t\2\2\2j"+
		"i\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\60\2\2oq\t\2\2\2"+
		"po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\36\3\2\2\2tx\t\3\2\2uw\t\4\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y \3\2\2\2zx\3\2\2\2{|\7-\2"+
		"\2|\"\3\2\2\2}~\7,\2\2~$\3\2\2\2\177\u0080\7/\2\2\u0080&\3\2\2\2\u0081"+
		"\u0082\7\61\2\2\u0082(\3\2\2\2\u0083\u0084\7=\2\2\u0084*\3\2\2\2\u0085"+
		"\u0086\7?\2\2\u0086,\3\2\2\2\u0087\u0088\7*\2\2\u0088.\3\2\2\2\u0089\u008a"+
		"\7+\2\2\u008a\60\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u0091\3\2\2\2\u008e\u0090\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\31\2\2\u0098\62\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\u009b\7,\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\61"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\32\2\2\u00a6\64\3\2\2\2\u00a7\u00a9"+
		"\t\6\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\33\2\2\u00ad\66\3\2\2"+
		"\2\13\2glrx\u0091\u0095\u009f\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}