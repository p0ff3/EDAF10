package expr;

import java.util.Map;
import java.util.Set;

public class Disjunction extends TwoVariableExpr {

	public Disjunction(Variable v1, Variable v2) {
		super(v1,v2);
	}

	/*
	 * @Override(non-Javadoc)
	 * @see expr.TwoVariableExpr#collectVariables(java.util.Set)
	
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);

	}
	 */

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (map.get(v1) && !map.get(v2) || !map.get(v1) && map.get(v2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String op(){
		return "XOR";
	}

}
