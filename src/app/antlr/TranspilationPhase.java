package app.antlr;

import java.util.List;

import app.Writers.JavaWriter;
import app.antlr.RUBYParser.ParameterContext;

/**
 * TranspilationPhase
 *
 *
 */
public class TranspilationPhase extends RUBYBaseListener {
  public JavaWriter writer;

  @Override public void enterProgram(RUBYParser.ProgramContext ctx) {
    writer = new JavaWriter("Program.java");
    writer.enterProgram();
  }

  @Override public void enterFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    writer.enterFunction_declaration(ctx);
  }

  @Override public void exitFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    writer.exitFunction_declaration();
  }

  @Override public void enterParameters(RUBYParser.ParametersContext ctx) {
    writer.enterParameters();
  }

  @Override public void enterParameter(RUBYParser.ParameterContext ctx) {
    writer.enterParameter(ctx);
  }

  @Override public void exitParameters(RUBYParser.ParametersContext ctx) {
    writer.exitParameter();
  }

	@Override public void enterFunction_body(RUBYParser.Function_bodyContext ctx) {
    writer.enterFunction_body();
  }

  @Override public void exitProgram(RUBYParser.ProgramContext ctx) {
    writer.exitProgram();
  }

  @Override public void enterDeclaration_statement(RUBYParser.Declaration_statementContext ctx) {
    writer.enterDeclaration_statement(ctx);
  }

  @Override public void enterVariable(RUBYParser.VariableContext ctx) {
    writer.enterPrimitiveType(ctx);
  }

  @Override public void enterInt(RUBYParser.IntContext ctx) {
    writer.enterPrimitiveType(ctx);
  }

  @Override public void enterFloat(RUBYParser.FloatContext ctx) {
    writer.enterPrimitiveType(ctx);
  }

  @Override public void enterBool(RUBYParser.BoolContext ctx) {
    writer.enterPrimitiveType(ctx);
  }

  @Override public void enterString(RUBYParser.StringContext ctx) {
    writer.enterPrimitiveType(ctx);
  }

  @Override public void enterMult(RUBYParser.MultContext ctx) {
    writer.enterAritmeticOperator(ctx);
  }

  @Override public void enterDiv(RUBYParser.DivContext ctx) {
    writer.enterAritmeticOperator(ctx);
  }

  @Override public void enterSub(RUBYParser.SubContext ctx) {
    writer.enterAritmeticOperator(ctx);
  }

  @Override public void enterAdd(RUBYParser.AddContext ctx) {
    writer.enterAritmeticOperator(ctx);
  }

  @Override public void enterEnclouse(RUBYParser.EnclouseContext ctx) {
    writer.enterEnclouse(ctx);
   }

  @Override public void exitEnclouse(RUBYParser.EnclouseContext ctx) {
    writer.exitEnclouse(ctx);
  }

  @Override
  public void enterIf_statement(RUBYParser.If_statementContext ctx) {
    writer.enterIf_statement(ctx);
  }

  @Override
  public void enterLogical_operator(RUBYParser.Logical_operatorContext ctx) {
    writer.enterLogical_operator(ctx);
  }

  @Override
  public void enterConditional_operator(RUBYParser.Conditional_operatorContext ctx) {
    writer.enterConditional_operator(ctx);
  }

  @Override
  public void enterConditional_expression_list(RUBYParser.Conditional_expression_listContext ctx) {
    writer.enterConditional_expression_list(ctx);
  }

  @Override
  public void exitConditional_expression_list(RUBYParser.Conditional_expression_listContext ctx) {
    writer.exitConditional_expression_list(ctx);
  }

	@Override
  public void enterConditional(RUBYParser.ConditionalContext ctx) {
    writer.enterConditional(ctx);
  }

	@Override
  public void exitConditional(RUBYParser.ConditionalContext ctx) {
    writer.exitConditional(ctx);
  }

  @Override
  public void enterStatement_body(RUBYParser.Statement_bodyContext ctx) {
    writer.enterStatement_body(ctx);
  }

  @Override
  public void exitStatement_body(RUBYParser.Statement_bodyContext ctx) {
    writer.exitStatement_body(ctx);
  }

  @Override
  public void enterElse_statement(RUBYParser.Else_statementContext ctx) {
    writer.enterElse_statement(ctx);
  }

	@Override
  public void enterDo_while_statement(RUBYParser.Do_while_statementContext ctx) {
    writer.enterDo_while_statement(ctx);
  }

  @Override
  public void enterWhile_block(RUBYParser.While_blockContext ctx) {
    writer.enterWhile_block(ctx);
  }

}
