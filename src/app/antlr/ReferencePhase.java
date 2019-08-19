package app.antlr;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import app.scopes.FunctionRuby;
import app.scopes.RubySymbol;
import app.scopes.GlobalScope;
import app.scopes.Scope;

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

	@Override public void exitVariable(RUBYParser.VariableContext ctx) {
    String name = ctx.ID().getSymbol().getText();
    RubySymbol var = currentScope.resolve(name);
    if ( var==null ) {
      // CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: "+name);
    }
    if ( var instanceof FunctionRuby) {
        // CheckSymbols.error(ctx.ID().getSymbol(), name+" is not a variable");
    }
  }
}