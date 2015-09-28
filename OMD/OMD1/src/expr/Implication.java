package expr;

import java.util.Map;
import java.util.Set;

public class Implication extends TwoVariableExpr {
	private Variable v1, v2;

	public Implication(Variable v1, Variable v2) {
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
		if (map.get(v1) && !map.get(v2)) {
			return false;
		} else {
			return true;
		}
	}

}
