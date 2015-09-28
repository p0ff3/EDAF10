package expr;

import java.util.Map;
import java.util.Set;

public class Negation extends Expr {
		private Variable v1;
	public Negation(Variable v1){
		this.v1 = v1;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);

	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		return !(map.get(v1));
	}

}
