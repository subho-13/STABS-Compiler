package parser.production.type.type1;

import parser.parserstack.ParserStack;
import parser.production.Production;

public class Production_Type1 implements Production {
    ParserStack stack;
    Type_1 action;

    Production_Type1(ParserStack stack, Type_1 action) {
        this.stack = stack;
        this.action = action;
    }

    @Override
    public void applyRule() {
        action.use(stack);
    }
}
