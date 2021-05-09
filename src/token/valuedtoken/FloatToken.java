package token.valuedtoken;

import terminal.Terminal;

public class FloatToken implements ValuedToken<Float> {
    private final float value;

    public FloatToken(float value) {
        this.value = value;
    }
    @Override
    public Terminal getType() {
        return Terminal.FLOAT_VAL;
    }

    @Override
    public Float getValue() {
        return value;
    }
}
