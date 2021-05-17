package lexer.lexerstate;

import lexer.Lexer;
import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.IntToken;

import java.util.HashMap;
import java.util.Map;

public class LexerStateBuilder {
    LexerState[] state = new LexerState[55];

    private void configureState41() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();

        state[41].setTransitionMap(map);
        state[41].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ASSIGN);
            return token;
        });
    }

    private void configureState42() {
        state[42].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.EQUALS);
            return token;
        });
    }

    private void configureState27() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();

        state[27].setTransitionMap(map);
        state[27].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ADD);
            return token;
        });
    }
}
