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
		RULE_function_call = 4, RULE_parameters = 5, RULE_parameter = 6, RULE_statement = 7, 
		RULE_statement_body = 8, RULE_declaration_statement = 9, RULE_assign_statement = 10, 
		RULE_for_statement = 11, RULE_puts_statement = 12, RULE_gets_statement = 13, 
		RULE_if_statement = 14, RULE_while_statement = 15, RULE_do_while_statement = 16, 
		RULE_type = 17, RULE_expression = 18, RULE_aritmetic_operator = 19, RULE_expression_list = 20, 
		RULE_conditional_expression_list = 21, RULE_conditional_expression = 22, 
		RULE_terminator = 23, RULE_conditional_operator = 24;
	public static final String[] ruleNames = {
		"program", "function_declaration", "new_line", "function_body", "function_call", 
		"parameters", "parameter", "statement", "statement_body", "declaration_statement", 
		"assign_statement", "for_statement", "puts_statement", "gets_statement", 
		"if_statement", "while_statement", "do_while_statement", "type", "expression", 
		"aritmetic_operator", "expression_list", "conditional_expression_list", 
		"conditional_expression", "terminator", "conditional_operator"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				{
				setState(50);
				declaration_statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(56);
				function_declaration();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RUBYParser.DEF, 0); }
		public TerminalNode ID() { return getToken(RUBYParser.ID, 0); }
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DEF);
			setState(63);
			match(ID);
			setState(64);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T))) != 0)) {
				{
				setState(65);
				parameters();
				}
			}

			setState(68);
			match(RPAREN);
			setState(69);
			match(T__0);
			setState(70);
			type();
			setState(71);
			new_line();
			setState(72);
			function_body();
			setState(73);
			match(END);
			setState(74);
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
			setState(76);
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
			setState(85);
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
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(78);
						function_call();
						}
						break;
					case 2:
						{
						setState(79);
						statement();
						}
						break;
					}
					}
					setState(82); 
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
			setState(87);
			match(ID);
			setState(88);
			match(LPAREN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << BOOL_T) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(89);
				expression_list();
				}
			}

			setState(92);
			match(RPAREN);
			setState(93);
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
			setState(95);
			parameter();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				parameter();
				}
				}
				setState(102);
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
			setState(103);
			type();
			setState(104);
			match(T__0);
			setState(105);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case FLOAT_T:
			case STRING_T:
			case VOID_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				declaration_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				do_while_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				assign_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				for_statement();
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				puts_statement();
				}
				break;
			case GETS:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
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
		enterRule(_localctx, 16, RULE_statement_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << GETS) | (1L << PUTS) | (1L << INT_T) | (1L << FLOAT_T) | (1L << STRING_T) | (1L << VOID_T) | (1L << ID))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
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
		enterRule(_localctx, 18, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			type();
			setState(124);
			match(T__0);
			setState(125);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(126);
				match(ASSIGN);
				setState(127);
				expression(0);
				}
				break;
			}
			setState(130);
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
		enterRule(_localctx, 20, RULE_assign_statement);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(ASSIGN);
			setState(134);
			expression(0);
			setState(135);
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
		enterRule(_localctx, 22, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FOR);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(138);
				expression(0);
				}
				break;
			case 2:
				{
				setState(139);
				declaration_statement();
				}
				break;
			case 3:
				{
				setState(140);
				assign_statement();
				}
				break;
			}
			setState(143);
			match(SEMICOLON);
			setState(144);
			conditional_expression_list(0);
			setState(145);
			match(SEMICOLON);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(146);
				assign_statement();
				}
			}

			setState(149);
			new_line();
			setState(150);
			statement_body();
			setState(151);
			match(END);
			setState(152);
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
		enterRule(_localctx, 24, RULE_puts_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PUTS);
			setState(155);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ID);
				}
				break;
			case 2:
				{
				setState(157);
				expression(0);
				}
				break;
			}
			setState(160);
			match(RPAREN);
			setState(161);
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
		enterRule(_localctx, 26, RULE_gets_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(GETS);
			setState(164);
			match(LPAREN);
			setState(165);
			match(RPAREN);
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IF);
				setState(169);
				conditional_expression_list(0);
				setState(170);
				new_line();
				setState(171);
				statement_body();
				setState(172);
				match(END);
				setState(173);
				terminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IF);
				setState(176);
				conditional_expression_list(0);
				setState(177);
				new_line();
				setState(178);
				statement_body();
				setState(179);
				match(ELSE);
				setState(180);
				statement_body();
				setState(181);
				match(END);
				setState(182);
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
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			conditional_expression_list(0);
			setState(188);
			new_line();
			setState(189);
			statement_body();
			setState(190);
			match(END);
			setState(191);
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
		public New_lineContext new_line() {
			return getRuleContext(New_lineContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(DO);
			setState(194);
			statement_body();
			setState(195);
			new_line();
			setState(196);
			match(WHILE);
			setState(197);
			conditional_expression_list(0);
			setState(198);
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new EnclouseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(203);
				match(LPAREN);
				setState(204);
				expression(0);
				setState(205);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(STRING);
				}
				break;
			case BOOL_T:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(BOOL_T);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
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
					setState(214);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(215);
					aritmetic_operator();
					setState(216);
					expression(8);
					}
					} 
				}
				setState(222);
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
		enterRule(_localctx, 38, RULE_aritmetic_operator);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(DIV);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(SUB);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
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
		enterRule(_localctx, 40, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			expression(0);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				expression(0);
				}
				}
				setState(236);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_conditional_expression_list, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			conditional_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
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
					setState(240);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(241);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(242);
					conditional_expression();
					}
					} 
				}
				setState(247);
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
		enterRule(_localctx, 44, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			expression(0);
			setState(249);
			conditional_operator();
			setState(250);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(253);
				match(NEW_LINE);
				}
				break;
			case 3:
				{
				setState(254);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(259);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(260);
						match(NEW_LINE);
						}
						break;
					}
					} 
				}
				setState(265);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RUBYVisitor ) return ((RUBYVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 21:
			return conditional_expression_list_sempred((Conditional_expression_listContext)_localctx, predIndex);
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\6\5S\n\5\r\5\16\5T\3\5\5\5X\n\5\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tv\n\t\3\n\7\ny\n\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0083\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0090\n\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00a1\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00d7\n\24\3\24\3\24\3\24\3\24\7\24\u00dd\n\24\f"+
		"\24\16\24\u00e0\13\24\3\25\3\25\3\25\3\25\5\25\u00e6\n\25\3\26\3\26\3"+
		"\26\7\26\u00eb\n\26\f\26\16\26\u00ee\13\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u00f6\n\27\f\27\16\27\u00f9\13\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\5\31\u0102\n\31\3\31\3\31\3\31\3\31\7\31\u0108\n\31\f\31\16\31"+
		"\u010b\13\31\3\32\3\32\3\32\2\5&,\60\33\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\2\5\4\2#%\'\'\3\2\13\f\4\2\4\b\n\n\2\u011a\2"+
		"\67\3\2\2\2\4@\3\2\2\2\6N\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fa\3\2\2\2\16"+
		"i\3\2\2\2\20u\3\2\2\2\22z\3\2\2\2\24}\3\2\2\2\26\u0086\3\2\2\2\30\u008b"+
		"\3\2\2\2\32\u009c\3\2\2\2\34\u00a5\3\2\2\2\36\u00ba\3\2\2\2 \u00bc\3\2"+
		"\2\2\"\u00c3\3\2\2\2$\u00ca\3\2\2\2&\u00d6\3\2\2\2(\u00e5\3\2\2\2*\u00e7"+
		"\3\2\2\2,\u00ef\3\2\2\2.\u00fa\3\2\2\2\60\u0101\3\2\2\2\62\u010c\3\2\2"+
		"\2\64\66\5\24\13\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8=\3\2\2\29\67\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>\3\3\2\2\2?=\3\2\2\2@A\7 \2\2AB\7(\2\2BD\7\21\2\2CE\5\f\7\2DC\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\7\22\2\2GH\7\3\2\2HI\5$\23\2IJ\5\6\4\2JK\5\b"+
		"\5\2KL\7\36\2\2LM\5\60\31\2M\5\3\2\2\2NO\7\31\2\2O\7\3\2\2\2PS\5\n\6\2"+
		"QS\5\20\t\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2"+
		"\2VX\3\2\2\2WR\3\2\2\2WV\3\2\2\2X\t\3\2\2\2YZ\7(\2\2Z\\\7\21\2\2[]\5*"+
		"\26\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\22\2\2_`\5\60\31\2`\13\3\2\2"+
		"\2af\5\16\b\2bc\7\30\2\2ce\5\16\b\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2g\r\3\2\2\2hf\3\2\2\2ij\5$\23\2jk\7\3\2\2kl\7(\2\2l\17\3\2\2\2m"+
		"v\5\24\13\2nv\5\36\20\2ov\5 \21\2pv\5\"\22\2qv\5\26\f\2rv\5\30\r\2sv\5"+
		"\32\16\2tv\5\34\17\2um\3\2\2\2un\3\2\2\2uo\3\2\2\2up\3\2\2\2uq\3\2\2\2"+
		"ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\21\3\2\2\2wy\5\20\t\2xw\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|z\3\2\2\2}~\5$\23\2~\177\7\3\2\2"+
		"\177\u0082\7(\2\2\u0080\u0081\7\t\2\2\u0081\u0083\5&\24\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\60\31\2"+
		"\u0085\25\3\2\2\2\u0086\u0087\7(\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5"+
		"&\24\2\u0089\u008a\5\60\31\2\u008a\27\3\2\2\2\u008b\u008f\7\37\2\2\u008c"+
		"\u0090\5&\24\2\u008d\u0090\5\24\13\2\u008e\u0090\5\26\f\2\u008f\u008c"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\27\2\2\u0092\u0093\5,\27\2\u0093\u0095\7\27\2\2\u0094\u0096\5"+
		"\26\f\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\5\6\4\2\u0098\u0099\5\22\n\2\u0099\u009a\7\36\2\2\u009a\u009b\5"+
		"\60\31\2\u009b\31\3\2\2\2\u009c\u009d\7\"\2\2\u009d\u00a0\7\21\2\2\u009e"+
		"\u00a1\7(\2\2\u009f\u00a1\5&\24\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\5\60\31\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\7\22\2"+
		"\2\u00a8\u00a9\5\60\31\2\u00a9\35\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac"+
		"\5,\27\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7\36\2\2"+
		"\u00af\u00b0\5\60\31\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\7\32\2\2\u00b2"+
		"\u00b3\5,\27\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7"+
		"\33\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\5\60\31"+
		"\2\u00b9\u00bb\3\2\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00b1\3\2\2\2\u00bb\37"+
		"\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00be\5,\27\2\u00be\u00bf\5\6\4\2"+
		"\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5\60\31\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6\5\6\4"+
		"\2\u00c6\u00c7\7\34\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9\5\60\31\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\b\24\1\2\u00cd"+
		"\u00ce\7\21\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7\22\2\2\u00d0\u00d7\3"+
		"\2\2\2\u00d1\u00d7\7(\2\2\u00d2\u00d7\7)\2\2\u00d3\u00d7\7*\2\2\u00d4"+
		"\u00d7\7+\2\2\u00d5\u00d7\7&\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00d1\3\2\2"+
		"\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00de\3\2\2\2\u00d8\u00d9\f\t\2\2\u00d9\u00da\5(\25\2\u00da"+
		"\u00db\5&\24\n\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e6\7\17\2\2\u00e2\u00e6\7\20\2\2\u00e3\u00e6\7\16\2"+
		"\2\u00e4\u00e6\7\r\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00ec\5&\24\2\u00e8"+
		"\u00e9\7\30\2\2\u00e9\u00eb\5&\24\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f0\b\27\1\2\u00f0\u00f1\5.\30\2\u00f1\u00f7\3\2\2\2"+
		"\u00f2\u00f3\f\4\2\2\u00f3\u00f4\t\3\2\2\u00f4\u00f6\5.\30\2\u00f5\u00f2"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"-\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\5\62\32"+
		"\2\u00fc\u00fd\5&\24\2\u00fd/\3\2\2\2\u00fe\u0102\b\31\1\2\u00ff\u0102"+
		"\7\31\2\2\u0100\u0102\7\27\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0109\3\2\2\2\u0103\u0104\f\4\2\2\u0104\u0108"+
		"\7\27\2\2\u0105\u0106\f\3\2\2\u0106\u0108\7\31\2\2\u0107\u0103\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\61\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\t\4\2\2\u010d"+
		"\63\3\2\2\2\31\67=DRTW\\fuz\u0082\u008f\u0095\u00a0\u00ba\u00d6\u00de"+
		"\u00e5\u00ec\u00f7\u0101\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}