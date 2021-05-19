package parser.parserstack;

import nonterminal.NonTerminal;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.StackSymbolType;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import util.ParseTree.ParseTree;

import java.util.*;

public class ParserStack {
    private Stack<StackSymbol> stack = new Stack<>();
    private ParseTree parseTree;

    public ParserStack(ParseTree parseTree) {
        this.parseTree = parseTree;
    }

    public void push(StackSymbol...stackSymbols) {
        ArrayList<String> strings = new ArrayList<>();

        for (StackSymbol stackSymbol: stackSymbols) {
            if (stackSymbol.getType() == StackSymbolType.NONTERMINAL) {
                NonTerminalStackSymbol nonTerminalStackSymbol = (NonTerminalStackSymbol) stackSymbol;
                strings.add(nonTerminalStackSymbol.getNonTerminalType().toString());
            } else {
                TerminalStackSymbol terminalStackSymbol = (TerminalStackSymbol) stackSymbol;
                strings.add(terminalStackSymbol.getTerminal().toString());
            }
        }

        parseTree.notifyPush(strings);

        Collections.reverse(Arrays.asList(stackSymbols));
        for(StackSymbol symbol: stackSymbols) {
            stack.push(symbol);
            System.out.println("PUSH: " + symbol);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public StackSymbol pop() {
        parseTree.notifyPop();
        StackSymbol symbol = stack.pop();
        System.out.println("POP: " + symbol);
        return symbol;
    }
}
