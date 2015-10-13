package parser;

import java.io.Reader;
import java.io.StringReader;
import expr.*;

public class Parser {
	private Scanner scanner;
	private int token;

	public Expr build(Reader reader) {
		scanner = new Scanner(reader);
		token = scanner.nextToken();
		Expr expr = expr();
		if (token == Scanner.EOF) {
			return expr;
		} else {
			throw new ParserException("Trailing garbage after " + scanner.token());
		}
	}

	public Expr build(String input) {
		return build(new StringReader(input));
	}

	
	private Expr expr() {
		Expr result, primary;
		result = primary();
		if(token == Scanner.IMPLIES){
			token = scanner.nextToken();
			primary = primary();
			return new Implies(result, primary);
			
		}
		return result;
	}

	private Expr primary() {
		Expr result, term;
		result = term();
		while(token =='|'){
			token = scanner.nextToken();
			term = term();
			result = new Or(result, term);
		}
		return result;
	}
	
	private Expr term() {
		Expr result, factor;
		result = factor();
		
		while(token == '&'){
			token = scanner.nextToken();
			factor = factor();
			result = new And(result, factor);
		}
		return result;
	}


	private Expr factor() {
		Expr e;
		switch (token) {
		case -2:
			e = new Variable(scanner.token());
			token = scanner.nextToken();
			return e;
		case '!':
			token = scanner.nextToken();
			return new Not(factor());
		case '(':
			token = scanner.nextToken();
			e = expr();
			if (token == ')') {
				token = scanner.nextToken();
			} else {
				throw new ParserException("Expecting \")\", found: EOF");
			}
			return e;

		default:
			throw new ParserException("Unexpected " + scanner.token());
		}
	}
}