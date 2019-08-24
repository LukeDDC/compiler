// Generated from /home/lucas/Projects/ufabc/compilers/compiler/RUBY.g4 by ANTLR 4.7.1
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
		RULE_conditional = 19, RULE_type = 20, RULE_function_call = 21, RULE_expression = 22, 
		RULE_aritmetic_operator = 23, RULE_expression_list = 24, RULE_additional_expression = 25, 
		RULE_conditional_expression_list = 26, RULE_conditional_expression = 27, 
		RULE_logical_operator = 28, RULE_terminator = 29, RULE_terminator_token = 30, 
		RULE_conditional_operator = 31;
	public static final String[] ruleNames = {
		"program", "function_declaration", "main_declaration", "new_line", "function_body", 
		"parameters", "parameter", "additional_parameter", "statement", "statement_body", 
		"return_statement", "declaration_statement", "assign_statement", "for_statement", 
		"if_statement", "else_statement", "while_statement", "while_block", "do_while_statement", 
		"conditional", "type", "function_call", "expression", "aritmetic_operator", 
		"expression_list", "additional_expression", "conditional_expression_list", 
		"conditional_expression", "logical_operator", "terminator", "terminator_token", 
		"conditional_operator"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(64);
				declaration_statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					function_declaration();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(76);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DEF);
			setState(80);
			match(ID);
			setState(81);
			parameters();
			setState(82);
			match(T__0);
			setState(83);
			type();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(84);
				new_line();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			function_body();
			setState(91);
			match(END);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(92);
				new_line();
				}
				}
				setState(97);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RUBYParser.END, 0); }
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public Main_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_declaration; }
	}

	public final Main_declarationContext main_declaration() throws RecognitionException {
		Main_declarationContext _localctx = new Main_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DEF);
			setState(99);
			match(T__1);
			setState(100);
			match(T__0);
			setState(101);
			match(VOID_T);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(102);
				new_line();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			function_body();
			setState(109);
			match(END);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(110);
				new_line();
				}
				}
				setState(115);
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
	}

	public final New_lineContext new_line() throws RecognitionException {
		New_lineContext _localctx = new New_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_new_line);
		try {
			_localctx = new NewLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(118);
					statement();
					}
					break;
				case 2:
					{
					setState(119);
					expression(0);
					}
					break;
				}
				}
				setState(122); 
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LPAREN);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(125);
				parameter();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				additional_parameter();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			type();
			setState(140);
			match(T__0);
			setState(141);
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
	}

	public final Additional_parameterContext additional_parameter() throws RecognitionException {
		Additional_parameterContext _localctx = new Additional_parameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additional_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(COMMA);
			setState(144);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				do_while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				assign_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				for_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				function_call();
				setState(154);
				terminator();
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
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					statement();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__2);
			setState(165);
			expression(0);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					new_line();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			type();
			setState(173);
			match(T__0);
			setState(174);
			match(ID);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(175);
				match(ASSIGN);
				setState(176);
				expression(0);
				}
				break;
			}
			setState(179);
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
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_statement);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ID);
			setState(182);
			match(ASSIGN);
			setState(183);
			expression(0);
			setState(184);
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
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FOR);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(187);
				expression(0);
				}
				break;
			case 2:
				{
				setState(188);
				declaration_statement();
				}
				break;
			case 3:
				{
				setState(189);
				assign_statement();
				}
				break;
			}
			setState(192);
			match(SEMICOLON);
			setState(193);
			conditional_expression_list(0);
			setState(194);
			match(SEMICOLON);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(195);
				assign_statement();
				}
			}

			setState(198);
			new_line();
			setState(199);
			statement_body();
			setState(200);
			match(END);
			setState(201);
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			int _alt;
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IF);
				setState(204);
				conditional();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(205);
					new_line();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				statement_body();
				setState(212);
				match(END);
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						new_line();
						}
						} 
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(IF);
				setState(220);
				conditional();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(221);
					new_line();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				statement_body();
				setState(228);
				else_statement();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(229);
					new_line();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				statement_body();
				setState(236);
				match(END);
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						new_line();
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			while_block();
			setState(248);
			new_line();
			setState(249);
			statement_body();
			setState(250);
			match(END);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					new_line();
					}
					} 
				}
				setState(256);
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
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHILE);
			setState(258);
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
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DO);
			setState(261);
			new_line();
			setState(262);
			statement_body();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(263);
				new_line();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			while_block();
			setState(270);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			int _alt;
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			expression_list();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					new_line();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class CallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(RUBYParser.FLOAT, 0); }
		public FloatContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL_T() { return getToken(RUBYParser.BOOL_T, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(RUBYParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EnclouseContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnclouseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(RUBYParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(285);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new EnclouseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(LPAREN);
				setState(287);
				expression(0);
				setState(288);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(BOOL_T);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticOperationContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(297);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(298);
					aritmetic_operator();
					setState(299);
					expression(9);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	}
	public static class AddContext extends Aritmetic_operatorContext {
		public AddContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends Aritmetic_operatorContext {
		public SubContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
	}
	public static class MultContext extends Aritmetic_operatorContext {
		public MultContext(Aritmetic_operatorContext ctx) { copyFrom(ctx); }
	}

	public final Aritmetic_operatorContext aritmetic_operator() throws RecognitionException {
		Aritmetic_operatorContext _localctx = new Aritmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aritmetic_operator);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(DIV);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(SUB);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
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
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LPAREN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BOOL_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(313);
				expression(0);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(319);
				additional_expression();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
	}

	public final Additional_expressionContext additional_expression() throws RecognitionException {
		Additional_expressionContext _localctx = new Additional_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_additional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(COMMA);
			setState(328);
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
	}

	public final Conditional_expression_listContext conditional_expression_list() throws RecognitionException {
		return conditional_expression_list(0);
	}

	private Conditional_expression_listContext conditional_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Conditional_expression_listContext _localctx = new Conditional_expression_listContext(_ctx, _parentState);
		Conditional_expression_listContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_conditional_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			conditional_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Conditional_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditional_expression_list);
					setState(333);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(334);
					logical_operator();
					setState(335);
					conditional_expression();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditional_expression);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				expression(0);
				setState(343);
				conditional_operator();
				setState(344);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
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
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
	}

	public final Terminator_tokenContext terminator_token() throws RecognitionException {
		return terminator_token(0);
	}

	private Terminator_tokenContext terminator_token(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Terminator_tokenContext _localctx = new Terminator_tokenContext(_ctx, _parentState);
		Terminator_tokenContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_terminator_token, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(354);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(355);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(362);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Terminator_tokenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator_token);
						setState(358);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(359);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new Terminator_tokenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator_token);
						setState(360);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(361);
						match(NEW_LINE);
						}
						break;
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		case 26:
			return conditional_expression_list_sempred((Conditional_expression_listContext)_localctx, predIndex);
		case 30:
			return terminator_token_sempred((Terminator_tokenContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0174\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\3\7\3`\n"+
		"\3\f\3\16\3c\13\3\3\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4"+
		"\3\4\7\4r\n\4\f\4\16\4u\13\4\3\5\3\5\3\6\3\6\6\6{\n\6\r\6\16\6|\3\7\3"+
		"\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u009f\n\n\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13\13"+
		"\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00b4\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c1"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20\3\20\3\20\3\20\7\20"+
		"\u00d9\n\20\f\20\16\20\u00dc\13\20\3\20\3\20\3\20\7\20\u00e1\n\20\f\20"+
		"\16\20\u00e4\13\20\3\20\3\20\3\20\7\20\u00e9\n\20\f\20\16\20\u00ec\13"+
		"\20\3\20\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\5\20\u00f6\n"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102"+
		"\13\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u010b\n\24\f\24\16\24\u010e"+
		"\13\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u011a\n"+
		"\27\f\27\16\27\u011d\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u012a\n\30\3\30\3\30\3\30\3\30\7\30\u0130\n\30\f\30\16"+
		"\30\u0133\13\30\3\31\3\31\3\31\3\31\5\31\u0139\n\31\3\32\3\32\7\32\u013d"+
		"\n\32\f\32\16\32\u0140\13\32\3\32\7\32\u0143\n\32\f\32\16\32\u0146\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0154"+
		"\n\34\f\34\16\34\u0157\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u015e\n\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u0167\n \3 \3 \3 \3 \7 \u016d\n \f \16"+
		" \u0170\13 \3!\3!\3!\2\5.\66>\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\5\4\2#%\'\'\3\2\r\16\4\2\6\n\f\f\2\u0186"+
		"\2E\3\2\2\2\4Q\3\2\2\2\6d\3\2\2\2\bv\3\2\2\2\nz\3\2\2\2\f~\3\2\2\2\16"+
		"\u008d\3\2\2\2\20\u0091\3\2\2\2\22\u009e\3\2\2\2\24\u00a3\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b7\3\2\2\2\34\u00bc\3\2\2\2\36\u00f5\3"+
		"\2\2\2 \u00f7\3\2\2\2\"\u00f9\3\2\2\2$\u0103\3\2\2\2&\u0106\3\2\2\2(\u0112"+
		"\3\2\2\2*\u0114\3\2\2\2,\u0116\3\2\2\2.\u0129\3\2\2\2\60\u0138\3\2\2\2"+
		"\62\u013a\3\2\2\2\64\u0149\3\2\2\2\66\u014c\3\2\2\28\u015d\3\2\2\2:\u015f"+
		"\3\2\2\2<\u0161\3\2\2\2>\u0166\3\2\2\2@\u0171\3\2\2\2BD\5\30\r\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\4\3\2IH\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NP\5\6\4\2ON\3\2"+
		"\2\2OP\3\2\2\2P\3\3\2\2\2QR\7\"\2\2RS\7(\2\2ST\5\f\7\2TU\7\3\2\2UY\5*"+
		"\26\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3"+
		"\2\2\2\\]\5\n\6\2]a\7 \2\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\5\3\2\2\2ca\3\2\2\2de\7\"\2\2ef\7\4\2\2fg\7\3\2\2gk\7\'\2\2hj"+
		"\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2n"+
		"o\5\n\6\2os\7 \2\2pr\5\b\5\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t"+
		"\7\3\2\2\2us\3\2\2\2vw\7\33\2\2w\t\3\2\2\2x{\5\22\n\2y{\5.\30\2zx\3\2"+
		"\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2\2~\u0082\7\23\2"+
		"\2\177\u0081\5\16\b\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\5\20\t\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\24\2\2\u008c\r\3\2\2\2\u008d\u008e\5*\26\2\u008e\u008f\7\3\2"+
		"\2\u008f\u0090\7(\2\2\u0090\17\3\2\2\2\u0091\u0092\7\32\2\2\u0092\u0093"+
		"\5\16\b\2\u0093\21\3\2\2\2\u0094\u009f\5\30\r\2\u0095\u009f\5\36\20\2"+
		"\u0096\u009f\5\"\22\2\u0097\u009f\5&\24\2\u0098\u009f\5\32\16\2\u0099"+
		"\u009f\5\34\17\2\u009a\u009f\5\26\f\2\u009b\u009c\5,\27\2\u009c\u009d"+
		"\5<\37\2\u009d\u009f\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0095\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2"+
		"\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a2"+
		"\5\22\n\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\7\5\2\2\u00a7\u00ab\5.\30\2\u00a8\u00aa\5\b\5\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5*\26\2\u00af\u00b0\7\3\2\2\u00b0\u00b3"+
		"\7(\2\2\u00b1\u00b2\7\13\2\2\u00b2\u00b4\5.\30\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5<\37\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5.\30\2\u00ba\u00bb"+
		"\5<\37\2\u00bb\33\3\2\2\2\u00bc\u00c0\7!\2\2\u00bd\u00c1\5.\30\2\u00be"+
		"\u00c1\5\30\r\2\u00bf\u00c1\5\32\16\2\u00c0\u00bd\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\31\2\2"+
		"\u00c3\u00c4\5\66\34\2\u00c4\u00c6\7\31\2\2\u00c5\u00c7\5\32\16\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5\b"+
		"\5\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5<\37\2\u00cc"+
		"\35\3\2\2\2\u00cd\u00ce\7\34\2\2\u00ce\u00d2\5(\25\2\u00cf\u00d1\5\b\5"+
		"\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\24\13\2"+
		"\u00d6\u00da\7 \2\2\u00d7\u00d9\5\b\5\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00f6\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\34\2\2\u00de\u00e2\5(\25\2\u00df\u00e1\5"+
		"\b\5\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\24"+
		"\13\2\u00e6\u00ea\5 \21\2\u00e7\u00e9\5\b\5\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5\24\13\2\u00ee\u00f2\7 \2\2\u00ef"+
		"\u00f1\5\b\5\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00cd\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7\35\2"+
		"\2\u00f8!\3\2\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\5\b\5\2\u00fb\u00fc"+
		"\5\24\13\2\u00fc\u0100\7 \2\2\u00fd\u00ff\5\b\5\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101#\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\36\2\2\u0104\u0105\5(\25\2\u0105"+
		"%\3\2\2\2\u0106\u0107\7\37\2\2\u0107\u0108\5\b\5\2\u0108\u010c\5\24\13"+
		"\2\u0109\u010b\5\b\5\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\5$\23\2\u0110\u0111\5<\37\2\u0111\'\3\2\2\2\u0112\u0113\5\66\34"+
		"\2\u0113)\3\2\2\2\u0114\u0115\t\2\2\2\u0115+\3\2\2\2\u0116\u0117\7(\2"+
		"\2\u0117\u011b\5\62\32\2\u0118\u011a\5\b\5\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c-\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011e\u011f\b\30\1\2\u011f\u012a\5,\27\2\u0120\u0121"+
		"\7\23\2\2\u0121\u0122\5.\30\2\u0122\u0123\7\24\2\2\u0123\u012a\3\2\2\2"+
		"\u0124\u012a\7(\2\2\u0125\u012a\7)\2\2\u0126\u012a\7*\2\2\u0127\u012a"+
		"\7+\2\2\u0128\u012a\7&\2\2\u0129\u011e\3\2\2\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\u0131\3\2\2\2\u012b\u012c\f\n\2\2\u012c"+
		"\u012d\5\60\31\2\u012d\u012e\5.\30\13\u012e\u0130\3\2\2\2\u012f\u012b"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"/\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0139\7\21\2\2\u0135\u0139\7\22\2"+
		"\2\u0136\u0139\7\20\2\2\u0137\u0139\7\17\2\2\u0138\u0134\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\61\3\2\2"+
		"\2\u013a\u013e\7\23\2\2\u013b\u013d\5.\30\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0144\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5\64\33\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\24\2\2\u0148\63\3\2\2\2\u0149\u014a"+
		"\7\32\2\2\u014a\u014b\5.\30\2\u014b\65\3\2\2\2\u014c\u014d\b\34\1\2\u014d"+
		"\u014e\58\35\2\u014e\u0155\3\2\2\2\u014f\u0150\f\4\2\2\u0150\u0151\5:"+
		"\36\2\u0151\u0152\58\35\2\u0152\u0154\3\2\2\2\u0153\u014f\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\67\3\2\2"+
		"\2\u0157\u0155\3\2\2\2\u0158\u0159\5.\30\2\u0159\u015a\5@!\2\u015a\u015b"+
		"\5.\30\2\u015b\u015e\3\2\2\2\u015c\u015e\5.\30\2\u015d\u0158\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e9\3\2\2\2\u015f\u0160\t\3\2\2\u0160;\3\2\2\2\u0161"+
		"\u0162\5> \2\u0162=\3\2\2\2\u0163\u0167\b \1\2\u0164\u0167\7\33\2\2\u0165"+
		"\u0167\7\31\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3"+
		"\2\2\2\u0167\u016e\3\2\2\2\u0168\u0169\f\4\2\2\u0169\u016d\7\31\2\2\u016a"+
		"\u016b\f\3\2\2\u016b\u016d\7\33\2\2\u016c\u0168\3\2\2\2\u016c\u016a\3"+
		"\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"?\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\t\4\2\2\u0172A\3\2\2\2&EKOY"+
		"aksz|\u0082\u0088\u009e\u00a3\u00ab\u00b3\u00c0\u00c6\u00d2\u00da\u00e2"+
		"\u00ea\u00f2\u00f5\u0100\u010c\u011b\u0129\u0131\u0138\u013e\u0144\u0155"+
		"\u015d\u0166\u016c\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}