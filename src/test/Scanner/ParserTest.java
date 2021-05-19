package test.Scanner;

import lexer.Lexer;
import lexer.lexerstate.LexerStateBuilder;
import lexer.lexerstate.StateMapping;
import lexer.scanner.Scanner;
import parser.Parser;
import parser.driver.Driver;
import parser.parserstack.ParserStack;
import parser.production.builder.ProductionBuilder;
import parser.table.FunctionTable;
import parser.table.SymbolTable;
import parser.synchronizer.Synchronizer;
import util.ParseTree.ParseTree;

import java.io.File;

public class ParserTest {
    public static  void main(String[] args) {
        File file = new File("src/test/testfiles/File1.txt");
        try {
            Scanner scanner = new Scanner(file);
            LexerStateBuilder stateBuilder = new LexerStateBuilder(new StateMapping());
            Lexer lexer = new Lexer(scanner, stateBuilder);
            SymbolTable symbolTable = new SymbolTable();
            FunctionTable functionTable = new FunctionTable();
            ParseTree parseTree = new ParseTree();
            ParserStack parserStack = new ParserStack(parseTree);
            ProductionBuilder productionBuilder = new ProductionBuilder(parserStack, symbolTable, functionTable);
            Driver driver = new Driver(productionBuilder);
            Synchronizer synchronizer = new Synchronizer();
            Parser parser = new Parser(parserStack, lexer, driver, synchronizer);
            parser.parse();
            if (functionTable.hasUnresolvedFunctionNames()) {
                throw new Exception("The following functions are unresolved :: " + functionTable.unresolvedFunctionNames());
            }
            parseTree.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
