package parser.production.builder.type2;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.identifier.SpecialTerminalStackSymbol;
import parser.production.type.type2.Production_Type2;
import parser.symboltable.SymbolTable;
import parser.symboltable.SymbolTableAction;
import terminal.Terminal;

import java.util.HashMap;
import java.util.Map;

public class Builder_Type2 {
    ParserStack stack;
    SymbolTable table;
    Map<Integer, Production_Type2> map = new HashMap<>();

    public Builder_Type2(ParserStack stack, SymbolTable table) {
        this.stack = stack;
        this.table = table;
    }

    private void setProduction4() {
        Production_Type2 production  = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.IDENTIFIER);

        });
    }

    private void setProduction9() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE);
            TerminalStackSymbol stackSymbol2 = new SpecialTerminalStackSymbol(
                    Terminal.IDENTIFIER, symbolTable, SymbolTableAction.ADD_IDENTIFIER);

            parserTable.push(stackSymbol1, stackSymbol2);
        });
    }
}