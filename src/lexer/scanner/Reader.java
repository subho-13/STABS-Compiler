package lexer.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reader {
    Scanner scanner;
    char lookahead;
    Set<Character> escapeCharacters;
    String currentString;

    public Reader(File file) throws FileNotFoundException {
        this.scanner = new Scanner(file);
    }

    private String constructNewString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (scanner.hasNext()) {
            while(true) {
                lookahead = scanner.next().charAt(0);
                if (escapeCharacters.contains(lookahead)) {

                }
            }
        }

        return stringBuilder.toString();
    }

    public void constructNextString() {
        String string;
        if(lookahead == '\0') {
            string = constructNewString();
        } else {
            string = "" + lookahead;
            lookahead = '\0';
        }
    }

    public String getCurrentString() {
        return currentString;
    }
}
