package app.antlr;

// Generated from RUBY.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RUBYParser}.
 */
public interface RUBYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RUBYParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RUBYParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RUBYParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#function_declarion}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declarion(RUBYParser.Function_declarionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#function_declarion}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declarion(RUBYParser.Function_declarionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(RUBYParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(RUBYParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(RUBYParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(RUBYParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(RUBYParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(RUBYParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(RUBYParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(RUBYParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RUBYParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RUBYParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(RUBYParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(RUBYParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(RUBYParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(RUBYParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(RUBYParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(RUBYParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(RUBYParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(RUBYParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(RUBYParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(RUBYParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(RUBYParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(RUBYParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(RUBYParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(RUBYParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RUBYParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RUBYParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RUBYParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RUBYParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(RUBYParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(RUBYParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#conditional_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression_list(RUBYParser.Conditional_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#conditional_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression_list(RUBYParser.Conditional_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(RUBYParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(RUBYParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(RUBYParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(RUBYParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(RUBYParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(RUBYParser.Conditional_operatorContext ctx);
}