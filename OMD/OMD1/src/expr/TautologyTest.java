package expr;

import java.util.HashMap;

public class TautologyTest {

	public static void main(String[] args) {
		HashMap<Variable, Boolean> vars = new HashMap<Variable, Boolean>();
		
		Variable p = new Variable("p");
		vars.put(p, true);
		
		Negation n1 = new Negation(p);
		
		//Variable pOrP = new Conjunction(p,p);
		
		//boolean fak = pOrP.value(vars);
		
		
	}

}
