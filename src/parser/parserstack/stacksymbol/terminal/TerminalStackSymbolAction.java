package parser.parserstack.stacksymbol.terminal;

import parser.table.SymbolTable;
import token.Token;

public interface TerminalStackSymbolAction<T> {
    void apply(T Table, Token token) throws Exception;
}
