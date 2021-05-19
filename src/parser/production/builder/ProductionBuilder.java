package parser.production.builder;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.production.builder.type1.Builder_Type1;
import parser.production.builder.type2.Builder_Type2;
import parser.production.type.type1.Production_Type1;
import parser.production.type.type2.Production_Type2;
import parser.symboltable.SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class ProductionBuilder {
    ParserStack parserStack;
    SymbolTable symbolTable;
    Map<Integer, Production> map = new HashMap<>();

    private void initializeMap() {
        Builder_Type1 builder_type1 = new Builder_Type1(parserStack);
        Builder_Type2 builder_type2 = new Builder_Type2(parserStack, symbolTable);

        for(Map.Entry<Integer, Production_Type1> entry: builder_type1.getMap().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, Production_Type2> entry: builder_type2.getMap().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Integer, Production> entry: map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().hashCode());
        }
    }

    public ProductionBuilder(ParserStack parserStack, SymbolTable symbolTable) {
        this.parserStack = parserStack;
        this.symbolTable = symbolTable;

        initializeMap();
    }

    public Production getProduction(int production_no) {
        Production production = map.get(production_no);

        if (production == null) {
            // Invalid production number
        }

        return production;
    }
}
