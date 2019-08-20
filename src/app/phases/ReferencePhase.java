package app.phases;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import app.scopes.FunctionRuby;
import app.scopes.GlobalScope;
import app.scopes.RubySymbol;
import app.scopes.Scope;
import app.scopes.VariableRuby;
import app.antlr.*;

/**
 * ReferencePhase
 */
public class ReferencePhase extends RUBYBaseListener {
  ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
  GlobalScope globalScope;
  Scope currentScope;

  public ReferencePhase(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {
    this.scopes = scopes;
    this.globalScope = globalScope;
  }

	@Override public void enterProgram(RUBYParser.ProgramContext ctx) {
    globalScope = new GlobalScope(null);
    currentScope = globalScope;
  }

  @Override
  public void enterFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    currentScope = scopes.get(ctx);
  }

  @Override
  public void exitFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

  @Override
  public void enterFunction_body(RUBYParser.Function_bodyContext ctx) {
    currentScope = scopes.get(ctx);
  }

  @Override
  public void exitFunction_body(RUBYParser.Function_bodyContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

	@Override
  public void enterStatement_body(RUBYParser.Statement_bodyContext ctx) {
    currentScope = scopes.get(ctx);
  }

  @Override
  public void exitStatement_body(RUBYParser.Statement_bodyContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

  @Override
  public void exitVariable(RUBYParser.VariableContext ctx) {
    String name = ctx.ID().getSymbol().getText();
    RubySymbol var = currentScope.resolve(name);

    if (var == null) {
      error(ctx.ID().getSymbol(), name + " no such variable:");
    }
    if (var instanceof FunctionRuby){
      error(ctx.ID().getSymbol(), name + " is not a variable");
    }
  }

  @Override public void exitAssign(RUBYParser.AssignContext ctx) {
    String name = ctx.ID().getSymbol().getText();
    RubySymbol var = currentScope.resolve(name);

    if (var == null) {
      error(ctx.ID().getSymbol(), name + " no such variable:");
    }
    if (var instanceof FunctionRuby){
      error(ctx.ID().getSymbol(), name + " is not a variable");
    }
  }

  @Override
  public void exitFunctionCall(RUBYParser.FunctionCallContext ctx) {
    String functionName = ctx.ID().getText();
    RubySymbol meth = currentScope.resolve(functionName);

    if (meth == null) {
      error(ctx.ID().getSymbol(), functionName + " no such function:");
    }
    if (meth instanceof VariableRuby){
      error(ctx.ID().getSymbol(), functionName + " is not a function");
    }
  }

  public static void error(Token t, String msg) {
    System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
  }
}
