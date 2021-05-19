package parser.production.type.type2;

import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.table.SymbolTable;

public class Production_Type2 implements Production {
    ParserStack stack;
    SymbolTable table;
    Type_2 action;

    public Production_Type2(ParserStack stack, SymbolTable table, Type_2 action) {
        this.stack = stack;
        this.table = table;
        this.action = action;
    }

    @Override
    public void applyRule() {
        action.use(stack, table);
    }
}
