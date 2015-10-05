package term;

import java.util.Set;

public interface Term {
    public Set<Variable> collectVariables(Set<Variable> set);

    public Term substitute(Variable x, Term term);
 
    public String toString(); //Behöver inte vara med.

	public boolean contains(Term x);
}
