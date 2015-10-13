package expr;

public class Implies extends TwoVariableExpr {

	public Implies(Expr e1, Expr e2) {
		super(e1, e2);
	}

	@Override
	public boolean opValue(Boolean b1, Boolean b2) {
		return !(b1 && !b2);
	}
	
	@Override
	public String op(){
		return "IMPLIES";
	}

}