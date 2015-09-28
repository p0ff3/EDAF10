package expr;

import java.util.Map;

public class Disjunction extends TwoVariableExpr {

	public Disjunction(Expr e1, Expr e2) {
		super(e1,e2);
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
		if (map.get(e1) && !map.get(e2) || !map.get(e1) && map.get(e2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String op(){
		return "XOR";
	}

}
