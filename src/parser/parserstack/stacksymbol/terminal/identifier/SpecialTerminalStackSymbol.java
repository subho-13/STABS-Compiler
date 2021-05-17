package parser.parserstack.stacksymbol.terminal.identifier;

import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.symboltable.SymbolTable;
import parser.symboltable.SymbolTableAction;
import terminal.Terminal;
import token.Token;
import token.valuedtoken.IdentifierToken;

import java.util.function.Consumer;

public class SpecialTerminalStackSymbol extends TerminalStackSymbol {
    private final SymbolTable symbolTable;
    private final SymbolTableAction action;

    public SpecialTerminalStackSymbol(final Terminal terminal, SymbolTable symbolTable, SymbolTableAction action) {
        super(terminal);
        this.symbolTable = symbolTable;
        this.action = action;
    }


    public void applySpecialAction(final Token token) {
        if (action == null) {
            return;
        }

        switch (action) {
            case ADD_IDENTIFIER -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                if (symbolTable.check(identifierToken.getValue()) == true) {
                    // Identifier already present. Throw an error.
                }
            }
            case CHECK_IDENTIFIER -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                if (symbolTable.check(identifierToken.getValue()) == false) {
                    // Identifier not present. Throw an error.
                }
            }

            case INCREMENT_SCOPE -> {
                symbolTable.incrementScope();
            }

            case DECREMENT_SCOPE ->  {
                symbolTable.decrementScope();
            }
        }
    }
}
