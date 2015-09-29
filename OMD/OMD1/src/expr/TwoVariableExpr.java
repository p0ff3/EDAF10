package expr;

import java.util.Set;

public abstract class TwoVariableExpr extends Expr {
	protected Expr e1,e2;
	
	public TwoVariableExpr(Expr e1, Expr e2){
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		e1.collectVariables(set);
		e2.collectVariables(set);
	}
	
	public String toString(){
		return "(" + e1.toString() + " " + op()+ " " + e2.toString() + ")";
	}
	
	public abstract String op();
}
