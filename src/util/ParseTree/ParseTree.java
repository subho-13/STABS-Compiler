package util.ParseTree;

import parser.parserstack.ParserStack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public void display() throws IOException {
        File file = new File("src/ParseTree.txt");
        FileWriter fileWriter = new FileWriter(file);
        printTree(root, new HashSet<>(), 0, false, fileWriter);
        fileWriter.close();
    }

    public void printTree(ParseNode root, Set<Integer> flag, int depth, boolean isLast, FileWriter writer) throws IOException {
        if (root == null) {
            return;
        }

        for (int i = 1; i < depth; ++i) {
            if (flag.contains(i)) {
                writer.write("| "
                        + " "
                        + " "
                        + " ");
            } else {
                writer.write(" "
                        + " "
                        + " "
                        + " ");
            }
        }

            if (depth == 0) {
                writer.write(root.getSymbol() + '\n');
            } else if (isLast) {
                writer.write("+--- " +  root.getSymbol() + '\n');
                flag.remove(depth);
            } else {
                writer.write("+--- " +  root.getSymbol() + '\n');
            }

            int it = 0;
            Queue<ParseNode> queue = root.getParseNodeQueue();
            for (ParseNode node : queue) {
                ++it;
                printTree(node, flag, depth + 1, it == (queue.size()) - 1, writer );
            }
        flag.add(depth);
    }
}
