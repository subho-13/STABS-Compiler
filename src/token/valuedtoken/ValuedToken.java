package token.valuedtoken;

import token.Token;

public interface ValuedToken<T> extends Token {
    public T getValue();
}
