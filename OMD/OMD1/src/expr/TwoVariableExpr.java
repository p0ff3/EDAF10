package expr;

import java.util.Set;

abstract class TwoVariableExpr extends Expr {
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
	
	public String toString(){
		return v1.toString() + " " + op()+ " " +v2.toString() + " ";
	}
	
	public abstract String op();
}
