package lexer.lexerstate;

import token.Token;

import java.util.HashMap;
import java.util.Map;

public class State implements  LexerState{

    Token token;
    boolean tokenExists = false;
    String tokenValue;
    Map<Character, LexerState> transitionMap;

    @Override
    public void setTransitionMap(Map<Character, LexerState> map) {
        this.transitionMap = new HashMap<>(map);
    }

    @Override
    public LexerState move(char c) {

        // somehow need to pass the char val to the next state
        //
        return null;
    }

    @Override
    public Token getToken(String string) {
        return null;
    }
}
