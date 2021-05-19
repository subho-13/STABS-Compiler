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
import parser.table.SymbolTable;
import parser.synchronizer.Synchronizer;
import terminal.Terminal;
import token.Token;

public class Parser {
    ParserStack parserStack;
    Driver driver;
    Lexer lexer;
    Synchronizer synchronizer;

    public Parser(ParserStack parserStack, Lexer lexer, Driver driver, Synchronizer synchronizer) throws Exception {
        this.parserStack = parserStack;
        this.lexer = lexer;
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

    private void handleSymbol(TerminalStackSymbol symbol) throws Exception {
        final Token currentToken = lexer.getCurrentToken();

        if(symbol.getTerminal() == currentToken.getType()) {
            try {
                symbol.applySpecialAction(currentToken);
            } catch (Exception exception) {
                String errorStmt = exception.getMessage() + "\n";
                errorStmt += "Error in line " + lexer.getCurrentLineNum() + " around " + lexer.getCurrentPosInLine() + "th character";
                throw new Exception(errorStmt);
            }
            if (!lexer.isEmpty()) {
                lexer.parseNextToken();
            }
        }
    }

    private void handleSymbol(NonTerminalStackSymbol symbol) throws Exception {
        NonTerminal nonTerminal = symbol.getNonTerminalType();
        Terminal terminal = lexer.getCurrentToken().getType();
        Production production = driver.getProduction(nonTerminal, terminal);

        if(production == null) {
            String errorStmt = "Error in line " + lexer.getCurrentLineNum() + " around " + lexer.getCurrentPosInLine() + "th character\n";
            errorStmt += "Expected Set of Terminals :: " + synchronizer.getTerminals(nonTerminal);
            throw new Exception(errorStmt);
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
