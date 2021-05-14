package parser;

import lexer.Lexer;
import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.StackSymbolType;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.production.Production;
import parser.symboltable.SymbolTable;
import terminal.Terminal;
import token.Token;

import java.util.Map;

public class Parser {
    ParserStack parserStack;
    Map<NonTerminal, Map<Terminal, Production>> driver;
    Lexer lexer;
    SymbolTable symbolTable;

    private boolean stopParser() {
        return lexer.isEmpty() && parserStack.isEmpty();
    }

    private void handleTerminalSymbol(StackSymbol symbol) {
        final TerminalStackSymbol terminalStackSymbol = (TerminalStackSymbol) symbol;
        final Token currentToken = lexer.getCurrentToken();

        if(terminalStackSymbol.getTerminal() == currentToken.getType()) {
            terminalStackSymbol.applySpecialAction(currentToken);
            lexer.parseNextToken();
        } else {
            // Do the error handling here
        }
    }

    private void handleNonTerminalSymbol(StackSymbol symbol) {
        NonTerminalStackSymbol nonTerminalStackSymbol = (NonTerminalStackSymbol) symbol;
        NonTerminal nonTerminal = nonTerminalStackSymbol.getNonTerminalType();

        Production production = driver.get(nonTerminal).get(lexer.getCurrentToken().getType());

        if(production == null) {
            // Error handling
        }

        production.apply();
    }

    public void parse() throws Exception {
        while(!stopParser()) {
            StackSymbol stackSymbol = parserStack.pop();

            if (stackSymbol.getType() == StackSymbolType.TERMINAL) {
                handleTerminalSymbol(stackSymbol);
            } else {
                handleNonTerminalSymbol(stackSymbol);
            }
        }
    }
}
