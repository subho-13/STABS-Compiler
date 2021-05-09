package parser.parserstack;

import nonterminal.NonTerminal;
import parser.parserstack.stacksymbol.StackSymbol;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ParserStack {
    private Stack<StackSymbol> stack;
    public void push(List<StackSymbol> stackSymbols) {
        Collections.reverse(stackSymbols);
        for(StackSymbol symbol: stackSymbols) {
            stack.push(symbol);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public StackSymbol pop() throws Exception {
        StackSymbol symbol = stack.pop();
        if (symbol == null) {
            throw new Exception("Stack is empty");
        }
        return symbol;
    }
}
