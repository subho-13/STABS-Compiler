package parser.production;

import lexer.Lexer;
import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.symboltable.SymbolTable;
import terminal.Terminal;

import java.util.ArrayList;

public class Production_1 extends Production {

    public Production_1(final Lexer lexer, final ParserStack stack, final SymbolTable table) {
        super(lexer, stack, table);
    }

    @Override
    public void apply() {

    }
}
