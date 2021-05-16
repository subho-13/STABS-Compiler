package lexer.lexerstate;

import terminal.Terminal;
import token.ReservedToken;
import token.Token;

import java.util.Map;

public class LexerStateBuilder {
    LexerState start = new LexerState();
    LexerState state_1 = new LexerState();
    LexerState state_35 = new LexerState();
    LexerState state_43 = new LexerState();

    private void configureStart() {
    }

    private void configureState35() {
        state_35.setTokenBuilder((s) -> {
            Token token = new ReservedToken(Terminal.IF);
            return token;
        });
    }
}
