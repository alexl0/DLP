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
		RULE_sentencia = 4, RULE_exprs = 5, RULE_expr = 6, RULE_defVars = 7, RULE_defVarLocal = 8, 
		RULE_defVar = 9, RULE_defStruct = 10, RULE_defFunc = 11, RULE_defWhile = 12, 
		RULE_defIf = 13, RULE_type = 14, RULE_params = 15, RULE_param = 16, RULE_fields = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definitions", "definition", "sentencias", "sentencia", "exprs", 
			"expr", "defVars", "defVarLocal", "defVar", "defStruct", "defFunc", "defWhile", 
			"defIf", "type", "params", "param", "fields"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'printsp'", "'println'", "'return'", "','", "'.'", "'['", 
			"']'", "'<'", "'>'", "'!='", "'=='", "'>='", "'<='", "'&&'", "'||'", 
			"'!'", "'''", "'var'", "':'", "'struct'", "'{'", "'}'", "'while'", "'if'", 
			"'else'", "'char'", "'DATA'", "'CODE'", "'print'", "'int'", "'float'", 
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
			setState(36);
			((StartContext)_localctx).definitions = definitions();
			 ((StartContext)_localctx).ast = new Program(((StartContext)_localctx).definitions.list); 
			setState(38);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				((DefinitionsContext)_localctx).definition = definition();
				 _localctx.list.add(((DefinitionsContext)_localctx).definition.ast); 
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__20) | (1L << IDENT))) != 0) );
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((DefinitionContext)_localctx).defVar = defVar();
				((DefinitionContext)_localctx).ast = ((DefinitionContext)_localctx).defVar.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((DefinitionContext)_localctx).defStruct = defStruct();
				((DefinitionContext)_localctx).ast = ((DefinitionContext)_localctx).defStruct.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				((DefinitionContext)_localctx).defFunc = defFunc();
				((DefinitionContext)_localctx).ast =  ((DefinitionContext)_localctx).defFunc.ast;
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__23) | (1L << T__24) | (1L << PRINT) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				{
				setState(58);
				((SentenciasContext)_localctx).sentencia = sentencia();
				_localctx.list.add(((SentenciasContext)_localctx).sentencia.ast);
				}
				}
				setState(65);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__0);
				setState(67);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(68);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(PRINT);
				setState(72);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(73);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__1);
				setState(77);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(78);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Printsp(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(T__2);
				setState(82);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(83);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Println(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(T__2);
				setState(87);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Println(new VoidConstant());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				((SentenciaContext)_localctx).defWhile = defWhile();
				((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).defWhile.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				((SentenciaContext)_localctx).defIf = defIf();
				((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).defIf.ast;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				((SentenciaContext)_localctx).l = expr(0);
				setState(96);
				match(ASSIGN);
				setState(97);
				((SentenciaContext)_localctx).r = expr(0);
				setState(98);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Assignment(((SentenciaContext)_localctx).l.ast, ((SentenciaContext)_localctx).r.ast);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(T__3);
				setState(102);
				((SentenciaContext)_localctx).expr = expr(0);
				setState(103);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expr.ast);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				match(T__3);
				setState(107);
				match(SEMICOLON);
				((SentenciaContext)_localctx).ast =  new Return(new VoidConstant());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(110);
				match(OPEN_PAREN);
				setState(111);
				((SentenciaContext)_localctx).exprs = exprs();
				setState(112);
				match(CLOSE_PAREN);
				setState(113);
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
		enterRule(_localctx, 10, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << LITENT) | (1L << LITREAL) | (1L << LITCHAR) | (1L << IDENT) | (1L << OPEN_PAREN))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						((ExprsContext)_localctx).expr = expr(0);
						 _localctx.list.add(((ExprsContext)_localctx).expr.ast); 
						setState(120);
						match(T__4);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(127);
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

	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext e;
		public ExprContext e1;
		public ExprContext l;
		public Token IDENT;
		public Token LITENT;
		public Token LITREAL;
		public Token LITCHAR;
		public ExprsContext exprs;
		public ExprContext expr;
		public TypeContext type;
		public Token op;
		public ExprContext r;
		public ExprContext e2;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GrammarParser.OPEN_PAREN, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GrammarParser.CLOSE_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(133);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 2:
				{
				setState(135);
				((ExprContext)_localctx).LITENT = match(LITENT);
				 ((ExprContext)_localctx).ast =  new IntConstant(((ExprContext)_localctx).LITENT); 
				}
				break;
			case 3:
				{
				setState(137);
				((ExprContext)_localctx).LITREAL = match(LITREAL);
				 ((ExprContext)_localctx).ast =  new RealConstant(((ExprContext)_localctx).LITREAL); 
				}
				break;
			case 4:
				{
				setState(139);
				((ExprContext)_localctx).LITCHAR = match(LITCHAR);
				 ((ExprContext)_localctx).ast =  new CharConstant(((ExprContext)_localctx).LITCHAR); 
				}
				break;
			case 5:
				{
				setState(141);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(142);
				match(OPEN_PAREN);
				setState(143);
				((ExprContext)_localctx).exprs = exprs();
				setState(144);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  new FuncInvocationExpression(((ExprContext)_localctx).IDENT,((ExprContext)_localctx).exprs.list); 
				}
				break;
			case 6:
				{
				setState(147);
				match(OPEN_PAREN);
				setState(148);
				((ExprContext)_localctx).expr = expr(0);
				setState(149);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 7:
				{
				setState(152);
				match(T__8);
				setState(153);
				((ExprContext)_localctx).type = type();
				setState(154);
				match(T__9);
				setState(155);
				match(OPEN_PAREN);
				setState(156);
				((ExprContext)_localctx).expr = expr(0);
				setState(157);
				match(CLOSE_PAREN);
				 ((ExprContext)_localctx).ast =  new CastExpression(((ExprContext)_localctx).type.ast,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 8:
				{
				setState(160);
				((ExprContext)_localctx).op = match(T__16);
				setState(161);
				((ExprContext)_localctx).expr = expr(2);
				 ((ExprContext)_localctx).ast =  new UnaryExpression(((ExprContext)_localctx).op,((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 9:
				{
				setState(164);
				match(T__17);
				setState(165);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(166);
				match(T__17);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(170);
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
						setState(171);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175);
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
						setState(176);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
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
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).ast =  new LogicalExpression(((ExprContext)_localctx).l.ast,((ExprContext)_localctx).op,((ExprContext)_localctx).r.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190);
						match(T__5);
						setState(191);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new FieldAccessExpression(((ExprContext)_localctx).e.ast,((ExprContext)_localctx).IDENT); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(194);
						match(T__6);
						setState(195);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(0);
						setState(196);
						match(T__7);
						 ((ExprContext)_localctx).ast =  new IndexExpression(((ExprContext)_localctx).e1.ast,((ExprContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(203);
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

	public static class DefVarsContext extends ParserRuleContext {
		public List<Definition> list = new ArrayList<Definition>();;
		public Token IDENT;
		public TypeContext type;
		public DefVarLocalContext defVarLocal;
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
		public List<DefVarLocalContext> defVarLocal() {
			return getRuleContexts(DefVarLocalContext.class);
		}
		public DefVarLocalContext defVarLocal(int i) {
			return getRuleContext(DefVarLocalContext.class,i);
		}
		public DefVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVars; }
	}

	public final DefVarsContext defVars() throws RecognitionException {
		DefVarsContext _localctx = new DefVarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defVars);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(204);
					match(T__18);
					setState(205);
					((DefVarsContext)_localctx).IDENT = match(IDENT);
					setState(206);
					match(T__19);
					setState(207);
					((DefVarsContext)_localctx).type = type();
					setState(208);
					match(SEMICOLON);
					 _localctx.list.add(new VarDefinition(((DefVarsContext)_localctx).IDENT,((DefVarsContext)_localctx).type.ast,VarScope.LOCAL)); 
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						((DefVarsContext)_localctx).defVarLocal = defVarLocal();
						_localctx.list.add(((DefVarsContext)_localctx).defVarLocal.ast); 
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
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

	public static class DefVarLocalContext extends ParserRuleContext {
		public Definition ast;
		public Token IDENT;
		public Token LITENT;
		public Token LITREAL;
		public Token LITCHAR;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public DefVarLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVarLocal; }
	}

	public final DefVarLocalContext defVarLocal() throws RecognitionException {
		DefVarLocalContext _localctx = new DefVarLocalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defVarLocal);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((DefVarLocalContext)_localctx).IDENT = match(IDENT);
				setState(227);
				match(T__19);
				setState(228);
				match(T__18);
				setState(229);
				match(ASSIGN);
				setState(230);
				((DefVarLocalContext)_localctx).LITENT = match(LITENT);
				setState(231);
				match(SEMICOLON);
				((DefVarLocalContext)_localctx).ast = new VarDefinition(((DefVarLocalContext)_localctx).IDENT, new IntType(), 	VarScope.LOCAL,  LexerHelper.lexemeToInt((((DefVarLocalContext)_localctx).LITENT!=null?((DefVarLocalContext)_localctx).LITENT.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((DefVarLocalContext)_localctx).IDENT = match(IDENT);
				setState(234);
				match(T__19);
				setState(235);
				match(T__18);
				setState(236);
				match(ASSIGN);
				setState(237);
				((DefVarLocalContext)_localctx).LITREAL = match(LITREAL);
				setState(238);
				match(SEMICOLON);
				((DefVarLocalContext)_localctx).ast = new VarDefinition(((DefVarLocalContext)_localctx).IDENT, new RealType(), VarScope.LOCAL,  LexerHelper.lexemeToReal((((DefVarLocalContext)_localctx).LITREAL!=null?((DefVarLocalContext)_localctx).LITREAL.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				((DefVarLocalContext)_localctx).IDENT = match(IDENT);
				setState(241);
				match(T__19);
				setState(242);
				match(T__18);
				setState(243);
				match(ASSIGN);
				setState(244);
				((DefVarLocalContext)_localctx).LITCHAR = match(LITCHAR);
				setState(245);
				match(SEMICOLON);
				((DefVarLocalContext)_localctx).ast = new VarDefinition(((DefVarLocalContext)_localctx).IDENT, new CharType(), VarScope.LOCAL,  LexerHelper.lexemeToChar((((DefVarLocalContext)_localctx).LITCHAR!=null?((DefVarLocalContext)_localctx).LITCHAR.getText():null)));
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

	public static class DefVarContext extends ParserRuleContext {
		public Definition ast;
		public Token IDENT;
		public TypeContext type;
		public Token LITENT;
		public Token LITREAL;
		public Token LITCHAR;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defVar);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__18);
				setState(250);
				((DefVarContext)_localctx).IDENT = match(IDENT);
				setState(251);
				match(T__19);
				setState(252);
				((DefVarContext)_localctx).type = type();
				setState(253);
				match(SEMICOLON);
				((DefVarContext)_localctx).ast = new VarDefinition(((DefVarContext)_localctx).IDENT, ((DefVarContext)_localctx).type.ast, 		VarScope.GLOBAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((DefVarContext)_localctx).IDENT = match(IDENT);
				setState(257);
				match(T__19);
				setState(258);
				match(T__18);
				setState(259);
				match(ASSIGN);
				setState(260);
				((DefVarContext)_localctx).LITENT = match(LITENT);
				setState(261);
				match(SEMICOLON);
				((DefVarContext)_localctx).ast = new VarDefinition(((DefVarContext)_localctx).IDENT, new IntType(), 	VarScope.GLOBAL,  LexerHelper.lexemeToInt((((DefVarContext)_localctx).LITENT!=null?((DefVarContext)_localctx).LITENT.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((DefVarContext)_localctx).IDENT = match(IDENT);
				setState(264);
				match(T__19);
				setState(265);
				match(T__18);
				setState(266);
				match(ASSIGN);
				setState(267);
				((DefVarContext)_localctx).LITREAL = match(LITREAL);
				setState(268);
				match(SEMICOLON);
				((DefVarContext)_localctx).ast = new VarDefinition(((DefVarContext)_localctx).IDENT, new RealType(), VarScope.GLOBAL,  LexerHelper.lexemeToReal((((DefVarContext)_localctx).LITREAL!=null?((DefVarContext)_localctx).LITREAL.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				((DefVarContext)_localctx).IDENT = match(IDENT);
				setState(271);
				match(T__19);
				setState(272);
				match(T__18);
				setState(273);
				match(ASSIGN);
				setState(274);
				((DefVarContext)_localctx).LITCHAR = match(LITCHAR);
				setState(275);
				match(SEMICOLON);
				((DefVarContext)_localctx).ast = new VarDefinition(((DefVarContext)_localctx).IDENT, new CharType(), VarScope.GLOBAL,  LexerHelper.lexemeToChar((((DefVarContext)_localctx).LITCHAR!=null?((DefVarContext)_localctx).LITCHAR.getText():null)));
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
		enterRule(_localctx, 20, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__20);
			setState(280);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(281);
			match(T__21);
			setState(282);
			((DefStructContext)_localctx).fields = fields();
			setState(283);
			match(T__22);
			setState(284);
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
		enterRule(_localctx, 22, RULE_defFunc);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((DefFuncContext)_localctx).IDENT = match(IDENT);
				setState(288);
				match(OPEN_PAREN);
				setState(289);
				((DefFuncContext)_localctx).params = params();
				setState(290);
				match(CLOSE_PAREN);
				{
				setState(291);
				match(T__19);
				setState(292);
				((DefFuncContext)_localctx).type = type();
				}
				setState(294);
				match(T__21);
				setState(295);
				((DefFuncContext)_localctx).defVars = defVars();
				setState(296);
				((DefFuncContext)_localctx).sentencias = sentencias();
				setState(297);
				match(T__22);
				 ((DefFuncContext)_localctx).ast =  new FunDefinition(((DefFuncContext)_localctx).IDENT, ((DefFuncContext)_localctx).params.list, ((DefFuncContext)_localctx).type.ast,			((DefFuncContext)_localctx).defVars.list, ((DefFuncContext)_localctx).sentencias.list); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				((DefFuncContext)_localctx).IDENT = match(IDENT);
				setState(301);
				match(OPEN_PAREN);
				setState(302);
				((DefFuncContext)_localctx).params = params();
				setState(303);
				match(CLOSE_PAREN);
				setState(304);
				match(T__21);
				setState(305);
				((DefFuncContext)_localctx).defVars = defVars();
				setState(306);
				((DefFuncContext)_localctx).sentencias = sentencias();
				setState(307);
				match(T__22);
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
		enterRule(_localctx, 24, RULE_defWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__23);
			setState(313);
			match(OPEN_PAREN);
			setState(314);
			((DefWhileContext)_localctx).expr = expr(0);
			setState(315);
			match(CLOSE_PAREN);
			setState(316);
			match(T__21);
			setState(317);
			((DefWhileContext)_localctx).sentencias = sentencias();
			setState(318);
			match(T__22);
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
		enterRule(_localctx, 26, RULE_defIf);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__24);
				setState(322);
				match(OPEN_PAREN);
				setState(323);
				((DefIfContext)_localctx).expr = expr(0);
				setState(324);
				match(CLOSE_PAREN);
				setState(325);
				match(T__21);
				setState(326);
				((DefIfContext)_localctx).sentencias = sentencias();
				setState(327);
				match(T__22);
				 ((DefIfContext)_localctx).ast =  new IfElse(((DefIfContext)_localctx).expr.ast, ((DefIfContext)_localctx).sentencias.list, 	null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T__24);
				setState(331);
				match(OPEN_PAREN);
				setState(332);
				((DefIfContext)_localctx).expr = expr(0);
				setState(333);
				match(CLOSE_PAREN);
				setState(334);
				match(T__21);
				setState(335);
				((DefIfContext)_localctx).ifSentences = sentencias();
				setState(336);
				match(T__22);
				setState(337);
				match(T__25);
				setState(338);
				match(T__21);
				setState(339);
				((DefIfContext)_localctx).elseSentences = sentencias();
				setState(340);
				match(T__22);
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
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((TypeContext)_localctx).i = match(INT);
				((TypeContext)_localctx).ast = new IntType(); _localctx.ast.setPositions(((TypeContext)_localctx).i);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				((TypeContext)_localctx).f = match(FLOAT);
				((TypeContext)_localctx).ast = new RealType(); _localctx.ast.setPositions(((TypeContext)_localctx).f);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				((TypeContext)_localctx).c = match(T__26);
				((TypeContext)_localctx).ast = new CharType(); _localctx.ast.setPositions(((TypeContext)_localctx).c);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(T__6);
				setState(352);
				((TypeContext)_localctx).LITENT = match(LITENT);
				setState(353);
				match(T__7);
				setState(354);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast = new ArrayType(new IntConstant(((TypeContext)_localctx).LITENT), ((TypeContext)_localctx).type.ast);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
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
		enterRule(_localctx, 30, RULE_params);
		try {
			int _alt;
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						((ParamsContext)_localctx).param = param();
						_localctx.list.add(((ParamsContext)_localctx).param.ast);
						setState(363);
						match(T__4);
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(370);
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
		enterRule(_localctx, 32, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((ParamContext)_localctx).IDENT = match(IDENT);
			setState(377);
			match(T__19);
			setState(378);
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
		enterRule(_localctx, 34, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				((FieldsContext)_localctx).IDENT = match(IDENT);
				setState(382);
				match(T__19);
				setState(383);
				((FieldsContext)_localctx).type = type();
				setState(384);
				match(SEMICOLON);
				 _localctx.list.add(new StructField(((FieldsContext)_localctx).IDENT,((FieldsContext)_localctx).type.ast)); 
				}
				}
				setState(389); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u018a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6"+
		"\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3\7\5\7\u0085\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00aa\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00ca\n\b\f\b\16\b\u00cd\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d6\n"+
		"\t\f\t\16\t\u00d9\13\t\3\t\3\t\3\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t\5"+
		"\t\u00e3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fa\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0118\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0139\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u015a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u016a\n\20\3\21\3\21\3\21\3\21\7\21\u0170\n\21\f"+
		"\21\16\21\u0173\13\21\3\21\3\21\3\21\3\21\5\21\u0179\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0186\n\23\r\23\16\23"+
		"\u0187\3\23\2\3\16\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\4"+
		"\2((**\4\2\'\'))\3\2\13\20\3\2\21\22\2\u01a6\2&\3\2\2\2\4-\3\2\2\2\6:"+
		"\3\2\2\2\bA\3\2\2\2\nv\3\2\2\2\f\u0084\3\2\2\2\16\u00a9\3\2\2\2\20\u00e2"+
		"\3\2\2\2\22\u00f9\3\2\2\2\24\u0117\3\2\2\2\26\u0119\3\2\2\2\30\u0138\3"+
		"\2\2\2\32\u013a\3\2\2\2\34\u0159\3\2\2\2\36\u0169\3\2\2\2 \u0178\3\2\2"+
		"\2\"\u017a\3\2\2\2$\u0185\3\2\2\2&\'\5\4\3\2\'(\b\2\1\2()\7\2\2\3)\3\3"+
		"\2\2\2*+\5\6\4\2+,\b\3\1\2,.\3\2\2\2-*\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\5\3\2\2\2\61\62\5\24\13\2\62\63\b\4\1\2\63;\3\2\2\2\64\65"+
		"\5\26\f\2\65\66\b\4\1\2\66;\3\2\2\2\678\5\30\r\289\b\4\1\29;\3\2\2\2:"+
		"\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\5\n\6\2=>\b\5\1\2>@\3"+
		"\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CA\3\2\2\2DE"+
		"\7\3\2\2EF\5\16\b\2FG\7+\2\2GH\b\6\1\2Hw\3\2\2\2IJ\7 \2\2JK\5\16\b\2K"+
		"L\7+\2\2LM\b\6\1\2Mw\3\2\2\2NO\7\4\2\2OP\5\16\b\2PQ\7+\2\2QR\b\6\1\2R"+
		"w\3\2\2\2ST\7\5\2\2TU\5\16\b\2UV\7+\2\2VW\b\6\1\2Ww\3\2\2\2XY\7\5\2\2"+
		"YZ\7+\2\2Zw\b\6\1\2[\\\5\32\16\2\\]\b\6\1\2]w\3\2\2\2^_\5\34\17\2_`\b"+
		"\6\1\2`w\3\2\2\2ab\5\16\b\2bc\7,\2\2cd\5\16\b\2de\7+\2\2ef\b\6\1\2fw\3"+
		"\2\2\2gh\7\6\2\2hi\5\16\b\2ij\7+\2\2jk\b\6\1\2kw\3\2\2\2lm\7\6\2\2mn\7"+
		"+\2\2nw\b\6\1\2op\7&\2\2pq\7-\2\2qr\5\f\7\2rs\7.\2\2st\7+\2\2tu\b\6\1"+
		"\2uw\3\2\2\2vD\3\2\2\2vI\3\2\2\2vN\3\2\2\2vS\3\2\2\2vX\3\2\2\2v[\3\2\2"+
		"\2v^\3\2\2\2va\3\2\2\2vg\3\2\2\2vl\3\2\2\2vo\3\2\2\2w\13\3\2\2\2xy\5\16"+
		"\b\2yz\b\7\1\2z{\7\7\2\2{}\3\2\2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\16\b\2\u0082"+
		"\u0083\b\7\1\2\u0083\u0085\3\2\2\2\u0084~\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\r\3\2\2\2\u0086\u0087\b\b\1\2\u0087\u0088\7&\2\2\u0088\u00aa\b"+
		"\b\1\2\u0089\u008a\7#\2\2\u008a\u00aa\b\b\1\2\u008b\u008c\7$\2\2\u008c"+
		"\u00aa\b\b\1\2\u008d\u008e\7%\2\2\u008e\u00aa\b\b\1\2\u008f\u0090\7&\2"+
		"\2\u0090\u0091\7-\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7.\2\2\u0093\u0094"+
		"\b\b\1\2\u0094\u00aa\3\2\2\2\u0095\u0096\7-\2\2\u0096\u0097\5\16\b\2\u0097"+
		"\u0098\7.\2\2\u0098\u0099\b\b\1\2\u0099\u00aa\3\2\2\2\u009a\u009b\7\13"+
		"\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\f\2\2\u009d\u009e\7-\2\2\u009e"+
		"\u009f\5\16\b\2\u009f\u00a0\7.\2\2\u00a0\u00a1\b\b\1\2\u00a1\u00aa\3\2"+
		"\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\16\b\4\u00a4\u00a5\b\b\1\2\u00a5"+
		"\u00aa\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7&\2\2\u00a8\u00aa\7\24"+
		"\2\2\u00a9\u0086\3\2\2\2\u00a9\u0089\3\2\2\2\u00a9\u008b\3\2\2\2\u00a9"+
		"\u008d\3\2\2\2\u00a9\u008f\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9\u009a\3\2"+
		"\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00cb\3\2\2\2\u00ab"+
		"\u00ac\f\n\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\5\16\b\13\u00ae\u00af\b"+
		"\b\1\2\u00af\u00ca\3\2\2\2\u00b0\u00b1\f\t\2\2\u00b1\u00b2\t\3\2\2\u00b2"+
		"\u00b3\5\16\b\n\u00b3\u00b4\b\b\1\2\u00b4\u00ca\3\2\2\2\u00b5\u00b6\f"+
		"\6\2\2\u00b6\u00b7\t\4\2\2\u00b7\u00b8\5\16\b\7\u00b8\u00b9\b\b\1\2\u00b9"+
		"\u00ca\3\2\2\2\u00ba\u00bb\f\5\2\2\u00bb\u00bc\t\5\2\2\u00bc\u00bd\5\16"+
		"\b\6\u00bd\u00be\b\b\1\2\u00be\u00ca\3\2\2\2\u00bf\u00c0\f\f\2\2\u00c0"+
		"\u00c1\7\b\2\2\u00c1\u00c2\7&\2\2\u00c2\u00ca\b\b\1\2\u00c3\u00c4\f\13"+
		"\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\7\n\2\2\u00c7"+
		"\u00c8\b\b\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00b0\3\2"+
		"\2\2\u00c9\u00b5\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\17\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0"+
		"\7&\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7+\2\2"+
		"\u00d3\u00d4\b\t\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e3\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\5\22\n\2\u00db\u00dc\b\t\1\2\u00dc\u00de\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00d7\3\2"+
		"\2\2\u00e2\u00df\3\2\2\2\u00e3\21\3\2\2\2\u00e4\u00e5\7&\2\2\u00e5\u00e6"+
		"\7\26\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7#\2\2\u00e9"+
		"\u00ea\7+\2\2\u00ea\u00fa\b\n\1\2\u00eb\u00ec\7&\2\2\u00ec\u00ed\7\26"+
		"\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7$\2\2\u00f0"+
		"\u00f1\7+\2\2\u00f1\u00fa\b\n\1\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7\26"+
		"\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7%\2\2\u00f7"+
		"\u00f8\7+\2\2\u00f8\u00fa\b\n\1\2\u00f9\u00e4\3\2\2\2\u00f9\u00eb\3\2"+
		"\2\2\u00f9\u00f2\3\2\2\2\u00fa\23\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd"+
		"\7&\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\7+\2\2"+
		"\u0100\u0101\b\13\1\2\u0101\u0118\3\2\2\2\u0102\u0103\7&\2\2\u0103\u0104"+
		"\7\26\2\2\u0104\u0105\7\25\2\2\u0105\u0106\7,\2\2\u0106\u0107\7#\2\2\u0107"+
		"\u0108\7+\2\2\u0108\u0118\b\13\1\2\u0109\u010a\7&\2\2\u010a\u010b\7\26"+
		"\2\2\u010b\u010c\7\25\2\2\u010c\u010d\7,\2\2\u010d\u010e\7$\2\2\u010e"+
		"\u010f\7+\2\2\u010f\u0118\b\13\1\2\u0110\u0111\7&\2\2\u0111\u0112\7\26"+
		"\2\2\u0112\u0113\7\25\2\2\u0113\u0114\7,\2\2\u0114\u0115\7%\2\2\u0115"+
		"\u0116\7+\2\2\u0116\u0118\b\13\1\2\u0117\u00fb\3\2\2\2\u0117\u0102\3\2"+
		"\2\2\u0117\u0109\3\2\2\2\u0117\u0110\3\2\2\2\u0118\25\3\2\2\2\u0119\u011a"+
		"\7\27\2\2\u011a\u011b\7&\2\2\u011b\u011c\7\30\2\2\u011c\u011d\5$\23\2"+
		"\u011d\u011e\7\31\2\2\u011e\u011f\7+\2\2\u011f\u0120\b\f\1\2\u0120\27"+
		"\3\2\2\2\u0121\u0122\7&\2\2\u0122\u0123\7-\2\2\u0123\u0124\5 \21\2\u0124"+
		"\u0125\7.\2\2\u0125\u0126\7\26\2\2\u0126\u0127\5\36\20\2\u0127\u0128\3"+
		"\2\2\2\u0128\u0129\7\30\2\2\u0129\u012a\5\20\t\2\u012a\u012b\5\b\5\2\u012b"+
		"\u012c\7\31\2\2\u012c\u012d\b\r\1\2\u012d\u0139\3\2\2\2\u012e\u012f\7"+
		"&\2\2\u012f\u0130\7-\2\2\u0130\u0131\5 \21\2\u0131\u0132\7.\2\2\u0132"+
		"\u0133\7\30\2\2\u0133\u0134\5\20\t\2\u0134\u0135\5\b\5\2\u0135\u0136\7"+
		"\31\2\2\u0136\u0137\b\r\1\2\u0137\u0139\3\2\2\2\u0138\u0121\3\2\2\2\u0138"+
		"\u012e\3\2\2\2\u0139\31\3\2\2\2\u013a\u013b\7\32\2\2\u013b\u013c\7-\2"+
		"\2\u013c\u013d\5\16\b\2\u013d\u013e\7.\2\2\u013e\u013f\7\30\2\2\u013f"+
		"\u0140\5\b\5\2\u0140\u0141\7\31\2\2\u0141\u0142\b\16\1\2\u0142\33\3\2"+
		"\2\2\u0143\u0144\7\33\2\2\u0144\u0145\7-\2\2\u0145\u0146\5\16\b\2\u0146"+
		"\u0147\7.\2\2\u0147\u0148\7\30\2\2\u0148\u0149\5\b\5\2\u0149\u014a\7\31"+
		"\2\2\u014a\u014b\b\17\1\2\u014b\u015a\3\2\2\2\u014c\u014d\7\33\2\2\u014d"+
		"\u014e\7-\2\2\u014e\u014f\5\16\b\2\u014f\u0150\7.\2\2\u0150\u0151\7\30"+
		"\2\2\u0151\u0152\5\b\5\2\u0152\u0153\7\31\2\2\u0153\u0154\7\34\2\2\u0154"+
		"\u0155\7\30\2\2\u0155\u0156\5\b\5\2\u0156\u0157\7\31\2\2\u0157\u0158\b"+
		"\17\1\2\u0158\u015a\3\2\2\2\u0159\u0143\3\2\2\2\u0159\u014c\3\2\2\2\u015a"+
		"\35\3\2\2\2\u015b\u015c\7!\2\2\u015c\u016a\b\20\1\2\u015d\u015e\7\"\2"+
		"\2\u015e\u016a\b\20\1\2\u015f\u0160\7\35\2\2\u0160\u016a\b\20\1\2\u0161"+
		"\u0162\7\t\2\2\u0162\u0163\7#\2\2\u0163\u0164\7\n\2\2\u0164\u0165\5\36"+
		"\20\2\u0165\u0166\b\20\1\2\u0166\u016a\3\2\2\2\u0167\u0168\7&\2\2\u0168"+
		"\u016a\b\20\1\2\u0169\u015b\3\2\2\2\u0169\u015d\3\2\2\2\u0169\u015f\3"+
		"\2\2\2\u0169\u0161\3\2\2\2\u0169\u0167\3\2\2\2\u016a\37\3\2\2\2\u016b"+
		"\u016c\5\"\22\2\u016c\u016d\b\21\1\2\u016d\u016e\7\7\2\2\u016e\u0170\3"+
		"\2\2\2\u016f\u016b\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5\""+
		"\22\2\u0175\u0176\b\21\1\2\u0176\u0179\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0171\3\2\2\2\u0178\u0177\3\2\2\2\u0179!\3\2\2\2\u017a\u017b\7&\2\2\u017b"+
		"\u017c\7\26\2\2\u017c\u017d\5\36\20\2\u017d\u017e\b\22\1\2\u017e#\3\2"+
		"\2\2\u017f\u0180\7&\2\2\u0180\u0181\7\26\2\2\u0181\u0182\5\36\20\2\u0182"+
		"\u0183\7+\2\2\u0183\u0184\b\23\1\2\u0184\u0186\3\2\2\2\u0185\u017f\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"%\3\2\2\2\26/:Av~\u0084\u00a9\u00c9\u00cb\u00d7\u00df\u00e2\u00f9\u0117"+
		"\u0138\u0159\u0169\u0171\u0178\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}