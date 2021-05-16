package parser.production.builder.type1;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.StackSymbol;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.production.Production;
import parser.production.type.type1.Production_Type1;
import terminal.Terminal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Builder_Type1 {
    ParserStack stack;
    Map<Integer, Production_Type1> map = new HashMap();

    public Builder_Type1(ParserStack stack) {
        this.stack = stack;
    }

    private void setProduction1() {
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTIONS);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.EOF);

            parserStack.push(stackSymbol1, stackSymbol2);
        });

        map.put(1, production);
    }

    private void setProduction2() {
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTION);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.FUNCTIONS);

            parserStack.push(stackSymbol1, stackSymbol2);
        });

        map.put(2, production);
    }

    private void setProduction3(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });

        map.put(3, production);
    }

    private void setProduction5(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.PARAMETER);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.OTHER_PARAMS);
            parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(5, production);
    }
}
