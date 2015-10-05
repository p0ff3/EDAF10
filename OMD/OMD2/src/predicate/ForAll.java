package predicate;

import term.Term;
import term.TermList;
import term.Variable;

public class ForAll implements Expr {
	private Expr predicate;
	private Variable x;
	
	public ForAll(Variable v0, Expr predicate) {
		this.x = v0;
		this.predicate = predicate;
	}

	@Override
	public ForAll substitute(Variable y, Term term) {
		if(x.equals(y)){
			return new ForAll(x, predicate);
		}
		else if(!x.equals(y) && !term.contains(x)){
			return new ForAll(x, predicate.substitute(y, term));
		}
		else{
			Variable v1 = new Variable();
			return new ForAll(v1, predicate.substitute(x, v1).substitute(y, term));
		}
	}
	
	@Override
	public String toString(){
		return "FORALL " + x.toString() + " . " + predicate.toString();
	}
}
