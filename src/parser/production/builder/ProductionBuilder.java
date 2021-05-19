package parser.production.builder;

import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.production.builder.type1.Builder_Type1;
import parser.production.builder.type2.Builder_Type2;
import parser.production.builder.type3.Builder_Type3;
import parser.production.type.type1.Production_Type1;
import parser.production.type.type2.Production_Type2;
import parser.production.type.type3.Production_Type3;
import parser.table.FunctionTable;
import parser.table.SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class ProductionBuilder {
    ParserStack parserStack;
    SymbolTable symbolTable;
    FunctionTable functionTable;

    Map<Integer, Production> map = new HashMap<>();

    private void initializeMap() {
        Builder_Type1 builder_type1 = new Builder_Type1(parserStack);
        Builder_Type2 builder_type2 = new Builder_Type2(parserStack, symbolTable);
        Builder_Type3 builder_type3 = new Builder_Type3(parserStack, functionTable);

        for(Map.Entry<Integer, Production_Type1> entry: builder_type1.getMap().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, Production_Type2> entry: builder_type2.getMap().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, Production_Type3> entry: builder_type3.getMap().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public ProductionBuilder(ParserStack parserStack, SymbolTable symbolTable, FunctionTable functionTable) {
        this.parserStack = parserStack;
        this.symbolTable = symbolTable;
        this.functionTable = functionTable;
        initializeMap();
    }

    public Production getProduction(int production_no) {
        Production production = map.get(production_no);
        assert production != null;
        return production;
    }
}
