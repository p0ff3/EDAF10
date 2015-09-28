package expr;

import java.util.Map;
import java.util.Set;

public class TwoVariableExpr extends Expr {
	protected Variable v1, v2;
	
	protected TwoVariableExpr(Variable v1, Variable v2){
		this.v1 = v1;
		this.v2 = v2;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);

	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return false;
	}

}
