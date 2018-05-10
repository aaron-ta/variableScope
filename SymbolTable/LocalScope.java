package SymbolTable;

public class LocalScope extends BaseScope {
	//public Scope scope = new Scope();
	
	public LocalScope(BaseScope scopeP) {
		//scope = scopeP;
		initTypeSystem(); 
	}
	
	public Scope getEnclosingScope() { 
		return this; 
	}
	
}
