package lexer.lexerstate;

import java.util.HashMap;
import java.util.Map;

public class StateMapping {


    public static Map<LexerState, Map<Character, LexerState>> stateMap = new HashMap<>(){{
        ////////////////////////////////////////////////////////////////////            LEXERSTATE 0
        put(state[0], new HashMap<Character, LexerState>(){{
            put('i', state[1]);
            put('f', state[9]);
            put('e', state[16]);
            put('p', state[21]);


            // any other letter except i, f,e,p -> goes to state 26
            put('a', state[26]);
            put('b', state[26]);
            put('c', state[26]);
            put('d', state[26]);
            //put('e', state[26]);
            //put('f', state[26]);
            put('g', state[26]);
            put('h', state[26]);
            //put('i', state[26]);
            put('j', state[26]);
            put('k', state[26]);
            put('l', state[26]);
            put('m', state[26]);
            put('n', state[26]);
            put('o', state[26]);
            //put('p', state[26]);
            put('q', state[26]);
            put('r', state[26]);
            put('s', state[26]);
            put('t', state[26]);
            put('u', state[26]);
            put('v', state[26]);
            put('w', state[26]);
            put('x', state[26]);
            put('y', state[26]);
            put('z', state[26]);


            put('A', state[26]);
            put('B', state[26]);
            put('C', state[26]);
            put('D', state[26]);
            put('E', state[26]);
            put('F', state[26]);
            put('G', state[26]);
            put('H', state[26]);
            put('I', state[26]);
            put('J', state[26]);
            put('K', state[26]);
            put('L', state[26]);
            put('M', state[26]);
            put('N', state[26]);
            put('O', state[26]);
            put('P', state[26]);
            put('Q', state[26]);
            put('R', state[26]);
            put('S', state[26]);
            put('T', state[26]);
            put('U', state[26]);
            put('V', state[26]);
            put('W', state[26]);
            put('X', state[26]);
            put('Y', state[26]);
            put('Z', state[26]);


            put('+', state[27]);


            // need to map any digit to it -> goes to state 29
            put('0', state[29]);
            put('1', state[29]);
            put('2', state[29]);
            put('3', state[29]);
            put('4', state[29]);
            put('5', state[29]);
            put('6', state[29]);
            put('7', state[29]);
            put('8', state[29]);
            put('9', state[29]);

            // rest
            put('-', state[31]);
            put(',', state[33]);
            put(';', state[34]);
            put(']', state[35]);
            put('[', state[36]);
            put('{', state[37]);
            put('}', state[38]);
            put('(', state[39]);
            put(')', state[40]);
            put('=', state[41]);
            put('<', state[43]);
            put('>', state[45]);
            put('*', state[47]);
            put('/', state[48]);
            put('&', state[49]);
            put('|', state[51]);
            put('!', state[53]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 1
        put(state[1], new HashMap<Character, LexerState>(){{

            put('f', state[2]);
            put('n', state[3]);

            // anything other than f or n maps to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            //put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            //put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 2

        put(state[2], new HashMap<Character, LexerState>(){{

            // any char maps to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 3
        put(state[3], new HashMap<Character, LexerState>(){{

            put('p', state[4]);
            put('t', state[7]);

            // rest is for identifier
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            //put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            //put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 4
        put(state[4], new HashMap<Character, LexerState>(){{
            put('u', state[5]);

            // rest is for state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            //put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 5
        put(state[5], new HashMap<Character, LexerState>(){{
            put('t', state[6]);

            // rest for identifier
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            //put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 6
        put(state[6], new HashMap<Character, LexerState>(){{
            // only maps to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 7
        put(state[7], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 8
        put(state[8], new HashMap<Character, LexerState>(){{
            // maps to itself only
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 9
        put(state[9], new HashMap<Character, LexerState>(){{
            put('o', state[10]);
            put('l', state[12]);

            //rest maps to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            //put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            //put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 10
        put(state[10], new HashMap<Character, LexerState>(){{
            put('r', state[11]);

            // rest maps to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            //put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 11
        put(state[11], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 12
        put(state[12], new HashMap<Character, LexerState>(){{
            put('o', state[13]);

            // rest is state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            //put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 13
        put(state[13], new HashMap<Character, LexerState>(){{
            put('a', state[14]);
            // rest is to state 8
            //put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 14
        put(state[14], new HashMap<Character, LexerState>(){{
            put('t', state[15]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            //put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 15
        put(state[15], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 16
        put(state[16], new HashMap<Character, LexerState>(){{
            put('l', state[17]);
            put('o', state[20]);

            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            //put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            //put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 17
        put(state[17], new HashMap<Character, LexerState>(){{
            put('s', state[18]);

            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            //put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 18
        put(state[18], new HashMap<Character, LexerState>(){{
            put('e', state[19]);

            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            //put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 19
        put(state[19], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});



        ////////////////////////////////////////////////////////////////////            LEXERSTATE 20
        put(state[20], new HashMap<Character, LexerState>(){{
            put('f', state[55]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            //put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 55
        put(state[55], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 21
        put(state[21], new HashMap<Character, LexerState>(){{
            put('r', state[22]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            //put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 22
        put(state[22], new HashMap<Character, LexerState>(){{
            put('i', state[23]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            //put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 23
        put(state[23], new HashMap<Character, LexerState>(){{
            put('n', state[24]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            //put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 24
        put(state[24], new HashMap<Character, LexerState>(){{
            put('t', state[25]);
            // rest is to state 8
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            //put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 25
        put(state[25], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 26
        put(state[26], new HashMap<Character, LexerState>(){{
            put('a', state[8]);
            put('b', state[8]);
            put('c', state[8]);
            put('d', state[8]);
            put('e', state[8]);
            put('f', state[8]);
            put('g', state[8]);
            put('h', state[8]);
            put('i', state[8]);
            put('j', state[8]);
            put('k', state[8]);
            put('l', state[8]);
            put('m', state[8]);
            put('n', state[8]);
            put('o', state[8]);
            put('p', state[8]);
            put('q', state[8]);
            put('r', state[8]);
            put('s', state[8]);
            put('t', state[8]);
            put('u', state[8]);
            put('v', state[8]);
            put('w', state[8]);
            put('x', state[8]);
            put('y', state[8]);
            put('z', state[8]);


            put('A', state[8]);
            put('B', state[8]);
            put('C', state[8]);
            put('D', state[8]);
            put('E', state[8]);
            put('F', state[8]);
            put('G', state[8]);
            put('H', state[8]);
            put('I', state[8]);
            put('J', state[8]);
            put('K', state[8]);
            put('L', state[8]);
            put('M', state[8]);
            put('N', state[8]);
            put('O', state[8]);
            put('P', state[8]);
            put('Q', state[8]);
            put('R', state[8]);
            put('S', state[8]);
            put('T', state[8]);
            put('U', state[8]);
            put('V', state[8]);
            put('W', state[8]);
            put('X', state[8]);
            put('Y', state[8]);
            put('Z', state[8]);


            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 27
        put(state[27], new HashMap<Character, LexerState>(){{
            put('+', state[28]);
            // rest  digits goes to 29

            put('0', state[29]);
            put('1', state[29]);
            put('2', state[29]);
            put('3', state[29]);
            put('4', state[29]);
            put('5', state[29]);
            put('6', state[29]);
            put('7', state[29]);
            put('8', state[29]);
            put('9', state[29]);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 28
        put(state[28], new HashMap<Character, LexerState>(){{
            // no transition map for state 28
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 29
        put(state[29], new HashMap<Character, LexerState>(){{
            put('.', state[30]);
            // rest digit goes to itself
            put('0', state[29]);
            put('1', state[29]);
            put('2', state[29]);
            put('3', state[29]);
            put('4', state[29]);
            put('5', state[29]);
            put('6', state[29]);
            put('7', state[29]);
            put('8', state[29]);
            put('9', state[29]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 30
        put(state[30], new HashMap<Character, LexerState>(){{
            put('0', state[8]);
            put('1', state[8]);
            put('2', state[8]);
            put('3', state[8]);
            put('4', state[8]);
            put('5', state[8]);
            put('6', state[8]);
            put('7', state[8]);
            put('8', state[8]);
            put('9', state[8]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 31
        put(state[31], new HashMap<Character, LexerState>(){{
            put('-', state[32]);

            put('0', state[29]);
            put('1', state[29]);
            put('2', state[29]);
            put('3', state[29]);
            put('4', state[29]);
            put('5', state[29]);
            put('6', state[29]);
            put('7', state[29]);
            put('8', state[29]);
            put('9', state[29]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 32
        put(state[32], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 33
        put(state[33], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 34
        put(state[34], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 35
        put(state[35], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 36
        put(state[36], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 37
        put(state[37], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 38
        put(state[38], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 39
        put(state[39], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 40
        put(state[40], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 41
        put(state[41], new HashMap<Character, LexerState>(){{
            put('=', state[42]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 42
        put(state[42], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 43
        put(state[43], new HashMap<Character, LexerState>(){{
            put('=', state[44]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 44
        put(state[44], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 45
        put(state[45], new HashMap<Character, LexerState>(){{
            put('=', state[46]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 46
        put(state[46], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 47
        put(state[47], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 48
        put(state[48], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 49
        put(state[49], new HashMap<Character, LexerState>(){{
            put('&', state[50]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 50
        put(state[50], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 51
        put(state[51], new HashMap<Character, LexerState>(){{
            put('|', state[52]);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 52
        put(state[52], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 53
        put(state[53], new HashMap<Character, LexerState>(){{
            put('=', state[54]);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 54
        put(state[54], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

    }};


}};
}
