package parser.parserstack.stacksymbol.nonterminal;

import nonterminal.NonTerminal;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.StackSymbolType;

public class NonTerminalStackSymbol implements StackSymbol {
    private final NonTerminal nonTerminal;

    public NonTerminalStackSymbol(NonTerminal nonTerminal) {
        this.nonTerminal = nonTerminal;
    }

    @Override
    public StackSymbolType getType() {
        return StackSymbolType.NONTERMINAL;
    }

    public NonTerminal getNonTerminalType() {
        return nonTerminal;
    }

    @Override
    public String toString() {
        return "NonTerminalStackSymbol{" +
                "nonTerminal=" + nonTerminal +
                '}';
    }
}
