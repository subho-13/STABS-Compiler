package parser.production.builder.type3;

import jdk.incubator.foreign.LibraryLookup;
import parser.parserstack.ParserStack;
import parser.production.type.type2.Production_Type2;
import parser.production.type.type3.Production_Type3;
import parser.table.FunctionTable;

import java.util.HashMap;
import java.util.Map;

public class Builder_Type3 {
    private ParserStack stack;
    private FunctionTable table;
    private Map<Integer, Production_Type3> map = new HashMap<>();

    public Builder_Type3(ParserStack stack, FunctionTable table){
        this.stack = stack;
        this.table = table;
        setAllProductions();
    }

}
