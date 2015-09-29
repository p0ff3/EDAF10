package expr;

import java.util.Map;

public class Implication extends TwoVariableExpr {

	public Implication(Expr e1, Expr e2) {
		super(e1, e2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (e1.value(map) && !e2.value(map)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String op(){
		return "IMPLIES";
	}

}
