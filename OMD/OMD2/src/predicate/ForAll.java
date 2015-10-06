package predicate;

import term.Term;
import term.TermList;
import term.Variable;

public class ForAll implements Expr {
	private Expr expr;
	private Variable x;
	
	public ForAll(Variable v0, Expr predicate) {
		this.x = v0;
		this.expr = predicate;
	}

	@Override
	public ForAll substitute(Variable y, Term term) {
		if(x.equals(y)){
			return this;
		}
		else if(!term.contains(x)){
			return new ForAll(x, expr.substitute(y, term));
		}
		else{
			Variable v1 = new Variable();
			return new ForAll(v1, expr.substitute(x, v1).substitute(y, term));
		}
	}
	
	@Override
	public String toString(){
		return "FORALL " + x.toString() + " . " + expr.toString();
	}
}
