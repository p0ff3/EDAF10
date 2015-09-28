package expr;

import java.util.Map;

public class Equivalence extends TwoVariableExpr {

	public Equivalence(Expr e1, Expr e2) {
		super(e1,e1);
	}
	
	/*
	protected void collectVariables(Set<Variable> set) {
		set.add(v1);
		set.add(v2);

	}
	*/

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if(map.get(e1) == map.get(e2)){
			return true;
		} else{
			return false;
		}
	}
	
	public String op(){
		return "EQ";
	}

}
