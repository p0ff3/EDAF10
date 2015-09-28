package expr;

import java.util.Map;
import java.util.Set;

public class Variable extends Expr {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	//Oklart om det är så simpelt?
	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(this);
	}
	// Metoden value(Map<Variable, Boolean> map) skall returnera uttryckets v¨arde under f¨oruts¨attning
	// av att alla ing˚aende variabler finns i map
	//Vad är "värde"?
	@Override
	public boolean value(Map<Variable, Boolean> map) {
		
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Expr && o.hashCode() == hashCode()) {
			return true;
		} else {
			return false;
		}
	}
	

}
