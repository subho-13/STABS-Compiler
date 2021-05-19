package parser.parserstack.stacksymbol.terminal;

import parser.symboltable.SymbolTable;
import token.Token;

public interface TerminalStackSymbolAction {
    void apply(SymbolTable symbolTable, Token token) throws Exception;
}
