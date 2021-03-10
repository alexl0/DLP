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
		T__24=25, T__25=26, T__26=27, DATA=28, CODE=29, PRINT=30, INT=31, FLOAT=32, 
		LITENT=33, LITREAL=34, LITCHAR=35, IDENT=36, PLUS=37, MULT=38, SUB=39, 
		DIV=40, SEMICOLON=41, ASSIGN=42, OPEN_PAREN=43, CLOSE_PAREN=44, LINE_COMMENT=45, 
		MULTILINE_COMMENT=46, WHITESPACE=47;
	public static final int
		RULE_start = 0, RULE_definitions = 1, RULE_definition = 2, RULE_sentencias = 3, 
		RULE_sentencia = 4, RULE_expr = 5, RULE_type = 6, RULE_params = 7, RULE_param = 8, 
		RULE_defVars = 9, RULE_defVar = 10, RULE_fields = 11, RULE_exprs = 12, 
		RULE_defStruct = 13, RULE_defFunc = 14, RULE_defWhile = 15, RULE_defIf = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definitions", "definition", "sentencias", "sentencia", "expr", 
			"type", "params", "param", "defVars", "defVar", "fields", "exprs", "defStruct", 
			"defFunc", "defWhile", "defIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'printsp'", "'println'", "'return'", "'.'", "'['", "']'", 
			"'<'", "'>'", "'!='", "'=='", "'>='", "'<='", "'&&'", "'||'", "'!'", 
			"'''", "'char'", "','", "':'", "'var'", "'struct'", "'{'", "'}'", "'while'", 
			"'if'", "'else'", "'DATA'", "'CODE'", "'print'", "'int'", "'float'", 
			null, null, null, null, "'+'", "'*'", "'-'", "'/'", "';'", "'='", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "DATA", "CODE", "PRINT", "INT", "FLOAT", "LITENT", 
			"LITREAL", "LITCHAR", "IDENT", "PLUS", "MULT", "SUB", "DIV", "SEMICOLON", 
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
			setState(34);
			((StartContext)_localctx).definitions = definitions();
			 ((StartContext)_localctx).ast = new Program(((StartContext)_localctx).definitions.list); 
			setState(36);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				((DefinitionsContext)_localctx).definition = definition();
				 _localctx.list.add(((DefinitionsContext)_localctx).definition.ast); 
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << IDENT))) != 0) );
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
		public DefStructContext defStruct;
		public DefFuncContext defFunc;
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
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((DefinitionContext)_localctx).defVar = defVar();
				((DefinitionContext)_localctx).ast = ((DefinitionContext)_localctx).defVar.ast;
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				((DefinitionContext)_localctx).defStruct = defStruct();
				((DefinitionContext)_localctx).ast = ((DefinitionContext)_localctx).defStruct.ast;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				((DefinitionContext)_localctx).defFunc = defFunc();
				((DefinitionContext)_localctx).ast =  ((DefinitionContext)_localctx).defFunc.ast;
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
		public List<Sentence> list = new ArrayList<>();;
		public SentenciaContext sentencia;
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__15) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << PRINT) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				{
				setState(56);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(63);
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
		public Sentence ast;
		public ExprContext expr;
		public DefWhileContext defWhile;
		public DefIfContext defIf;
		public ExprContext l;
		public ExprContext r;
		public Token IDENT;
		public ExprsContext exprs;
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
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
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
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__0);
				setState(65);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(66);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(PRINT);
				setState(70);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(71);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__1);
				setState(75);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(76);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Printsp(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__2);
				setState(80);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(81);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Println(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__2);
				setState(85);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Println(new VoidConstant());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				((SentenciaContext)_localctx).defWhile = defWhile();
				((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).defWhile.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				((SentenciaContext)_localctx).defIf = defIf();
				((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).defIf.ast;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				((SentenciaContext)_localctx).l = expr(0);
				setState(94);
				match(ASSIGN);
				setState(95);
				((SentenciaContext)_localctx).r = expr(0);
				setState(96);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Assignment(((SentenciaContext)_localctx).l.ast, ((SentenciaContext)_localctx).r.ast);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				match(T__3);
				setState(100);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(101);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				match(T__3);
				setState(105);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Return(new VoidConstant());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(108);
				match(OPEN_PAREN);
				setState(109);
				((SentenciaContext)_localctx).exprs = exprs();
				setState(110);
				match(CLOSE_PAREN);
				setState(111);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new FuncInvocation(((SentenciaContext)_localctx).IDENT, ((SentenciaContext)_localctx).exprs.list);
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
		public Expression ast;
		public ExprContext e1;
		public ExprContext l;
		public ExprContext expr;
		public Token IDENT;
		public ExprsContext exprs;
		public Token LITENT;
		public Token LITREAL;
		public Token LITCHAR;
		public TypeContext type;
		public Token op;
		public ExprContext r;
		public ExprContext e2;
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(117);
				match(OPEN_PAREN);
				setState(118);
				((ExprContext)_localctx).expr = expr(0);
				setState(119);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 2:
				{
				setState(122);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 3:
				{
				setState(124);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(125);
				match(OPEN_PAREN);
				setState(126);
				((ExprContext)_localctx).exprs = exprs();
				setState(127);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  new FuncInvocationExpression(((ExprContext)_localctx).IDENT,((ExprContext)_localctx).exprs.list); 
				}
				break;
			case 4:
				{
				setState(130);
				((ExprContext)_localctx).LITENT = match(LITENT);
				 ((ExprContext)_localctx).ast =  new IntConstant(((ExprContext)_localctx).LITENT); 
				}
				break;
			case 5:
				{
				setState(132);
				((ExprContext)_localctx).LITREAL = match(LITREAL);
				 ((ExprContext)_localctx).ast =  new RealConstant(((ExprContext)_localctx).LITREAL); 
				}
				break;
			case 6:
				{
				setState(134);
				((ExprContext)_localctx).LITCHAR = match(LITCHAR);
				 ((ExprContext)_localctx).ast =  new CharConstant(((ExprContext)_localctx).LITCHAR); 
				}
				break;
			case 7:
				{
				setState(136);
				match(T__7);
				setState(137);
				((ExprContext)_localctx).type = type();
				setState(138);
				match(T__8);
				setState(139);
				match(OPEN_PAREN);
				setState(140);
				((ExprContext)_localctx).expr = expr(0);
				setState(141);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  new CastExpression(((ExprContext)_localctx).type.ast,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 8:
				{
				setState(144);
				((ExprContext)_localctx).op = match(T__15);
				setState(145);
				((ExprContext)_localctx).expr = expr(2);
				 ((ExprContext)_localctx).ast =  new UnaryExpression(((ExprContext)_localctx).op,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 9:
				{
				setState(148);
				match(T__16);
				setState(149);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(150);
				match(T__16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(154);
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
						setState(155);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(159);
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
						setState(160);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).ast =  new ComparableExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).ast =  new LogicalExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(174);
						match(T__4);
						setState(175);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new FieldAccessExpression(((ExprContext)_localctx).expr.ast,((ExprContext)_localctx).IDENT); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(178);
						match(T__5);
						setState(179);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(180);
						match(T__6);
						 ((ExprContext)_localctx).ast =  new IndexExpression(((ExprContext)_localctx).e1.ast,((ExprContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((TypeContext)_localctx).i = match(INT);
				((TypeContext)_localctx).ast = new IntType(); _localctx.ast.setPositions(((TypeContext)_localctx).i);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((TypeContext)_localctx).f = match(FLOAT);
				((TypeContext)_localctx).ast = new RealType(); _localctx.ast.setPositions(((TypeContext)_localctx).f);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				((TypeContext)_localctx).c = match(T__17);
				((TypeContext)_localctx).ast = new CharType(); _localctx.ast.setPositions(((TypeContext)_localctx).c);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__5);
				setState(195);
				((TypeContext)_localctx).LITENT = match(LITENT);
				setState(196);
				match(T__6);
				setState(197);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast = new ArrayType(new IntConstant(((TypeContext)_localctx).LITENT), ((TypeContext)_localctx).type.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
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
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public ParamContext param;
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
		try {
			int _alt;
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						((ParamsContext)_localctx).param = param();
						_localctx.list.add(((ParamsContext)_localctx).param.ast);
						setState(206);
						match(T__18);
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(213);
				((ParamsContext)_localctx).param = param();
				_localctx.list.add(((ParamsContext)_localctx).param.ast);
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
		public VarDefinition ast;
		public Token IDENT;
		public TypeContext type;
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
			setState(219);
			((ParamContext)_localctx).IDENT = match(IDENT);
			setState(220);
			match(T__19);
			setState(221);
			((ParamContext)_localctx).type = type();
			 ((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).IDENT,((ParamContext)_localctx).type.ast,VarScope.PARAM); 
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

	public static class DefVarsContext extends ParserRuleContext {
		public List<Definition> list = new ArrayList<Definition>();;
		public Token IDENT;
		public TypeContext type;
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public DefVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVars; }
	}

	public final DefVarsContext defVars() throws RecognitionException {
		DefVarsContext _localctx = new DefVarsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(224);
				match(T__20);
				setState(225);
				((DefVarsContext)_localctx).IDENT = match(IDENT);
				setState(226);
				match(T__19);
				setState(227);
				((DefVarsContext)_localctx).type = type();
				setState(228);
				match(SEMICOLON);
				 _localctx.list.add(new VarDefinition(((DefVarsContext)_localctx).IDENT,((DefVarsContext)_localctx).type.ast,VarScope.LOCAL)); 
				}
				}
				setState(235);
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
		enterRule(_localctx, 20, RULE_defVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__20);
			setState(237);
			((DefVarContext)_localctx).IDENT = match(IDENT);
			setState(238);
			match(T__19);
			setState(239);
			((DefVarContext)_localctx).type = type();
			setState(240);
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

	public static class FieldsContext extends ParserRuleContext {
		public List<StructField> list = new ArrayList<StructField>();;
		public Token IDENT;
		public TypeContext type;
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				((FieldsContext)_localctx).IDENT = match(IDENT);
				setState(244);
				match(T__19);
				setState(245);
				((FieldsContext)_localctx).type = type();
				setState(246);
				match(SEMICOLON);
				 _localctx.list.add(new StructField(((FieldsContext)_localctx).IDENT,((FieldsContext)_localctx).type.ast)); 
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class ExprsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__15) | (1L << T__16) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						((ExprsContext)_localctx).expr = expr(0);
						 _localctx.list.add(((ExprsContext)_localctx).expr.ast); 
						setState(255);
						match(T__18);
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(262);
				((ExprsContext)_localctx).expr = expr(0);
				 _localctx.list.add(((ExprsContext)_localctx).expr.ast); 
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

	public static class DefStructContext extends ParserRuleContext {
		public StructDefinition ast;
		public Token IDENT;
		public FieldsContext fields;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
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
			setState(267);
			match(T__21);
			setState(268);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(269);
			match(T__22);
			setState(270);
			((DefStructContext)_localctx).fields = fields();
			setState(271);
			match(T__23);
			setState(272);
			match(SEMICOLON);
			 ((DefStructContext)_localctx).ast =  new StructDefinition(new VarType(((DefStructContext)_localctx).IDENT),((DefStructContext)_localctx).fields.list); 
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
		public FunDefinition ast;
		public Token IDENT;
		public ParamsContext params;
		public TypeContext type;
		public DefVarsContext defVars;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public DefVarsContext defVars() {
			return getRuleContext(DefVarsContext.class,0);
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
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((DefFuncContext)_localctx).IDENT = match(IDENT);
				setState(276);
				match(OPEN_PAREN);
				setState(277);
				((DefFuncContext)_localctx).params = params();
				setState(278);
				match(CLOSE_PAREN);
				{
				setState(279);
				match(T__19);
				setState(280);
				((DefFuncContext)_localctx).type = type();
				}
				setState(282);
				match(T__22);
				setState(283);
				((DefFuncContext)_localctx).defVars = defVars();
				setState(284);
				((DefFuncContext)_localctx).sentencias = sentencias();
				setState(285);
				match(T__23);
				 ((DefFuncContext)_localctx).ast =  new FunDefinition(((DefFuncContext)_localctx).IDENT, ((DefFuncContext)_localctx).params.list, ((DefFuncContext)_localctx).type.ast,			((DefFuncContext)_localctx).defVars.list, ((DefFuncContext)_localctx).sentencias.list); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				((DefFuncContext)_localctx).IDENT = match(IDENT);
				setState(289);
				match(OPEN_PAREN);
				setState(290);
				((DefFuncContext)_localctx).params = params();
				setState(291);
				match(CLOSE_PAREN);
				setState(292);
				match(T__22);
				setState(293);
				((DefFuncContext)_localctx).defVars = defVars();
				setState(294);
				((DefFuncContext)_localctx).sentencias = sentencias();
				setState(295);
				match(T__23);
				 ((DefFuncContext)_localctx).ast =  new FunDefinition(((DefFuncContext)_localctx).IDENT, ((DefFuncContext)_localctx).params.list, new VoidType(),	((DefFuncContext)_localctx).defVars.list, ((DefFuncContext)_localctx).sentencias.list); 
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

	public static class DefWhileContext extends ParserRuleContext {
		public While ast;
		public ExprContext expr;
		public SentenciasContext sentencias;
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 30, RULE_defWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__24);
			setState(301);
			match(OPEN_PAREN);
			setState(302);
			((DefWhileContext)_localctx).expr = expr(0);
			setState(303);
			match(CLOSE_PAREN);
			setState(304);
			match(T__22);
			setState(305);
			((DefWhileContext)_localctx).sentencias = sentencias();
			setState(306);
			match(T__23);
			 ((DefWhileContext)_localctx).ast =  new While(((DefWhileContext)_localctx).expr.ast, ((DefWhileContext)_localctx).sentencias.list); 
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
		public IfElse ast;
		public ExprContext expr;
		public SentenciasContext sentencias;
		public SentenciasContext ifSentences;
		public SentenciasContext elseSentences;
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 32, RULE_defIf);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__25);
				setState(310);
				match(OPEN_PAREN);
				setState(311);
				((DefIfContext)_localctx).expr = expr(0);
				setState(312);
				match(CLOSE_PAREN);
				setState(313);
				match(T__22);
				setState(314);
				((DefIfContext)_localctx).sentencias = sentencias();
				setState(315);
				match(T__23);
				 ((DefIfContext)_localctx).ast =  new IfElse(((DefIfContext)_localctx).expr.ast, ((DefIfContext)_localctx).sentencias.list, 	null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__25);
				setState(319);
				match(OPEN_PAREN);
				setState(320);
				((DefIfContext)_localctx).expr = expr(0);
				setState(321);
				match(CLOSE_PAREN);
				setState(322);
				match(T__22);
				setState(323);
				((DefIfContext)_localctx).ifSentences = sentencias();
				setState(324);
				match(T__23);
				setState(325);
				match(T__26);
				setState(326);
				match(T__22);
				setState(327);
				((DefIfContext)_localctx).elseSentences = sentencias();
				setState(328);
				match(T__23);
				 ((DefIfContext)_localctx).ast =  new IfElse(((DefIfContext)_localctx).expr.ast, ((DefIfContext)_localctx).ifSentences.list, 	((DefIfContext)_localctx).elseSentences.list); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ba\n\7\f"+
		"\7\16\7\u00bd\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00cd\n\b\3\t\3\t\3\t\3\t\7\t\u00d3\n\t\f\t\16\t\u00d6\13\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00ea\n\13\f\13\16\13\u00ed\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00fc\n\r\r\r\16\r\u00fd\3\16\3"+
		"\16\3\16\3\16\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\16\3\16\3\16\5"+
		"\16\u010c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012d\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014e"+
		"\n\22\3\22\2\3\f\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2"+
		"((**\4\2\'\'))\3\2\n\17\3\2\20\21\2\u0166\2$\3\2\2\2\4+\3\2\2\2\68\3\2"+
		"\2\2\b?\3\2\2\2\nt\3\2\2\2\f\u0099\3\2\2\2\16\u00cc\3\2\2\2\20\u00db\3"+
		"\2\2\2\22\u00dd\3\2\2\2\24\u00eb\3\2\2\2\26\u00ee\3\2\2\2\30\u00fb\3\2"+
		"\2\2\32\u010b\3\2\2\2\34\u010d\3\2\2\2\36\u012c\3\2\2\2 \u012e\3\2\2\2"+
		"\"\u014d\3\2\2\2$%\5\4\3\2%&\b\2\1\2&\'\7\2\2\3\'\3\3\2\2\2()\5\6\4\2"+
		")*\b\3\1\2*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2"+
		"\2/\60\5\26\f\2\60\61\b\4\1\2\619\3\2\2\2\62\63\5\34\17\2\63\64\b\4\1"+
		"\2\649\3\2\2\2\65\66\5\36\20\2\66\67\b\4\1\2\679\3\2\2\28/\3\2\2\28\62"+
		"\3\2\2\28\65\3\2\2\29\7\3\2\2\2:;\5\n\6\2;<\b\5\1\2<>\3\2\2\2=:\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BC\7\3\2\2CD\5\f"+
		"\7\2DE\7+\2\2EF\b\6\1\2Fu\3\2\2\2GH\7 \2\2HI\5\f\7\2IJ\7+\2\2JK\b\6\1"+
		"\2Ku\3\2\2\2LM\7\4\2\2MN\5\f\7\2NO\7+\2\2OP\b\6\1\2Pu\3\2\2\2QR\7\5\2"+
		"\2RS\5\f\7\2ST\7+\2\2TU\b\6\1\2Uu\3\2\2\2VW\7\5\2\2WX\7+\2\2Xu\b\6\1\2"+
		"YZ\5 \21\2Z[\b\6\1\2[u\3\2\2\2\\]\5\"\22\2]^\b\6\1\2^u\3\2\2\2_`\5\f\7"+
		"\2`a\7,\2\2ab\5\f\7\2bc\7+\2\2cd\b\6\1\2du\3\2\2\2ef\7\6\2\2fg\5\f\7\2"+
		"gh\7+\2\2hi\b\6\1\2iu\3\2\2\2jk\7\6\2\2kl\7+\2\2lu\b\6\1\2mn\7&\2\2no"+
		"\7-\2\2op\5\32\16\2pq\7.\2\2qr\7+\2\2rs\b\6\1\2su\3\2\2\2tB\3\2\2\2tG"+
		"\3\2\2\2tL\3\2\2\2tQ\3\2\2\2tV\3\2\2\2tY\3\2\2\2t\\\3\2\2\2t_\3\2\2\2"+
		"te\3\2\2\2tj\3\2\2\2tm\3\2\2\2u\13\3\2\2\2vw\b\7\1\2wx\7-\2\2xy\5\f\7"+
		"\2yz\7.\2\2z{\b\7\1\2{\u009a\3\2\2\2|}\7&\2\2}\u009a\b\7\1\2~\177\7&\2"+
		"\2\177\u0080\7-\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7.\2\2\u0082\u0083"+
		"\b\7\1\2\u0083\u009a\3\2\2\2\u0084\u0085\7#\2\2\u0085\u009a\b\7\1\2\u0086"+
		"\u0087\7$\2\2\u0087\u009a\b\7\1\2\u0088\u0089\7%\2\2\u0089\u009a\b\7\1"+
		"\2\u008a\u008b\7\n\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\13\2\2\u008d"+
		"\u008e\7-\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7.\2\2\u0090\u0091\b\7\1"+
		"\2\u0091\u009a\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u0094\5\f\7\4\u0094"+
		"\u0095\b\7\1\2\u0095\u009a\3\2\2\2\u0096\u0097\7\23\2\2\u0097\u0098\7"+
		"&\2\2\u0098\u009a\7\23\2\2\u0099v\3\2\2\2\u0099|\3\2\2\2\u0099~\3\2\2"+
		"\2\u0099\u0084\3\2\2\2\u0099\u0086\3\2\2\2\u0099\u0088\3\2\2\2\u0099\u008a"+
		"\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u00bb\3\2\2\2\u009b"+
		"\u009c\f\17\2\2\u009c\u009d\t\2\2\2\u009d\u009e\5\f\7\20\u009e\u009f\b"+
		"\7\1\2\u009f\u00ba\3\2\2\2\u00a0\u00a1\f\16\2\2\u00a1\u00a2\t\3\2\2\u00a2"+
		"\u00a3\5\f\7\17\u00a3\u00a4\b\7\1\2\u00a4\u00ba\3\2\2\2\u00a5\u00a6\f"+
		"\6\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a8\5\f\7\7\u00a8\u00a9\b\7\1\2\u00a9"+
		"\u00ba\3\2\2\2\u00aa\u00ab\f\5\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\5\f"+
		"\7\6\u00ad\u00ae\b\7\1\2\u00ae\u00ba\3\2\2\2\u00af\u00b0\f\21\2\2\u00b0"+
		"\u00b1\7\7\2\2\u00b1\u00b2\7&\2\2\u00b2\u00ba\b\7\1\2\u00b3\u00b4\f\20"+
		"\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5\f\7\2\u00b6\u00b7\7\t\2\2\u00b7"+
		"\u00b8\b\7\1\2\u00b8\u00ba\3\2\2\2\u00b9\u009b\3\2\2\2\u00b9\u00a0\3\2"+
		"\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7!\2\2\u00bf\u00cd"+
		"\b\b\1\2\u00c0\u00c1\7\"\2\2\u00c1\u00cd\b\b\1\2\u00c2\u00c3\7\24\2\2"+
		"\u00c3\u00cd\b\b\1\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7"+
		"\7\t\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9\b\b\1\2\u00c9\u00cd\3\2\2\2"+
		"\u00ca\u00cb\7&\2\2\u00cb\u00cd\b\b\1\2\u00cc\u00be\3\2\2\2\u00cc\u00c0"+
		"\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\17\3\2\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\b\t\1\2\u00d0\u00d1\7\25"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\b\t\1\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\21\3\2\2"+
		"\2\u00dd\u00de\7&\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\5\16\b\2\u00e0"+
		"\u00e1\b\n\1\2\u00e1\23\3\2\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\7&\2"+
		"\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\7+\2\2\u00e7"+
		"\u00e8\b\13\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\25\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\7&\2\2\u00f0\u00f1\7\26"+
		"\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\b\f\1\2\u00f4"+
		"\27\3\2\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7\26\2\2\u00f7\u00f8\5\16\b"+
		"\2\u00f8\u00f9\7+\2\2\u00f9\u00fa\b\r\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f5"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\31\3\2\2\2\u00ff\u0100\5\f\7\2\u0100\u0101\b\16\1\2\u0101\u0102\7\25"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\5\f\7\2\u0109\u010a\b\16\1\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0105\3\2\2\2\u010b\u010c\3\2\2\2\u010c\33\3\2\2\2\u010d\u010e\7\30\2"+
		"\2\u010e\u010f\7&\2\2\u010f\u0110\7\31\2\2\u0110\u0111\5\30\r\2\u0111"+
		"\u0112\7\32\2\2\u0112\u0113\7+\2\2\u0113\u0114\b\17\1\2\u0114\35\3\2\2"+
		"\2\u0115\u0116\7&\2\2\u0116\u0117\7-\2\2\u0117\u0118\5\20\t\2\u0118\u0119"+
		"\7.\2\2\u0119\u011a\7\26\2\2\u011a\u011b\5\16\b\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\7\31\2\2\u011d\u011e\5\24\13\2\u011e\u011f\5\b\5\2\u011f"+
		"\u0120\7\32\2\2\u0120\u0121\b\20\1\2\u0121\u012d\3\2\2\2\u0122\u0123\7"+
		"&\2\2\u0123\u0124\7-\2\2\u0124\u0125\5\20\t\2\u0125\u0126\7.\2\2\u0126"+
		"\u0127\7\31\2\2\u0127\u0128\5\24\13\2\u0128\u0129\5\b\5\2\u0129\u012a"+
		"\7\32\2\2\u012a\u012b\b\20\1\2\u012b\u012d\3\2\2\2\u012c\u0115\3\2\2\2"+
		"\u012c\u0122\3\2\2\2\u012d\37\3\2\2\2\u012e\u012f\7\33\2\2\u012f\u0130"+
		"\7-\2\2\u0130\u0131\5\f\7\2\u0131\u0132\7.\2\2\u0132\u0133\7\31\2\2\u0133"+
		"\u0134\5\b\5\2\u0134\u0135\7\32\2\2\u0135\u0136\b\21\1\2\u0136!\3\2\2"+
		"\2\u0137\u0138\7\34\2\2\u0138\u0139\7-\2\2\u0139\u013a\5\f\7\2\u013a\u013b"+
		"\7.\2\2\u013b\u013c\7\31\2\2\u013c\u013d\5\b\5\2\u013d\u013e\7\32\2\2"+
		"\u013e\u013f\b\22\1\2\u013f\u014e\3\2\2\2\u0140\u0141\7\34\2\2\u0141\u0142"+
		"\7-\2\2\u0142\u0143\5\f\7\2\u0143\u0144\7.\2\2\u0144\u0145\7\31\2\2\u0145"+
		"\u0146\5\b\5\2\u0146\u0147\7\32\2\2\u0147\u0148\7\35\2\2\u0148\u0149\7"+
		"\31\2\2\u0149\u014a\5\b\5\2\u014a\u014b\7\32\2\2\u014b\u014c\b\22\1\2"+
		"\u014c\u014e\3\2\2\2\u014d\u0137\3\2\2\2\u014d\u0140\3\2\2\2\u014e#\3"+
		"\2\2\2\22-8?t\u0099\u00b9\u00bb\u00cc\u00d4\u00db\u00eb\u00fd\u0105\u010b"+
		"\u012c\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}