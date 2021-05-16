package parser.production;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.symboltable.SymbolTable;

public interface Production {
    public void applyRule();
}
