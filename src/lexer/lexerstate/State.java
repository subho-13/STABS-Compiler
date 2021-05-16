package lexer.lexerstate;

import token.Token;

import java.util.HashMap;
import java.util.Map;
import static lexer.StateMapping.stateMap;

public class State implements  LexerState{

    String tokenValue;
    Map<Character, LexerState> transitionMap;

    @Override
    public void setTransitionMap(Map<Character, LexerState> map, String currToken) {
        this.tokenValue = currToken;
        this.transitionMap = new HashMap<>(map);
    }

    @Override
    public LexerState move(char c) {
        if(this.transitionMap.get(c) == null) {
            // handle exception
            // no such token exists
        }

        LexerState temp = this.transitionMap.get(c);
        tokenValue += c;
        temp.setTransitionMap(stateMap.get(temp), tokenValue);
        return temp;
    }

    @Override
    public Token getToken(String str) {
        Token token;
        return null;
    }
}
