package parser.parserstack.stacksymbol.terminal;

import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.StackSymbolType;
import terminal.Terminal;
import token.Token;

public class TerminalStackSymbol implements StackSymbol {
    protected final Terminal terminal;

    public TerminalStackSymbol(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public StackSymbolType getType() {
        return StackSymbolType.TERMINAL;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void applySpecialAction(Token token) throws Exception {}

    @Override
    public String toString() {
        return "TerminalStackSymbol{" +
                "terminal=" + terminal +
                '}';
    }
}
