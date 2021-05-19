package parser.table;

import java.util.HashSet;
import java.util.Set;

public class FunctionTable {
    private Set<String> functionNames = new HashSet<>();
    private Set<String> pendingNameChecks = new HashSet<>();

    public void addFunctionName(String identifier) {
        functionNames.add(identifier);
        if (pendingNameChecks.contains(identifier)) {
            pendingNameChecks.remove(identifier);
        }
    }

    public boolean checkFunctionName(String identifier) {
        if (!functionNames.contains(identifier)) {
            pendingNameChecks.add(identifier);
            return false;
        }

        return true;
    }

    public boolean hasUnresolvedFunctionNames() {
        return pendingNameChecks.size() > 0;
    }

    public Set<String> unresolvedFunctionNames() {
        return pendingNameChecks;
    }
}
