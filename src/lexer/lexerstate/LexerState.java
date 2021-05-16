package lexer.lexerstate;

import token.Token;

import java.util.Map;

public interface LexerState {
    public void setTransitionMap(Map<Character, LexerState> map, String currToken);
    public LexerState move(char c);
    public Token getToken(String string);
}
