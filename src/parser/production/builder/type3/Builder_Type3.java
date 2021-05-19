package parser.production.builder.type3;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.SpecialTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.production.type.type2.Production_Type2;
import parser.production.type.type3.Production_Type3;
import parser.table.FunctionTable;
import terminal.Terminal;
import token.Token;
import token.valuedtoken.IdentifierToken;

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

    private void setAllProductions() {

    }

    private void setProduction4() {
        Production_Type3 production = new Production_Type3(stack, table, (parserStack, functionTable) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE);
            TerminalStackSymbol stackSymbol2 = new SpecialTerminalStackSymbol<>(Terminal.IDENTIFIER, functionTable, (table, token) -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                String value = identifierToken.getValue();
                if(table.checkFunctionName(value)) {
                    throw new Exception("Function " + value + " is already defined.");
                } else {
                    table.addFunctionName(value);
                }
            });

            TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.LEFT_PARA);
            NonTerminalStackSymbol stackSymbol4 = new NonTerminalStackSymbol(NonTerminal.PARAMETERS);
            TerminalStackSymbol stackSymbol5 = new TerminalStackSymbol(Terminal.RIGHT_PARA);
            NonTerminalStackSymbol stackSymbol6 = new NonTerminalStackSymbol(NonTerminal.BLOCK);

            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3, stackSymbol4, stackSymbol5, stackSymbol6);
        });
        map.put(4, production);
    }

}
