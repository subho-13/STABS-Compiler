package token;

import terminal.Terminal;

public class ReservedToken implements Token{
    Terminal terminal;
    public ReservedToken(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public Terminal getType() {
        return terminal;
    }
}
