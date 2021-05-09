package parser.parserstack;

import nonterminal.NonTerminal;

import java.util.List;
import java.util.Stack;

public class ParserStack {
    private Stack<NonTerminal> stack;
    public void push(List<NonTerminal> nonTerminalList) {
        for(NonTerminal nonTerminal: nonTerminalList) {
            stack.push(nonTerminal);
        }
    }

    public NonTerminal pop() {
        if (stack.empty() == true) {
            return NonTerminal.EOS;
        }

        return stack.pop();
    }
}
