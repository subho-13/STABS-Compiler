package parser.production.builder;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.production.Production;
import parser.symboltable.SymbolTable;

import java.util.Map;

public class ProductionBuilder {
    ParserStack parserStack;
    SymbolTable symbolTable;
    Map<Integer, Production> map;

    private void initializeMap() {

    }

    public ProductionBuilder(Lexer lexer, ParserStack parserStack, SymbolTable symbolTable) {
        this.parserStack = parserStack;
        this.symbolTable = symbolTable;

        initializeMap();
    }

    public Production getProduction(int production_no) throws Exception {
        Production production = map.get(production_no);

        if (production == null) {
            // Invalid production number
        }

        return production;
    }
}