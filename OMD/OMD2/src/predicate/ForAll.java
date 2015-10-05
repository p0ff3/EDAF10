package predicate;

//import java.util.function.Predicate;

import term.Term;
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
		//return new ForAll(v0.substitute(y, term), predicate.substitute(y, term));
		if(x.equals(y)){
			return new ForAll(x, predicate);
		}
		else if(!x.equals(y) && !term.contains(x)){
			//System.out.println("Stuff");
			return new ForAll(x, predicate.substitute(y, term));
		}
		else{
			System.out.println("stuff");
			return new ForAll(x, predicate);
		}
	}
	
	@Override
	public String toString(){
		return "FORALL " + x.toString() + " . " + predicate.toString();
	}
}
