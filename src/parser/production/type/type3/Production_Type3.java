package parser.production.type.type3;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.symboltable.SymbolTable;

public class Production_Type3 implements Production {
    ParserStack stack;
    Lexer lexer;
    SymbolTable table;
    Type_3 action;

    public  Production_Type3(ParserStack stack, Lexer lexer, SymbolTable table, Type_3 action) {
        this.stack = stack;
        this.lexer = lexer;
        this.table = table;
        this.action = action;
    }

    @Override
    public void applyRule() {
        action.use(stack, lexer, table);
    }
}
