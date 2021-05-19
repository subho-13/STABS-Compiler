package util.ParseTree;

import parser.parserstack.ParserStack;

import java.util.*;

public class ParseTree {
    ParseNode root = new ParseNode("Root");
    ParseNode lastAccessed = root;
    Stack<ParseNode> stackNodes = new Stack<>();

    public void notifyPush(List<String> symbols) {
        ArrayList<ParseNode> nodes = new ArrayList<>();
        for(String symbol: symbols) {
            nodes.add(new ParseNode(symbol));
        }

        for(ParseNode node: nodes) {
            lastAccessed.addNextParseNode(node);
        }

        Collections.reverse(nodes);

        for(ParseNode node: nodes) {
            stackNodes.push(node);
        }
    }

    public void notifyPop() {
        lastAccessed = stackNodes.pop();
    }

    public ParseNode getRoot() {
        return root;
    }

    public void display() {
        printTree(root, new HashSet<>(), 0, false);
    }

    public void printTree(ParseNode root, Set<Integer> flag, int depth, boolean isLast) {
        if (root == null) {
            return;
        }

        for (int i = 1; i < depth; ++i) {
            if (flag.contains(i)) {
                System.out.print("  "
                        + " "
                        + " "
                        + " ");
            } else {
                System.out.print("| "
                        + " "
                        + " "
                        + " ");
            }
        }

            if (depth == 0) {
                System.out.println(root.getSymbol());
            } else if (isLast) {
                System.out.print("+--- " +  root.getSymbol() + '\n');
                flag.remove(depth);
            } else {
                System.out.print("+--- " +  root.getSymbol() + '\n');
            }

            int it = 0;
            Queue<ParseNode> queue = root.getParseNodeQueue();
            for (ParseNode node : queue) {
                ++it;
                printTree(node, flag, depth + 1, it == (queue.size()) - 1 );
            }
        flag.add(depth);
    }
}
