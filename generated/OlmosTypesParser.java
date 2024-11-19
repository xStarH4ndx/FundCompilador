// Generated from OlmosTypes.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OlmosTypesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, ID=36, NUMBER=37, STRING=38, WS=39, 
		COMMENT=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_type = 3, 
		RULE_listDeclaration = 4, RULE_functionDeclaration = 5, RULE_parameterList = 6, 
		RULE_parameter = 7, RULE_functionReturn = 8, RULE_controlFlow = 9, RULE_ifStatement = 10, 
		RULE_whileLoop = 11, RULE_forLoop = 12, RULE_condition = 13, RULE_comparisonOp = 14, 
		RULE_expression = 15, RULE_term = 16, RULE_functionCall = 17, RULE_argumentList = 18, 
		RULE_printStatement = 19, RULE_inputStatement = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "type", "listDeclaration", 
			"functionDeclaration", "parameterList", "parameter", "functionReturn", 
			"controlFlow", "ifStatement", "whileLoop", "forLoop", "condition", "comparisonOp", 
			"expression", "term", "functionCall", "argumentList", "printStatement", 
			"inputStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'Saldano'", "'='", "'int'", "'string'", "'bool'", "'list'", 
			"'SaldanosList'", "'['", "','", "']'", "'defOlmos'", "'('", "')'", "'{'", 
			"'}'", "'OlmosReturn'", "'Olmos'", "'say'", "'else'", "'nachoWhile'", 
			"'paltaFor'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'saldanosprint'", "'olmosKeep'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "NUMBER", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "OlmosTypes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OlmosTypesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
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
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ControlFlowContext controlFlow() {
			return getRuleContext(ControlFlowContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				controlFlow();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				inputStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				expression();
				setState(53);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			type();
			setState(59);
			match(ID);
			setState(60);
			match(T__2);
			setState(61);
			expression();
			setState(62);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitListDeclaration(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__7);
			setState(67);
			match(T__2);
			setState(68);
			match(T__8);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036345344L) != 0)) {
				{
				setState(69);
				expression();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(70);
					match(T__9);
					setState(71);
					expression();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(79);
			match(T__10);
			setState(80);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__11);
			setState(83);
			match(ID);
			setState(84);
			match(T__12);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
				{
				setState(85);
				parameterList();
				}
			}

			setState(88);
			match(T__13);
			setState(89);
			match(T__12);
			setState(90);
			type();
			setState(91);
			match(T__13);
			setState(92);
			match(T__14);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			parameter();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(102);
				match(T__9);
				setState(103);
				parameter();
				}
				}
				setState(108);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitFunctionReturn(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__16);
			setState(113);
			expression();
			setState(114);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControlFlowContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ControlFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterControlFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitControlFlow(this);
		}
	}

	public final ControlFlowContext controlFlow() throws RecognitionException {
		ControlFlowContext _localctx = new ControlFlowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controlFlow);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				ifStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				whileLoop();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				forLoop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__17);
			setState(122);
			match(T__18);
			setState(123);
			match(T__12);
			setState(124);
			condition();
			setState(125);
			match(T__13);
			setState(126);
			match(T__14);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__15);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(134);
				match(T__19);
				setState(135);
				match(T__14);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0)) {
					{
					{
					setState(136);
					statement();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__20);
			setState(146);
			match(T__12);
			setState(147);
			condition();
			setState(148);
			match(T__13);
			setState(149);
			match(T__14);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__21);
			setState(159);
			match(T__12);
			setState(160);
			variableDeclaration();
			setState(161);
			condition();
			setState(162);
			match(T__0);
			setState(163);
			expression();
			setState(164);
			match(T__13);
			setState(165);
			match(T__14);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498222772228L) != 0)) {
				{
				{
				setState(166);
				statement();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) {
				{
				setState(175);
				comparisonOp();
				setState(176);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOpContext extends ParserRuleContext {
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitComparisonOp(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			term();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				term();
				}
				}
				setState(189);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(OlmosTypesParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(OlmosTypesParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__12);
				setState(194);
				expression();
				setState(195);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(T__12);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036345344L) != 0)) {
				{
				setState(202);
				argumentList();
				}
			}

			setState(205);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expression();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(208);
				match(T__9);
				setState(209);
				expression();
				}
				}
				setState(214);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OlmosTypesParser.STRING, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__33);
			setState(216);
			match(T__12);
			setState(217);
			match(STRING);
			setState(218);
			match(T__13);
			setState(219);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OlmosTypesParser.ID, 0); }
		public TerminalNode STRING() { return getToken(OlmosTypesParser.STRING, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlmosTypesListener ) ((OlmosTypesListener)listener).exitInputStatement(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__1);
			setState(222);
			type();
			setState(223);
			match(ID);
			setState(224);
			match(T__2);
			setState(225);
			match(T__34);
			setState(226);
			match(T__12);
			setState(227);
			match(STRING);
			setState(228);
			match(T__13);
			setState(229);
			match(T__0);
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
		"\u0004\u0001(\u00e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004"+
		"\f\u0004L\t\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006"+
		"l\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tx\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0081\b\n\n\n\f\n\u0084\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u008a\b\n\n\n\f\n\u008d\t\n\u0001\n"+
		"\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0098\b\u000b\n\u000b\f\u000b\u009b\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a8\b\f\n\f\f\f\u00ab\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b3\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ba\b\u000f"+
		"\n\u000f\f\u000f\u00bd\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c7"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cc\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00d3\b\u0012\n\u0012\f\u0012\u00d6\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0003\u0001\u0000\u0004\u0007\u0001\u0000\u0017\u001c\u0001\u0000\u001d"+
		"!\u00ec\u0000+\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bB\u0001"+
		"\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000"+
		"\u000em\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012w"+
		"\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0091\u0001"+
		"\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00ae\u0001"+
		"\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00b6\u0001"+
		"\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000\"\u00c8\u0001\u0000"+
		"\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000"+
		"(\u00dd\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/8\u0003\u0004\u0002"+
		"\u000008\u0003\n\u0005\u000018\u0003\u0012\t\u000028\u0003&\u0013\u0000"+
		"38\u0003(\u0014\u000045\u0003\u001e\u000f\u000056\u0005\u0001\u0000\u0000"+
		"68\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001\u0000\u0000"+
		"\u000071\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u000073\u0001\u0000"+
		"\u0000\u000074\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0002\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0005$\u0000\u0000"+
		"<=\u0005\u0003\u0000\u0000=>\u0003\u001e\u000f\u0000>?\u0005\u0001\u0000"+
		"\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000\u0000A\u0007"+
		"\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DM\u0005\t\u0000\u0000EJ\u0003\u001e\u000f\u0000FG\u0005\n\u0000\u0000"+
		"GI\u0003\u001e\u000f\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000"+
		"PQ\u0005\u0001\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\f\u0000"+
		"\u0000ST\u0005$\u0000\u0000TV\u0005\r\u0000\u0000UW\u0003\f\u0006\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0005\u000e\u0000\u0000YZ\u0005\r\u0000\u0000Z[\u0003\u0006\u0003"+
		"\u0000[\\\u0005\u000e\u0000\u0000\\`\u0005\u000f\u0000\u0000]_\u0003\u0002"+
		"\u0001\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005\u0010\u0000\u0000d\u000b\u0001\u0000"+
		"\u0000\u0000ej\u0003\u000e\u0007\u0000fg\u0005\n\u0000\u0000gi\u0003\u000e"+
		"\u0007\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000mn\u0003\u0006\u0003\u0000no\u0005$\u0000\u0000"+
		"o\u000f\u0001\u0000\u0000\u0000pq\u0005\u0011\u0000\u0000qr\u0003\u001e"+
		"\u000f\u0000rs\u0005\u0001\u0000\u0000s\u0011\u0001\u0000\u0000\u0000"+
		"tx\u0003\u0014\n\u0000ux\u0003\u0016\u000b\u0000vx\u0003\u0018\f\u0000"+
		"wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x\u0013\u0001\u0000\u0000\u0000yz\u0005\u0012\u0000\u0000z{\u0005"+
		"\u0013\u0000\u0000{|\u0005\r\u0000\u0000|}\u0003\u001a\r\u0000}~\u0005"+
		"\u000e\u0000\u0000~\u0082\u0005\u000f\u0000\u0000\u007f\u0081\u0003\u0002"+
		"\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u008f\u0005\u0010\u0000\u0000\u0086\u0087\u0005\u0014"+
		"\u0000\u0000\u0087\u008b\u0005\u000f\u0000\u0000\u0088\u008a\u0003\u0002"+
		"\u0001\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0005\u0010\u0000\u0000\u008f\u0086\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0015\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u0015\u0000\u0000\u0092\u0093\u0005\r\u0000"+
		"\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094\u0095\u0005\u000e\u0000\u0000"+
		"\u0095\u0099\u0005\u000f\u0000\u0000\u0096\u0098\u0003\u0002\u0001\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0010\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0\u0005\r\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0004\u0002\u0000\u00a1\u00a2\u0003\u001a\r\u0000\u00a2\u00a3"+
		"\u0005\u0001\u0000\u0000\u00a3\u00a4\u0003\u001e\u000f\u0000\u00a4\u00a5"+
		"\u0005\u000e\u0000\u0000\u00a5\u00a9\u0005\u000f\u0000\u0000\u00a6\u00a8"+
		"\u0003\u0002\u0001\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0010\u0000\u0000\u00ad\u0019"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0003\u001e\u000f\u0000\u00af\u00b0"+
		"\u0003\u001c\u000e\u0000\u00b0\u00b1\u0003\u001e\u000f\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0007\u0001\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6\u00bb"+
		"\u0003 \u0010\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000\u00b8\u00ba\u0003"+
		" \u0010\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00c7\u0005$\u0000\u0000\u00bf\u00c7\u0005%\u0000\u0000"+
		"\u00c0\u00c7\u0005&\u0000\u0000\u00c1\u00c2\u0005\r\u0000\u0000\u00c2"+
		"\u00c3\u0003\u001e\u000f\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\"\u0011\u0000\u00c6\u00be"+
		"\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000\u00c6\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"$\u0000\u0000\u00c9\u00cb\u0005\r\u0000\u0000\u00ca\u00cc\u0003$\u0012"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000e\u0000"+
		"\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d4\u0003\u001e\u000f\u0000"+
		"\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d3\u0003\u001e\u000f\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"%\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\"\u0000\u0000\u00d8\u00d9\u0005\r\u0000\u0000\u00d9\u00da\u0005"+
		"&\u0000\u0000\u00da\u00db\u0005\u000e\u0000\u0000\u00db\u00dc\u0005\u0001"+
		"\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0002\u0000"+
		"\u0000\u00de\u00df\u0003\u0006\u0003\u0000\u00df\u00e0\u0005$\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2"+
		"\u00e3\u0005\r\u0000\u0000\u00e3\u00e4\u0005&\u0000\u0000\u00e4\u00e5"+
		"\u0005\u000e\u0000\u0000\u00e5\u00e6\u0005\u0001\u0000\u0000\u00e6)\u0001"+
		"\u0000\u0000\u0000\u0012-7JMV`jw\u0082\u008b\u008f\u0099\u00a9\u00b2\u00bb"+
		"\u00c6\u00cb\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}