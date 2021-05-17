package lexer;

import lexer.lexerstate.LexerState;

import java.util.HashMap;
import java.util.Map;

import static lexer.lexerstate.StateRepository.lxState;

public class StateMapping {

    public static Map<LexerState, Map<Character, LexerState>> stateMap = new HashMap<>(){{

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 0
        put(lxState[0], new HashMap<Character, LexerState>(){{
            put('i', lxState[1]);
            put('f', lxState[9]);
            put('e', lxState[16]);
            put('p', lxState[21]);


            // any other letter except i, f,e,p -> goes to state 26
            put('a', lxState[26]);
            put('b', lxState[26]);
            put('c', lxState[26]);
            put('d', lxState[26]);
            //put('e', lxState[26]);
            //put('f', lxState[26]);
            put('g', lxState[26]);
            put('h', lxState[26]);
            //put('i', lxState[26]);
            put('j', lxState[26]);
            put('k', lxState[26]);
            put('l', lxState[26]);
            put('m', lxState[26]);
            put('n', lxState[26]);
            put('o', lxState[26]);
            //put('p', lxState[26]);
            put('q', lxState[26]);
            put('r', lxState[26]);
            put('s', lxState[26]);
            put('t', lxState[26]);
            put('u', lxState[26]);
            put('v', lxState[26]);
            put('w', lxState[26]);
            put('x', lxState[26]);
            put('y', lxState[26]);
            put('z', lxState[26]);


            put('A', lxState[26]);
            put('B', lxState[26]);
            put('C', lxState[26]);
            put('D', lxState[26]);
            put('E', lxState[26]);
            put('F', lxState[26]);
            put('G', lxState[26]);
            put('H', lxState[26]);
            put('I', lxState[26]);
            put('J', lxState[26]);
            put('K', lxState[26]);
            put('L', lxState[26]);
            put('M', lxState[26]);
            put('N', lxState[26]);
            put('O', lxState[26]);
            put('P', lxState[26]);
            put('Q', lxState[26]);
            put('R', lxState[26]);
            put('S', lxState[26]);
            put('T', lxState[26]);
            put('U', lxState[26]);
            put('V', lxState[26]);
            put('W', lxState[26]);
            put('X', lxState[26]);
            put('Y', lxState[26]);
            put('Z', lxState[26]);


            put('+', lxState[27]);


            // need to map any digit to it -> goes to state 29
            put('0', lxState[29]);
            put('1', lxState[29]);
            put('2', lxState[29]);
            put('3', lxState[29]);
            put('4', lxState[29]);
            put('5', lxState[29]);
            put('6', lxState[29]);
            put('7', lxState[29]);
            put('8', lxState[29]);
            put('9', lxState[29]);

            // rest
            put('-', lxState[31]);
            put(',', lxState[33]);
            put(';', lxState[34]);
            put(']', lxState[35]);
            put('[', lxState[36]);
            put('{', lxState[37]);
            put('}', lxState[38]);
            put('(', lxState[39]);
            put(')', lxState[40]);
            put('=', lxState[41]);
            put('<', lxState[43]);
            put('>', lxState[45]);
            put('*', lxState[47]);
            put('/', lxState[48]);
            put('&', lxState[49]);
            put('|', lxState[51]);
            put('!', lxState[53]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 1
        put(lxState[1], new HashMap<Character, LexerState>(){{

            put('f', lxState[2]);
            put('n', lxState[3]);

            // anything other than f or n maps to state 8
            put('a', lxState[8]);
            put('b', lxState[8]);
            put('c', lxState[8]);
            put('d', lxState[8]);
            put('e', lxState[8]);
            //put('f', lxState[8]);
            put('g', lxState[8]);
            put('h', lxState[8]);
            put('i', lxState[8]);
            put('j', lxState[8]);
            put('k', lxState[8]);
            put('l', lxState[8]);
            put('m', lxState[8]);
            //put('n', lxState[8]);
            put('o', lxState[8]);
            put('p', lxState[8]);
            put('q', lxState[8]);
            put('r', lxState[8]);
            put('s', lxState[8]);
            put('t', lxState[8]);
            put('u', lxState[8]);
            put('v', lxState[8]);
            put('w', lxState[8]);
            put('x', lxState[8]);
            put('y', lxState[8]);
            put('z', lxState[8]);


            put('A', lxState[8]);
            put('B', lxState[8]);
            put('C', lxState[8]);
            put('D', lxState[8]);
            put('E', lxState[8]);
            put('F', lxState[8]);
            put('G', lxState[8]);
            put('H', lxState[8]);
            put('I', lxState[8]);
            put('J', lxState[8]);
            put('K', lxState[8]);
            put('L', lxState[8]);
            put('M', lxState[8]);
            put('N', lxState[8]);
            put('O', lxState[8]);
            put('P', lxState[8]);
            put('Q', lxState[8]);
            put('R', lxState[8]);
            put('S', lxState[8]);
            put('T', lxState[8]);
            put('U', lxState[8]);
            put('V', lxState[8]);
            put('W', lxState[8]);
            put('X', lxState[8]);
            put('Y', lxState[8]);
            put('Z', lxState[8]);


            put('0', lxState[8]);
            put('1', lxState[8]);
            put('2', lxState[8]);
            put('3', lxState[8]);
            put('4', lxState[8]);
            put('5', lxState[8]);
            put('6', lxState[8]);
            put('7', lxState[8]);
            put('8', lxState[8]);
            put('9', lxState[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 2

        put(lxState[2], new HashMap<Character, LexerState>(){{

            // any char maps to state 8
            put('a', lxState[8]);
            put('b', lxState[8]);
            put('c', lxState[8]);
            put('d', lxState[8]);
            put('e', lxState[8]);
            put('f', lxState[8]);
            put('g', lxState[8]);
            put('h', lxState[8]);
            put('i', lxState[8]);
            put('j', lxState[8]);
            put('k', lxState[8]);
            put('l', lxState[8]);
            put('m', lxState[8]);
            put('n', lxState[8]);
            put('o', lxState[8]);
            put('p', lxState[8]);
            put('q', lxState[8]);
            put('r', lxState[8]);
            put('s', lxState[8]);
            put('t', lxState[8]);
            put('u', lxState[8]);
            put('v', lxState[8]);
            put('w', lxState[8]);
            put('x', lxState[8]);
            put('y', lxState[8]);
            put('z', lxState[8]);


            put('A', lxState[8]);
            put('B', lxState[8]);
            put('C', lxState[8]);
            put('D', lxState[8]);
            put('E', lxState[8]);
            put('F', lxState[8]);
            put('G', lxState[8]);
            put('H', lxState[8]);
            put('I', lxState[8]);
            put('J', lxState[8]);
            put('K', lxState[8]);
            put('L', lxState[8]);
            put('M', lxState[8]);
            put('N', lxState[8]);
            put('O', lxState[8]);
            put('P', lxState[8]);
            put('Q', lxState[8]);
            put('R', lxState[8]);
            put('S', lxState[8]);
            put('T', lxState[8]);
            put('U', lxState[8]);
            put('V', lxState[8]);
            put('W', lxState[8]);
            put('X', lxState[8]);
            put('Y', lxState[8]);
            put('Z', lxState[8]);


            put('0', lxState[8]);
            put('1', lxState[8]);
            put('2', lxState[8]);
            put('3', lxState[8]);
            put('4', lxState[8]);
            put('5', lxState[8]);
            put('6', lxState[8]);
            put('7', lxState[8]);
            put('8', lxState[8]);
            put('9', lxState[8]);

        }};


    }};



    /*

     put(lxState[0], new HashMap<Character, LexerState>(){{  }};

       put('a', lxState[8]);
       put('b', lxState[8]);
       put('c', lxState[8]);
       put('d', lxState[8]);
       put('e', lxState[8]);
       put('f', lxState[8]);
       put('g', lxState[8]);
       put('h', lxState[8]);
       put('i', lxState[8]);
       put('j', lxState[8]);
       put('k', lxState[8]);
       put('l', lxState[8]);
       put('m', lxState[8]);
       put('n', lxState[8]);
       put('o', lxState[8]);
       put('p', lxState[8]);
       put('q', lxState[8]);
       put('r', lxState[8]);
       put('s', lxState[8]);
       put('t', lxState[8]);
       put('u', lxState[8]);
       put('v', lxState[8]);
       put('w', lxState[8]);
       put('x', lxState[8]);
       put('y', lxState[8]);
       put('z', lxState[8]);


       put('A', lxState[8]);
       put('B', lxState[8]);
       put('C', lxState[8]);
       put('D', lxState[8]);
       put('E', lxState[8]);
       put('F', lxState[8]);
       put('G', lxState[8]);
       put('H', lxState[8]);
       put('I', lxState[8]);
       put('J', lxState[8]);
       put('K', lxState[8]);
       put('L', lxState[8]);
       put('M', lxState[8]);
       put('N', lxState[8]);
       put('O', lxState[8]);
       put('P', lxState[8]);
       put('Q', lxState[8]);
       put('R', lxState[8]);
       put('S', lxState[8]);
       put('T', lxState[8]);
       put('U', lxState[8]);
       put('V', lxState[8]);
       put('W', lxState[8]);
       put('X', lxState[8]);
       put('Y', lxState[8]);
       put('Z', lxState[8]);


       put('0', lxState[8]);
       put('1', lxState[8]);
       put('2', lxState[8]);
       put('3', lxState[8]);
       put('4', lxState[8]);
       put('5', lxState[8]);
       put('6', lxState[8]);
       put('7', lxState[8]);
       put('8', lxState[8]);
       put('9', lxState[8]);


    */
}
