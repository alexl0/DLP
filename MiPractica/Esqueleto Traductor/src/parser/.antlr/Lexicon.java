// Generated from c:\git\DLP\MiPractica\Esqueleto Traductor\src\parser\Lexicon.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, CODE=2, PRINT=3, INT=4, FLOAT=5, LITENT=6, LITREAL=7, LITCHAR=8, 
		IDENT=9, PLUS=10, MULT=11, SUB=12, DIV=13, SEMICOLON=14, ASSIGN=15, OPEN_PAREN=16, 
		CLOSE_PAREN=17, LINE_COMMENT=18, MULTILINE_COMMENT=19, WHITESPACE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DATA", "CODE", "PRINT", "INT", "FLOAT", "LITENT", "LITREAL", "LITCHAR", 
			"IDENT", "PLUS", "MULT", "SUB", "DIV", "SEMICOLON", "ASSIGN", "OPEN_PAREN", 
			"CLOSE_PAREN", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "'CODE'", "'print'", "'int'", "'float'", null, null, 
			null, null, "'+'", "'*'", "'-'", "'/'", "';'", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "CODE", "PRINT", "INT", "FLOAT", "LITENT", "LITREAL", "LITCHAR", 
			"IDENT", "PLUS", "MULT", "SUB", "DIV", "SEMICOLON", "ASSIGN", "OPEN_PAREN", 
			"CLOSE_PAREN", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\6\7G\n\7\r\7\16\7H\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\6\bR\n\b\r\b\16"+
		"\bS\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\7\na\n\n\f\n\16\nd\13"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\7\23z\n\23\f\23\16\23}\13\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\7\24\u0085\n\24\f\24\16\24\u0088\13\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\6\25\u0090\n\25\r\25\16\25\u0091\3\25\3\25\3\u0086"+
		"\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\b\3\2\62;\4\2\13\f\17\17\4\2C\\c|\6"+
		"\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t;\3\2\2\2\13?"+
		"\3\2\2\2\rF\3\2\2\2\17K\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25e\3\2\2\2\27"+
		"g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s"+
		"\3\2\2\2%u\3\2\2\2\'\u0080\3\2\2\2)\u008f\3\2\2\2+,\7F\2\2,-\7C\2\2-."+
		"\7V\2\2./\7C\2\2/\4\3\2\2\2\60\61\7E\2\2\61\62\7Q\2\2\62\63\7F\2\2\63"+
		"\64\7G\2\2\64\6\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\2"+
		"9:\7v\2\2:\b\3\2\2\2;<\7k\2\2<=\7p\2\2=>\7v\2\2>\n\3\2\2\2?@\7h\2\2@A"+
		"\7n\2\2AB\7q\2\2BC\7c\2\2CD\7v\2\2D\f\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2I\16\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\60\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2T\20\3\2\2\2UV\7)\2\2VW\n\3\2\2W]\7)\2\2XY\7)\2\2"+
		"YZ\7^\2\2Z[\7p\2\2[]\7)\2\2\\U\3\2\2\2\\X\3\2\2\2]\22\3\2\2\2^b\t\4\2"+
		"\2_a\t\5\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\24\3\2\2\2db\3\2"+
		"\2\2ef\7-\2\2f\26\3\2\2\2gh\7,\2\2h\30\3\2\2\2ij\7/\2\2j\32\3\2\2\2kl"+
		"\7\61\2\2l\34\3\2\2\2mn\7=\2\2n\36\3\2\2\2op\7?\2\2p \3\2\2\2qr\7*\2\2"+
		"r\"\3\2\2\2st\7+\2\2t$\3\2\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\n\6\2"+
		"\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b"+
		"\23\2\2\177&\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086"+
		"\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\b\24\2\2\u008d(\3\2\2\2\u008e\u0090\t\7\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\b\25\2\2\u0094*\3\2\2\2\13\2HMS\\b{\u0086\u0091\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}