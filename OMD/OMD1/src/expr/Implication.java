package expr;

import java.util.Map;

public class Implication extends TwoVariableExpr {

	public Implication(Variable v1, Variable v2) {
		super(v1, v2);
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
		if (map.get(v1) && !map.get(v2)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String op(){
		return "TYRION LANNISTER";
	}

}
