package parser.driver;

import nonterminal.NonTerminal;
import parser.ParsingException;
import parser.production.Production;
import terminal.Terminal;

import java.util.Map;

public class Driver {
    private Map<NonTerminal, Map<Terminal, Production>> map;
    public Production getProduction(NonTerminal nonTerminal, Terminal terminal) throws ParsingException {
        Production production = map.get(nonTerminal).get(terminal);

        // No production to satisfy the current Parser State
        if (production == null) {
            throw new ParsingException();
        }

        return production;
    }
}
