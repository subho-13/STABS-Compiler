package parser.parserstack;

import nonterminal.NonTerminal;
import parser.parserstack.stacksymbol.StackSymbol;

import java.util.*;

public class ParserStack {
    private Stack<StackSymbol> stack = new Stack<>();
    public void push(StackSymbol...stackSymbols) {
        Collections.reverse(Arrays.asList(stackSymbols));
        for(StackSymbol symbol: stackSymbols) {
            stack.push(symbol);
            System.out.println(symbol);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public StackSymbol pop() {
        StackSymbol symbol = stack.pop();
        if (symbol == null) {
            // Throw Exception
        }
        return symbol;
    }
}
