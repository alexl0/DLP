// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

    import ast.*;
	import ast.VarDefinition.VarScope;

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
		FLOAT=33, LITENT=34, LITREAL=35, LITCHAR=36, IDENT=37, PLUS=38, MULT=39, 
		SUB=40, DIV=41, SEMICOLON=42, ASSIGN=43, OPEN_PAREN=44, CLOSE_PAREN=45, 
		LINE_COMMENT=46, MULTILINE_COMMENT=47, WHITESPACE=48;
	public static final int
		RULE_start = 0, RULE_definitions = 1, RULE_definition = 2, RULE_sentencias = 3, 
		RULE_sentencia = 4, RULE_expr = 5, RULE_type = 6, RULE_params = 7, RULE_param = 8, 
		RULE_defVar = 9, RULE_campos = 10, RULE_campo = 11, RULE_cond = 12, RULE_defStruct = 13, 
		RULE_defFunc = 14, RULE_defLocales = 15, RULE_defLocal = 16, RULE_defWhile = 17, 
		RULE_defIf = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definitions", "definition", "sentencias", "sentencia", "expr", 
			"type", "params", "param", "defVar", "campos", "campo", "cond", "defStruct", 
			"defFunc", "defLocales", "defLocal", "defWhile", "defIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'printsp'", "'println'", "'return'", "'.'", "'['", "']'", 
			"','", "'<'", "'>'", "'''", "'char'", "':'", "'var'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "'true'", "'false'", "'struct'", "'{'", 
			"'}'", "'while'", "'if'", "'else'", "'DATA'", "'CODE'", "'print'", "'int'", 
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
		public Program ast;
		public DefinitionsContext definitions;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
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
			((StartContext)_localctx).definitions = definitions();
			 ((StartContext)_localctx).ast = new Program(((StartContext)_localctx).definitions.list); 
			setState(40);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> list = new ArrayList<Definition>();;
		public DefinitionContext definition;
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((DefinitionsContext)_localctx).definition = definition();
				 _localctx.list.add(((DefinitionsContext)_localctx).definition.ast); 
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__22) | (1L << IDENT))) != 0) );
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

	public static class DefinitionContext extends ParserRuleContext {
		public Definition ast;
		public DefVarContext defVar;
		public DefVarContext defVar() {
			return getRuleContext(DefVarContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((DefinitionContext)_localctx).defVar = defVar();
				((DefinitionContext)_localctx).ast = ((DefinitionContext)_localctx).defVar.ast;
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << PRINT) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				{
				setState(56);
				sentencia();
				}
				}
				setState(61);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(PRINT);
				setState(67);
				expr(0);
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(T__1);
				setState(71);
				expr(0);
				setState(72);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__2);
				setState(75);
				expr(0);
				setState(76);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				defWhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				defIf();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				((SentenciaContext)_localctx).l = expr(0);
				setState(81);
				match(ASSIGN);
				setState(82);
				((SentenciaContext)_localctx).r = expr(0);
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				match(T__3);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
					{
					setState(86);
					expr(0);
					}
				}

				setState(89);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				expr(0);
				setState(91);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				match(IDENT);
				setState(94);
				match(OPEN_PAREN);
				setState(95);
				params();
				setState(96);
				match(CLOSE_PAREN);
				setState(97);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(102);
				match(OPEN_PAREN);
				setState(103);
				expr(0);
				setState(104);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				setState(106);
				match(IDENT);
				}
				break;
			case 3:
				{
				setState(107);
				match(IDENT);
				setState(108);
				match(OPEN_PAREN);
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						expr(0);
						setState(110);
						match(T__7);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(117);
				expr(0);
				setState(118);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				setState(120);
				match(LITENT);
				}
				break;
			case 5:
				{
				setState(121);
				match(LITREAL);
				}
				break;
			case 6:
				{
				setState(122);
				match(LITCHAR);
				}
				break;
			case 7:
				{
				setState(123);
				match(T__8);
				setState(124);
				type();
				setState(125);
				match(T__9);
				setState(126);
				match(OPEN_PAREN);
				setState(127);
				expr(0);
				setState(128);
				match(CLOSE_PAREN);
				}
				break;
			case 8:
				{
				setState(130);
				match(T__10);
				setState(131);
				match(IDENT);
				setState(132);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(136);
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
						setState(137);
						((ExprContext)_localctx).r = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
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
						setState(140);
						((ExprContext)_localctx).r = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						match(T__4);
						setState(143);
						match(IDENT);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						match(T__5);
						setState(146);
						expr(0);
						setState(147);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(153);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token i;
		public Token f;
		public Token c;
		public Token LITENT;
		public TypeContext type;
		public Token IDENT;
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((TypeContext)_localctx).i = match(INT);
				((TypeContext)_localctx).ast = new IntType(); _localctx.ast.setPositions(((TypeContext)_localctx).i);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((TypeContext)_localctx).f = match(FLOAT);
				((TypeContext)_localctx).ast = new RealType(); _localctx.ast.setPositions(((TypeContext)_localctx).f);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				((TypeContext)_localctx).c = match(T__11);
				((TypeContext)_localctx).ast = new CharType(); _localctx.ast.setPositions(((TypeContext)_localctx).c);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__5);
				setState(161);
				((TypeContext)_localctx).LITENT = match(LITENT);
				setState(162);
				match(T__6);
				setState(163);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast = new ArrayType(new IntConstant(((TypeContext)_localctx).LITENT), ((TypeContext)_localctx).type.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				((TypeContext)_localctx).IDENT = match(IDENT);
				((TypeContext)_localctx).ast = new VarType(((TypeContext)_localctx).IDENT);
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
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					param();
					setState(171);
					match(T__7);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(178);
				param();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENT);
			setState(182);
			match(T__12);
			setState(183);
			type();
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

	public static class DefVarContext extends ParserRuleContext {
		public Definition ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__13);
			setState(186);
			((DefVarContext)_localctx).IDENT = match(IDENT);
			setState(187);
			match(T__12);
			setState(188);
			((DefVarContext)_localctx).type = type();
			setState(189);
			match(SEMICOLON);
			((DefVarContext)_localctx).ast = new VarDefinition(((DefVarContext)_localctx).IDENT, ((DefVarContext)_localctx).type.ast, VarScope.GLOBAL);
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
		enterRule(_localctx, 20, RULE_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(192);
				campo();
				}
				}
				setState(197);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IDENT);
			setState(199);
			match(T__12);
			setState(200);
			type();
			setState(201);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
				setState(204);
				expr(0);
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				expr(0);
				}
				break;
			case T__20:
				{
				setState(208);
				match(T__20);
				}
				break;
			case T__21:
				{
				setState(209);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(212);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					cond(4);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 26, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__22);
			setState(221);
			match(IDENT);
			setState(222);
			match(T__23);
			setState(223);
			campos();
			setState(224);
			match(T__24);
			setState(225);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENT);
			setState(228);
			match(OPEN_PAREN);
			setState(229);
			params();
			setState(230);
			match(CLOSE_PAREN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(231);
				match(T__12);
				setState(232);
				type();
				}
			}

			setState(235);
			match(T__23);
			setState(236);
			defLocales();
			setState(237);
			sentencias();
			setState(238);
			match(T__24);
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
		enterRule(_localctx, 30, RULE_defLocales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__22) {
				{
				{
				setState(240);
				defLocal();
				}
				}
				setState(245);
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
		enterRule(_localctx, 32, RULE_defLocal);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				defVar();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
			setState(250);
			match(T__25);
			setState(251);
			match(OPEN_PAREN);
			setState(252);
			cond(0);
			setState(253);
			match(CLOSE_PAREN);
			setState(254);
			match(T__23);
			setState(255);
			sentencias();
			setState(256);
			match(T__24);
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
			setState(258);
			match(T__26);
			setState(259);
			match(OPEN_PAREN);
			setState(260);
			cond(0);
			setState(261);
			match(CLOSE_PAREN);
			setState(262);
			match(T__23);
			setState(263);
			sentencias();
			setState(264);
			match(T__24);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(265);
				match(T__27);
				setState(266);
				match(T__23);
				setState(267);
				sentencias();
				setState(268);
				match(T__24);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61"+
		"\3\4\3\4\3\4\3\4\3\4\5\49\n\4\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16\7"+
		"v\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t"+
		"\u00b3\13\t\3\t\5\t\u00b6\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\3\16\7\16"+
		"\u00da\n\16\f\16\16\16\u00dd\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\7\21\u00f4\n\21\f\21\16\21\u00f7\13\21\3\22\3\22\5\22\u00fb\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111\n\24\3\24\2\4\f\32\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\4\2))++\4\2((**\4\2\13\f\21"+
		"\24\3\2\25\26\2\u0127\2(\3\2\2\2\4/\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\ne\3"+
		"\2\2\2\f\u0087\3\2\2\2\16\u00aa\3\2\2\2\20\u00b1\3\2\2\2\22\u00b7\3\2"+
		"\2\2\24\u00bb\3\2\2\2\26\u00c5\3\2\2\2\30\u00c8\3\2\2\2\32\u00d4\3\2\2"+
		"\2\34\u00de\3\2\2\2\36\u00e5\3\2\2\2 \u00f5\3\2\2\2\"\u00fa\3\2\2\2$\u00fc"+
		"\3\2\2\2&\u0104\3\2\2\2()\5\4\3\2)*\b\2\1\2*+\7\2\2\3+\3\3\2\2\2,-\5\6"+
		"\4\2-.\b\3\1\2.\60\3\2\2\2/,\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\5\3\2\2\2\63\64\5\24\13\2\64\65\b\4\1\2\659\3\2\2\2\669\5\34"+
		"\17\2\679\5\36\20\28\63\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:<\5"+
		"\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2@A"+
		"\7\3\2\2AB\5\f\7\2BC\7,\2\2Cf\3\2\2\2DE\7!\2\2EF\5\f\7\2FG\7,\2\2Gf\3"+
		"\2\2\2HI\7\4\2\2IJ\5\f\7\2JK\7,\2\2Kf\3\2\2\2LM\7\5\2\2MN\5\f\7\2NO\7"+
		",\2\2Of\3\2\2\2Pf\5$\23\2Qf\5&\24\2RS\5\f\7\2ST\7-\2\2TU\5\f\7\2UV\7,"+
		"\2\2Vf\3\2\2\2WY\7\6\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[f\7,"+
		"\2\2\\]\5\f\7\2]^\7,\2\2^f\3\2\2\2_`\7\'\2\2`a\7.\2\2ab\5\20\t\2bc\7/"+
		"\2\2cd\7,\2\2df\3\2\2\2e@\3\2\2\2eD\3\2\2\2eH\3\2\2\2eL\3\2\2\2eP\3\2"+
		"\2\2eQ\3\2\2\2eR\3\2\2\2eW\3\2\2\2e\\\3\2\2\2e_\3\2\2\2f\13\3\2\2\2gh"+
		"\b\7\1\2hi\7.\2\2ij\5\f\7\2jk\7/\2\2k\u0088\3\2\2\2l\u0088\7\'\2\2mn\7"+
		"\'\2\2nt\7.\2\2op\5\f\7\2pq\7\n\2\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3"+
		"\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\f\7\2xy\7/\2\2y\u0088\3\2\2\2"+
		"z\u0088\7$\2\2{\u0088\7%\2\2|\u0088\7&\2\2}~\7\13\2\2~\177\5\16\b\2\177"+
		"\u0080\7\f\2\2\u0080\u0081\7.\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7/\2"+
		"\2\u0083\u0088\3\2\2\2\u0084\u0085\7\r\2\2\u0085\u0086\7\'\2\2\u0086\u0088"+
		"\7\r\2\2\u0087g\3\2\2\2\u0087l\3\2\2\2\u0087m\3\2\2\2\u0087z\3\2\2\2\u0087"+
		"{\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u0099"+
		"\3\2\2\2\u0089\u008a\f\f\2\2\u008a\u008b\t\2\2\2\u008b\u0098\5\f\7\r\u008c"+
		"\u008d\f\13\2\2\u008d\u008e\t\3\2\2\u008e\u0098\5\f\7\f\u008f\u0090\f"+
		"\16\2\2\u0090\u0091\7\7\2\2\u0091\u0098\7\'\2\2\u0092\u0093\f\r\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\t\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0089\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\"\2\2\u009d\u00ab"+
		"\b\b\1\2\u009e\u009f\7#\2\2\u009f\u00ab\b\b\1\2\u00a0\u00a1\7\16\2\2\u00a1"+
		"\u00ab\b\b\1\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\7\t"+
		"\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\b\b\1\2\u00a7\u00ab\3\2\2\2\u00a8"+
		"\u00a9\7\'\2\2\u00a9\u00ab\b\b\1\2\u00aa\u009c\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\17\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\n\2\2\u00ae\u00b0\3\2\2"+
		"\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\22\n\2"+
		"\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00b8"+
		"\7\'\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\5\16\b\2\u00ba\23\3\2\2\2\u00bb"+
		"\u00bc\7\20\2\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5"+
		"\16\b\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\b\13\1\2\u00c1\25\3\2\2\2\u00c2"+
		"\u00c4\5\30\r\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\7\'\2\2\u00c9\u00ca\7\17\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7"+
		",\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\b\16\1\2\u00ce\u00cf\5\f\7\2\u00cf"+
		"\u00d0\t\4\2\2\u00d0\u00d1\5\f\7\2\u00d1\u00d5\3\2\2\2\u00d2\u00d5\7\27"+
		"\2\2\u00d3\u00d5\7\30\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\f\5\2\2\u00d7\u00d8\t\5"+
		"\2\2\u00d8\u00da\5\32\16\6\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00df\7\31\2\2\u00df\u00e0\7\'\2\2\u00e0\u00e1\7\32\2\2\u00e1"+
		"\u00e2\5\26\f\2\u00e2\u00e3\7\33\2\2\u00e3\u00e4\7,\2\2\u00e4\35\3\2\2"+
		"\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\7.\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00eb"+
		"\7/\2\2\u00e9\u00ea\7\17\2\2\u00ea\u00ec\5\16\b\2\u00eb\u00e9\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\32\2\2\u00ee\u00ef"+
		"\5 \21\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\7\33\2\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f4\5\"\22\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb"+
		"\5\24\13\2\u00f9\u00fb\5\34\17\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2"+
		"\2\u00fb#\3\2\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\7.\2\2\u00fe\u00ff"+
		"\5\32\16\2\u00ff\u0100\7/\2\2\u0100\u0101\7\32\2\2\u0101\u0102\5\b\5\2"+
		"\u0102\u0103\7\33\2\2\u0103%\3\2\2\2\u0104\u0105\7\35\2\2\u0105\u0106"+
		"\7.\2\2\u0106\u0107\5\32\16\2\u0107\u0108\7/\2\2\u0108\u0109\7\32\2\2"+
		"\u0109\u010a\5\b\5\2\u010a\u0110\7\33\2\2\u010b\u010c\7\36\2\2\u010c\u010d"+
		"\7\32\2\2\u010d\u010e\5\b\5\2\u010e\u010f\7\33\2\2\u010f\u0111\3\2\2\2"+
		"\u0110\u010b\3\2\2\2\u0110\u0111\3\2\2\2\u0111\'\3\2\2\2\25\618=Yet\u0087"+
		"\u0097\u0099\u00aa\u00b1\u00b5\u00c5\u00d4\u00db\u00eb\u00f5\u00fa\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}