package parser.production.type.type3;

import parser.Parser;
import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.symboltable.SymbolTable;
import parser.table.FunctionTable;

public class Production_Type3 implements Production {
    ParserStack stack;
    FunctionTable table;
    Type_3 action;

    public Production_Type3(ParserStack stack, FunctionTable table, Type_3 action){
        this.stack  = stack;
        this.table = table;
        this.action = action;
    }
    @Override
    public void applyRule(){
        action.use(stack, table);
    }


}
