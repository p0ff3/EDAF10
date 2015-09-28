package expr;

import java.util.Map;

public class Conjunction extends TwoVariableExpr {

	public Conjunction(Variable v1, Variable v2) {
		super(v1,v2);
	}

	/*@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);
		// TODO Auto-generated method stub

	}*/

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (map.get(v1) || map.get(v2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String op(){
		return "OR";
	}

}