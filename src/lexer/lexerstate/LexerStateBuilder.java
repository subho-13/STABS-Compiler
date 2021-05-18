package lexer.lexerstate;

import lexer.Lexer;
import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.FloatToken;
import token.valuedtoken.IdentifierToken;
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

         configureState_0();
         configureState_1();
         configureState_2();
         configureState_3();
         configureState_4();
         configureState_5();
         configureState_6();
         configureState_7();
         configureState_8();
         configureState_9();
         configureState_10();
         configureState_11();
         configureState_12();
         configureState_13();
         configureState_14();
         configureState_15();
         configureState_16();
         configureState_17();
         configureState_18();
         configureState_19();
         configureState_20();
         configureState_21();
         configureState_22();
         configureState_23();
         configureState_24();
         configureState_25();
         configureState_26();
         configureState_27();
         configureState_29();
         configureState_30();
         configureState_31();
         configureState_32();
         configureState_33();
         configureState_34();
         configureState_35();
         configureState_36();
         configureState_37();
         configureState_38();
         configureState_39();
         configureState_40();
         configureState_41();
         configureState_42();
         configureState_43();
         configureState_44();
         configureState_45();
         configureState_46();
         configureState_47();
         configureState_48();
         configureState_50();
         configureState_52();
         configureState_54();
         configureState_55();
     }

    private void configureState_0() {
        state[0].setTransitionMap(map);
    }

    private void configureState_1() {
        state[1].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_2() {
        state[2].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.IF);
            return token;
        });
    }

    private void configureState_3() {
        state[3].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_4() {
        state[4].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_5() {
        state[5].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_6() {
        state[6].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.INPUT);
            return token;
        });
    }

    private void configureState_7() {
        state[7].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.INT);
            return token;
        });
    }

    private void configureState_8() {
        state[8].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_9() {
        state[9].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_10() {
        state[10].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_11() {
        state[11].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.FOR);
            return token;
        });
    }

    private void configureState_12() {
        state[12].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_13() {
        state[13].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_14() {
        state[14].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_15() {
        state[15].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.FLOAT);
            return token;
        });
    }

    private void configureState_16() {
        state[16].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_17() {
        state[17].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_18() {
        state[18].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_19() {
        state[19].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ELSE);
            return token;
        });
    }

    private void configureState_20() {
        state[20].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }



    private void configureState_21() {
        state[21].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_22() {
        state[22].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_23() {
        state[23].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_24() {
        state[24].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }

    private void configureState_25() {
        state[25].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.PRINT);
            return token;
        });
    }

    private void configureState_26() {
        state[26].setTokenBuilder((string) -> {
            Token token = new IdentifierToken(string);
            return token;
        });
    }


    private void configureState_27() {
        state[27].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ADD);
            return token;
        });
    }

    private void configureState_29() {
        state[29].setTokenBuilder((string) -> {
            Token token = new IntToken(Integer.parseInt(string));
            return token;
        });
    }

    private void configureState_30() {
        state[30].setTokenBuilder((string) -> {
            Token token = new FloatToken(Float.parseFloat(string));
            return token;
        });
    }

    private void configureState_31() {
        state[31].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.SUBSTRACT);
            return token;
        });
    }
    private void configureState_32() {
        state[32].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.DECREMENT);
            return token;
        });
    }
    private void configureState_33() {
        state[33].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.COMMA);
            return token;
        });
    }
    private void configureState_34() {
        state[34].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.SEMICOLON);
            return token;
        });
    }
    private void configureState_35() {
        state[35].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.RIGHT_SQ);
            return token;
        });
    }

    private void configureState_36() {
        state[36].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.LEFT_SQ);
            return token;
        });
    }

    private void configureState_37() {
        state[37].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.LEFT_CURLY);
            return token;
        });
    }
    private void configureState_38() {
        state[38].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.RIGHT_CURLY);
            return token;
        });
    }
    private void configureState_39() {
        state[39].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LEFT_PARA);
            return token;
        });
    }
    private void configureState_40() {
        state[40].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.RIGHT_PARA);
            return token;
        });
    }
    private void configureState_41() {
        state[41].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ASSIGN);
            return token;
        });
    }

    private void configureState_42() {
        state[42].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.EQUALS);
            return token;
        });
    }
    private void configureState_43() {
        state[43].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER);
            return token;
        });
    }
    private void configureState_44() {
        state[44].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER_EQ);
            return token;
        });
    }
    private void configureState_45() {
        state[45].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER);
            return token;
        });
    }
    private void configureState_46() {
        state[46].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER_EQ);
            return token;
        });
    }
    private void configureState_47() {
        state[47].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.MULTIPLY);
            return token;
        });
    }
    private void configureState_48() {
        state[48].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.DIVIDE);
            return token;
        });
    }

    private void configureState_50() {
        state[50].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.AND);
            return token;
        });
    }

    private void configureState_52() {
        state[52].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.OR);
            return token;
        });
    }

    private void configureState_54() {
        state[54].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.NOT_EQ);
            return token;
        });
    }

    private void configureState_55() {
        state[55].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.EOF);
            return token;
        });
    }
}
