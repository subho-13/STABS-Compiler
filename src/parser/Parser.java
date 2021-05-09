package parser;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.production.Production;
import terminal.Terminal;

import java.util.Map;

public class Parser {
    ParserStack parserStack;
    Map<NonTerminal, Map<Terminal, Production>> driver;

}
