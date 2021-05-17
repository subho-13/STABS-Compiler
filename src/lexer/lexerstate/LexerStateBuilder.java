package lexer.lexerstate;

import lexer.Lexer;
import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.IntToken;

import java.util.HashMap;
import java.util.Map;

public class LexerStateBuilder {
    LexerState start = new LexerState();
    LexerState state_1 = new LexerState();
    LexerState state_2 = new LexerState();
    LexerState state_3 = new LexerState();

    public LexerState getInitialState() {
        return start;
    }

    private void configureStart() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        start.setTransitionMap(map);
    }

    private void configureState_1() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state_1.setTransitionMap(map);
        state_1.setTokenBuilder((string) -> {
            Token token = new IntToken(Integer.parseInt(string));
            return token;
        });
    }
}

/* for first push*/
