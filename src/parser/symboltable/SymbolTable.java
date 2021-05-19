package parser.symboltable;

import java.util.*;

public class SymbolTable {
    Queue<Set<String>> table = new LinkedList<>();
    List<String> toBeAdded = new ArrayList<String>();

    public void addToFutureScope(String identifier) {
        toBeAdded.add(identifier);
    }

    public void incrementScope() {
        table.add(new HashSet<String>());

        for (String identifier: toBeAdded) {
            addToCurrentScope(identifier);
        }

        toBeAdded.clear();
    }

    public void decrementScope() {
        table.remove();
    }

    public void addToCurrentScope(String identifier) {
        Set<String> topScope = table.peek();
        topScope.add(identifier);
    }

    public boolean check(String identifier) {
        for (Set scope: table) {
            if (scope.contains(identifier) == true) {
                return true;
            }
        }

        return false;
    }
}
