package token.valuedtoken;

import terminal.Terminal;

public class IdentifierToken implements ValuedToken<String> {
    private String value;

    public IdentifierToken(String value) {
        this.value = value;
    }

    @Override
    public Terminal getType() {
        return Terminal.IDENTIFIER;
    }

    @Override
    public String getValue() {
        return value;
    }
}
