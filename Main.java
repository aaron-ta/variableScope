import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import PseudoLexer.PseudoLexer;
import PseudoParser.PseudoParser;
import SymbolTable.BaseScope;
import SymbolTable.GlobalScope;
import SymbolTable.MethodSymbol;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.Type;
import SymbolTable.VariableSymbol;	

public class Main {
	//private static final String FILENAME = "texto.txt";
	static Type flotante;
	//Symbol symbol;
	static Type entero;
	
	public static void main(String[] args) throws IOException {

		Scope currentScope;
		
		currentScope = new GlobalScope();
		
		Symbol x = currentScope.resolve("entero");
		currentScope.define(new Symbol("i",entero));
		currentScope.define(new Symbol("y",flotante));
		
		MethodSymbol aux = new MethodSymbol("f",currentScope);
		
		currentScope.define(aux);
		currentScope = aux;
		currentScope = currentScope.getEnclosingScope();		
		
		//MAIN VIEJO // COMPILADOR
		//String content = new Scanner(new File("..\\CompiladorA\\src\\texto.txt")).useDelimiter("\\Z").next();

		//PseudoLexer pseuLexer = new PseudoLexer(content);
		//PseudoParser parser = new PseudoParser(pseuLexer); // create parser
		//--------
	}

}
