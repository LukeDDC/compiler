package app.scopes;

/**
 * LocalScope
 */
public class LocalScope extends BaseScope {
  public LocalScope(Scope parent) { super(parent); }
  public String getScopeName() {
    return "LocalScope";
  }
}