package test.Scanner;

import lexer.Lexer;
import lexer.lexerstate.LexerStateBuilder;
import lexer.lexerstate.StateMapping;
import lexer.scanner.Scanner;

import java.io.File;

public class ScannerTest {
    public static  void main(String[] args) {
        File file = new File("src/test/testfiles/File1.stabs");
        try {
            Scanner scanner = new Scanner(file);
            LexerStateBuilder stateBuilder = new LexerStateBuilder(new StateMapping());
            Lexer lexer = new Lexer(scanner, stateBuilder);
//            while(!lexer.isEmpty()) {
//                lexer.parseNextToken();
//                System.out.println(lexer.getCurrentToken() + " " + lexer.getCurrentLineNum());
//            }

            while(!scanner.isEOF()) {
                System.out.println(scanner.getNextString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
