package expr;

import java.util.Map;
import java.util.Set;

public class Equivalence extends TwoVariableExpr {

	public Equivalence(Variable v1, Variable v2) {
		super(v1,v2);
	}
	/*
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);

	}
	*/

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if(map.get(v1) == map.get(v2)){
			return true;
		} else{
			return false;
		}
	}

}
