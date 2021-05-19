package parser.symboltable;

import lexer.lexerstate.StateMapping;

import java.util.*;

public class SymbolTable {
    Stack<Set<String>> table = new Stack<>();
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
        table.pop();
    }

    public void addToCurrentScope(String identifier) {
        Set<String> topScope = table.peek();
        System.out.println("SymbolTable : " + identifier);
        topScope.add(identifier);
    }

    public boolean checkInAllScopes(String identifier) {
        for (Set<String> scope: table) {
            if (scope.contains(identifier)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkInCurrentScope(String identifier) {
        Set<String> topScope = table.peek();
        System.out.println(topScope);
        return topScope.contains(identifier);
    }
}
