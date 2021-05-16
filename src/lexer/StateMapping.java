package lexer;

import lexer.lexerstate.LexerState;

import java.util.HashMap;
import java.util.Map;

import static lexer.lexerstate.StateRepository.lxState;

public class StateMapping {

    public static Map<LexerState, Map<Character, LexerState>> stateMap = new HashMap<>(){{

        put(lxState[0], new HashMap<Character, LexerState>(){{
            put('i', lxState[1]);
            put('f', lxState[9]);
            put('e', lxState[16]);
            put('+', lxState[22]);

            // need to map any digit to it
            put('e', lxState[16]);

            // rest
            put('-', lxState[26]);
            put('p', lxState[27]);
            // any other letter except i, f,e,p
            put('e', lxState[16]);

            // rest
            put(',', lxState[33]);
            put(';', lxState[34]);
            put(']', lxState[35]);
            put('[', lxState[36]);
            put('{', lxState[37]);
            put('}', lxState[38]);
            put('(', lxState[39]);
            put(')', lxState[40]);
            put('=', lxState[41]);
            put('<', lxState[42]);
            put('>', lxState[43]);
            put('*', lxState[44]);
            put('/', lxState[45]);
            put('&', lxState[47]);
            put('|', lxState[48]);
            put('!', lxState[50]);
        }});

        put(lxState[1], new HashMap<Character, LexerState>(){{


        }});

    }};
}
