package lexer.lexerstate;

import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.IntToken;

import java.util.HashMap;
import java.util.Map;

public class LexerStateBuilder {
    LexerState[] state = new LexerState[55];

    public LexerState getInitialState() {
        return state[0];
    }

    private void configureStart_0() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[0].setTransitionMap(map);
    }

    private void configureState_1() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[1].setTransitionMap(map);
        state[1].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_2() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[2].setTransitionMap(map);
        state[2].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IF);
            return token;
        });
    }

    private void configureState_3() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[3].setTransitionMap(map);
        state[3].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_4() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[4].setTransitionMap(map);
        state[4].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_5() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[5].setTransitionMap(map);
        state[5].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_6() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[6].setTransitionMap(map);
        state[6].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.INPUT);
            return token;
        });
    }

    private void configureState_7() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[7].setTransitionMap(map);
        state[7].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.INT);
            return token;
        });
    }

    private void configureState_8() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[8].setTransitionMap(map);
        state[8].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_9() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[9].setTransitionMap(map);
        state[9].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_10() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[10].setTransitionMap(map);
        state[10].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_11() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[11].setTransitionMap(map);
        state[11].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.FOR);
            return token;
        });
    }

    private void configureState_12() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[12].setTransitionMap(map);
        state[12].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_13() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[13].setTransitionMap(map);
        state[13].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_14() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[14].setTransitionMap(map);
        state[14].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_15() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[15].setTransitionMap(map);
        state[15].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.FLOAT);
            return token;
        });
    }

    private void configureState_16() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[16].setTransitionMap(map);
        state[16].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_17() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[17].setTransitionMap(map);
        state[17].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_18() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[18].setTransitionMap(map);
        state[18].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_19() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[19].setTransitionMap(map);
        state[19].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ELSE);
            return token;
        });
    }

    private void configureState_20() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[20].setTransitionMap(map);
        state[20].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_21() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[21].setTransitionMap(map);
        state[21].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.EOF);
            return token;
        });
    }

    private void configureState_22() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[22].setTransitionMap(map);
        state[22].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_23() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[23].setTransitionMap(map);
        state[23].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_24() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[24].setTransitionMap(map);
        state[24].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IDENTIFIER);
            return token;
        });
    }

    private void configureState_25() {
        Map<Character, LexerState>  map = new HashMap<Character, LexerState>();
        state[25].setTransitionMap(map);
        state[25].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.PRINT);
            return token;
        });
    }
}

/* for first push*/
