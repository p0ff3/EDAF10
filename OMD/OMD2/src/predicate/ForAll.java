package predicate;

import term.Term;
import term.TermList;
import term.Variable;

public class ForAll implements Expr {
	private Predicate predicate;
	private Variable x;
	
	public ForAll(Variable v0, Predicate predicate) {
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
			// (FORALL x . Q(x,y)[y\f(x)] = FORALL v0 . Q(v0, f(x))
			
			Variable v0 = new Variable();
			Predicate p1 = new Predicate(predicate.toString(), new TermList(v0));
			return new ForAll(v0, predicate.substitute(y, p1));
		}
		

	}
	
	@Override
	public String toString(){
		return "FORALL " + x.toString() + " . " + predicate.toString();
	}
}
