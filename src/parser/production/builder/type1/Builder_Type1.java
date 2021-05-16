package parser.production.builder.type1;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.production.Production;
import parser.production.type.type1.Production_Type1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Builder_Type1 {
    ParserStack stack;
    Map<Integer, Production_Type1> map = new HashMap();

    public Builder_Type1(ParserStack stack) {
        this.stack = stack;
    }

    private void insertIntoMap(int production_no, Production_Type1 production) {
        map.put(production_no, production);
    }

    private void setProduction2() {
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTION);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.FUNCTIONS);

            stack.push(stackSymbol1, stackSymbol2);
        });

        insertIntoMap(2, production);
    }


}
