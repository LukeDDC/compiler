// Generated from RUBY.g4 by ANTLR 4.7.1
package app.antlr;
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
	 * Enter a parse tree produced by {@link RUBYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(RUBYParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(RUBYParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RUBYParser#main_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMain_declaration(RUBYParser.Main_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#main_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMain_declaration(RUBYParser.Main_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link RUBYParser#new_line}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(RUBYParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link RUBYParser#new_line}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(RUBYParser.NewLineContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#additional_parameter}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_parameter(RUBYParser.Additional_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#additional_parameter}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_parameter(RUBYParser.Additional_parameterContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(RUBYParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(RUBYParser.Return_statementContext ctx);
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
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(RUBYParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link RUBYParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(RUBYParser.AssignContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(RUBYParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(RUBYParser.Else_statementContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(RUBYParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(RUBYParser.While_blockContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(RUBYParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(RUBYParser.ConditionalContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RUBYParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RUBYParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RUBYParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(RUBYParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(RUBYParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat(RUBYParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat(RUBYParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AritmeticOperation}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmeticOperation(RUBYParser.AritmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AritmeticOperation}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmeticOperation(RUBYParser.AritmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RUBYParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RUBYParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(RUBYParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(RUBYParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(RUBYParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(RUBYParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Enclouse}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEnclouse(RUBYParser.EnclouseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Enclouse}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEnclouse(RUBYParser.EnclouseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(RUBYParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link RUBYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(RUBYParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterMult(RUBYParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitMult(RUBYParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterDiv(RUBYParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitDiv(RUBYParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterSub(RUBYParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitSub(RUBYParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd(RUBYParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link RUBYParser#aritmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd(RUBYParser.AddContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#additional_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_expression(RUBYParser.Additional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#additional_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_expression(RUBYParser.Additional_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(RUBYParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(RUBYParser.Logical_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link RUBYParser#terminator_token}.
	 * @param ctx the parse tree
	 */
	void enterTerminator_token(RUBYParser.Terminator_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RUBYParser#terminator_token}.
	 * @param ctx the parse tree
	 */
	void exitTerminator_token(RUBYParser.Terminator_tokenContext ctx);
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