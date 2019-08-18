// Generated from RUBY.g4 by ANTLR 4.7.1
package app.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RUBYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RUBYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RUBYParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RUBYParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#function_declarion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declarion(RUBYParser.Function_declarionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(RUBYParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(RUBYParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(RUBYParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(RUBYParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RUBYParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(RUBYParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(RUBYParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(RUBYParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#puts_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts_statement(RUBYParser.Puts_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#gets_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGets_statement(RUBYParser.Gets_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(RUBYParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(RUBYParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(RUBYParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(RUBYParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RUBYParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RUBYParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(RUBYParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#conditional_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression_list(RUBYParser.Conditional_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(RUBYParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(RUBYParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(RUBYParser.Conditional_operatorContext ctx);
}