package expr;

import java.util.Map;
import java.util.Set;

public class Negation extends Expr {
	private Expr e1;
	public Negation(Expr e1){
		this.e1 = e1;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(new Variable (toString()));
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		return !(map.get(e1));
	}
	
	public String toString(){
		return "SCHWARZENEGGER" + " " + e1.toString();
	}

}
