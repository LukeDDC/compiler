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
	 * Visit a parse tree produced by {@link RUBYParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(RUBYParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(RUBYParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RUBYParser.FunctionCallContext ctx);
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
	 * Visit a parse tree produced by {@link RUBYParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(RUBYParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RUBYParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(RUBYParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(RUBYParser.AssignContext ctx);
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
	 * Visit a parse tree produced by {@link RUBYParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RUBYParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(RUBYParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AritmeticOperation}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmeticOperation(RUBYParser.AritmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RUBYParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(RUBYParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(RUBYParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Enclouse}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnclouse(RUBYParser.EnclouseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(RUBYParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(RUBYParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(RUBYParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(RUBYParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(RUBYParser.AddContext ctx);
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