package lexer;

import lexer.scanner.Scanner;
import token.Token;

public class Lexer {
    private Token currentToken;
    private Scanner scanner;

    public void parseNextToken() {

    }

    public Token getCurrentToken() {
        return currentToken;
    }

    public boolean isEmpty() {
        return scanner.hasNoString();
    }
}
