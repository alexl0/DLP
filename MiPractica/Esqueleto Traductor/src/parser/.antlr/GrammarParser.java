// Generated from c:\git\DLP\MiPractica\Esqueleto Traductor\src\parser\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_sentencias = 3, 
		RULE_sentencia = 4, RULE_expr = 5, RULE_cond = 6, RULE_defVar = 7, RULE_defStruct = 8, 
		RULE_campos = 9, RULE_campo = 10, RULE_defFunc = 11, RULE_params = 12, 
		RULE_param = 13, RULE_defLocales = 14, RULE_defLocal = 15, RULE_tipo = 16, 
		RULE_defWhile = 17, RULE_defIf = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "sentencias", "sentencia", "expr", 
			"cond", "defVar", "defStruct", "campos", "campo", "defFunc", "params", 
			"param", "defLocales", "defLocal", "tipo", "defWhile", "defIf"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			definiciones();
			setState(39);
			match(EOF);
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

	public static class DefinicionesContext extends ParserRuleContext {
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				definicion();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__21) | (1L << IDENT))) != 0) );
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

	public static class DefinicionContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				defVar();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				defFunc();
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

	public static class SentenciasContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << PRINT) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				{
				setState(51);
				sentencia();
				}
				}
				setState(56);
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

	public static class SentenciaContext extends ParserRuleContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public DefWhileContext defWhile() {
			return getRuleContext(DefWhileContext.class,0);
		}
		public DefIfContext defIf() {
			return getRuleContext(DefIfContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__0);
				setState(58);
				expr(0);
				setState(59);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(PRINT);
				setState(62);
				expr(0);
				setState(63);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(T__1);
				setState(66);
				expr(0);
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(T__2);
				setState(70);
				expr(0);
				setState(71);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				defWhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				defIf();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				((SentenciaContext)_localctx).l = expr(0);
				setState(76);
				match(ASSIGN);
				setState(77);
				((SentenciaContext)_localctx).r = expr(0);
				setState(78);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(T__3);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
					{
					setState(81);
					expr(0);
					}
				}

				setState(84);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				expr(0);
				setState(86);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				match(IDENT);
				setState(89);
				match(OPEN_PAREN);
				setState(90);
				params();
				setState(91);
				match(CLOSE_PAREN);
				setState(92);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext l;
		public Token op;
		public ExprContext r;
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(OPEN_PAREN);
				setState(98);
				expr(0);
				setState(99);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				setState(101);
				match(IDENT);
				}
				break;
			case 3:
				{
				setState(102);
				match(IDENT);
				setState(103);
				match(OPEN_PAREN);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						expr(0);
						setState(105);
						match(T__7);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(112);
				expr(0);
				setState(113);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				setState(115);
				match(LITENT);
				}
				break;
			case 5:
				{
				setState(116);
				match(LITREAL);
				}
				break;
			case 6:
				{
				setState(117);
				match(LITCHAR);
				}
				break;
			case 7:
				{
				setState(118);
				match(T__8);
				setState(119);
				tipo();
				setState(120);
				match(T__9);
				setState(121);
				match(OPEN_PAREN);
				setState(122);
				expr(0);
				setState(123);
				match(CLOSE_PAREN);
				}
				break;
			case 8:
				{
				setState(125);
				match(T__10);
				setState(126);
				match(IDENT);
				setState(127);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((ExprContext)_localctx).r = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(134);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((ExprContext)_localctx).r = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(137);
						match(T__4);
						setState(138);
						match(IDENT);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(140);
						match(T__5);
						setState(141);
						expr(0);
						setState(142);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case LITENT:
			case LITREAL:
			case LITCHAR:
			case IDENT:
			case OPEN_PAREN:
				{
				setState(150);
				expr(0);
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				expr(0);
				}
				break;
			case T__17:
				{
				setState(154);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(155);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(158);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(159);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					cond(4);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefVarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__19);
			setState(167);
			match(IDENT);
			setState(168);
			match(T__20);
			setState(169);
			tipo();
			setState(170);
			match(SEMICOLON);
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

	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__21);
			setState(173);
			match(IDENT);
			setState(174);
			match(T__22);
			setState(175);
			campos();
			setState(176);
			match(T__23);
			setState(177);
			match(SEMICOLON);
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

	public static class CamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public CamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos; }
	}

	public final CamposContext campos() throws RecognitionException {
		CamposContext _localctx = new CamposContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(179);
				campo();
				}
				}
				setState(184);
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

	public static class CampoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDENT);
			setState(186);
			match(T__20);
			setState(187);
			tipo();
			setState(188);
			match(SEMICOLON);
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

	public static class DefFuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public DefLocalesContext defLocales() {
			return getRuleContext(DefLocalesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENT);
			setState(191);
			match(OPEN_PAREN);
			setState(192);
			params();
			setState(193);
			match(CLOSE_PAREN);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(194);
				match(T__20);
				setState(195);
				tipo();
				}
			}

			setState(198);
			match(T__22);
			setState(199);
			defLocales();
			setState(200);
			sentencias();
			setState(201);
			match(T__23);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						param();
						setState(204);
						match(T__7);
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(211);
				param();
				}
				break;
			case CLOSE_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENT);
			setState(216);
			match(T__20);
			setState(217);
			tipo();
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

	public static class DefLocalesContext extends ParserRuleContext {
		public List<DefLocalContext> defLocal() {
			return getRuleContexts(DefLocalContext.class);
		}
		public DefLocalContext defLocal(int i) {
			return getRuleContext(DefLocalContext.class,i);
		}
		public DefLocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defLocales; }
	}

	public final DefLocalesContext defLocales() throws RecognitionException {
		DefLocalesContext _localctx = new DefLocalesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defLocales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__21) {
				{
				{
				setState(219);
				defLocal();
				}
				}
				setState(224);
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

	public static class DefLocalContext extends ParserRuleContext {
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defLocal; }
	}

	public final DefLocalContext defLocal() throws RecognitionException {
		DefLocalContext _localctx = new DefLocalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defLocal);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				defVar();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				defStruct();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(FLOAT);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__24);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__5);
				setState(233);
				match(LITENT);
				setState(234);
				match(T__6);
				setState(235);
				tipo();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(IDENT);
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

	public static class DefWhileContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public DefWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defWhile; }
	}

	public final DefWhileContext defWhile() throws RecognitionException {
		DefWhileContext _localctx = new DefWhileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__25);
			setState(240);
			match(OPEN_PAREN);
			setState(241);
			cond(0);
			setState(242);
			match(CLOSE_PAREN);
			setState(243);
			match(T__22);
			setState(244);
			sentencias();
			setState(245);
			match(T__23);
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

	public static class DefIfContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public DefIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defIf; }
	}

	public final DefIfContext defIf() throws RecognitionException {
		DefIfContext _localctx = new DefIfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__26);
			setState(248);
			match(OPEN_PAREN);
			setState(249);
			cond(0);
			setState(250);
			match(CLOSE_PAREN);
			setState(251);
			match(T__22);
			setState(252);
			sentencias();
			setState(253);
			match(T__23);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(254);
				match(T__27);
				setState(255);
				match(T__22);
				setState(256);
				sentencias();
				setState(257);
				match(T__23);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0108\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\6\3-\n\3\r\3\16\3.\3\4\3\4\3\4\5"+
		"\4\64\n\4\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0093\n\7\f\7\16"+
		"\7\u0096\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\b\3\b\3\b\7"+
		"\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\7\13\u00b7\n\13\f\13\16\13\u00ba\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16\3\16\3\16\5\16\u00d8"+
		"\n\16\3\17\3\17\3\17\3\17\3\20\7\20\u00df\n\20\f\20\16\20\u00e2\13\20"+
		"\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00f0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\24\2\4\f\16"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\4\2))++\4\2((**\4"+
		"\2\13\f\16\21\3\2\22\23\2\u011c\2(\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b8"+
		"\3\2\2\2\n`\3\2\2\2\f\u0082\3\2\2\2\16\u009e\3\2\2\2\20\u00a8\3\2\2\2"+
		"\22\u00ae\3\2\2\2\24\u00b8\3\2\2\2\26\u00bb\3\2\2\2\30\u00c0\3\2\2\2\32"+
		"\u00d7\3\2\2\2\34\u00d9\3\2\2\2\36\u00e0\3\2\2\2 \u00e5\3\2\2\2\"\u00ef"+
		"\3\2\2\2$\u00f1\3\2\2\2&\u00f9\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2"+
		"+-\5\6\4\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60\64\5"+
		"\20\t\2\61\64\5\22\n\2\62\64\5\30\r\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62"+
		"\3\2\2\2\64\7\3\2\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\7\3\2\2<=\5\f\7\2=>\7,\2\2>a\3\2"+
		"\2\2?@\7!\2\2@A\5\f\7\2AB\7,\2\2Ba\3\2\2\2CD\7\4\2\2DE\5\f\7\2EF\7,\2"+
		"\2Fa\3\2\2\2GH\7\5\2\2HI\5\f\7\2IJ\7,\2\2Ja\3\2\2\2Ka\5$\23\2La\5&\24"+
		"\2MN\5\f\7\2NO\7-\2\2OP\5\f\7\2PQ\7,\2\2Qa\3\2\2\2RT\7\6\2\2SU\5\f\7\2"+
		"TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Va\7,\2\2WX\5\f\7\2XY\7,\2\2Ya\3\2\2\2Z"+
		"[\7\'\2\2[\\\7.\2\2\\]\5\32\16\2]^\7/\2\2^_\7,\2\2_a\3\2\2\2`;\3\2\2\2"+
		"`?\3\2\2\2`C\3\2\2\2`G\3\2\2\2`K\3\2\2\2`L\3\2\2\2`M\3\2\2\2`R\3\2\2\2"+
		"`W\3\2\2\2`Z\3\2\2\2a\13\3\2\2\2bc\b\7\1\2cd\7.\2\2de\5\f\7\2ef\7/\2\2"+
		"f\u0083\3\2\2\2g\u0083\7\'\2\2hi\7\'\2\2io\7.\2\2jk\5\f\7\2kl\7\n\2\2"+
		"ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\5\f\7\2st\7/\2\2t\u0083\3\2\2\2u\u0083\7$\2\2v\u0083\7%\2\2w\u0083"+
		"\7&\2\2xy\7\13\2\2yz\5\"\22\2z{\7\f\2\2{|\7.\2\2|}\5\f\7\2}~\7/\2\2~\u0083"+
		"\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\'\2\2\u0081\u0083\7\r\2\2\u0082"+
		"b\3\2\2\2\u0082g\3\2\2\2\u0082h\3\2\2\2\u0082u\3\2\2\2\u0082v\3\2\2\2"+
		"\u0082w\3\2\2\2\u0082x\3\2\2\2\u0082\177\3\2\2\2\u0083\u0094\3\2\2\2\u0084"+
		"\u0085\f\f\2\2\u0085\u0086\t\2\2\2\u0086\u0093\5\f\7\r\u0087\u0088\f\13"+
		"\2\2\u0088\u0089\t\3\2\2\u0089\u0093\5\f\7\f\u008a\u008b\f\16\2\2\u008b"+
		"\u008c\7\7\2\2\u008c\u0093\7\'\2\2\u008d\u008e\f\r\2\2\u008e\u008f\7\b"+
		"\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7\t\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0084\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008d\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\r\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\b\1\2\u0098\u0099\5\f\7\2"+
		"\u0099\u009a\t\4\2\2\u009a\u009b\5\f\7\2\u009b\u009f\3\2\2\2\u009c\u009f"+
		"\7\24\2\2\u009d\u009f\7\25\2\2\u009e\u0097\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\f\5\2\2\u00a1\u00a2"+
		"\t\5\2\2\u00a2\u00a4\5\16\b\6\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\27\2\2"+
		"\u00ab\u00ac\5\"\22\2\u00ac\u00ad\7,\2\2\u00ad\21\3\2\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\u00b0\7\'\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5\24\13"+
		"\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\7,\2\2\u00b4\23\3\2\2\2\u00b5\u00b7"+
		"\5\26\f\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7\'\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5\"\22\2\u00be\u00bf\7,\2\2"+
		"\u00bf\27\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7.\2\2\u00c2\u00c3\5"+
		"\32\16\2\u00c3\u00c6\7/\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c7\5\"\22\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\7\31\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\32\2"+
		"\2\u00cc\31\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7\n\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\5\34"+
		"\17\2\u00d6\u00d8\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\33\3\2\2\2\u00d9\u00da\7\'\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\5\"\22"+
		"\2\u00dc\35\3\2\2\2\u00dd\u00df\5 \21\2\u00de\u00dd\3\2\2\2\u00df\u00e2"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\37\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\5\20\t\2\u00e4\u00e6\5\22\n\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e4\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00f0\7\"\2\2\u00e8\u00f0"+
		"\7#\2\2\u00e9\u00f0\7\33\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\7$\2\2\u00ec"+
		"\u00ed\7\t\2\2\u00ed\u00f0\5\"\22\2\u00ee\u00f0\7\'\2\2\u00ef\u00e7\3"+
		"\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2\u00f3\7.\2\2"+
		"\u00f3\u00f4\5\16\b\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7\31\2\2\u00f6\u00f7"+
		"\5\b\5\2\u00f7\u00f8\7\32\2\2\u00f8%\3\2\2\2\u00f9\u00fa\7\35\2\2\u00fa"+
		"\u00fb\7.\2\2\u00fb\u00fc\5\16\b\2\u00fc\u00fd\7/\2\2\u00fd\u00fe\7\31"+
		"\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0105\7\32\2\2\u0100\u0101\7\36\2\2\u0101"+
		"\u0102\7\31\2\2\u0102\u0103\5\b\5\2\u0103\u0104\7\32\2\2\u0104\u0106\3"+
		"\2\2\2\u0105\u0100\3\2\2\2\u0105\u0106\3\2\2\2\u0106\'\3\2\2\2\25.\63"+
		"8T`o\u0082\u0092\u0094\u009e\u00a5\u00b8\u00c6\u00d2\u00d7\u00e0\u00e5"+
		"\u00ef\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}