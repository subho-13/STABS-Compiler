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

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 3
        put(lxState[3], new HashMap<Character, LexerState>(){{

            put('p', lxState[4]);
            put('t', lxState[7]);

            // rest is for identifier
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
            //put('p', lxState[8]);
            put('q', lxState[8]);
            put('r', lxState[8]);
            put('s', lxState[8]);
            //put('t', lxState[8]);
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


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 4
        put(lxState[4], new HashMap<Character, LexerState>(){{
            put('u', lxState[5]);

            // rest is for state 8
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
            //put('u', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 5
        put(lxState[5], new HashMap<Character, LexerState>(){{
            put('t', lxState[6]);

            // rest for identifier
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
            //put('t', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 6
        put(lxState[6], new HashMap<Character, LexerState>(){{
            // only maps to state 8
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 7
        put(lxState[7], new HashMap<Character, LexerState>(){{
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
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 8
        put(lxState[8], new HashMap<Character, LexerState>(){{
            // maps to itself only
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 9
        put(lxState[9], new HashMap<Character, LexerState>(){{
            put('o', lxState[10]);
            put('l', lxState[12]);

            //rest maps to state 8
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
            //put('l', lxState[8]);
            put('m', lxState[8]);
            put('n', lxState[8]);
            //put('o', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 10
        put(lxState[10], new HashMap<Character, LexerState>(){{
            put('r', lxState[11]);

            // rest maps to state 8
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
            //put('r', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 11
        put(lxState[11], new HashMap<Character, LexerState>(){{
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
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 12
        put(lxState[12], new HashMap<Character, LexerState>(){{
            put('o', lxState[13]);

            // rest is state 8
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
            //put('o', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 13
        put(lxState[13], new HashMap<Character, LexerState>(){{
            put('a', lxState[14]);
            // rest is to state 8
            //put('a', lxState[8]);
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 14
        put(lxState[14], new HashMap<Character, LexerState>(){{
            put('t', lxState[15]);
            // rest is to state 8
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
            //put('t', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 15
        put(lxState[15], new HashMap<Character, LexerState>(){{
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 16
        put(lxState[16], new HashMap<Character, LexerState>(){{
            put('l', lxState[17]);
            put('o', lxState[20]);

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
            //put('l', lxState[8]);
            put('m', lxState[8]);
            put('n', lxState[8]);
            //put('o', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 17
        put(lxState[17], new HashMap<Character, LexerState>(){{
            put('s', lxState[18]);

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
            //put('s', lxState[8]);
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


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 18
        put(lxState[18], new HashMap<Character, LexerState>(){{
            put('e', lxState[19]);

            put('a', lxState[8]);
            put('b', lxState[8]);
            put('c', lxState[8]);
            put('d', lxState[8]);
            //put('e', lxState[8]);
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 19
        put(lxState[19], new HashMap<Character, LexerState>(){{
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

        }});



        ////////////////////////////////////////////////////////////////////            LEXERSTATE 20
        put(lxState[20], new HashMap<Character, LexerState>(){{
            put('f', lxState[55]);
            // rest is to state 8
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


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 55
        put(lxState[55], new HashMap<Character, LexerState>(){{
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
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 21
        put(lxState[21], new HashMap<Character, LexerState>(){{
            put('r', lxState[22]);
            // rest is to state 8
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
            //put('r', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 22
        put(lxState[22], new HashMap<Character, LexerState>(){{
            put('i', lxState[23]);
            // rest is to state 8
            put('a', lxState[8]);
            put('b', lxState[8]);
            put('c', lxState[8]);
            put('d', lxState[8]);
            put('e', lxState[8]);
            put('f', lxState[8]);
            put('g', lxState[8]);
            put('h', lxState[8]);
            //put('i', lxState[8]);
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 23
        put(lxState[23], new HashMap<Character, LexerState>(){{
            put('n', lxState[24]);
            // rest is to state 8
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 24
        put(lxState[24], new HashMap<Character, LexerState>(){{
            put('t', lxState[25]);
            // rest is to state 8
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
            //put('t', lxState[8]);
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 25
        put(lxState[25], new HashMap<Character, LexerState>(){{
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 26
        put(lxState[26], new HashMap<Character, LexerState>(){{
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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 27
        put(lxState[27], new HashMap<Character, LexerState>(){{
            put('+', lxState[28]);
            // rest  digits goes to 29

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

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 28
        put(lxState[28], new HashMap<Character, LexerState>(){{
           // no transition map for state 28
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 29
        put(lxState[29], new HashMap<Character, LexerState>(){{
            put('.', lxState[30]);
            // rest digit goes to itself
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
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 30
        put(lxState[30], new HashMap<Character, LexerState>(){{
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

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 31
        put(lxState[31], new HashMap<Character, LexerState>(){{
            put('-', lxState[32]);

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
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 32
        put(lxState[32], new HashMap<Character, LexerState>(){{
           // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 33
        put(lxState[33], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 34
        put(lxState[34], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 35
        put(lxState[35], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 36
        put(lxState[36], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 37
        put(lxState[37], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 38
        put(lxState[38], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 39
        put(lxState[39], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 40
        put(lxState[40], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 41
        put(lxState[41], new HashMap<Character, LexerState>(){{
            put('=', lxState[42]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 42
        put(lxState[42], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 43
        put(lxState[43], new HashMap<Character, LexerState>(){{
            put('=', lxState[44]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 44
        put(lxState[44], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 45
        put(lxState[45], new HashMap<Character, LexerState>(){{
            put('=', lxState[46]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 46
        put(lxState[46], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 47
        put(lxState[47], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 48
        put(lxState[48], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 49
        put(lxState[49], new HashMap<Character, LexerState>(){{
            put('&', lxState[50]);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 50
        put(lxState[50], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 51
        put(lxState[51], new HashMap<Character, LexerState>(){{
            put('|', lxState[52]);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 52
        put(lxState[52], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 53
        put(lxState[53], new HashMap<Character, LexerState>(){{
            put('=', lxState[54]);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 54
        put(lxState[54], new HashMap<Character, LexerState>(){{
            // no transitioin map as its an end state
        }});

    }};



    ////////////////////////////////////////////////////////////////////            LEXERSTATE 3
    /*

     ////////////////////////////////////////////////////////////////////            LEXERSTATE 13
        put(lxState[13], new HashMap<Character, LexerState>(){{
            put('a', lxState[14]);
            // rest is to state 8
        }});

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
