package lexer.lexerstate;

import lexer.Lexer;
import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.IntToken;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class LexerStateBuilder {
    private LexerState[] state = new LexerState[56];
    private StateMapping stateMapping;

    public LexerStateBuilder(StateMapping stateMapping) {
        initializeStates();
        addMappingToStates(stateMapping);
        configureStates();
    }

    private void initializeStates() {
        for(int i = 0; i < state.length; i++) {
            state[i] = new LexerState();
        }
    }

    private void addMappingToStates(StateMapping mapping) {
        for(int i = 0; i < state.length; i++) {
            Map<Character, Integer> map = mapping.getMappingForState(i);
            Map<Character, LexerState> characterLexerStateMap = new HashMap<>();
            for(Map.Entry<Character, Integer> entry: map.entrySet()) {
                characterLexerStateMap.put(entry.getKey(), state[entry.getValue()]);
            }

            state[i].setTransitionMap(characterLexerStateMap);
        }
    }

     public void configureStates() {

     }

    private void configureState27() {
        state[27].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ADD);
            return token;
        });
    }

    private void configureState37() {
        state[37].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.LEFT_CURLY);
            return token;
        });
    }
    private void configureState38() {
        state[38].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.RIGHT_CURLY);
            return token;
        });
    }
    private void configureState39() {
        state[39].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LEFT_PARA);
            return token;
        });
    }
    private void configureState40() {
        state[40].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.RIGHT_PARA);
            return token;
        });
    }
    private void configureState41() {
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
    private void configureState43() {
        state[43].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER);
            return token;
        });
    }
    private void configureState44() {
        state[44].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER_EQ);
            return token;
        });
    }
    private void configureState45() {
        state[45].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER);
            return token;
        });
    }
    private void configureState46() {
        state[46].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER_EQ);
            return token;
        });
    }
    private void configureState47() {
        state[47].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.MULTIPLY);
            return token;
        });
    }
    private void configureState48() {
        state[48].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.DIVIDE);
            return token;
        });
    }

    private void configureState50() {
        state[50].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.AND);
            return token;
        });
    }

    private void configureState52() {
        state[52].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.OR);
            return token;
        });
    }

    private void configureState54() {
        state[54].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.NOT_EQ);
            return token;
        });
    }
}
