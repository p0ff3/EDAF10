package expr;

public class Implication extends TwoVariableExpr {

	public Implication(Expr e1, Expr e2) {
		super(e1, e2);
	}

	@Override
	public boolean opValue(Boolean b1, Boolean b2) {
		return !(b1 && !b2);
	}
	
	public String op(){
		return "TYRION LANNISTER";
	}

}
