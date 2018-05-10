package SymbolTable;

public class GlobalScope extends BaseScope{
	public BaseScope scope = new BaseScope();

	public GlobalScope() {
		//scope = scopeP;
		initTypeSystem(); 
	}

}
