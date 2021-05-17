package lexer.lexerstate;

import java.util.HashMap;
import java.util.Map;

public class StateMapping {
    public Map<Character, Integer> getMappingForState(Integer i) {
        return stateMap.get(i);
    }

    private Map<Integer, Map<Character, Integer>> stateMap = new HashMap<>(){{
        ////////////////////////////////////////////////////////////////////            LEXERSTATE 0
        put(0, new HashMap<Character, Integer>(){{
            put('i', 1);
            put('f', 9);
            put('e', 16);
            put('p', 21);


            // any other letter except i, f,e,p -> goes to state 26
            put('a', 26);
            put('b', 26);
            put('c', 26);
            put('d', 26);
            //put('e', 26);
            //put('f', 26);
            put('g', 26);
            put('h', 26);
            //put('i', 26);
            put('j', 26);
            put('k', 26);
            put('l', 26);
            put('m', 26);
            put('n', 26);
            put('o', 26);
            //put('p', 26);
            put('q', 26);
            put('r', 26);
            put('s', 26);
            put('t', 26);
            put('u', 26);
            put('v', 26);
            put('w', 26);
            put('x', 26);
            put('y', 26);
            put('z', 26);


            put('A', 26);
            put('B', 26);
            put('C', 26);
            put('D', 26);
            put('E', 26);
            put('F', 26);
            put('G', 26);
            put('H', 26);
            put('I', 26);
            put('J', 26);
            put('K', 26);
            put('L', 26);
            put('M', 26);
            put('N', 26);
            put('O', 26);
            put('P', 26);
            put('Q', 26);
            put('R', 26);
            put('S', 26);
            put('T', 26);
            put('U', 26);
            put('V', 26);
            put('W', 26);
            put('X', 26);
            put('Y', 26);
            put('Z', 26);


            put('+', 27);


            // need to map any digit to it -> goes to state 29
            put('0', 29);
            put('1', 29);
            put('2', 29);
            put('3', 29);
            put('4', 29);
            put('5', 29);
            put('6', 29);
            put('7', 29);
            put('8', 29);
            put('9', 29);

            // rest
            put('-', 31);
            put(',', 33);
            put(';', 34);
            put(']', 35);
            put('[', 36);
            put('{', 37);
            put('}', 38);
            put('(', 39);
            put(')', 40);
            put('=', 41);
            put('<', 43);
            put('>', 45);
            put('*', 47);
            put('/', 48);
            put('&', 49);
            put('|', 51);
            put('!', 53);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 1
        put(1, new HashMap<Character, Integer>(){{

            put('f', 2);
            put('n', 3);

            // anything other than f or n maps to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            //put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            //put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 2

        put(2, new HashMap<Character, Integer>(){{

            // any char maps to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 3
        put(3, new HashMap<Character, Integer>(){{

            put('p', 4);
            put('t', 7);

            // rest is for identifier
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            //put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            //put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 4
        put(4, new HashMap<Character, Integer>(){{
            put('u', 5);

            // rest is for state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            //put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 5
        put(5, new HashMap<Character, Integer>(){{
            put('t', 6);

            // rest for identifier
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            //put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 6
        put(6, new HashMap<Character, Integer>(){{
            // only maps to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 7
        put(7, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 8
        put(8, new HashMap<Character, Integer>(){{
            // maps to itself only
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 9
        put(9, new HashMap<Character, Integer>(){{
            put('o', 10);
            put('l', 12);

            //rest maps to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            //put('l', 8);
            put('m', 8);
            put('n', 8);
            //put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 10
        put(10, new HashMap<Character, Integer>(){{
            put('r', 11);

            // rest maps to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            //put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 11
        put(11, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 12
        put(12, new HashMap<Character, Integer>(){{
            put('o', 13);

            // rest is state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            //put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 13
        put(13, new HashMap<Character, Integer>(){{
            put('a', 14);
            // rest is to state 8
            //put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 14
        put(14, new HashMap<Character, Integer>(){{
            put('t', 15);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            //put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 15
        put(15, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 16
        put(16, new HashMap<Character, Integer>(){{
            put('l', 17);
            put('o', 20);

            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            //put('l', 8);
            put('m', 8);
            put('n', 8);
            //put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 17
        put(17, new HashMap<Character, Integer>(){{
            put('s', 18);

            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            //put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});


        ////////////////////////////////////////////////////////////////////            LEXERSTATE 18
        put(18, new HashMap<Character, Integer>(){{
            put('e', 19);

            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            //put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 19
        put(19, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});



        ////////////////////////////////////////////////////////////////////            LEXERSTATE 20
        put(20, new HashMap<Character, Integer>(){{
            put('f', 55);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            //put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 55
        put(55, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 21
        put(21, new HashMap<Character, Integer>(){{
            put('r', 22);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            //put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);


        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 22
        put(22, new HashMap<Character, Integer>(){{
            put('i', 23);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            //put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 23
        put(23, new HashMap<Character, Integer>(){{
            put('n', 24);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            //put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 24
        put(24, new HashMap<Character, Integer>(){{
            put('t', 25);
            // rest is to state 8
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            //put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 25
        put(25, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 26
        put(26, new HashMap<Character, Integer>(){{
            put('a', 8);
            put('b', 8);
            put('c', 8);
            put('d', 8);
            put('e', 8);
            put('f', 8);
            put('g', 8);
            put('h', 8);
            put('i', 8);
            put('j', 8);
            put('k', 8);
            put('l', 8);
            put('m', 8);
            put('n', 8);
            put('o', 8);
            put('p', 8);
            put('q', 8);
            put('r', 8);
            put('s', 8);
            put('t', 8);
            put('u', 8);
            put('v', 8);
            put('w', 8);
            put('x', 8);
            put('y', 8);
            put('z', 8);


            put('A', 8);
            put('B', 8);
            put('C', 8);
            put('D', 8);
            put('E', 8);
            put('F', 8);
            put('G', 8);
            put('H', 8);
            put('I', 8);
            put('J', 8);
            put('K', 8);
            put('L', 8);
            put('M', 8);
            put('N', 8);
            put('O', 8);
            put('P', 8);
            put('Q', 8);
            put('R', 8);
            put('S', 8);
            put('T', 8);
            put('U', 8);
            put('V', 8);
            put('W', 8);
            put('X', 8);
            put('Y', 8);
            put('Z', 8);


            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 27
        put(27, new HashMap<Character, Integer>(){{
            put('+', 28);
            // rest  digits goes to 29

            put('0', 29);
            put('1', 29);
            put('2', 29);
            put('3', 29);
            put('4', 29);
            put('5', 29);
            put('6', 29);
            put('7', 29);
            put('8', 29);
            put('9', 29);

        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 28
        put(28, new HashMap<Character, Integer>(){{
            // no transition map for state 28
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 29
        put(29, new HashMap<Character, Integer>(){{
            put('.', 30);
            // rest digit goes to itself
            put('0', 29);
            put('1', 29);
            put('2', 29);
            put('3', 29);
            put('4', 29);
            put('5', 29);
            put('6', 29);
            put('7', 29);
            put('8', 29);
            put('9', 29);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 30
        put(30, new HashMap<Character, Integer>(){{
            put('0', 8);
            put('1', 8);
            put('2', 8);
            put('3', 8);
            put('4', 8);
            put('5', 8);
            put('6', 8);
            put('7', 8);
            put('8', 8);
            put('9', 8);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 31
        put(31, new HashMap<Character, Integer>(){{
            put('-', 32);

            put('0', 29);
            put('1', 29);
            put('2', 29);
            put('3', 29);
            put('4', 29);
            put('5', 29);
            put('6', 29);
            put('7', 29);
            put('8', 29);
            put('9', 29);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 32
        put(32, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 33
        put(33, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 34
        put(34, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 35
        put(35, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 36
        put(36, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 37
        put(37, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 38
        put(38, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 39
        put(39, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 40
        put(40, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 41
        put(41, new HashMap<Character, Integer>(){{
            put('=', 42);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 42
        put(42, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 43
        put(43, new HashMap<Character, Integer>(){{
            put('=', 44);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 44
        put(44, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 45
        put(45, new HashMap<Character, Integer>(){{
            put('=', 46);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 46
        put(46, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 47
        put(47, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 48
        put(48, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 49
        put(49, new HashMap<Character, Integer>(){{
            put('&', 50);
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 50
        put(50, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 51
        put(51, new HashMap<Character, Integer>(){{
            put('|', 52);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 52
        put(52, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 53
        put(53, new HashMap<Character, Integer>(){{
            put('=', 54);
            // rest is to state 8
        }});

        ////////////////////////////////////////////////////////////////////            LEXERSTATE 54
        put(54, new HashMap<Character, Integer>(){{
            // no transitioin map as its an end state
        }});

    }};
}
