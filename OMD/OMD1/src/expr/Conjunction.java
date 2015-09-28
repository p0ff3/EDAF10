package expr;

import java.util.Map;

public class Conjunction extends TwoVariableExpr {

	public Conjunction(Expr e1, Expr e2) {
		super(e1,e2);
	}

	/*@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);
		// TODO Auto-generated method stub

	}*/

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (map.get(e1) || map.get(e1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String op(){
		return "OR";
	}

}
