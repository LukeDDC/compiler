package app.Writers;

import java.io.FileWriter;
import java.io.PrintWriter;

import app.antlr.RUBYParser;
import app.antlr.RUBYParser.Additional_parameterContext;
import app.antlr.RUBYParser.AritmeticOperationContext;
import app.antlr.RUBYParser.ConditionalContext;
import app.antlr.RUBYParser.Conditional_expression_listContext;
import app.antlr.RUBYParser.Conditional_operatorContext;
import app.antlr.RUBYParser.Declaration_statementContext;
import app.antlr.RUBYParser.Do_while_statementContext;
import app.antlr.RUBYParser.Else_statementContext;
import app.antlr.RUBYParser.EnclouseContext;
import app.antlr.RUBYParser.Main_declarationContext;
import app.antlr.RUBYParser.ParameterContext;
import app.antlr.RUBYParser.Return_statementContext;
import app.antlr.RUBYParser.Statement_bodyContext;
import app.antlr.RUBYParser.TerminatorContext;
import app.antlr.RUBYParser.While_blockContext;

/**
 * JavaWriter
 */
public class JavaWriter {
  private PrintWriter printWriter;
  private FileWriter fileWriter;

  public JavaWriter(String fileName) {
    try {
      fileWriter = new FileWriter(fileName);
      printWriter = new PrintWriter(fileWriter);

    } catch (Exception e) {
      System.err.println("ERRO AO ABRIR ARQUIVO");
    }
  }

  public void enterProgram() {
    printWriter.println("public class Program {");
  }

  public void exitProgram() {
    printWriter.println("}");
    printWriter.close();
  }

  public void enterFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    String functionName = ctx.ID().getText();
    printWriter.print("\tpublic static " + translateToJavaType(ctx.type().getText()) + " " + functionName + " ");
  }

  public void enterParameter(ParameterContext ctx) {
    String parameterType = ctx.type().getText();
    String javaType = translateToJavaType(parameterType);
    String parameterName = ctx.ID().getText();

    printWriter.print(javaType + " " + parameterName);
  }

  public void exitFunction_declaration() {
    printWriter.println("\t}");
  }

  private void enterMain() {
    printWriter.println("\tpublic void main(String[] args) {");
  }

  public void enterParameters() {
    printWriter.print("(");
  }

  public void exitParameters() {
    printWriter.print(")");
  }

  private String translateToJavaType(String rubyType) {
    switch (rubyType) {
    case "Void":
      return "void";
    case "String":
      return "String";
    case "Integer":
      return "int";
    case "Float":
      return "float";
    default:
      return "";
    }
  }

  public void enterFunction_body() {
    printWriter.println(" {");
  }

  public void enterDeclaration_statement(Declaration_statementContext ctx) {

    String variableType = ctx.type().getText();
    String javaType = translateToJavaType(variableType);
    String variableName = ctx.ID().getText();
    if (ctx.parent.parent == null) {
      printWriter.print("static " + javaType + " " + variableName);
    } else {
      printWriter.print(javaType + " " + variableName);
    }
    if (ctx.ASSIGN() != null) {
      printWriter.print(" = ");
    }
  }

  public void enterPrimitiveType(RUBYParser.ExpressionContext ctx) {
    printWriter.print(ctx.getText() + " ");
  }

  public void enterAritmeticOperation(AritmeticOperationContext ctx) {
    printWriter.print(" " + ctx.getText() + " ");
  }

  public void enterAritmeticOperator(RUBYParser.Aritmetic_operatorContext ctx) {
    printWriter.print(" " + ctx.getText() + " ");
  }

  public void enterEnclouse(EnclouseContext ctx) {
    printWriter.print("( ");
  }

  public void exitEnclouse(EnclouseContext ctx) {
    printWriter.print(")");
  }

  public void enterIf_statement(RUBYParser.If_statementContext ctx) {
    printWriter.print("\tif ");
  }

  public void enterLogical_operator(RUBYParser.Logical_operatorContext ctx) {
    printWriter.print(" " + ctx.getText() + " ");
  }

  public void enterConditional_operator(Conditional_operatorContext ctx) {
    printWriter.print(" " + ctx.getText() + " ");
  }

  public void enterConditional_expression_list(Conditional_expression_listContext ctx) {
  }

  public void exitConditional_expression_list(Conditional_expression_listContext ctx) {
  }

  public void enterConditional(ConditionalContext ctx) {
    printWriter.print("(");
  }

  public void exitConditional(ConditionalContext ctx) {
    printWriter.print(")");
  }

  public void enterStatement_body(Statement_bodyContext ctx) {
    printWriter.print("{\n");
  }

  public void exitStatement_body(Statement_bodyContext ctx) {
    printWriter.print("\n\t}\n");
  }

  public void enterElse_statement(Else_statementContext ctx) {
    printWriter.print("\telse");
  }

  public void enterDo_while_statement(Do_while_statementContext ctx) {
    printWriter.print("\tdo ");
  }

  public void enterWhile_block(While_blockContext ctx) {
    printWriter.print("\twhile ");
  }

  public void enterAdditional_parameter(Additional_parameterContext ctx) {
    printWriter.print(", ");
  }

  public void exitTerminator(TerminatorContext ctx) {
    printWriter.print(" ;");
  }

  public void enterMain_declaration(Main_declarationContext ctx) {
    enterMain();
  }

  public void exitMain_declaration(Main_declarationContext ctx) {
    printWriter.print("\t}\n");
  }

  public void enterReturn_statement(Return_statementContext ctx) {
    printWriter.print("return ");
  }

  public void exitReturn_statement(Return_statementContext ctx) {
    printWriter.print(";");
  }
}
