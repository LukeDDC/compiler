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
		T__0=1, T__1=2, T__2=3, GREATER_THAN_OR_EQUALS=4, LESSER_THAN_OR_EQUALS=5, 
		GREATER_THAN=6, LESSER_THAN=7, NOT_EQUALS=8, ASSIGN=9, EQUALS=10, AND=11, 
		OR=12, ADD=13, SUB=14, MULT=15, DIV=16, LPAREN=17, RPAREN=18, LBRACE=19, 
		RBRACE=20, LBRACK=21, RBRACK=22, SEMICOLON=23, COMMA=24, NEW_LINE=25, 
		IF=26, ELSE=27, WHILE=28, DO=29, END=30, FOR=31, DEF=32, INT_T=33, FLOAT_T=34, 
		STRING_T=35, BOOL_T=36, VOID_T=37, ID=38, INT=39, FLOAT=40, STRING=41, 
		WS=42;
	public static final int
		RULE_program = 0, RULE_function_declaration = 1, RULE_main_declaration = 2, 
		RULE_new_line = 3, RULE_function_body = 4, RULE_parameters = 5, RULE_parameter = 6, 
		RULE_additional_parameter = 7, RULE_statement = 8, RULE_statement_body = 9, 
		RULE_return_statement = 10, RULE_declaration_statement = 11, RULE_assign_statement = 12, 
		RULE_for_statement = 13, RULE_if_statement = 14, RULE_else_statement = 15, 
		RULE_while_statement = 16, RULE_while_block = 17, RULE_do_while_statement = 18, 
		RULE_conditional = 19, RULE_type = 20, RULE_expression = 21, RULE_aritmetic_operator = 22, 
		RULE_expression_list = 23, RULE_additional_expression = 24, RULE_conditional_expression_list = 25, 
		RULE_conditional_expression = 26, RULE_logical_operator = 27, RULE_terminator = 28, 
		RULE_terminator_token = 29, RULE_conditional_operator = 30;
	public static final String[] ruleNames = {
		"program", "function_declaration", "main_declaration", "new_line", "function_body", 
		"parameters", "parameter", "additional_parameter", "statement", "statement_body", 
		"return_statement", "declaration_statement", "assign_statement", "for_statement", 
		"if_statement", "else_statement", "while_statement", "while_block", "do_while_statement", 
		"conditional", "type", "expression", "aritmetic_operator", "expression_list", 
		"additional_expression", "conditional_expression_list", "conditional_expression", 
		"logical_operator", "terminator", "terminator_token", "conditional_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'main'", "'return'", "'>='", "'<='", "'>'", "'<'", "'!='", 
		"'='", "'=='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", null, "'if'", "'else'", "'while'", 
		"'do'", "'end'", "'for'", "'def'", "'Integer'", "'Float'", "'String'", 
		"'Bool'", "'Void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "GREATER_THAN_OR_EQUALS", "LESSER_THAN_OR_EQUALS", 
		"GREATER_THAN", "LESSER_THAN", "NOT_EQUALS", "ASSIGN", "EQUALS", "AND", 
		"OR", "ADD", "SUB", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "NEW_LINE", "IF", "ELSE", "WHILE", 
		"DO", "END", "FOR", "DEF", "INT_T", "FLOAT_T", "STRING_T", "BOOL_T", "VOID_T", 
		"ID", "INT", "FLOAT", "STRING", "WS"
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
		public Main_declarationContext main_declaration() {
			return getRuleContext(Main_declarationContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(62);
				declaration_statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					function_declaration();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(74);
				main_declaration();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RUBYParser.DEF, 0); }
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DEF);
			setState(78);
			match(ID);
			setState(79);
			parameters();
			setState(80);
			match(T__0);
			setState(81);
			type();
			setState(82);
			new_line();
			setState(83);
			function_body();
			setState(84);
			match(END);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(85);
				new_line();
				}
				}
				setState(90);
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

	public static class Main_declarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RUBYParser.DEF, 0); }
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
		public Main_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterMain_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitMain_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitMain_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_declarationContext main_declaration() throws RecognitionException {
		Main_declarationContext _localctx = new Main_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DEF);
			setState(92);
			match(T__1);
			setState(93);
			match(T__0);
			setState(94);
			match(VOID_T);
			setState(95);
			new_line();
			setState(96);
			function_body();
			setState(97);
			match(END);
			setState(98);
			terminator();
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
		enterRule(_localctx, 6, RULE_new_line);
		try {
			_localctx = new NewLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(102);
					expression(0);
					}
					break;
				case 2:
					{
					setState(103);
					statement();
					}
					break;
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LPAREN) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << BOOL_T) | (1L << VOID_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0) );
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
			setState(108);
			match(LPAREN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(109);
				parameter();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				additional_parameter();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
			setState(123);
			type();
			setState(124);
			match(T__0);
			setState(125);
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
			setState(127);
			match(COMMA);
			setState(128);
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				declaration_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				do_while_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				assign_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				for_statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				return_statement();
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
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					statement();
					}
					} 
				}
				setState(144);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__2);
			setState(146);
			expression(0);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					new_line();
					}
					} 
				}
				setState(152);
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
		enterRule(_localctx, 22, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			type();
			setState(154);
			match(T__0);
			setState(155);
			match(ID);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ASSIGN);
				setState(157);
				expression(0);
				}
				break;
			}
			setState(160);
			terminator();
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
		enterRule(_localctx, 24, RULE_assign_statement);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(ASSIGN);
			setState(164);
			expression(0);
			setState(165);
			terminator();
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
		enterRule(_localctx, 26, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(FOR);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(168);
				expression(0);
				}
				break;
			case 2:
				{
				setState(169);
				declaration_statement();
				}
				break;
			case 3:
				{
				setState(170);
				assign_statement();
				}
				break;
			}
			setState(173);
			match(SEMICOLON);
			setState(174);
			conditional_expression_list(0);
			setState(175);
			match(SEMICOLON);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				assign_statement();
				}
			}

			setState(179);
			new_line();
			setState(180);
			statement_body();
			setState(181);
			match(END);
			setState(182);
			terminator();
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
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
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
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IF);
				setState(185);
				conditional();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(186);
					new_line();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				statement_body();
				setState(193);
				match(END);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						new_line();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(IF);
				setState(201);
				conditional();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(202);
					new_line();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				statement_body();
				setState(209);
				else_statement();
				setState(210);
				statement_body();
				setState(211);
				match(END);
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						new_line();
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 30, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
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
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			while_block();
			setState(223);
			new_line();
			setState(224);
			statement_body();
			setState(225);
			match(END);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					new_line();
					}
					} 
				}
				setState(231);
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
		enterRule(_localctx, 34, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
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
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(DO);
			setState(236);
			new_line();
			setState(237);
			statement_body();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(238);
				new_line();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			while_block();
			setState(245);
			terminator();
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
		enterRule(_localctx, 38, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
	public static class FunctionCallContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(252);
				match(ID);
				setState(253);
				expression_list();
				setState(254);
				terminator();
				}
				break;
			case 2:
				{
				_localctx = new EnclouseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(LPAREN);
				setState(257);
				expression(0);
				setState(258);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(BOOL_T);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticOperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(267);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(268);
					aritmetic_operator();
					setState(269);
					expression(8);
					}
					} 
				}
				setState(275);
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
		enterRule(_localctx, 44, RULE_aritmetic_operator);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(DIV);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(SUB);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
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
		public List<Additional_expressionContext> additional_expression() {
			return getRuleContexts(Additional_expressionContext.class);
		}
		public Additional_expressionContext additional_expression(int i) {
			return getRuleContext(Additional_expressionContext.class,i);
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
		enterRule(_localctx, 46, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LPAREN);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BOOL_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(283);
				expression(0);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				additional_expression();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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

	public static class Additional_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Additional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterAdditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitAdditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitAdditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additional_expressionContext additional_expression() throws RecognitionException {
		Additional_expressionContext _localctx = new Additional_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(COMMA);
			setState(298);
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
			setState(301);
			conditional_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Conditional_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditional_expression_list);
					setState(303);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(304);
					logical_operator();
					setState(305);
					conditional_expression();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				expression(0);
				setState(313);
				conditional_operator();
				setState(314);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
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
			setState(319);
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
		public Terminator_tokenContext terminator_token() {
			return getRuleContext(Terminator_tokenContext.class,0);
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
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			terminator_token(0);
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

	public static class Terminator_tokenContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(RUBYParser.NEW_LINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(RUBYParser.SEMICOLON, 0); }
		public Terminator_tokenContext terminator_token() {
			return getRuleContext(Terminator_tokenContext.class,0);
		}
		public Terminator_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).enterTerminator_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RUBYListener ) ((RUBYListener)listener).exitTerminator_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitTerminator_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminator_tokenContext terminator_token() throws RecognitionException {
		return terminator_token(0);
	}

	private Terminator_tokenContext terminator_token(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Terminator_tokenContext _localctx = new Terminator_tokenContext(_ctx, _parentState);
		Terminator_tokenContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_terminator_token, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(324);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(325);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Terminator_tokenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator_token);
						setState(328);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(329);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new Terminator_tokenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator_token);
						setState(330);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(331);
						match(NEW_LINE);
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 60, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return conditional_expression_list_sempred((Conditional_expression_listContext)_localctx, predIndex);
		case 29:
			return terminator_token_sempred((Terminator_tokenContext)_localctx, predIndex);
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
	private boolean terminator_token_sempred(Terminator_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\5\2N\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\6\6k\n\6\r\6\16\6l\3\7\3\7\7"+
		"\7q\n\7\f\7\16\7t\13\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\7\13\u008f"+
		"\n\13\f\13\16\13\u0092\13\13\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\17\3\17\3\17\3\17\5\17\u00b4"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00be\n\20\f\20\16"+
		"\20\u00c1\13\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13\20"+
		"\3\20\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\5\20\u00dd\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00f2\n\24\f\24\16\24\u00f5\13"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0112\n\27\f\27\16\27\u0115\13\27\3\30\3\30\3\30\3\30\5\30"+
		"\u011b\n\30\3\31\3\31\7\31\u011f\n\31\f\31\16\31\u0122\13\31\3\31\7\31"+
		"\u0125\n\31\f\31\16\31\u0128\13\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0136\n\33\f\33\16\33\u0139\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0140\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\5\37\u0149\n\37\3\37\3\37\3\37\3\37\7\37\u014f\n\37\f\37\16\37\u0152"+
		"\13\37\3 \3 \3 \2\5,\64<!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>\2\5\4\2#%\'\'\3\2\r\16\4\2\6\n\f\f\2\u0163\2C\3\2"+
		"\2\2\4O\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nj\3\2\2\2\fn\3\2\2\2\16}\3\2\2"+
		"\2\20\u0081\3\2\2\2\22\u008b\3\2\2\2\24\u0090\3\2\2\2\26\u0093\3\2\2\2"+
		"\30\u009b\3\2\2\2\32\u00a4\3\2\2\2\34\u00a9\3\2\2\2\36\u00dc\3\2\2\2 "+
		"\u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00ea\3\2\2\2&\u00ed\3\2\2\2(\u00f9\3"+
		"\2\2\2*\u00fb\3\2\2\2,\u010b\3\2\2\2.\u011a\3\2\2\2\60\u011c\3\2\2\2\62"+
		"\u012b\3\2\2\2\64\u012e\3\2\2\2\66\u013f\3\2\2\28\u0141\3\2\2\2:\u0143"+
		"\3\2\2\2<\u0148\3\2\2\2>\u0153\3\2\2\2@B\5\30\r\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\6\4\2ML\3\2\2\2MN\3\2\2\2"+
		"N\3\3\2\2\2OP\7\"\2\2PQ\7(\2\2QR\5\f\7\2RS\7\3\2\2ST\5*\26\2TU\5\b\5\2"+
		"UV\5\n\6\2VZ\7 \2\2WY\5\b\5\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\5\3\2\2\2\\Z\3\2\2\2]^\7\"\2\2^_\7\4\2\2_`\7\3\2\2`a\7\'\2\2ab\5\b\5"+
		"\2bc\5\n\6\2cd\7 \2\2de\5:\36\2e\7\3\2\2\2fg\7\33\2\2g\t\3\2\2\2hk\5,"+
		"\27\2ik\5\22\n\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13"+
		"\3\2\2\2nr\7\23\2\2oq\5\16\b\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"sx\3\2\2\2tr\3\2\2\2uw\5\20\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y{\3\2\2\2zx\3\2\2\2{|\7\24\2\2|\r\3\2\2\2}~\5*\26\2~\177\7\3\2\2\177"+
		"\u0080\7(\2\2\u0080\17\3\2\2\2\u0081\u0082\7\32\2\2\u0082\u0083\5\16\b"+
		"\2\u0083\21\3\2\2\2\u0084\u008c\5\30\r\2\u0085\u008c\5\36\20\2\u0086\u008c"+
		"\5\"\22\2\u0087\u008c\5&\24\2\u0088\u008c\5\32\16\2\u0089\u008c\5\34\17"+
		"\2\u008a\u008c\5\26\f\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\23\3\2\2\2\u008d\u008f\5\22\n\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0098\5,\27"+
		"\2\u0095\u0097\5\b\5\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\27\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\5*\26\2\u009c\u009d\7\3\2\2\u009d\u00a0\7(\2\2\u009e\u009f\7\13"+
		"\2\2\u009f\u00a1\5,\27\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\5:\36\2\u00a3\31\3\2\2\2\u00a4\u00a5\7(\2\2"+
		"\u00a5\u00a6\7\13\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\5:\36\2\u00a8\33"+
		"\3\2\2\2\u00a9\u00ad\7!\2\2\u00aa\u00ae\5,\27\2\u00ab\u00ae\5\30\r\2\u00ac"+
		"\u00ae\5\32\16\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b1\5\64\33\2"+
		"\u00b1\u00b3\7\31\2\2\u00b2\u00b4\5\32\16\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\5\24"+
		"\13\2\u00b7\u00b8\7 \2\2\u00b8\u00b9\5:\36\2\u00b9\35\3\2\2\2\u00ba\u00bb"+
		"\7\34\2\2\u00bb\u00bf\5(\25\2\u00bc\u00be\5\b\5\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c7\7 \2\2"+
		"\u00c4\u00c6\5\b\5\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00dd\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7\34\2\2\u00cb\u00cf\5(\25\2\u00cc\u00ce\5\b\5\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4\5"+
		" \21\2\u00d4\u00d5\5\24\13\2\u00d5\u00d9\7 \2\2\u00d6\u00d8\5\b\5\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00ba\3\2\2\2\u00dc"+
		"\u00ca\3\2\2\2\u00dd\37\3\2\2\2\u00de\u00df\7\35\2\2\u00df!\3\2\2\2\u00e0"+
		"\u00e1\5$\23\2\u00e1\u00e2\5\b\5\2\u00e2\u00e3\5\24\13\2\u00e3\u00e7\7"+
		" \2\2\u00e4\u00e6\5\b\5\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00eb\7\36\2\2\u00eb\u00ec\5(\25\2\u00ec%\3\2\2\2\u00ed\u00ee\7"+
		"\37\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f3\5\24\13\2\u00f0\u00f2\5\b\5\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5$\23\2\u00f7"+
		"\u00f8\5:\36\2\u00f8\'\3\2\2\2\u00f9\u00fa\5\64\33\2\u00fa)\3\2\2\2\u00fb"+
		"\u00fc\t\2\2\2\u00fc+\3\2\2\2\u00fd\u00fe\b\27\1\2\u00fe\u00ff\7(\2\2"+
		"\u00ff\u0100\5\60\31\2\u0100\u0101\5:\36\2\u0101\u010c\3\2\2\2\u0102\u0103"+
		"\7\23\2\2\u0103\u0104\5,\27\2\u0104\u0105\7\24\2\2\u0105\u010c\3\2\2\2"+
		"\u0106\u010c\7(\2\2\u0107\u010c\7)\2\2\u0108\u010c\7*\2\2\u0109\u010c"+
		"\7+\2\2\u010a\u010c\7&\2\2\u010b\u00fd\3\2\2\2\u010b\u0102\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c\u0113\3\2\2\2\u010d\u010e\f\t\2\2\u010e"+
		"\u010f\5.\30\2\u010f\u0110\5,\27\n\u0110\u0112\3\2\2\2\u0111\u010d\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"-\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b\7\21\2\2\u0117\u011b\7\22\2"+
		"\2\u0118\u011b\7\20\2\2\u0119\u011b\7\17\2\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b/\3\2\2\2"+
		"\u011c\u0120\7\23\2\2\u011d\u011f\5,\27\2\u011e\u011d\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0126\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\5\62\32\2\u0124\u0123\3\2\2\2\u0125\u0128\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\7\24\2\2\u012a\61\3\2\2\2\u012b\u012c\7\32"+
		"\2\2\u012c\u012d\5,\27\2\u012d\63\3\2\2\2\u012e\u012f\b\33\1\2\u012f\u0130"+
		"\5\66\34\2\u0130\u0137\3\2\2\2\u0131\u0132\f\4\2\2\u0132\u0133\58\35\2"+
		"\u0133\u0134\5\66\34\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\65\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\5,\27\2\u013b\u013c\5> \2\u013c\u013d\5,\27"+
		"\2\u013d\u0140\3\2\2\2\u013e\u0140\5,\27\2\u013f\u013a\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\67\3\2\2\2\u0141\u0142\t\3\2\2\u01429\3\2\2\2\u0143\u0144"+
		"\5<\37\2\u0144;\3\2\2\2\u0145\u0149\b\37\1\2\u0146\u0149\7\33\2\2\u0147"+
		"\u0149\7\31\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3"+
		"\2\2\2\u0149\u0150\3\2\2\2\u014a\u014b\f\4\2\2\u014b\u014f\7\31\2\2\u014c"+
		"\u014d\f\3\2\2\u014d\u014f\7\33\2\2\u014e\u014a\3\2\2\2\u014e\u014c\3"+
		"\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"=\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\t\4\2\2\u0154?\3\2\2\2!CIMZ"+
		"jlrx\u008b\u0090\u0098\u00a0\u00ad\u00b3\u00bf\u00c7\u00cf\u00d9\u00dc"+
		"\u00e7\u00f3\u010b\u0113\u011a\u0120\u0126\u0137\u013f\u0148\u014e\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}