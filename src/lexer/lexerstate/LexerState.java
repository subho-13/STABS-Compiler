package lexer.lexerstate;

import token.Token;

import java.util.Map;

public interface LexerState {
    public void setTransitionMap(Map<Char, LexerState> map);
    public
    public Token getToken(String string);
}
