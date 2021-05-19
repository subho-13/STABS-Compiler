package parser.production.builder.type3;

import jdk.incubator.foreign.LibraryLookup;
import parser.parserstack.ParserStack;
import parser.production.type.type2.Production_Type2;
import parser.symboltable.SymbolTable;

import java.util.HashMap;

public class Builder_Type3 {
    private ParserStack stack;
    private FunctionTable table;
    private Map<Integer, Production_Type3> map = new HashMap<>();

    public Builder_Type3(ParserStack stack, SymbolTable table){
        this.stack = stack;
        this.table = table;
        setAllProductions();
    }

}
