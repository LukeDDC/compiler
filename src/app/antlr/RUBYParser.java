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
		DO=27, END=28, FOR=29, DEF=30, GETS=31, PUTS=32, INT_T=33, FLOAT_T=34, 
		STRING_T=35, BOOL_T=36, VOID_T=37, ID=38, INT=39, FLOAT=40, STRING=41, 
		WS=42;
	public static final int
		RULE_program = 0, RULE_function_declaration = 1, RULE_new_line = 2, RULE_function_body = 3, 
		RULE_function_call = 4, RULE_parameters = 5, RULE_parameter = 6, RULE_additional_parameter = 7, 
		RULE_statement = 8, RULE_statement_body = 9, RULE_declaration_statement = 10, 
		RULE_assign_statement = 11, RULE_for_statement = 12, RULE_puts_statement = 13, 
		RULE_gets_statement = 14, RULE_if_statement = 15, RULE_else_statement = 16, 
		RULE_while_statement = 17, RULE_while_block = 18, RULE_do_while_statement = 19, 
		RULE_conditional = 20, RULE_type = 21, RULE_expression = 22, RULE_aritmetic_operator = 23, 
		RULE_expression_list = 24, RULE_conditional_expression_list = 25, RULE_conditional_expression = 26, 
		RULE_logical_operator = 27, RULE_terminator = 28, RULE_conditional_operator = 29;
	public static final String[] ruleNames = {
		"program", "function_declaration", "new_line", "function_body", "function_call", 
		"parameters", "parameter", "additional_parameter", "statement", "statement_body", 
		"declaration_statement", "assign_statement", "for_statement", "puts_statement", 
		"gets_statement", "if_statement", "else_statement", "while_statement", 
		"while_block", "do_while_statement", "conditional", "type", "expression", 
		"aritmetic_operator", "expression_list", "conditional_expression_list", 
		"conditional_expression", "logical_operator", "terminator", "conditional_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'>='", "'<='", "'>'", "'<'", "'!='", "'='", "'=='", "'&&'", 
		"'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", null, "'if'", "'else'", "'while'", "'do'", "'end'", 
		"'for'", "'def'", "'gets'", "'puts'", "'Integer'", "'Float'", "'String'", 
		"'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", "GREATER_THAN", 
		"LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", "OR", "ADD", "SUB", 
		"MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", "DO", "END", 
		"FOR", "DEF", "GETS", "PUTS", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", 
		"VOID_T", "ID", "INT", "FLOAT", "STRING", "WS"
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
		public List<Declaration_statementContext> declaration_statement() {
			return getRuleContexts(Declaration_statementContext.class);
		}
		public Declaration_statementContext declaration_statement(int i) {
			return getRuleContext(Declaration_statementContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(60);
				declaration_statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(66);
				function_declaration();
				}
				}
				setState(71);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RUBYParser.DEF, 0); }
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DEF);
			setState(73);
			match(ID);
			setState(74);
			parameters();
			setState(75);
			match(T__0);
			setState(76);
			type();
			setState(77);
			new_line();
			setState(78);
			function_body();
			setState(79);
			match(END);
			setState(80);
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

	public static class New_lineContext extends ParserRuleContext {
		public New_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_line; }
	 
		public New_lineContext() { }
		public void copyFrom(New_lineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewLineContext extends New_lineContext {
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public NewLineContext(New_lineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_lineContext new_line() throws RecognitionException {
		New_lineContext _localctx = new New_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_new_line);
		try {
			_localctx = new NewLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NEW_LINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_body);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case GETS:
			case PUTS:
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(84);
						function_call();
						}
						break;
					case 2:
						{
						setState(85);
						statement();
						}
						break;
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << GETS) | (1L << PUTS) | (1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T) | (1L << ID))) != 0) );
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
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(LPAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BOOL_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(95);
				expression_list();
				}
			}

			setState(98);
			match(RPAREN);
			setState(99);
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
		public List<Additional_parameterContext> additional_parameter() {
			return getRuleContexts(Additional_parameterContext.class);
		}
		public Additional_parameterContext additional_parameter(int i) {
			return getRuleContext(Additional_parameterContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LPAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(102);
				parameter();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				additional_parameter();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
			match(T__0);
			setState(118);
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

	public static class Additional_parameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Additional_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additional_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAdditional_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAdditional_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitAdditional_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additional_parameterContext additional_parameter() throws RecognitionException {
		Additional_parameterContext _localctx = new Additional_parameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additional_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(COMMA);
			setState(121);
			parameter();
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
		public Puts_statementContext puts_statement() {
			return getRuleContext(Puts_statementContext.class,0);
		}
		public Gets_statementContext gets_statement() {
			return getRuleContext(Gets_statementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				declaration_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				do_while_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				assign_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				for_statement();
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				puts_statement();
				}
				break;
			case GETS:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				gets_statement();
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					statement();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RUBYParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			type();
			setState(140);
			match(T__0);
			setState(141);
			match(ID);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(142);
				match(ASSIGN);
				setState(143);
				expression(0);
				}
				break;
			}
			setState(146);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	 
		public Assign_statementContext() { }
		public void copyFrom(Assign_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends Assign_statementContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(RUBYParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public AssignContext(Assign_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_statement);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(ASSIGN);
			setState(150);
			expression(0);
			setState(151);
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
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FOR);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154);
				expression(0);
				}
				break;
			case 2:
				{
				setState(155);
				declaration_statement();
				}
				break;
			case 3:
				{
				setState(156);
				assign_statement();
				}
				break;
			}
			setState(159);
			match(SEMICOLON);
			setState(160);
			conditional_expression_list(0);
			setState(161);
			match(SEMICOLON);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162);
				assign_statement();
				}
			}

			setState(165);
			new_line();
			setState(166);
			statement_body();
			setState(167);
			match(END);
			setState(168);
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

	public static class Puts_statementContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(RUBYParser.PUTS, 0); }
		public TerminalNode LPAREN() { return getToken(RUBYParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RUBYParser.RPAREN, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Puts_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterPuts_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitPuts_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitPuts_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Puts_statementContext puts_statement() throws RecognitionException {
		Puts_statementContext _localctx = new Puts_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_puts_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PUTS);
			setState(171);
			match(LPAREN);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172);
				match(ID);
				}
				break;
			case 2:
				{
				setState(173);
				expression(0);
				}
				break;
			}
			setState(176);
			match(RPAREN);
			setState(177);
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

	public static class Gets_statementContext extends ParserRuleContext {
		public TerminalNode GETS() { return getToken(RUBYParser.GETS, 0); }
		public TerminalNode LPAREN() { return getToken(RUBYParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RUBYParser.RPAREN, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Gets_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gets_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterGets_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitGets_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitGets_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gets_statementContext gets_statement() throws RecognitionException {
		Gets_statementContext _localctx = new Gets_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gets_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(GETS);
			setState(180);
			match(LPAREN);
			setState(181);
			match(RPAREN);
			setState(182);
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
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
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IF);
				setState(185);
				conditional();
				setState(186);
				new_line();
				setState(187);
				statement_body();
				setState(188);
				match(END);
				setState(189);
				terminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(IF);
				setState(192);
				conditional();
				setState(193);
				new_line();
				setState(194);
				statement_body();
				setState(195);
				else_statement();
				setState(196);
				statement_body();
				setState(197);
				match(END);
				setState(198);
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RUBYParser.ELSE, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ELSE);
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
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			while_block();
			setState(205);
			new_line();
			setState(206);
			statement_body();
			setState(207);
			match(END);
			setState(208);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RUBYParser.WHILE, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(WHILE);
			setState(211);
			conditional();
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
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(DO);
			setState(214);
			new_line();
			setState(215);
			statement_body();
			setState(216);
			terminator(0);
			setState(217);
			while_block();
			setState(218);
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

	public static class ConditionalContext extends ParserRuleContext {
		public Conditional_expression_listContext conditional_expression_list() {
			return getRuleContext(Conditional_expression_listContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			conditional_expression_list(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(RUBYParser.FLOAT, 0); }
		public FloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AritmeticOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Aritmetic_operatorContext aritmetic_operator() {
			return getRuleContext(Aritmetic_operatorContext.class,0);
		}
		public AritmeticOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAritmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAritmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitAritmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL_T() { return getToken(RUBYParser.BOOL_T, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(RUBYParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnclouseContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnclouseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterEnclouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitEnclouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitEnclouse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(RUBYParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new EnclouseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(225);
				match(LPAREN);
				setState(226);
				expression(0);
				setState(227);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(STRING);
				}
				break;
			case BOOL_T:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(BOOL_T);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticOperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(236);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(237);
					aritmetic_operator();
					setState(238);
					expression(8);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Aritmetic_operatorContext extends ParserRuleContext {
		public Aritmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_operator; }
	 
		public Aritmetic_operatorContext() { }
		public void copyFrom(Aritmetic_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Aritmetic_operatorContext {
		public DivContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Aritmetic_operatorContext {
		public AddContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends Aritmetic_operatorContext {
		public SubContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends Aritmetic_operatorContext {
		public MultContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetic_operatorContext aritmetic_operator() throws RecognitionException {
		Aritmetic_operatorContext _localctx = new Aritmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aritmetic_operator);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(DIV);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(SUB);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(ADD);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			expression(0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				expression(0);
				}
				}
				setState(258);
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
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitConditional_expression_list(this);
			else return visitor.visitChildren(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_conditional_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			conditional_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
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
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					logical_operator();
					setState(264);
					conditional_expression();
					}
					} 
				}
				setState(270);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditional_expression);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				expression(0);
				setState(272);
				conditional_operator();
				setState(273);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				expression(0);
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RUBYParser.AND, 0); }
		public TerminalNode OR() { return getToken(RUBYParser.OR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(281);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(282);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						match(NEW_LINE);
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return conditional_expression_list_sempred((Conditional_expression_listContext)_localctx, predIndex);
		case 28:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean conditional_expression_list_sempred(Conditional_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\6\5Y\n\5\r\5\16\5Z\3\5\5\5^\n\5\3\6"+
		"\3\6\3\6\5\6c\n\6\3\6\3\6\3\6\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\7\7"+
		"p\n\7\f\7\16\7s\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13\7\13\u0089\n\13\f\13\16\13\u008c"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\16\3\16\3\16\3\16\5\16\u00a6\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cb\n\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00ed\n\30\3\30\3\30\3\30\3\30\7\30\u00f3\n\30\f\30\16\30\u00f6"+
		"\13\30\3\31\3\31\3\31\3\31\5\31\u00fc\n\31\3\32\3\32\3\32\7\32\u0101\n"+
		"\32\f\32\16\32\u0104\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u010d"+
		"\n\33\f\33\16\33\u0110\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u0117\n\34"+
		"\3\35\3\35\3\36\3\36\3\36\5\36\u011e\n\36\3\36\3\36\3\36\3\36\7\36\u0124"+
		"\n\36\f\36\16\36\u0127\13\36\3\37\3\37\3\37\2\5.\64: \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\4\2#%\'\'\3\2\13\f\4"+
		"\2\4\b\n\n\2\u0132\2A\3\2\2\2\4J\3\2\2\2\6T\3\2\2\2\b]\3\2\2\2\n_\3\2"+
		"\2\2\fg\3\2\2\2\16v\3\2\2\2\20z\3\2\2\2\22\u0085\3\2\2\2\24\u008a\3\2"+
		"\2\2\26\u008d\3\2\2\2\30\u0096\3\2\2\2\32\u009b\3\2\2\2\34\u00ac\3\2\2"+
		"\2\36\u00b5\3\2\2\2 \u00ca\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d4"+
		"\3\2\2\2(\u00d7\3\2\2\2*\u00de\3\2\2\2,\u00e0\3\2\2\2.\u00ec\3\2\2\2\60"+
		"\u00fb\3\2\2\2\62\u00fd\3\2\2\2\64\u0105\3\2\2\2\66\u0116\3\2\2\28\u0118"+
		"\3\2\2\2:\u011d\3\2\2\2<\u0128\3\2\2\2>@\5\26\f\2?>\3\2\2\2@C\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\7 \2\2KL\7(\2\2LM\5\f\7\2"+
		"MN\7\3\2\2NO\5,\27\2OP\5\6\4\2PQ\5\b\5\2QR\7\36\2\2RS\5:\36\2S\5\3\2\2"+
		"\2TU\7\31\2\2U\7\3\2\2\2VY\5\n\6\2WY\5\22\n\2XV\3\2\2\2XW\3\2\2\2YZ\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\^\3\2\2\2]X\3\2\2\2]\\\3\2\2\2^"+
		"\t\3\2\2\2_`\7(\2\2`b\7\21\2\2ac\5\62\32\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2"+
		"\2de\7\22\2\2ef\5:\36\2f\13\3\2\2\2gk\7\21\2\2hj\5\16\b\2ih\3\2\2\2jm"+
		"\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2\2\2np\5\20\t\2on\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\22\2\2u\r\3\2\2"+
		"\2vw\5,\27\2wx\7\3\2\2xy\7(\2\2y\17\3\2\2\2z{\7\30\2\2{|\5\16\b\2|\21"+
		"\3\2\2\2}\u0086\5\26\f\2~\u0086\5 \21\2\177\u0086\5$\23\2\u0080\u0086"+
		"\5(\25\2\u0081\u0086\5\30\r\2\u0082\u0086\5\32\16\2\u0083\u0086\5\34\17"+
		"\2\u0084\u0086\5\36\20\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2"+
		"\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u0089\5\22\n\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\25\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5,\27\2\u008e\u008f"+
		"\7\3\2\2\u008f\u0092\7(\2\2\u0090\u0091\7\t\2\2\u0091\u0093\5.\30\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5:"+
		"\36\2\u0095\27\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7\t\2\2\u0098\u0099"+
		"\5.\30\2\u0099\u009a\5:\36\2\u009a\31\3\2\2\2\u009b\u009f\7\37\2\2\u009c"+
		"\u00a0\5.\30\2\u009d\u00a0\5\26\f\2\u009e\u00a0\5\30\r\2\u009f\u009c\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\27\2\2\u00a2\u00a3\5\64\33\2\u00a3\u00a5\7\27\2\2\u00a4\u00a6"+
		"\5\30\r\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a8\5\6\4\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa\7\36\2\2\u00aa"+
		"\u00ab\5:\36\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00b0\7\21\2"+
		"\2\u00ae\u00b1\7(\2\2\u00af\u00b1\5.\30\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4\5:\36\2"+
		"\u00b4\35\3\2\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8"+
		"\7\22\2\2\u00b8\u00b9\5:\36\2\u00b9\37\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb"+
		"\u00bc\5*\26\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7"+
		"\36\2\2\u00bf\u00c0\5:\36\2\u00c0\u00cb\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2"+
		"\u00c3\5*\26\2\u00c3\u00c4\5\6\4\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\5"+
		"\"\22\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\36\2\2\u00c8\u00c9\5:\36\2"+
		"\u00c9\u00cb\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00c1\3\2\2\2\u00cb!\3"+
		"\2\2\2\u00cc\u00cd\7\33\2\2\u00cd#\3\2\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0"+
		"\5\6\4\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\5:\36"+
		"\2\u00d3%\3\2\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\5*\26\2\u00d6\'\3\2"+
		"\2\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00da\5\24\13\2\u00da"+
		"\u00db\5:\36\2\u00db\u00dc\5&\24\2\u00dc\u00dd\5:\36\2\u00dd)\3\2\2\2"+
		"\u00de\u00df\5\64\33\2\u00df+\3\2\2\2\u00e0\u00e1\t\2\2\2\u00e1-\3\2\2"+
		"\2\u00e2\u00e3\b\30\1\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\5.\30\2\u00e5"+
		"\u00e6\7\22\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00ed\7(\2\2\u00e8\u00ed\7)"+
		"\2\2\u00e9\u00ed\7*\2\2\u00ea\u00ed\7+\2\2\u00eb\u00ed\7&\2\2\u00ec\u00e2"+
		"\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\f\t"+
		"\2\2\u00ef\u00f0\5\60\31\2\u00f0\u00f1\5.\30\n\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5/\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fc\7\17\2\2\u00f8\u00fc"+
		"\7\20\2\2\u00f9\u00fc\7\16\2\2\u00fa\u00fc\7\r\2\2\u00fb\u00f7\3\2\2\2"+
		"\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\61"+
		"\3\2\2\2\u00fd\u0102\5.\30\2\u00fe\u00ff\7\30\2\2\u00ff\u0101\5.\30\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\63\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\33\1\2\u0106"+
		"\u0107\5\66\34\2\u0107\u010e\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\5"+
		"8\35\2\u010a\u010b\5\66\34\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\65\3\2\2"+
		"\2\u0110\u010e\3\2\2\2\u0111\u0112\5.\30\2\u0112\u0113\5<\37\2\u0113\u0114"+
		"\5.\30\2\u0114\u0117\3\2\2\2\u0115\u0117\5.\30\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\67\3\2\2\2\u0118\u0119\t\3\2\2\u01199\3\2\2\2\u011a"+
		"\u011e\b\36\1\2\u011b\u011e\7\31\2\2\u011c\u011e\7\27\2\2\u011d\u011a"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0125\3\2\2\2\u011f"+
		"\u0120\f\4\2\2\u0120\u0124\7\27\2\2\u0121\u0122\f\3\2\2\u0122\u0124\7"+
		"\31\2\2\u0123\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126;\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\t\4\2\2\u0129=\3\2\2\2\32AGXZ]bkq\u0085\u008a\u0092\u009f"+
		"\u00a5\u00b0\u00ca\u00ec\u00f4\u00fb\u0102\u010e\u0116\u011d\u0123\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}