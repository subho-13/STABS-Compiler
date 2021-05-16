package parser.parserstack.stacksymbol.terminal.identifier;

import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.symboltable.SymbolTable;
import terminal.Terminal;
import token.Token;

import java.util.function.Consumer;

public class IdentifierStackSymbol extends TerminalStackSymbol {
    private final Consumer<Token> action;
    private final SymbolTable symbolTable;

    public IdentifierStackSymbol(final Terminal terminal, SymbolTable symbolTable, Consumer<Token> action) {
        super(terminal);
        this.symbolTable = symbolTable;
        this.action = action;
    }

    @Override
    public void applySpecialAction(final Token token) {
        action.accept(token);
    }
}
