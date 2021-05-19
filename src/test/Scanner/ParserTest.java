package test.Scanner;

import lexer.Lexer;
import lexer.lexerstate.LexerStateBuilder;
import lexer.lexerstate.StateMapping;
import lexer.scanner.Scanner;
import parser.Parser;
import parser.driver.Driver;
import parser.parserstack.ParserStack;
import parser.production.builder.ProductionBuilder;
import parser.symboltable.SymbolTable;
import parser.synchronizer.Synchronizer;

import java.io.File;

public class ParserTest {
    public static  void main(String[] args) {
        File file = new File("src/test/testfiles/File1.txt");
        try {
            Scanner scanner = new Scanner(file);
            LexerStateBuilder stateBuilder = new LexerStateBuilder(new StateMapping());
            Lexer lexer = new Lexer(scanner, stateBuilder);
            SymbolTable symbolTable = new SymbolTable();
            ParserStack parserStack = new ParserStack();
            ProductionBuilder productionBuilder = new ProductionBuilder(parserStack, symbolTable);
            System.out.println(productionBuilder.getProduction(4));
            Driver driver = new Driver(productionBuilder);
            Synchronizer synchronizer = new Synchronizer();
            Parser parser = new Parser(parserStack, lexer, symbolTable, driver, synchronizer);
            parser.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
