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
}