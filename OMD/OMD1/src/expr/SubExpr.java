package expr;

import java.util.Map;
import java.util.Set;

public abstract class SubExpr extends Expr {

	@Override
	protected void collectVariables(Set<Variable> set) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return false;
	}

}
