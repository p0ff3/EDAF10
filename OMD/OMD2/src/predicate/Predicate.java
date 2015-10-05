package predicate;

import term.Term;
import term.TermList;
import term.Variable;

public class Predicate implements Expr {
	private String name;
	private TermList list;

	public Predicate(String string, TermList termList) {
		name = string;
		list = termList;
	}

	@Override
	public Predicate substitute(Variable variable, Term term) {
		return new Predicate(name, list.substitute(variable, term));
	}
	
	@Override
	public String toString(){
		return name + list.toString();
	}
	
	public boolean contains(Term t){
		return list.contains(t);
	}

}
