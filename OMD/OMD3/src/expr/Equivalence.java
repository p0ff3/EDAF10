package expr;

public class Equivalence extends TwoVariableExpr {

	public Equivalence(Expr e1, Expr e2) {
		super(e1,e1);
	}

	@Override
	public boolean opValue(Boolean b1, Boolean b2) {
		return (b1 == b2);
	}
	
	@Override
	public String op(){
		return "EQ";
	}

}
