// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DATA=29, CODE=30, PRINT=31, INT=32, 
		FLOAT=33, LITENT=34, LITREAL=35, IDENT=36, PLUS=37, MULT=38, SUB=39, DIV=40, 
		SEMICOLON=41, ASSIGN=42, OPEN_PAREN=43, CLOSE_PAREN=44, LINE_COMMENT=45, 
		MULTILINE_COMMENT=46, WHITESPACE=47;
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
			"'float'", null, null, null, "'+'", "'*'", "'-'", "'/'", "';'", "'='", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DATA", "CODE", "PRINT", "INT", "FLOAT", 
			"LITENT", "LITREAL", "IDENT", "PLUS", "MULT", "SUB", "DIV", "SEMICOLON", 
			"ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "LINE_COMMENT", "MULTILINE_COMMENT", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << PRINT) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
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
			setState(88);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << LITENT) | (1L << LITREAL) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				match(OPEN_PAREN);
				setState(92);
				expr(0);
				setState(93);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				setState(95);
				match(IDENT);
				}
				break;
			case 3:
				{
				setState(96);
				match(IDENT);
				setState(97);
				match(OPEN_PAREN);
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						expr(0);
						setState(99);
						match(T__7);
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(106);
				expr(0);
				setState(107);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				setState(109);
				match(LITENT);
				}
				break;
			case 5:
				{
				setState(110);
				match(LITREAL);
				}
				break;
			case 6:
				{
				setState(111);
				match(T__8);
				setState(112);
				tipo();
				setState(113);
				match(T__9);
				setState(114);
				match(OPEN_PAREN);
				setState(115);
				expr(0);
				setState(116);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				{
				setState(118);
				match(T__10);
				setState(119);
				match(IDENT);
				setState(120);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
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
						setState(125);
						((ExprContext)_localctx).r = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
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
						setState(128);
						((ExprContext)_localctx).r = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(130);
						match(T__4);
						setState(131);
						match(IDENT);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(133);
						match(T__5);
						setState(134);
						expr(0);
						setState(135);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(141);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case LITENT:
			case LITREAL:
			case IDENT:
			case OPEN_PAREN:
				{
				setState(143);
				expr(0);
				setState(144);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				expr(0);
				}
				break;
			case T__17:
				{
				setState(147);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(148);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
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
					setState(151);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(152);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(153);
					cond(4);
					}
					} 
				}
				setState(158);
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
			setState(159);
			match(T__19);
			setState(160);
			match(IDENT);
			setState(161);
			match(T__20);
			setState(162);
			tipo();
			setState(163);
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
			setState(165);
			match(T__21);
			setState(166);
			match(IDENT);
			setState(167);
			match(T__22);
			setState(168);
			campos();
			setState(169);
			match(T__23);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(172);
				campo();
				}
				}
				setState(177);
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
			setState(178);
			match(IDENT);
			setState(179);
			match(T__20);
			setState(180);
			tipo();
			setState(181);
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
			setState(183);
			match(IDENT);
			setState(184);
			match(OPEN_PAREN);
			setState(185);
			params();
			setState(186);
			match(CLOSE_PAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(187);
				match(T__20);
				setState(188);
				tipo();
				}
			}

			setState(191);
			match(T__22);
			setState(192);
			defLocales();
			setState(193);
			sentencias();
			setState(194);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						param();
						setState(197);
						match(T__7);
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(204);
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
			setState(208);
			match(IDENT);
			setState(209);
			match(T__20);
			setState(210);
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__21) {
				{
				{
				setState(212);
				defLocal();
				}
				}
				setState(217);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				defVar();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(FLOAT);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__24);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__5);
				setState(226);
				match(LITENT);
				setState(227);
				match(T__6);
				setState(228);
				tipo();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
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
			setState(232);
			match(T__25);
			setState(233);
			match(OPEN_PAREN);
			setState(234);
			cond(0);
			setState(235);
			match(CLOSE_PAREN);
			setState(236);
			match(T__22);
			setState(237);
			sentencias();
			setState(238);
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
			setState(240);
			match(T__26);
			setState(241);
			match(OPEN_PAREN);
			setState(242);
			cond(0);
			setState(243);
			match(CLOSE_PAREN);
			setState(244);
			match(T__22);
			setState(245);
			sentencias();
			setState(246);
			match(T__23);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(247);
				match(T__27);
				setState(248);
				match(T__22);
				setState(249);
				sentencias();
				setState(250);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\6\3-\n\3\r\3\16\3.\3\4\3\4\3\4\5"+
		"\4\64\n\4\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6U\n\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0098\n\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\7\13\u00b0\n"+
		"\13\f\13\16\13\u00b3\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00c0\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00ca\n\16\f\16"+
		"\16\16\u00cd\13\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\17\3\17\3\20"+
		"\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\3\21\3\21\5\21\u00df\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00ff\n\24\3\24\2\4\f\16\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\6\4\2((**\4\2\'\'))\4\2\13\f\16\21\3\2\22\23\2\u0113"+
		"\2(\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b8\3\2\2\2\nZ\3\2\2\2\f{\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u00a1\3\2\2\2\22\u00a7\3\2\2\2\24\u00b1\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\u00b9\3\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00d9\3"+
		"\2\2\2 \u00de\3\2\2\2\"\u00e8\3\2\2\2$\u00ea\3\2\2\2&\u00f2\3\2\2\2()"+
		"\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5\6\4\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\5\3\2\2\2\60\64\5\20\t\2\61\64\5\22\n\2\62\64\5\30\r\2\63"+
		"\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\67\5\n\6\2\66"+
		"\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\7"+
		"\3\2\2<=\5\f\7\2=>\7+\2\2>[\3\2\2\2?@\7!\2\2@A\5\f\7\2AB\7+\2\2B[\3\2"+
		"\2\2CD\7\4\2\2DE\5\f\7\2EF\7+\2\2F[\3\2\2\2GH\7\5\2\2HI\5\f\7\2IJ\7+\2"+
		"\2J[\3\2\2\2K[\5$\23\2L[\5&\24\2MN\5\f\7\2NO\7,\2\2OP\5\f\7\2PQ\7+\2\2"+
		"Q[\3\2\2\2RT\7\6\2\2SU\5\f\7\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2V[\7+\2\2"+
		"WX\5\f\7\2XY\7+\2\2Y[\3\2\2\2Z;\3\2\2\2Z?\3\2\2\2ZC\3\2\2\2ZG\3\2\2\2"+
		"ZK\3\2\2\2ZL\3\2\2\2ZM\3\2\2\2ZR\3\2\2\2ZW\3\2\2\2[\13\3\2\2\2\\]\b\7"+
		"\1\2]^\7-\2\2^_\5\f\7\2_`\7.\2\2`|\3\2\2\2a|\7&\2\2bc\7&\2\2ci\7-\2\2"+
		"de\5\f\7\2ef\7\n\2\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\5\f\7\2mn\7.\2\2n|\3\2\2\2o|\7$\2\2p|\7%\2\2qr"+
		"\7\13\2\2rs\5\"\22\2st\7\f\2\2tu\7-\2\2uv\5\f\7\2vw\7.\2\2w|\3\2\2\2x"+
		"y\7\r\2\2yz\7&\2\2z|\7\r\2\2{\\\3\2\2\2{a\3\2\2\2{b\3\2\2\2{o\3\2\2\2"+
		"{p\3\2\2\2{q\3\2\2\2{x\3\2\2\2|\u008d\3\2\2\2}~\f\13\2\2~\177\t\2\2\2"+
		"\177\u008c\5\f\7\f\u0080\u0081\f\n\2\2\u0081\u0082\t\3\2\2\u0082\u008c"+
		"\5\f\7\13\u0083\u0084\f\r\2\2\u0084\u0085\7\7\2\2\u0085\u008c\7&\2\2\u0086"+
		"\u0087\f\f\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\t"+
		"\2\2\u008a\u008c\3\2\2\2\u008b}\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0083"+
		"\3\2\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\b\b\1\2"+
		"\u0091\u0092\5\f\7\2\u0092\u0093\t\4\2\2\u0093\u0094\5\f\7\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0098\7\24\2\2\u0096\u0098\7\25\2\2\u0097\u0090\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u009a"+
		"\f\5\2\2\u009a\u009b\t\5\2\2\u009b\u009d\5\16\b\6\u009c\u0099\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\17"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7&\2\2\u00a3"+
		"\u00a4\7\27\2\2\u00a4\u00a5\5\"\22\2\u00a5\u00a6\7+\2\2\u00a6\21\3\2\2"+
		"\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7&\2\2\u00a9\u00aa\7\31\2\2\u00aa"+
		"\u00ab\5\24\13\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7+\2\2\u00ad\23\3\2"+
		"\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b5\7&\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\"\22\2\u00b7"+
		"\u00b8\7+\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\7-\2\2\u00bb"+
		"\u00bc\5\32\16\2\u00bc\u00bf\7.\2\2\u00bd\u00be\7\27\2\2\u00be\u00c0\5"+
		"\"\22\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\31\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5"+
		"\7\32\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\n\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d1\5\34\17\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3\u00d4\7\27\2\2\u00d4"+
		"\u00d5\5\"\22\2\u00d5\35\3\2\2\2\u00d6\u00d8\5 \21\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\5\20\t\2\u00dd\u00df\5\22\n\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e9\7"+
		"\"\2\2\u00e1\u00e9\7#\2\2\u00e2\u00e9\7\33\2\2\u00e3\u00e4\7\b\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e9\5\"\22\2\u00e7\u00e9\7&"+
		"\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8"+
		"\u00e3\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00eb\7\34\2\2"+
		"\u00eb\u00ec\7-\2\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\7.\2\2\u00ee\u00ef"+
		"\7\31\2\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\7\32\2\2\u00f1%\3\2\2\2\u00f2"+
		"\u00f3\7\35\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6\7"+
		".\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8\5\b\5\2\u00f8\u00fe\7\32\2\2\u00f9"+
		"\u00fa\7\36\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7"+
		"\32\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\'\3\2\2\2\25.\638TZi{\u008b\u008d\u0097\u009e\u00b1\u00bf\u00cb\u00d0"+
		"\u00d9\u00de\u00e8\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}