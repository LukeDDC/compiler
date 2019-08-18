// Generated from RUBY.g4 by ANTLR 4.7.1
package app.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RUBYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, GREATER_THAN_OR_EQUALS=2, LESSER_THAN_OR_EQUALS=3, GREATER_THAN=4, 
		LESSER_THAN=5, NOT_EQUALS=6, ASSIGN=7, EQUALS=8, AND=9, OR=10, ADD=11, 
		SUB=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, LBRACK=19, 
		RBRACK=20, SEMICOLON=21, COMMA=22, NEW_LINE=23, IF=24, ELSE=25, WHILE=26, 
		DO=27, END=28, FOR=29, DEF=30, INT_T=31, FLOAT_T=32, STRING_T=33, BOOL_T=34, 
		VOID_T=35, ID=36, INT=37, FLOAT=38, STRING=39, WS=40;
	public static final int
		RULE_program = 0, RULE_function_declarion = 1, RULE_function_body = 2, 
		RULE_function_call = 3, RULE_parameters = 4, RULE_parameter = 5, RULE_statement = 6, 
		RULE_declaration_statement = 7, RULE_assign_statement = 8, RULE_for_statement = 9, 
		RULE_if_statement = 10, RULE_while_statement = 11, RULE_do_while_statement = 12, 
		RULE_statement_body = 13, RULE_type = 14, RULE_expression = 15, RULE_expression_list = 16, 
		RULE_conditional_expression_list = 17, RULE_conditional_expression = 18, 
		RULE_terminator = 19, RULE_conditional_operator = 20;
	public static final String[] ruleNames = {
		"program", "function_declarion", "function_body", "function_call", "parameters", 
		"parameter", "statement", "declaration_statement", "assign_statement", 
		"for_statement", "if_statement", "while_statement", "do_while_statement", 
		"statement_body", "type", "expression", "expression_list", "conditional_expression_list", 
		"conditional_expression", "terminator", "conditional_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'>='", "'<='", "'>'", "'<'", "'!='", "'='", "'=='", "'&&'", 
		"'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", null, "'if'", "'else'", "'while'", "'do'", "'end'", 
		"'for'", "'def'", "'Integer'", "'Float'", "'String'", "'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", "GREATER_THAN", 
		"LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", "OR", "ADD", "SUB", 
		"MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", "DO", "END", 
		"FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", "ID", 
		"INT", "FLOAT", "STRING", "WS"
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

	@Override
	public String getGrammarFileName() { return "RUBY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RUBYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Function_declarionContext> function_declarion() {
			return getRuleContexts(Function_declarionContext.class);
		}
		public Function_declarionContext function_declarion(int i) {
			return getRuleContext(Function_declarionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitProgram(this);
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
				function_declarion();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEF );
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

	public static class Function_declarionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RUBYParser.DEF, 0); }
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_declarionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declarion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFunction_declarion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFunction_declarion(this);
		}
	}

	public final Function_declarionContext function_declarion() throws RecognitionException {
		Function_declarionContext _localctx = new Function_declarionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_declarion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(DEF);
			setState(48);
			match(ID);
			setState(49);
			match(T__0);
			setState(50);
			type();
			setState(51);
			match(LPAREN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				setState(52);
				parameters();
				}
			}

			setState(55);
			match(RPAREN);
			setState(56);
			match(NEW_LINE);
			setState(57);
			function_body();
			setState(58);
			match(END);
			setState(59);
			terminator(0);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_body);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(61);
						function_call();
						}
						break;
					case 2:
						{
						setState(62);
						statement();
						}
						break;
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T) | (1L << ID))) != 0) );
				}
				break;
			case END:
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(LPAREN);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BOOL_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(72);
				expression_list();
				}
			}

			setState(75);
			match(RPAREN);
			setState(76);
			terminator(0);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			parameter();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				parameter();
				}
				}
				setState(85);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
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

	public static class StatementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaration_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				do_while_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				assign_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				for_statement();
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				type();
				setState(98);
				match(T__0);
				setState(99);
				match(ID);
				setState(100);
				terminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				type();
				setState(103);
				match(T__0);
				setState(104);
				assign_statement();
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

	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(RUBYParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAssign_statement(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(ASSIGN);
			setState(110);
			expression(0);
			setState(111);
			terminator(0);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RUBYParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(RUBYParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RUBYParser.SEMICOLON, i);
		}
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(FOR);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(114);
				expression(0);
				}
				break;
			case 2:
				{
				setState(115);
				declaration_statement();
				}
				break;
			case 3:
				{
				setState(116);
				assign_statement();
				}
				break;
			}
			setState(119);
			match(SEMICOLON);
			setState(120);
			conditional_expression_list(0);
			setState(121);
			match(SEMICOLON);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(122);
				assign_statement();
				}
			}

			setState(125);
			match(NEW_LINE);
			setState(126);
			statement_body(0);
			setState(127);
			match(END);
			setState(128);
			terminator(0);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RUBYParser.IF, 0); }
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(RUBYParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(IF);
				setState(131);
				conditional_expression_list(0);
				setState(132);
				match(NEW_LINE);
				setState(133);
				statement_body(0);
				setState(134);
				match(END);
				setState(135);
				terminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IF);
				setState(138);
				conditional_expression_list(0);
				setState(139);
				match(NEW_LINE);
				setState(140);
				statement_body(0);
				setState(141);
				match(ELSE);
				setState(142);
				statement_body(0);
				setState(143);
				match(END);
				setState(144);
				terminator(0);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RUBYParser.WHILE, 0); }
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHILE);
			setState(149);
			conditional_expression_list(0);
			setState(150);
			match(NEW_LINE);
			setState(151);
			statement_body(0);
			setState(152);
			match(END);
			setState(153);
			terminator(0);
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(RUBYParser.DO, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public TerminalNode WHILE() { return getToken(RUBYParser.WHILE, 0); }
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(DO);
			setState(156);
			statement_body(0);
			setState(157);
			match(NEW_LINE);
			setState(158);
			match(WHILE);
			setState(159);
			conditional_expression_list(0);
			setState(160);
			terminator(0);
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitStatement_body(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		return statement_body(0);
	}

	private Statement_bodyContext statement_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, _parentState);
		Statement_bodyContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_statement_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163);
				statement();
				}
				break;
			case 2:
				{
				setState(164);
				terminator(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_body);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						statement();
						}
						break;
					case 2:
						{
						_localctx = new Statement_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_body);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(170);
						function_call();
						}
						break;
					}
					} 
				}
				setState(175);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(RUBYParser.INT_T, 0); }
		public TerminalNode FLOAT_T() { return getToken(RUBYParser.FLOAT_T, 0); }
		public TerminalNode STRING_T() { return getToken(RUBYParser.STRING_T, 0); }
		public TerminalNode VOID_T() { return getToken(RUBYParser.VOID_T, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminalNode INT() { return getToken(RUBYParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RUBYParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(RUBYParser.STRING, 0); }
		public TerminalNode BOOL_T() { return getToken(RUBYParser.BOOL_T, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(179);
				match(LPAREN);
				setState(180);
				expression(0);
				setState(181);
				match(RPAREN);
				}
				break;
			case ID:
				{
				setState(183);
				match(ID);
				}
				break;
			case INT:
				{
				setState(184);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(185);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(186);
				match(STRING);
				}
				break;
			case BOOL_T:
				{
				setState(187);
				match(BOOL_T);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						match(MULT);
						setState(192);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(DIV);
						setState(195);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expression(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				expression(0);
				}
				}
				setState(211);
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

	public static class Conditional_expression_listContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(RUBYParser.AND, 0); }
		public TerminalNode OR() { return getToken(RUBYParser.OR, 0); }
		public Conditional_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterConditional_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitConditional_expression_list(this);
		}
	}

	public final Conditional_expression_listContext conditional_expression_list() throws RecognitionException {
		return conditional_expression_list(0);
	}

	private Conditional_expression_listContext conditional_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Conditional_expression_listContext _localctx = new Conditional_expression_listContext(_ctx, _parentState);
		Conditional_expression_listContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_conditional_expression_list, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			conditional_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Conditional_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditional_expression_list);
					setState(215);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(217);
					conditional_expression();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression(0);
			setState(224);
			conditional_operator();
			setState(225);
			expression(0);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(RUBYParser.SEMICOLON, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(228);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(229);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(233);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(NEW_LINE);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RUBYParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(RUBYParser.NOT_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(RUBYParser.GREATER_THAN, 0); }
		public TerminalNode LESSER_THAN() { return getToken(RUBYParser.LESSER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(RUBYParser.GREATER_THAN_OR_EQUALS, 0); }
		public TerminalNode LESSER_THAN_OR_EQUALS() { return getToken(RUBYParser.LESSER_THAN_OR_EQUALS, 0); }
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitConditional_operator(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN_OR_EQUALS) | (1L << LESSER_THAN_OR_EQUALS) | (1L << GREATER_THAN) | (1L << LESSER_THAN) | (1L << NOT_EQUALS) | (1L << EQUALS))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return statement_body_sempred((Statement_bodyContext)_localctx, predIndex);
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 17:
			return conditional_expression_list_sempred((Conditional_expression_listContext)_localctx, predIndex);
		case 19:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_body_sempred(Statement_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean conditional_expression_list_sempred(Conditional_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4B\n\4\r"+
		"\4\16\4C\3\4\5\4G\n\4\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13x\n\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0095\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00a8\n\17\3\17\3\17\3\17\3\17\7\17\u00ae"+
		"\n\17\f\17\16\17\u00b1\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00bf\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21\3\22\3\22\3\22\7\22"+
		"\u00d2\n\22\f\22\16\22\u00d5\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u00dd\n\23\f\23\16\23\u00e0\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00e9\n\25\3\25\3\25\3\25\3\25\7\25\u00ef\n\25\f\25\16\25\u00f2"+
		"\13\25\3\26\3\26\3\26\2\6\34 $(\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\6\4\2!#%%\3\2\r\16\3\2\13\f\4\2\4\b\n\n\2\u0102\2-\3\2\2"+
		"\2\4\61\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nP\3\2\2\2\fX\3\2\2\2\16a\3\2\2"+
		"\2\20l\3\2\2\2\22n\3\2\2\2\24s\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2"+
		"\2\32\u009d\3\2\2\2\34\u00a7\3\2\2\2\36\u00b2\3\2\2\2 \u00be\3\2\2\2\""+
		"\u00ce\3\2\2\2$\u00d6\3\2\2\2&\u00e1\3\2\2\2(\u00e8\3\2\2\2*\u00f3\3\2"+
		"\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2"+
		"\61\62\7 \2\2\62\63\7&\2\2\63\64\7\3\2\2\64\65\5\36\20\2\65\67\7\21\2"+
		"\2\668\5\n\6\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\22\2\2:;\7\31\2"+
		"\2;<\5\6\4\2<=\7\36\2\2=>\5(\25\2>\5\3\2\2\2?B\5\b\5\2@B\5\16\b\2A?\3"+
		"\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EG\3\2\2\2FA\3"+
		"\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\7&\2\2IK\7\21\2\2JL\5\"\22\2KJ\3\2\2\2K"+
		"L\3\2\2\2LM\3\2\2\2MN\7\22\2\2NO\5(\25\2O\t\3\2\2\2PU\5\f\7\2QR\7\30\2"+
		"\2RT\5\f\7\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2"+
		"\2\2XY\5\36\20\2YZ\7&\2\2Z\r\3\2\2\2[b\5\20\t\2\\b\5\26\f\2]b\5\30\r\2"+
		"^b\5\32\16\2_b\5\22\n\2`b\5\24\13\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3"+
		"\2\2\2a_\3\2\2\2a`\3\2\2\2b\17\3\2\2\2cd\5\36\20\2de\7\3\2\2ef\7&\2\2"+
		"fg\5(\25\2gm\3\2\2\2hi\5\36\20\2ij\7\3\2\2jk\5\22\n\2km\3\2\2\2lc\3\2"+
		"\2\2lh\3\2\2\2m\21\3\2\2\2no\7&\2\2op\7\t\2\2pq\5 \21\2qr\5(\25\2r\23"+
		"\3\2\2\2sw\7\37\2\2tx\5 \21\2ux\5\20\t\2vx\5\22\n\2wt\3\2\2\2wu\3\2\2"+
		"\2wv\3\2\2\2xy\3\2\2\2yz\7\27\2\2z{\5$\23\2{}\7\27\2\2|~\5\22\n\2}|\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\31\2\2\u0080\u0081\5\34\17\2"+
		"\u0081\u0082\7\36\2\2\u0082\u0083\5(\25\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\7\32\2\2\u0085\u0086\5$\23\2\u0086\u0087\7\31\2\2\u0087\u0088\5\34\17"+
		"\2\u0088\u0089\7\36\2\2\u0089\u008a\5(\25\2\u008a\u0095\3\2\2\2\u008b"+
		"\u008c\7\32\2\2\u008c\u008d\5$\23\2\u008d\u008e\7\31\2\2\u008e\u008f\5"+
		"\34\17\2\u008f\u0090\7\33\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\36\2"+
		"\2\u0092\u0093\5(\25\2\u0093\u0095\3\2\2\2\u0094\u0084\3\2\2\2\u0094\u008b"+
		"\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\7\34\2\2\u0097\u0098\5$\23\2\u0098"+
		"\u0099\7\31\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\36\2\2\u009b\u009c"+
		"\5(\25\2\u009c\31\3\2\2\2\u009d\u009e\7\35\2\2\u009e\u009f\5\34\17\2\u009f"+
		"\u00a0\7\31\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\5"+
		"(\25\2\u00a3\33\3\2\2\2\u00a4\u00a5\b\17\1\2\u00a5\u00a8\5\16\b\2\u00a6"+
		"\u00a8\5(\25\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00af\3\2"+
		"\2\2\u00a9\u00aa\f\5\2\2\u00aa\u00ae\5\16\b\2\u00ab\u00ac\f\4\2\2\u00ac"+
		"\u00ae\5\b\5\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\b\21\1\2\u00b5"+
		"\u00b6\7\21\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\22\2\2\u00b8\u00bf\3"+
		"\2\2\2\u00b9\u00bf\7&\2\2\u00ba\u00bf\7\'\2\2\u00bb\u00bf\7(\2\2\u00bc"+
		"\u00bf\7)\2\2\u00bd\u00bf\7$\2\2\u00be\u00b4\3\2\2\2\u00be\u00b9\3\2\2"+
		"\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00cb\3\2\2\2\u00c0\u00c1\f\13\2\2\u00c1\u00c2\7\17\2\2"+
		"\u00c2\u00ca\5 \21\f\u00c3\u00c4\f\n\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00ca"+
		"\5 \21\13\u00c6\u00c7\f\t\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00ca\5 \21\n"+
		"\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d3\5 \21\2\u00cf\u00d0\7\30\2\2\u00d0\u00d2\5"+
		" \21\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\23\1\2"+
		"\u00d7\u00d8\5&\24\2\u00d8\u00de\3\2\2\2\u00d9\u00da\f\4\2\2\u00da\u00db"+
		"\t\4\2\2\u00db\u00dd\5&\24\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e2\5 \21\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\5 \21\2\u00e4\'\3"+
		"\2\2\2\u00e5\u00e9\b\25\1\2\u00e6\u00e9\7\31\2\2\u00e7\u00e9\7\27\2\2"+
		"\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00f0"+
		"\3\2\2\2\u00ea\u00eb\f\4\2\2\u00eb\u00ef\7\27\2\2\u00ec\u00ed\f\3\2\2"+
		"\u00ed\u00ef\7\31\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1)\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\t\5\2\2\u00f4+\3\2\2\2\31/\67ACFKUalw}\u0094"+
		"\u00a7\u00ad\u00af\u00be\u00c9\u00cb\u00d3\u00de\u00e8\u00ee\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}