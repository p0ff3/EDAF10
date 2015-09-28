package expr;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Variable, Boolean> vars = new HashMap<Variable, Boolean>();
		Variable v1 = new Variable("p");
		Variable v2 = new Variable("q");
		
		vars.put(v1, false);
		vars.put(v2, true);
		
		Expr e1 = new Negation(v1);
		Expr e2 = new Disjunction(v1,v1);
		Expr e3 = new Conjunction(e2,e1);
		Expr e4 = new Implication(e3,	v2);
		
		System.out.println(e4.value(vars));
		System.out.println(e4.isTautology());
		System.out.println(e4.toString());

	}

}
