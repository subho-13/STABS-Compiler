package parser.driver;

import nonterminal.NonTerminal;
import parser.ParsingException;
import parser.production.Production;
import parser.production.builder.ProductionBuilder;
import terminal.Terminal;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    private Map<NonTerminal, Map<Terminal, Production>> map = new HashMap<>();
    private ProductionBuilder productionBuilder;

    public Driver(ProductionBuilder productionBuilder) {
        this.productionBuilder = productionBuilder;
    }

    public Production getProduction(NonTerminal nonTerminal, Terminal terminal)  {
        Production production = map.get(nonTerminal).get(terminal);

        if (production == null) {
            // Throw some error
        }

        return production;
    }

    private void addMappingForPROGRAM(){
        map.put(NonTerminal.PROGRAM, new HashMap<Terminal, Production>());
        map.get(NonTerminal.PROGRAM).put(Terminal.EOF, productionBuilder.getProduction(1));
        map.get(NonTerminal.PROGRAM).put(Terminal.INT, productionBuilder.getProduction(1));
        map.get(NonTerminal.PROGRAM).put(Terminal.FLOAT, productionBuilder.getProduction(1));
    }

    private void addMappingForFUNCTIONS(){
        map.put(NonTerminal.FUNCTIONS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.FUNCTIONS).put(Terminal.INT, productionBuilder.getProduction(2));
        map.get(NonTerminal.FUNCTIONS).put(Terminal.FLOAT, productionBuilder.getProduction(2));
        map.get(NonTerminal.FUNCTIONS).put(Terminal.EOF, productionBuilder.getProduction(3));
    }

    private void addMappingForFUNCTION(){
        map.put(NonTerminal.FUNCTION, new HashMap<Terminal, Production>());
        map.get(NonTerminal.FUNCTION).put(Terminal.INT, productionBuilder.getProduction(4));
        map.get(NonTerminal.FUNCTION).put(Terminal.FLOAT, productionBuilder.getProduction(4));
    }

    private void addMappingForPARAMETERS(){
        map.put(NonTerminal.PARAMETERS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.PARAMETERS).put(Terminal.INT, productionBuilder.getProduction(5));
        map.get(NonTerminal.PARAMETERS).put(Terminal.FLOAT, productionBuilder.getProduction(5));
        map.get(NonTerminal.PARAMETERS).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(6));
    }

    private void addMappingForOTHER_PARAMS(){
        map.put(NonTerminal.OTHER_PARAMS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.OTHER_PARAMS).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(8));
        map.get(NonTerminal.OTHER_PARAMS).put(Terminal.COMMA, productionBuilder.getProduction(7));
    }

    private void addMappingForPARAMETER(){
        map.put(NonTerminal.PARAMETER, new HashMap<Terminal, Production>());
        map.get(NonTerminal.PARAMETER).put(Terminal.INT, productionBuilder.getProduction(9));
        map.get(NonTerminal.PARAMETER).put(Terminal.FLOAT, productionBuilder.getProduction(9));
    }

    private void addMappingForTYPE(){
        map.put(NonTerminal.TYPE, new HashMap<Terminal, Production>());
        map.get(NonTerminal.TYPE).put(Terminal.INT, productionBuilder.getProduction(10));
        map.get(NonTerminal.TYPE).put(Terminal.FLOAT, productionBuilder.getProduction(10));
    }

    private void addMappingForTYPE_PART_1(){
        map.put(NonTerminal.TYPE_PART_1, new HashMap<Terminal, Production>());
        map.get(NonTerminal.TYPE_PART_1).put(Terminal.INT, productionBuilder.getProduction(11));
        map.get(NonTerminal.TYPE_PART_1).put(Terminal.FLOAT, productionBuilder.getProduction(12));
    }

    private void addMappingForTYPE_PART_2(){
        map.put(NonTerminal.TYPE_PART_2, new HashMap<Terminal, Production>());
        map.get(NonTerminal.TYPE_PART_2).put(Terminal.LEFT_SQ, productionBuilder.getProduction(13));
        map.get(NonTerminal.TYPE_PART_2).put(Terminal.IDENTIFIER, productionBuilder.getProduction(14));
    }

    private void addMappingForBLOCK(){
        map.put(NonTerminal.BLOCK, new HashMap<Terminal, Production>());
        map.get(NonTerminal.BLOCK).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(15));
    }

    private void addMappingForSTATEMENTS(){
        map.put(NonTerminal.STATEMENTS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.STATEMENTS).put(Terminal.INCREMENT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.DECREMENT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.LEFT_PARA, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.INT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.FLOAT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.PRINT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.INPUT, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.IDENTIFIER, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.RETURN, productionBuilder.getProduction(16));
        map.get(NonTerminal.STATEMENTS).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(17));
        map.get(NonTerminal.STATEMENTS).put(Terminal.IF, productionBuilder.getProduction(17));
        map.get(NonTerminal.STATEMENTS).put(Terminal.FOR, productionBuilder.getProduction(17));
        map.get(NonTerminal.STATEMENTS).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(18));
    }

    private void addMappingForSTATEMENT(){
        map.put(NonTerminal.STATEMENT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.STATEMENT).put(Terminal.INT, productionBuilder.getProduction(19));
        map.get(NonTerminal.STATEMENT).put(Terminal.FLOAT, productionBuilder.getProduction(19));
        map.get(NonTerminal.STATEMENT).put(Terminal.IDENTIFIER, productionBuilder.getProduction(20));
        map.get(NonTerminal.STATEMENT).put(Terminal.INCREMENT, productionBuilder.getProduction(21));
        map.get(NonTerminal.STATEMENT).put(Terminal.DECREMENT, productionBuilder.getProduction(21));
        map.get(NonTerminal.STATEMENT).put(Terminal.PRINT, productionBuilder.getProduction(22));
        map.get(NonTerminal.STATEMENT).put(Terminal.INPUT, productionBuilder.getProduction(22));
        map.get(NonTerminal.STATEMENT).put(Terminal.RETURN, productionBuilder.getProduction(23));
        map.get(NonTerminal.STATEMENT).put(Terminal.LEFT_PARA, productionBuilder.getProduction(24));
    }

    private void addMappingForCOMPOUND_STMT(){
        map.put(NonTerminal.COMPOUND_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.COMPOUND_STMT).put(Terminal.IF, productionBuilder.getProduction(25));
        map.get(NonTerminal.COMPOUND_STMT).put(Terminal.FOR, productionBuilder.getProduction(26));
        map.get(NonTerminal.COMPOUND_STMT).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(27));
    }

    private void addMappingForDECLARATION(){
        map.put(NonTerminal.DECLARATION, new HashMap<Terminal, Production>());
        map.get(NonTerminal.DECLARATION).put(Terminal.FLOAT, productionBuilder.getProduction(28));
        map.get(NonTerminal.DECLARATION).put(Terminal.INT, productionBuilder.getProduction(28));
    }

    private void addMappingForIDENTIFIERS(){
        map.put(NonTerminal.IDENTIFIERS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.IDENTIFIERS).put(Terminal.IDENTIFIER, productionBuilder.getProduction(29));
    }

    private void addMappingForOTHER_IDS(){
        map.put(NonTerminal.OTHER_IDS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.OTHER_IDS).put(Terminal.COMMA, productionBuilder.getProduction(30));
        map.get(NonTerminal.OTHER_IDS).put(Terminal.SEMICOLON, productionBuilder.getProduction(31));
    }

    private void addMappingForASSIGNMENT(){
        map.put(NonTerminal.ASSIGNMENT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ASSIGNMENT).put(Terminal.IDENTIFIER, productionBuilder.getProduction(32));
    }

    private void addMappingForVARIABLE(){
        map.put(NonTerminal.VARIABLE, new HashMap<Terminal, Production>());
        map.get(NonTerminal.VARIABLE).put(Terminal.IDENTIFIER, productionBuilder.getProduction(33));
    }

    private void addMappingForVARIABLE_OPT(){
        map.put(NonTerminal.VARIABLE_OPT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.LEFT_SQ, productionBuilder.getProduction(34));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.NOT_EQ, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.AND, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.MULTIPLY, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.ADD, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.COMMA, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.SUBSTRACT, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.DIVIDE, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.LESSER, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.LESSER_EQ, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.ASSIGN, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.EQUALS, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.GREATER, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.GREATER_EQ, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.RIGHT_SQ, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(35));
        map.get(NonTerminal.VARIABLE_OPT).put(Terminal.OR, productionBuilder.getProduction(35));
    }

    private void addMappingForVALUE(){
        map.put(NonTerminal.VALUE, new HashMap<Terminal, Production>());
        map.get(NonTerminal.VALUE).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(36));
        map.get(NonTerminal.VALUE).put(Terminal.LEFT_PARA, productionBuilder.getProduction(37));
        map.get(NonTerminal.VALUE).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(37));
        map.get(NonTerminal.VALUE).put(Terminal.INT_VAL, productionBuilder.getProduction(37));
        map.get(NonTerminal.VALUE).put(Terminal.IDENTIFIER, productionBuilder.getProduction(37));
    }

    private void addMappingForARRAY(){
        map.put(NonTerminal.ARRAY, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ARRAY).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(38));
    }

    private void addMappingForARRAY_ELEMS(){
        map.put(NonTerminal.ARRAY_ELEMS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ARRAY_ELEMS).put(Terminal.LEFT_PARA, productionBuilder.getProduction(39));
        map.get(NonTerminal.ARRAY_ELEMS).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(39));
        map.get(NonTerminal.ARRAY_ELEMS).put(Terminal.INT_VAL, productionBuilder.getProduction(39));
        map.get(NonTerminal.ARRAY_ELEMS).put(Terminal.IDENTIFIER, productionBuilder.getProduction(39));
    }

    private void addMappingForOTHER_ELEMS(){
        map.put(NonTerminal.OTHER_ELEMS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.OTHER_ELEMS).put(Terminal.COMMA, productionBuilder.getProduction(40));
        map.get(NonTerminal.OTHER_ELEMS).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(41));
    }

    private void addMappingForINC_DEC_STMT(){
        map.put(NonTerminal.INC_DEC_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.INC_DEC_STMT).put(Terminal.INCREMENT, productionBuilder.getProduction(42));
        map.get(NonTerminal.INC_DEC_STMT).put(Terminal.DECREMENT, productionBuilder.getProduction(43));
    }

    private void addMappingForIO_STMT(){
        map.put(NonTerminal.IO_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.IO_STMT).put(Terminal.PRINT, productionBuilder.getProduction(44));
        map.get(NonTerminal.IO_STMT).put(Terminal.INPUT, productionBuilder.getProduction(45));
    }

    private void addMappingForIF_STMT(){
        map.put(NonTerminal.IF_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.IF_STMT).put(Terminal.IF, productionBuilder.getProduction(46));
    }

    private void addMappingForELSE_STMT(){
        map.put(NonTerminal.ELSE_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ELSE_STMT).put(Terminal.ELSE, productionBuilder.getProduction(47));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.INCREMENT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.DECREMENT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.LEFT_PARA, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.INT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.FLOAT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.PRINT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.INPUT, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.IDENTIFIER, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.RETURN, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.FOR, productionBuilder.getProduction(48));
        map.get(NonTerminal.ELSE_STMT).put(Terminal.IF, productionBuilder.getProduction(48));
    }

    private void addMappingForFOR_STMT(){
        map.put(NonTerminal.FOR_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.FOR_STMT).put(Terminal.FOR, productionBuilder.getProduction(49));
    }

    private void addMappingForRETURN_STMT(){
        map.put(NonTerminal.RETURN_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.RETURN_STMT).put(Terminal.RETURN, productionBuilder.getProduction(50));
    }

    private void addMappingForFUNCTION_STMT(){
        map.put(NonTerminal.FUNCTION_STMT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.FUNCTION_STMT).put(Terminal.LEFT_PARA, productionBuilder.getProduction(51));
    }

    private void addMappingForFUNC_EXPR(){
        map.put(NonTerminal.FUNC_EXPR, new HashMap<Terminal, Production>());
        map.get(NonTerminal.FUNC_EXPR).put(Terminal.LEFT_PARA, productionBuilder.getProduction(52));
    }

    private void addMappingForARGUMENTS(){
        map.put(NonTerminal.ARGUMENTS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ARGUMENTS).put(Terminal.LEFT_PARA, productionBuilder.getProduction(53));
        map.get(NonTerminal.ARGUMENTS).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(53));
        map.get(NonTerminal.ARGUMENTS).put(Terminal.INT_VAL, productionBuilder.getProduction(53));
        map.get(NonTerminal.ARGUMENTS).put(Terminal.IDENTIFIER, productionBuilder.getProduction(53));
        map.get(NonTerminal.ARGUMENTS).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(54));
    }

    private void addMappingForOTHER_ARGS(){
        map.put(NonTerminal.OTHER_ARGS, new HashMap<Terminal, Production>());
        map.get(NonTerminal.OTHER_ARGS).put(Terminal.COMMA, productionBuilder.getProduction(55));
        map.get(NonTerminal.OTHER_ARGS).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(56));
    }

    private void addMappingForARGUMENT(){
        map.put(NonTerminal.ARGUMENT, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ARGUMENT).put(Terminal.LEFT_PARA, productionBuilder.getProduction(57));
        map.get(NonTerminal.ARGUMENT).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(57));
        map.get(NonTerminal.ARGUMENT).put(Terminal.INT_VAL, productionBuilder.getProduction(57));
        map.get(NonTerminal.ARGUMENT).put(Terminal.IDENTIFIER, productionBuilder.getProduction(57));
    }

    private void addMappingForMUL_OP(){
        map.put(NonTerminal.MUL_OP, new HashMap<Terminal, Production>());
        map.get(NonTerminal.MUL_OP).put(Terminal.MULTIPLY, productionBuilder.getProduction(58));
        map.get(NonTerminal.MUL_OP).put(Terminal.DIVIDE, productionBuilder.getProduction(59));
    }

    private void addMappingForADD_OP(){
        map.put(NonTerminal.ADD_OP, new HashMap<Terminal, Production>());
        map.get(NonTerminal.ADD_OP).put(Terminal.ADD, productionBuilder.getProduction(60));
        map.get(NonTerminal.ADD_OP).put(Terminal.SUBSTRACT, productionBuilder.getProduction(61));
    }

    private void addMappingForREL_OP(){
        map.put(NonTerminal.REL_OP, new HashMap<Terminal, Production>());
        map.get(NonTerminal.REL_OP).put(Terminal.EQUALS, productionBuilder.getProduction(62));
        map.get(NonTerminal.REL_OP).put(Terminal.NOT_EQ, productionBuilder.getProduction(63));
        map.get(NonTerminal.REL_OP).put(Terminal.GREATER, productionBuilder.getProduction(64));
        map.get(NonTerminal.REL_OP).put(Terminal.GREATER_EQ, productionBuilder.getProduction(65));
        map.get(NonTerminal.REL_OP).put(Terminal.LESSER, productionBuilder.getProduction(66));
        map.get(NonTerminal.REL_OP).put(Terminal.LESSER_EQ, productionBuilder.getProduction(67));
    }

    private void addMappingForAND_OP(){
        map.put(NonTerminal.AND_OP, new HashMap<Terminal, Production>());
        map.get(NonTerminal.AND_OP).put(Terminal.AND, productionBuilder.getProduction(68));
    }

    private void addMappingForOR_OP(){
        map.put(NonTerminal.OR_OP, new HashMap<Terminal, Production>());
        map.get(NonTerminal.OR_OP).put(Terminal.OR, productionBuilder.getProduction(69));
    }

    private void addMappingForNUM_EXPR(){
        map.put(NonTerminal.NUM_EXPR, new HashMap<Terminal, Production>());
        map.get(NonTerminal.NUM_EXPR).put(Terminal.LEFT_PARA, productionBuilder.getProduction(70));
        map.get(NonTerminal.NUM_EXPR).put(Terminal.IDENTIFIER, productionBuilder.getProduction(70));
        map.get(NonTerminal.NUM_EXPR).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(70));
        map.get(NonTerminal.NUM_EXPR).put(Terminal.INT_VAL, productionBuilder.getProduction(70));
    }

    private void addMappingForN_(){
        map.put(NonTerminal.N_, new HashMap<Terminal, Production>());
        map.get(NonTerminal.N_).put(Terminal.ADD, productionBuilder.getProduction(71));
        map.get(NonTerminal.N_).put(Terminal.SUBSTRACT, productionBuilder.getProduction(71));
        map.get(NonTerminal.N_).put(Terminal.NOT_EQ, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.AND, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.COMMA, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.SEMICOLON, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.GREATER, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.GREATER_EQ, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.EQUALS, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.LESSER, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.LESSER_EQ, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.RIGHT_SQ, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(72));
        map.get(NonTerminal.N_).put(Terminal.OR, productionBuilder.getProduction(72));
    }

    private void addMappingForT(){
        map.put(NonTerminal.T, new HashMap<Terminal, Production>());
        map.get(NonTerminal.T).put(Terminal.LEFT_PARA, productionBuilder.getProduction(73));
        map.get(NonTerminal.T).put(Terminal.IDENTIFIER, productionBuilder.getProduction(73));
        map.get(NonTerminal.T).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(73));
        map.get(NonTerminal.T).put(Terminal.INT_VAL, productionBuilder.getProduction(73));
    }

    private void addMappingForT_(){
        map.put(NonTerminal.T_, new HashMap<Terminal, Production>());
        map.get(NonTerminal.T_).put(Terminal.MULTIPLY, productionBuilder.getProduction(74));
        map.get(NonTerminal.T_).put(Terminal.DIVIDE, productionBuilder.getProduction(74));
        map.get(NonTerminal.T_).put(Terminal.NOT_EQ, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.AND, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.ADD, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.COMMA, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.SUBSTRACT, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.SEMICOLON, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.GREATER, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.GREATER_EQ, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.EQUALS, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.LESSER, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.LESSER_EQ, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.RIGHT_SQ, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.RIGHT_CURLY, productionBuilder.getProduction(75));
        map.get(NonTerminal.T_).put(Terminal.OR, productionBuilder.getProduction(75));
    }

    private void addMappingForF(){
        map.put(NonTerminal.F, new HashMap<Terminal, Production>());
        map.get(NonTerminal.F).put(Terminal.IDENTIFIER, productionBuilder.getProduction(76));
        map.get(NonTerminal.F).put(Terminal.LEFT_PARA, productionBuilder.getProduction(77));
        map.get(NonTerminal.F).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(78));
        map.get(NonTerminal.F).put(Terminal.INT_VAL, productionBuilder.getProduction(79));
    }

    private void addMappingForBOOL_EXPR(){
        map.put(NonTerminal.BOOL_EXPR, new HashMap<Terminal, Production>());
        map.get(NonTerminal.BOOL_EXPR).put(Terminal.LEFT_PARA, productionBuilder.getProduction(80));
        map.get(NonTerminal.BOOL_EXPR).put(Terminal.IDENTIFIER, productionBuilder.getProduction(80));
        map.get(NonTerminal.BOOL_EXPR).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(80));
        map.get(NonTerminal.BOOL_EXPR).put(Terminal.INT_VAL, productionBuilder.getProduction(80));
    }

    private void addMappingForB_(){
        map.put(NonTerminal.B_, new HashMap<Terminal, Production>());
        map.get(NonTerminal.B_).put(Terminal.OR, productionBuilder.getProduction(81));
        map.get(NonTerminal.B_).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(82));
        map.get(NonTerminal.B_).put(Terminal.RIGHT_PARA, productionBuilder.getProduction(82));
    }

    private void addMappingForX(){
        map.put(NonTerminal.X, new HashMap<Terminal, Production>());
        map.get(NonTerminal.X).put(Terminal.LEFT_PARA, productionBuilder.getProduction(83));
        map.get(NonTerminal.X).put(Terminal.IDENTIFIER, productionBuilder.getProduction(83));
        map.get(NonTerminal.X).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(83));
        map.get(NonTerminal.X).put(Terminal.INT_VAL, productionBuilder.getProduction(83));
    }

    private void addMappingForX_(){
        map.put(NonTerminal.X_, new HashMap<Terminal, Production>());
        map.get(NonTerminal.X_).put(Terminal.AND, productionBuilder.getProduction(84));
        map.get(NonTerminal.X_).put(Terminal.LEFT_CURLY, productionBuilder.getProduction(85));
        map.get(NonTerminal.X_).put(Terminal.OR, productionBuilder.getProduction(85));
    }

    private void addMappingForY(){
        map.put(NonTerminal.Y, new HashMap<Terminal, Production>());
        map.get(NonTerminal.Y).put(Terminal.LEFT_PARA, productionBuilder.getProduction(86));
        map.get(NonTerminal.Y).put(Terminal.IDENTIFIER, productionBuilder.getProduction(86));
        map.get(NonTerminal.Y).put(Terminal.FLOAT_VAL, productionBuilder.getProduction(86));
        map.get(NonTerminal.Y).put(Terminal.INT_VAL, productionBuilder.getProduction(86));
    }
}
