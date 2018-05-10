package SymbolTable;

import java.util.HashMap;
import java.util.Map;
import SymbolTable.Scope;

public class BaseScope implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    public BaseScope() { initTypeSystem(); }
    
    protected void initTypeSystem() {
        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("float"));
    }
    
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return null; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
   
    public Symbol resolve(String name) { return symbols.get(name); }
    public String toString() { return getScopeName()+":"+symbols; }
}
