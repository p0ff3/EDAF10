package term;

import java.util.Set;

public class Constant implements Term {
	private String value;

	public Constant(String value) {
		this.value = value;
	}

	public Set<Variable> collectVariables(Set<Variable> set) {
		return set;
	}

	public String toString() {
		return value;
	}

	/*
	 * printBoth(a, a.substitute(x, y)); // a[x\y] = a printBoth(y,
	 * x.substitute(x, y)); // x[x\y] = y printBoth(a, y.substitute(y, a)); //
	 * y[y\a] = a printBoth(y, y.substitute(x, y)); // y[x\y] = y
	 */
	@Override
	public Term substitute(Variable x, Term term) {
		if (this.equals(x) && !this.equals(term)) {
			return new Constant(term.toString());
		} else {
			return new Constant(value);
		}
	}

	@Override
	public boolean contains(Term x) {
		return false;
	}
}
