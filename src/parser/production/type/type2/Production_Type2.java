package parser.production.type.type2;

import lexer.Lexer;
import parser.parserstack.ParserStack;
import parser.production.Production;

public class Production_Type2 implements Production {
    ParserStack stack;
    Lexer lexer;
    Type_2 action;

    public Production_Type2(ParserStack stack, Lexer lexer, Type_2 action) {
        this.stack = stack;
        this.lexer = lexer;
        this.action = action;
    }

    @Override
    public void applyRule() {
        action.use(stack, lexer);
    }
}
