package lexer.lexerstate;

import token.Token;

import java.util.Map;

public class State implements  LexerState{
    @Override
    public void setTransitionMap(Map<Character, LexerState> map) {

    }

    @Override
    public LexerState move(char c) {
        return null;
    }

    @Override
    public Token getToken(String string) {
        return null;
    }
}
