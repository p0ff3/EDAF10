package predicate;

//import java.util.function.Predicate;

import term.Term;
import term.Variable;

public class ForAll implements Expr {
	private Predicate predicate;
	private Variable v0;
	
	public ForAll(Variable v0, Predicate predicate) {
		this.v0 = v0;
		this.predicate = predicate;
	}

	@Override
	public ForAll substitute(Variable y, Term term) {
		return new ForAll(v0.substitute(y, term), predicate.substitute(y, term));
	}
	
	@Override
	public String toString(){
		return "FORALL " + v0.toString() + " . " + predicate.toString();
	}
}
