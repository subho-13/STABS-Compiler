package parser.parserstack.stacksymbol.terminal;

import parser.table.SymbolTable;
import terminal.Terminal;
import token.Token;

public class SpecialTerminalStackSymbol<T> extends TerminalStackSymbol {
    private final T table;
    private final TerminalStackSymbolAction<T> action;

    public SpecialTerminalStackSymbol(final Terminal terminal, T table, TerminalStackSymbolAction<T> action) {
        super(terminal);
        this.table = table;
        this.action = action;
    }

    @Override
    public void applySpecialAction(final Token token) throws Exception {
        action.apply(table, token);
    }
}
