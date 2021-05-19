package util.ParseTree;

import parser.Parser;

import java.util.LinkedList;
import java.util.Queue;

public class ParseNode {
    private String symbol;
    private Queue<ParseNode> parseNodeQueue = new LinkedList<>();

    public Queue<ParseNode> getParseNodeQueue() {
        return parseNodeQueue;
    }

    public void addNextParseNode(ParseNode parseNode) {
        parseNodeQueue.add(parseNode);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(final String symbol) {
        this.symbol = symbol;
    }
}
