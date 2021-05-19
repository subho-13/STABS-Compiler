package parser.production.builder.type2;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.SpecialTerminalStackSymbol;
import parser.production.type.type2.Production_Type2;
import parser.table.SymbolTable;
import terminal.Terminal;
import token.valuedtoken.IdentifierToken;

import java.util.HashMap;
import java.util.Map;

public class Builder_Type2 {
    private  ParserStack stack;
    private  SymbolTable table;
    private  Map<Integer, Production_Type2> map = new HashMap<>();

    public Builder_Type2(ParserStack stack, SymbolTable table) {
        this.stack = stack;
        this.table = table;
        setAllProductions();
    }

    public Map<Integer, Production_Type2> getMap() {
        return map;
    }

    private void setAllProductions() {
        setProduction9();
        setProduction15();
        setProduction29();
        setProduction30();
        setProduction33();
    }

    private void setProduction9() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE);

            TerminalStackSymbol stackSymbol2 = new SpecialTerminalStackSymbol<>(Terminal.IDENTIFIER, symbolTable, (table, token) -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                String value = identifierToken.getValue();
                if (table.checkInFutureScope(value)) {
                    throw new Exception(value + " already present as a parameter");
                } else {
                    table.addToFutureScope(identifierToken.getValue());
                }
            });

            parserTable.push(stackSymbol1, stackSymbol2);
        });

        map.put(9, production);
    }

    private void setProduction15() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            TerminalStackSymbol stackSymbol1 = new SpecialTerminalStackSymbol<SymbolTable>(Terminal.LEFT_CURLY, symbolTable, (table, token) -> {
               table.incrementScope();
            });

            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.STATEMENTS);

            TerminalStackSymbol stackSymbol3 = new SpecialTerminalStackSymbol<>(Terminal.RIGHT_CURLY, symbolTable, (table, token) -> {
                table.decrementScope();
            });

            parserTable.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });

        map.put(15, production);
    }

    private void setProduction29() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            TerminalStackSymbol stackSymbol1 = new SpecialTerminalStackSymbol<SymbolTable>(Terminal.IDENTIFIER, symbolTable, (table, token) -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                String value = identifierToken.getValue();
                if (table.checkInCurrentScope(value) == true) {
                    throw new Exception("Identifier " + value + " present in current scope");
                } else {
                    table.addToCurrentScope(value);
                }
            });
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.OTHER_IDS);

            parserTable.push(stackSymbol1, stackSymbol2);
        });

        map.put(29, production);
    }

    private void setProduction30() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.COMMA);
            TerminalStackSymbol stackSymbol2 = new SpecialTerminalStackSymbol<SymbolTable>(Terminal.IDENTIFIER, symbolTable, (table, token) -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                String value = identifierToken.getValue();
                if (table.checkInCurrentScope(value)) {
                    throw new Exception("Identifier " + value + " present in current scope");
                } else {
                    table.addToCurrentScope(value);
                }
            });
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.OTHER_IDS);

            parserTable.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });

        map.put(30, production);
    }

    private void setProduction33() {
        Production_Type2 production = new Production_Type2(stack, table, (parserTable, symbolTable) -> {
            TerminalStackSymbol stackSymbol1 = new SpecialTerminalStackSymbol<SymbolTable>(Terminal.IDENTIFIER, symbolTable, (table, token) -> {
                IdentifierToken identifierToken = (IdentifierToken) token;
                String value = identifierToken.getValue();

                if (!table.checkInAllScopes(value)) {
                    throw new Exception("Identifier " + value + " not present in scope");
                }
            });

            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.VARIABLE_OPT);

            parserTable.push(stackSymbol1, stackSymbol2);
        });

        map.put(33, production);
    }
}