package token.valuedtoken;

import terminal.Terminal;
import token.Token;

public class IntToken implements ValuedToken<Integer> {
    private final int value;

    public IntToken(int value) {
        this.value = value;
    }
    @Override
    public Terminal getType() {
        return Terminal.INT_VAL;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
