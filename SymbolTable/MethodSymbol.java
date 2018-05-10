package SymbolTable;

import java.util.HashMap;
import java.util.Map;
import SymbolTable.Type;

public class MethodSymbol extends Symbol implements Scope {
    Map<String, Symbol> symbols = new HashMap<String, Symbol>();
    public static Type method;
    //public BaseScope scope = new BaseScope();
    
    public MethodSymbol(String name,Scope currentScope) {
    	super(name,method);
    	//scope = scopeP;
    	initTypeSystem();
    }
    
    protected void initTypeSystem() {
        define(new BuiltInTypeSymbol("entero"));
        define(new BuiltInTypeSymbol("flotante"));
    }
    
    // Satisfy Scope interface
    public String getScopeName() { return "method"; }
    public Scope getEnclosingScope() { return this; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
    public Symbol resolve(String name) { return symbols.get(name); }
    public String toString() { return getScopeName()+":"+symbols; }
}