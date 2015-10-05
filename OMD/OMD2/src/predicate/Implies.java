package predicate;

import term.Term;
import term.Variable;

public class Implies implements Expr {
	private Predicate px, py;
	
	
	public Implies(Predicate px, Predicate py) {
		this.py = py;
		this.px = px;
		
	}

	@Override
	public Implies substitute(Variable variable, Term term) {
		return new Implies(px.substitute(variable, term), py.substitute(variable, term));
	}
	
	@Override
	public String toString(){
		return px.toString() + " -> " + py.toString();
	}

}
