package expr;

import java.util.Set;

abstract class TwoVariableExpr extends Expr {
	protected Expr e1,e2;
	
	protected TwoVariableExpr(Expr v1, Expr v2){
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(new Variable(toString()));
	}
	
	public String toString(){
		return e1.toString() + " " + op()+ " " +e2.toString() + " ";
	}
	
	public abstract String op();
}
