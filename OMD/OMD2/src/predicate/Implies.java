package predicate;

import java.util.function.Predicate;

import term.Term;
import term.Variable;

public class Implies implements Expr {

	public Implies(Predicate px, Predicate py) {
		// TODO Auto-generated constructor stub
	}

	public Implies(predicate.Predicate px, predicate.Predicate py) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Expr substitute(Variable variable, Term term) {
		// TODO Auto-generated method stub
		return null;
	}

}
