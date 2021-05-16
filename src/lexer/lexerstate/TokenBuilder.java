package lexer.lexerstate;

import token.Token;

public interface TokenBuilder {
    public Token construct(String string);
}
