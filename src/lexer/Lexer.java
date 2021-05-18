package lexer;

import lexer.lexerstate.LexerState;
import lexer.scanner.Scanner;
import token.Token;

public class Lexer {
    private Token currentToken;
    private Scanner scanner;
    private LexerState startState;
    private boolean empty = false;

    public boolean isEmpty() {
        return empty;
    }

    public void parseNextToken() {
        if (scanner.isEOF()) {
            // Throw that lexer has no more tokens to return
        }

        String string = scanner.getCurrentString();

        LexerState currentState = startState;

        for(char c: string.toCharArray()) {
            currentState = currentState.move(c);
        }

        currentToken = currentState.getToken(string);

        if (scanner.isEOF()) {
            empty = true;
        }
    }

    public Token getCurrentToken() {
        return currentToken;
    }
}
