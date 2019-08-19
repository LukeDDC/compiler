package app.Writers;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import app.antlr.RUBYParser;
import app.antlr.RUBYParser.Declaration_statementContext;
import app.antlr.RUBYParser.ParameterContext;
import app.antlr.RUBYParser.ParametersContext;

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
    if (functionName.equals("main")) {
      enterMain();
    } else {
      printWriter.print("\tpublic " + functionName + " ");
    }
  }

  public void enterParameter(ParameterContext ctx) {
    String parameterType = ctx.type().getText();
    String javaType = translateToJavaType(parameterType);
    String parameterName = ctx.ID().getText();

    printWriter.print(javaType + " " + parameterName + ", ");
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

  public void exitParameter() {
    printWriter.print(")");
  }

  public void enterFunction_body() {
    printWriter.println(" {");
  }

  public void enterDeclaration_statement(Declaration_statementContext ctx) {
    String variableType = ctx.type().getText();
    String javaType = translateToJavaType(variableType);
    String variableName = ctx.ID().getText();
    printWriter.print(javaType + " " + variableName);
    if(ctx.ASSIGN() != null) {
      printWriter.print(" =");
    }
  }
}