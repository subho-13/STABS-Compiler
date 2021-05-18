package parser.synchronizer;

import nonterminal.NonTerminal;
import terminal.Terminal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Synchronizer {
    Map<NonTerminal, Set<Terminal>> map = new HashMap<>();

    private void configurePROGRAM() {
        map.put(NonTerminal.PROGRAM, new HashSet<>());

    }
}
