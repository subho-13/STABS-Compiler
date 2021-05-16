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

    private void setProduction6(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(6, production);
    }
    private void setProduction7(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.COMMA);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.PARAMETER);
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.OTHER_PARAMS);
            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(7, production);
    }

    private void setProduction8(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {

        });
        map.put(8, production);
    }

    private void setProduction10(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE_PART1);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.TYPE_PART2);

            parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(10, production);
    }
    private void setProduction11(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.INT);

            parserStack.push(stackSymbol1);
        });
        map.put(11, production);
    }
    private void setProduction12(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.FLOAT);

            parserStack.push(stackSymbol1);
        });
        map.put(12, production);
    }
    private void setProduction13(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.OPEN_SQUARE_BRACKET);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.INT_VAL);
            TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.CLOSE_SQUARE_BRACKET);
            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(13, production);
    }
    private void setProduction14(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {

        });
        map.put(14, production);
    }

    private void setProduction16(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.STATEMENT);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.SEMICOLON);
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.STATEMENTS);

            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(10, production);
    }


}
