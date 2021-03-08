// Generated from c:\git\DLP\MiPractica\Esqueleto Traductor\src\parser\Grammar.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DATA=29, CODE=30, PRINT=31, INT=32, 
		FLOAT=33, LITENT=34, LITREAL=35, LITCHAR=36, IDENT=37, PLUS=38, MULT=39, 
		SUB=40, DIV=41, SEMICOLON=42, ASSIGN=43, OPEN_PAREN=44, CLOSE_PAREN=45, 
		LINE_COMMENT=46, MULTILINE_COMMENT=47, WHITESPACE=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "DATA", "CODE", "PRINT", "INT", "FLOAT", "LITENT", 
			"LITREAL", "LITCHAR", "IDENT", "PLUS", "MULT", "SUB", "DIV", "SEMICOLON", 
			"ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'printsp'", "'println'", "'return'", "'.'", "'['", "']'", 
			"','", "'<'", "'>'", "'''", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'true'", "'false'", "'var'", "':'", "'struct'", "'{'", "'}'", "'char'", 
			"'while'", "'if'", "'else'", "'DATA'", "'CODE'", "'print'", "'int'", 
			"'float'", null, null, null, null, "'+'", "'*'", "'-'", "'/'", "';'", 
			"'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DATA", "CODE", "PRINT", "INT", "FLOAT", 
			"LITENT", "LITREAL", "LITCHAR", "IDENT", "PLUS", "MULT", "SUB", "DIV", 
			"SEMICOLON", "ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\6#\u00ea\n#\r#\16#\u00eb\3$\6$\u00ef\n$\r$\16$\u00f0\3"+
		"$\3$\6$\u00f5\n$\r$\16$\u00f6\3%\3%\3%\3%\3%\3%\3%\5%\u0100\n%\3&\3&\7"+
		"&\u0104\n&\f&\16&\u0107\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3/\3/\7/\u011d\n/\f/\16/\u0120\13/\3/\3/\3\60\3\60\3\60"+
		"\3\60\7\60\u0128\n\60\f\60\16\60\u012b\13\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\6\61\u0133\n\61\r\61\16\61\u0134\3\61\3\61\3\u0129\2\62\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b\3\2\62;\4\2\13\f\17\17\4"+
		"\2C\\c|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\2\u013f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2"+
		"\2\2\5h\3\2\2\2\7p\3\2\2\2\tx\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17"+
		"\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u0099\3\2\2\2#\u009c\3\2\2\2%\u009f\3\2\2\2\'\u00a4\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00bb\3\2\2\2\65\u00c0\3\2\2\2\67\u00c6\3\2\2\29\u00c9\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d8\3\2\2\2A\u00de\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u00e9\3\2\2\2G\u00ee\3\2\2\2I\u00ff\3\2\2\2K\u0101\3\2\2\2M\u0108\3\2"+
		"\2\2O\u010a\3\2\2\2Q\u010c\3\2\2\2S\u010e\3\2\2\2U\u0110\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2\2\2]\u0118\3\2\2\2_\u0123\3\2\2\2a"+
		"\u0132\3\2\2\2cd\7t\2\2de\7g\2\2ef\7c\2\2fg\7f\2\2g\4\3\2\2\2hi\7r\2\2"+
		"ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2mn\7u\2\2no\7r\2\2o\6\3\2\2\2pq\7"+
		"r\2\2qr\7t\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2uv\7n\2\2vw\7p\2\2w\b\3\2\2\2"+
		"xy\7t\2\2yz\7g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\n\3\2\2\2\177"+
		"\u0080\7\60\2\2\u0080\f\3\2\2\2\u0081\u0082\7]\2\2\u0082\16\3\2\2\2\u0083"+
		"\u0084\7_\2\2\u0084\20\3\2\2\2\u0085\u0086\7.\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0088\7>\2\2\u0088\24\3\2\2\2\u0089\u008a\7@\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7)\2\2\u008c\30\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095\36\3\2\2\2\u0096\u0097\7#\2\2\u0097"+
		"\u0098\7?\2\2\u0098 \3\2\2\2\u0099\u009a\7(\2\2\u009a\u009b\7(\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7~\2\2\u009d\u009e\7~\2\2\u009e$\3\2\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3&\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2"+
		"\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7"+
		"x\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7t\2\2\u00ad*\3\2\2\2\u00ae\u00af"+
		"\7<\2\2\u00af,\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		".\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\66\3\2\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c88\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd:\3\2\2\2\u00ce"+
		"\u00cf\7F\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d1\7V\2\2\u00d1\u00d2\7C\2\2"+
		"\u00d2<\3\2\2\2\u00d3\u00d4\7E\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7F\2"+
		"\2\u00d6\u00d7\7G\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7"+
		"t\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd@"+
		"\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1"+
		"B\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7D\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ecF\3\2\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\7\60\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7H\3\2\2\2\u00f8\u00f9"+
		"\7)\2\2\u00f9\u00fa\n\3\2\2\u00fa\u0100\7)\2\2\u00fb\u00fc\7)\2\2\u00fc"+
		"\u00fd\7^\2\2\u00fd\u00fe\7p\2\2\u00fe\u0100\7)\2\2\u00ff\u00f8\3\2\2"+
		"\2\u00ff\u00fb\3\2\2\2\u0100J\3\2\2\2\u0101\u0105\t\4\2\2\u0102\u0104"+
		"\t\5\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106L\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7-\2\2\u0109"+
		"N\3\2\2\2\u010a\u010b\7,\2\2\u010bP\3\2\2\2\u010c\u010d\7/\2\2\u010dR"+
		"\3\2\2\2\u010e\u010f\7\61\2\2\u010fT\3\2\2\2\u0110\u0111\7=\2\2\u0111"+
		"V\3\2\2\2\u0112\u0113\7?\2\2\u0113X\3\2\2\2\u0114\u0115\7*\2\2\u0115Z"+
		"\3\2\2\2\u0116\u0117\7+\2\2\u0117\\\3\2\2\2\u0118\u0119\7\61\2\2\u0119"+
		"\u011a\7\61\2\2\u011a\u011e\3\2\2\2\u011b\u011d\n\6\2\2\u011c\u011b\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\b/\2\2\u0122^\3\2\2\2\u0123"+
		"\u0124\7\61\2\2\u0124\u0125\7,\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13"+
		"\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7,"+
		"\2\2\u012d\u012e\7\61\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\60\2\2\u0130"+
		"`\3\2\2\2\u0131\u0133\t\7\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\b\61\2\2\u0137b\3\2\2\2\13\2\u00eb\u00f0\u00f6\u00ff\u0105\u011e\u0129"+
		"\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}