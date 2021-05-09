package parser.production;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.symboltable.SymbolTable;

public abstract class Production {
    protected Lexer lexer;
    protected ParserStack stack;
    protected SymbolTable table;

    public Production(Lexer lexer, ParserStack stack, SymbolTable table) {
        this.lexer = lexer;
        this.stack = stack;
        this.table = table;
    }
    public abstract  void apply();
}
