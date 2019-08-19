package app.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import app.scopes.FunctionRuby;
import app.scopes.GlobalScope;
import app.scopes.LocalScope;
import app.scopes.RubySymbol;
import app.scopes.Scope;
import app.scopes.VariableRuby;

/**
 * DefinitionPhase
 */
public class DefinitionPhase extends RUBYBaseListener{
  ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
  GlobalScope globalScope;
  Scope currentScope;

	@Override public void enterProgram(RUBYParser.ProgramContext ctx) {
    globalScope = new GlobalScope(null);
    currentScope = globalScope;
  }

  @Override public void exitProgram(RUBYParser.ProgramContext ctx) {
    System.out.println(currentScope);
  }

  @Override
  public void enterFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    String functionName = ctx.ID().getText();
    int functionType = ctx.type().start.getType();
    RubySymbol.Type type = RubySymbol.getType(functionType);

    FunctionRuby functionScope = new FunctionRuby(functionName, type, currentScope);
    currentScope.define(functionScope);
    saveScope(ctx, functionScope);
    currentScope = functionScope;
  }

	@Override public void exitFunction_declaration(RUBYParser.Function_declarationContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

  @Override
  public void enterFunction_body(RUBYParser.Function_bodyContext ctx) {
    currentScope = new LocalScope(currentScope);
    saveScope(ctx, currentScope);
  }

  @Override
  public void exitFunction_body(RUBYParser.Function_bodyContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

	@Override
  public void enterStatement_body(RUBYParser.Statement_bodyContext ctx) {
    currentScope = new LocalScope(currentScope);
    saveScope(ctx, currentScope);
  }

  @Override
  public void exitStatement_body(RUBYParser.Statement_bodyContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope();
  }

  private void saveScope(ParserRuleContext ctx, Scope scope) {
    scopes.put(ctx, scope);
  }

  @Override
  public void exitParameter(RUBYParser.ParameterContext ctx) {
    defineVar(ctx.type(), ctx.ID().getSymbol());
  }

	@Override public void exitDeclaration_statement(RUBYParser.Declaration_statementContext ctx) {
    defineVar(ctx.type(), ctx.ID().getSymbol());
  }

  private void defineVar(RUBYParser.TypeContext typeCtx, Token name) {
    int typeTokenType = typeCtx.start.getType();
    RubySymbol.Type type = RubySymbol.getType(typeTokenType);
    VariableRuby var = new VariableRuby(name.getText(), type);
    currentScope.define(var);
  }
}