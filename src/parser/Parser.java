package parser;

import lexer.Lexer;
import nonterminal.NonTerminal;
import parser.driver.Driver;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.StackSymbolType;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.production.Production;
import parser.symboltable.SymbolTable;
import parser.synchronizer.Synchronizer;
import terminal.Terminal;
import token.Token;

import java.io.IOException;
import java.util.Map;

public class Parser {
    ParserStack parserStack;
    Driver driver;
    Lexer lexer;
    SymbolTable symbolTable;
    Synchronizer synchronizer;

    public Parser(ParserStack parserStack, Lexer lexer, SymbolTable symbolTable, Driver driver, Synchronizer synchronizer) throws Exception {
        this.parserStack = parserStack;
        this.lexer = lexer;
        this.symbolTable = symbolTable;
        this.driver = driver;
        this.synchronizer = synchronizer;

        initializeParser();
    }

    private void initializeParser() throws Exception {
        NonTerminalStackSymbol nonTerminalStackSymbol = new NonTerminalStackSymbol(NonTerminal.PROGRAM);
        parserStack.push(nonTerminalStackSymbol);
        lexer.parseNextToken();
    }

    private boolean stopParser() {
        return lexer.isEmpty() && parserStack.isEmpty();
    }

    private void handleSymbol(TerminalStackSymbol symbol) throws IOException {
        final Token currentToken = lexer.getCurrentToken();

        if(symbol.getTerminal() == currentToken.getType()) {
            symbol.applySpecialAction(currentToken);
            lexer.parseNextToken();
        } else {
            // handle error
        }
    }

    private void handleSymbol(NonTerminalStackSymbol symbol) {
        NonTerminal nonTerminal = symbol.getNonTerminalType();
        Terminal terminal = lexer.getCurrentToken().getType();
        Production production = driver.getProduction(nonTerminal, terminal);

        if(production == null) {
            // Error handling // Panic Mode Error recovery
        }

        production.applyRule();
    }

    public void parse() throws Exception {
        while(!stopParser()) {
            StackSymbol stackSymbol = parserStack.pop();

            if (stackSymbol.getType() == StackSymbolType.TERMINAL) {
                handleSymbol((TerminalStackSymbol) stackSymbol);
            } else {
                handleSymbol((NonTerminalStackSymbol) stackSymbol);
            }
        }
    }
}
