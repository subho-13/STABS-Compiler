package test.Scanner;

import lexer.Lexer;
import lexer.lexerstate.LexerState;
import lexer.lexerstate.LexerStateBuilder;
import lexer.lexerstate.StateMapping;
import lexer.scanner.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class ScannerTest {
    public static  void main(String[] args) {
        File file = new File("src/test/testfiles/File1.txt");
        try {
            Scanner scanner = new Scanner(file);
            LexerStateBuilder stateBuilder = new LexerStateBuilder(new StateMapping());
            Lexer lexer = new Lexer(scanner, stateBuilder);

            while(!scanner.isEOF()) {
                lexer.parseNextToken();
                System.out.println(lexer.getCurrentToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
