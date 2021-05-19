package lexer;

import lexer.lexerstate.LexerState;
import lexer.lexerstate.LexerStateBuilder;
import lexer.scanner.Scanner;
import token.Token;

import java.io.IOException;

public class Lexer {
    private Token currentToken;
    private Scanner scanner;
    private LexerState startState;
    private boolean empty = false;

    public Lexer(Scanner scanner, LexerStateBuilder builder) {
        this.scanner = scanner;
        this.startState = builder.getStartState();
    }

    public boolean isEmpty() {
        return empty;
    }

    public void parseNextToken() throws IOException {
        if (empty == true) {
            // Throw exception saying my Lexer is empty
        }

        String string = scanner.getNextString();
        if (scanner.isEOF()) {
            empty = true;
        }

        LexerState currentState = startState;
        System.out.println(string);

        for(char c: string.toCharArray()) {
            currentState = currentState.move(c);
        }

        currentToken = currentState.getToken(string);
    }

    public Token getCurrentToken() {
        return currentToken;
    }
}
