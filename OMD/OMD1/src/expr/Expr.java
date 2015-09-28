package expr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Expr {
    protected abstract void collectVariables(Set<Variable> set);

    public boolean isTautology() {
        List<Variable> list = new ArrayList<Variable>(variables());
        return testAll(list, new HashMap<Variable, Boolean>());
    }

    private boolean testAll(List<Variable> list, Map<Variable, Boolean> map) {
		return false;
    // omissions
    }

    public abstract boolean value(Map<Variable, Boolean> map);

    public Set<Variable> variables() {
        Set<Variable> set = new HashSet<Variable>();
        collectVariables(set);
        return set;
    }
}