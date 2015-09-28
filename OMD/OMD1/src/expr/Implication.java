package expr;

import java.util.Map;

public class Implication extends TwoVariableExpr {

	public Implication(Expr e1, Expr e2) {
		super(e1, e2);
	}

	/*
	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);

	}
	*/

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (map.get(e1) && !map.get(e2)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String op(){
		return "TYRION LANNISTER";
	}

}
