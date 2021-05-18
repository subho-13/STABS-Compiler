package test.Scanner;

import lexer.scanner.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class ScannerTest {
    public static  void main(String[] args) {
        File file = new File("src/test/testfiles/File1.txt");
        try {
            Scanner scanner = new Scanner(file);

            while(!scanner.isEOF()) {
                System.out.println("->    " + scanner.constructNextString() +  " <-");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
