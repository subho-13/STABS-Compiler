package parser.parserstack.stacksymbol.terminal;

import parser.symboltable.SymbolTable;
import terminal.Terminal;
import token.Token;

public class SpecialTerminalStackSymbol extends TerminalStackSymbol {
    private final SymbolTable symbolTable;
    private final TerminalStackSymbolAction action;

    public SpecialTerminalStackSymbol(final Terminal terminal, SymbolTable symbolTable, TerminalStackSymbolAction action) {
        super(terminal);
        this.symbolTable = symbolTable;
        this.action = action;
    }

    @Override
    public void applySpecialAction(final Token token) {
        action.apply(symbolTable, token);
    }
}
