package parser.symboltable;

import java.util.*;

public class SymbolTable {
    Queue<Set<String>> table = new LinkedList<>();

    public void incrementScope() {
        table.add(new HashSet<String>());
    }

    public void decrementScope() {
        table.remove();
    }

    public void add(String identifier) {
        Set topScope = table.peek();
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
