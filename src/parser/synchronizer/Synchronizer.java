package parser.synchronizer;

import nonterminal.NonTerminal;
import terminal.Terminal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Synchronizer {
    Map<NonTerminal, Set<Terminal>> map = new HashMap<>();

    public Synchronizer() {
        configure();
    }

    public Set<Terminal> getTerminals(NonTerminal nonTerminal) {
        return map.get(nonTerminal);
    }

    private void configure() {
        map.put(NonTerminal.PROGRAM, new HashSet<>());
        map.get(NonTerminal.PROGRAM).add(Terminal.EOF);
        map.get(NonTerminal.PROGRAM).add(Terminal.INT);
        map.get(NonTerminal.PROGRAM).add(Terminal.FLOAT);
        map.put(NonTerminal.FUNCTIONS, new HashSet<>());
        map.get(NonTerminal.FUNCTIONS).add(Terminal.INT);
        map.get(NonTerminal.FUNCTIONS).add(Terminal.FLOAT);
        map.get(NonTerminal.FUNCTIONS).add(Terminal.EOF);
        map.put(NonTerminal.FUNCTION, new HashSet<>());
        map.get(NonTerminal.FUNCTION).add(Terminal.INT);
        map.get(NonTerminal.FUNCTION).add(Terminal.FLOAT);
        map.put(NonTerminal.PARAMETERS, new HashSet<>());
        map.get(NonTerminal.PARAMETERS).add(Terminal.INT);
        map.get(NonTerminal.PARAMETERS).add(Terminal.FLOAT);
        map.get(NonTerminal.PARAMETERS).add(Terminal.RIGHT_PARA);
        map.put(NonTerminal.OTHER_PARAMS, new HashSet<>());
        map.get(NonTerminal.OTHER_PARAMS).add(Terminal.RIGHT_PARA);
        map.get(NonTerminal.OTHER_PARAMS).add(Terminal.COMMA);
        map.put(NonTerminal.PARAMETER, new HashSet<>());
        map.get(NonTerminal.PARAMETER).add(Terminal.INT);
        map.get(NonTerminal.PARAMETER).add(Terminal.FLOAT);
        map.put(NonTerminal.TYPE, new HashSet<>());
        map.get(NonTerminal.TYPE).add(Terminal.INT);
        map.get(NonTerminal.TYPE).add(Terminal.FLOAT);
        map.put(NonTerminal.TYPE_PART_1, new HashSet<>());
        map.get(NonTerminal.TYPE_PART_1).add(Terminal.INT);
        map.get(NonTerminal.TYPE_PART_1).add(Terminal.FLOAT);
        map.put(NonTerminal.TYPE_PART_2, new HashSet<>());
        map.get(NonTerminal.TYPE_PART_2).add(Terminal.LEFT_SQ);
        map.get(NonTerminal.TYPE_PART_2).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.BLOCK, new HashSet<>());
        map.get(NonTerminal.BLOCK).add(Terminal.LEFT_CURLY);
        map.put(NonTerminal.STATEMENTS, new HashSet<>());
        map.get(NonTerminal.STATEMENTS).add(Terminal.INCREMENT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.DECREMENT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.STATEMENTS).add(Terminal.INT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.FLOAT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.PRINT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.INPUT);
        map.get(NonTerminal.STATEMENTS).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.STATEMENTS).add(Terminal.RETURN);
        map.get(NonTerminal.STATEMENTS).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.STATEMENTS).add(Terminal.IF);
        map.get(NonTerminal.STATEMENTS).add(Terminal.FOR);
        map.get(NonTerminal.STATEMENTS).add(Terminal.RIGHT_CURLY);
        map.put(NonTerminal.STATEMENT, new HashSet<>());
        map.get(NonTerminal.STATEMENT).add(Terminal.INT);
        map.get(NonTerminal.STATEMENT).add(Terminal.FLOAT);
        map.get(NonTerminal.STATEMENT).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.STATEMENT).add(Terminal.INCREMENT);
        map.get(NonTerminal.STATEMENT).add(Terminal.DECREMENT);
        map.get(NonTerminal.STATEMENT).add(Terminal.PRINT);
        map.get(NonTerminal.STATEMENT).add(Terminal.INPUT);
        map.get(NonTerminal.STATEMENT).add(Terminal.RETURN);
        map.get(NonTerminal.STATEMENT).add(Terminal.LEFT_PARA);
        map.put(NonTerminal.COMPOUND_STMT, new HashSet<>());
        map.get(NonTerminal.COMPOUND_STMT).add(Terminal.IF);
        map.get(NonTerminal.COMPOUND_STMT).add(Terminal.FOR);
        map.get(NonTerminal.COMPOUND_STMT).add(Terminal.LEFT_CURLY);
        map.put(NonTerminal.DECLARATION, new HashSet<>());
        map.get(NonTerminal.DECLARATION).add(Terminal.FLOAT);
        map.get(NonTerminal.DECLARATION).add(Terminal.INT);
        map.put(NonTerminal.IDENTIFIERS, new HashSet<>());
        map.get(NonTerminal.IDENTIFIERS).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.OTHER_IDS, new HashSet<>());
        map.get(NonTerminal.OTHER_IDS).add(Terminal.COMMA);
        map.get(NonTerminal.OTHER_IDS).add(Terminal.SEMICOLON);
        map.put(NonTerminal.ASSIGNMENT, new HashSet<>());
        map.get(NonTerminal.ASSIGNMENT).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.VARIABLE, new HashSet<>());
        map.get(NonTerminal.VARIABLE).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.VARIABLE_OPT, new HashSet<>());
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.LEFT_SQ);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.NOT_EQ);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.AND);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.RIGHT_PARA);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.MULTIPLY);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.ADD);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.COMMA);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.SUBSTRACT);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.DIVIDE);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.LESSER);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.LESSER_EQ);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.ASSIGN);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.EQUALS);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.GREATER);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.GREATER_EQ);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.RIGHT_SQ);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.RIGHT_CURLY);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.OR);
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.SEMICOLON);
        map.put(NonTerminal.VALUE, new HashSet<>());
        map.get(NonTerminal.VALUE).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.VALUE).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.VALUE).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.VALUE).add(Terminal.INT_VAL);
        map.get(NonTerminal.VALUE).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.ARRAY, new HashSet<>());
        map.get(NonTerminal.ARRAY).add(Terminal.LEFT_CURLY);
        map.put(NonTerminal.ARRAY_ELEMS, new HashSet<>());
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.INT_VAL);
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.OTHER_ELEMS, new HashSet<>());
        map.get(NonTerminal.OTHER_ELEMS).add(Terminal.COMMA);
        map.get(NonTerminal.OTHER_ELEMS).add(Terminal.RIGHT_CURLY);
        map.put(NonTerminal.INC_DEC_STMT, new HashSet<>());
        map.get(NonTerminal.INC_DEC_STMT).add(Terminal.INCREMENT);
        map.get(NonTerminal.INC_DEC_STMT).add(Terminal.DECREMENT);
        map.put(NonTerminal.IO_STMT, new HashSet<>());
        map.get(NonTerminal.IO_STMT).add(Terminal.PRINT);
        map.get(NonTerminal.IO_STMT).add(Terminal.INPUT);
        map.put(NonTerminal.IF_STMT, new HashSet<>());
        map.get(NonTerminal.IF_STMT).add(Terminal.IF);
        map.put(NonTerminal.ELSE_STMT, new HashSet<>());
        map.get(NonTerminal.ELSE_STMT).add(Terminal.ELSE);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.INCREMENT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.DECREMENT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.INT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.FLOAT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.PRINT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.INPUT);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.RETURN);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.RIGHT_CURLY);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.FOR);
        map.get(NonTerminal.ELSE_STMT).add(Terminal.IF);
        map.put(NonTerminal.FOR_STMT, new HashSet<>());
        map.get(NonTerminal.FOR_STMT).add(Terminal.FOR);
        map.put(NonTerminal.RETURN_STMT, new HashSet<>());
        map.get(NonTerminal.RETURN_STMT).add(Terminal.RETURN);
        map.put(NonTerminal.FUNCTION_STMT, new HashSet<>());
        map.get(NonTerminal.FUNCTION_STMT).add(Terminal.LEFT_PARA);
        map.put(NonTerminal.FUNC_EXPR, new HashSet<>());
        map.get(NonTerminal.FUNC_EXPR).add(Terminal.LEFT_PARA);
        map.put(NonTerminal.ARGUMENTS, new HashSet<>());
        map.get(NonTerminal.ARGUMENTS).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.ARGUMENTS).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.ARGUMENTS).add(Terminal.INT_VAL);
        map.get(NonTerminal.ARGUMENTS).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.ARGUMENTS).add(Terminal.RIGHT_PARA);
        map.put(NonTerminal.OTHER_ARGS, new HashSet<>());
        map.get(NonTerminal.OTHER_ARGS).add(Terminal.COMMA);
        map.get(NonTerminal.OTHER_ARGS).add(Terminal.RIGHT_PARA);
        map.put(NonTerminal.ARGUMENT, new HashSet<>());
        map.get(NonTerminal.ARGUMENT).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.ARGUMENT).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.ARGUMENT).add(Terminal.INT_VAL);
        map.get(NonTerminal.ARGUMENT).add(Terminal.IDENTIFIER);
        map.put(NonTerminal.MUL_OP, new HashSet<>());
        map.get(NonTerminal.MUL_OP).add(Terminal.MULTIPLY);
        map.get(NonTerminal.MUL_OP).add(Terminal.DIVIDE);
        map.put(NonTerminal.ADD_OP, new HashSet<>());
        map.get(NonTerminal.ADD_OP).add(Terminal.ADD);
        map.get(NonTerminal.ADD_OP).add(Terminal.SUBSTRACT);
        map.put(NonTerminal.REL_OP, new HashSet<>());
        map.get(NonTerminal.REL_OP).add(Terminal.EQUALS);
        map.get(NonTerminal.REL_OP).add(Terminal.NOT_EQ);
        map.get(NonTerminal.REL_OP).add(Terminal.LESSER);
        map.get(NonTerminal.REL_OP).add(Terminal.LESSER_EQ);
        map.get(NonTerminal.REL_OP).add(Terminal.GREATER);
        map.get(NonTerminal.REL_OP).add(Terminal.GREATER_EQ);
        map.put(NonTerminal.AND_OP, new HashSet<>());
        map.get(NonTerminal.AND_OP).add(Terminal.AND);
        map.put(NonTerminal.OR_OP, new HashSet<>());
        map.get(NonTerminal.OR_OP).add(Terminal.OR);
        map.put(NonTerminal.NUM_EXPR, new HashSet<>());
        map.get(NonTerminal.NUM_EXPR).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.NUM_EXPR).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.NUM_EXPR).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.NUM_EXPR).add(Terminal.INT_VAL);
        map.put(NonTerminal.N_, new HashSet<>());
        map.get(NonTerminal.N_).add(Terminal.ADD);
        map.get(NonTerminal.N_).add(Terminal.SUBSTRACT);
        map.get(NonTerminal.N_).add(Terminal.NOT_EQ);
        map.get(NonTerminal.N_).add(Terminal.AND);
        map.get(NonTerminal.N_).add(Terminal.RIGHT_PARA);
        map.get(NonTerminal.N_).add(Terminal.COMMA);
        map.get(NonTerminal.N_).add(Terminal.SEMICOLON);
        map.get(NonTerminal.N_).add(Terminal.GREATER);
        map.get(NonTerminal.N_).add(Terminal.GREATER_EQ);
        map.get(NonTerminal.N_).add(Terminal.EQUALS);
        map.get(NonTerminal.N_).add(Terminal.LESSER);
        map.get(NonTerminal.N_).add(Terminal.LESSER_EQ);
        map.get(NonTerminal.N_).add(Terminal.RIGHT_SQ);
        map.get(NonTerminal.N_).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.N_).add(Terminal.RIGHT_CURLY);
        map.get(NonTerminal.N_).add(Terminal.OR);
        map.put(NonTerminal.T, new HashSet<>());
        map.get(NonTerminal.T).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.T).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.T).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.T).add(Terminal.INT_VAL);
        map.put(NonTerminal.T_, new HashSet<>());
        map.get(NonTerminal.T_).add(Terminal.MULTIPLY);
        map.get(NonTerminal.T_).add(Terminal.DIVIDE);
        map.get(NonTerminal.T_).add(Terminal.NOT_EQ);
        map.get(NonTerminal.T_).add(Terminal.AND);
        map.get(NonTerminal.T_).add(Terminal.RIGHT_PARA);
        map.get(NonTerminal.T_).add(Terminal.ADD);
        map.get(NonTerminal.T_).add(Terminal.COMMA);
        map.get(NonTerminal.T_).add(Terminal.SUBSTRACT);
        map.get(NonTerminal.T_).add(Terminal.SEMICOLON);
        map.get(NonTerminal.T_).add(Terminal.GREATER);
        map.get(NonTerminal.T_).add(Terminal.GREATER_EQ);
        map.get(NonTerminal.T_).add(Terminal.EQUALS);
        map.get(NonTerminal.T_).add(Terminal.LESSER);
        map.get(NonTerminal.T_).add(Terminal.LESSER_EQ);
        map.get(NonTerminal.T_).add(Terminal.RIGHT_SQ);
        map.get(NonTerminal.T_).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.T_).add(Terminal.RIGHT_CURLY);
        map.get(NonTerminal.T_).add(Terminal.OR);
        map.put(NonTerminal.F, new HashSet<>());
        map.get(NonTerminal.F).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.F).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.F).add(Terminal.INT_VAL);
        map.get(NonTerminal.F).add(Terminal.FLOAT_VAL);
        map.put(NonTerminal.BOOL_EXPR, new HashSet<>());
        map.get(NonTerminal.BOOL_EXPR).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.BOOL_EXPR).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.BOOL_EXPR).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.BOOL_EXPR).add(Terminal.INT_VAL);
        map.put(NonTerminal.B_, new HashSet<>());
        map.get(NonTerminal.B_).add(Terminal.OR);
        map.get(NonTerminal.B_).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.B_).add(Terminal.RIGHT_PARA);
        map.put(NonTerminal.X, new HashSet<>());
        map.get(NonTerminal.X).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.X).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.X).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.X).add(Terminal.INT_VAL);
        map.put(NonTerminal.X_, new HashSet<>());
        map.get(NonTerminal.X_).add(Terminal.AND);
        map.get(NonTerminal.X_).add(Terminal.LEFT_CURLY);
        map.get(NonTerminal.X_).add(Terminal.OR);
        map.put(NonTerminal.Y, new HashSet<>());
        map.get(NonTerminal.Y).add(Terminal.LEFT_PARA);
        map.get(NonTerminal.Y).add(Terminal.IDENTIFIER);
        map.get(NonTerminal.Y).add(Terminal.FLOAT_VAL);
        map.get(NonTerminal.Y).add(Terminal.INT_VAL);
    }

//    private void configurePROGRAM() {
//        map.put(NonTerminal.PROGRAM, new HashSet<>());
//    }
//
//    private void configureFUNCTIONS() {
//        map.put(NonTerminal.FUNCTIONS, new HashSet<>());
//    }
//    private void configureFUNCTION() {
//        map.put(NonTerminal.FUNCTION, new HashSet<>());
//    }
//    private void configurePARAMETERS() {
//        map.put(NonTerminal.PARAMETERS, new HashSet<>());
//        map.get(NonTerminal.PARAMETERS).add(Terminal.RIGHT_PARA);
//    }
//    private void configurePARAMETER() {
//        map.put(NonTerminal.PARAMETER, new HashSet<>());
//    }
//    private void configureOTHER_PARAMS() {
//        map.put(NonTerminal.OTHER_PARAMS, new HashSet<>());
//    }
//    private void configureTYPE() {
//        map.put(NonTerminal.TYPE, new HashSet<>());
//    }
//    private void configureTYPE_PART1() {
//        map.put(NonTerminal.TYPE_PART_1, new HashSet<>());
//    }
//    private void configureTYPE_PART2() {
//        map.put(NonTerminal.TYPE_PART_2, new HashSet<>());
//    }
//    private void configureBLOCK() {
//        map.put(NonTerminal.BLOCK, new HashSet<>());
//    }
//    private void configureSTATEMENTS() {
//        map.put(NonTerminal.STATEMENTS, new HashSet<>());
//        map.get(NonTerminal.STATEMENTS).add(Terminal.RIGHT_CURLY);
//    }
//    private void configureSTATEMENT() {
//        map.put(NonTerminal.STATEMENT, new HashSet<>());
//    }
//    private void configureCOMPOUND_STMT() {
//        map.put(NonTerminal.COMPOUND_STMT, new HashSet<>());
//    }
//    private void configureDECLARATION() {
//        map.put(NonTerminal.DECLARATION, new HashSet<>());
//    }
//    private void configureIDENTIFIERS() {
//        map.put(NonTerminal.IDENTIFIERS, new HashSet<>());
//    }
//    private void configureOTHER_IDS() {
//        map.put(NonTerminal.OTHER_IDS, new HashSet<>());
//    }
//    private void configureASSIGNMENT() {
//        map.put(NonTerminal.ASSIGNMENT, new HashSet<>());
//    }
//    private void configureVARIABLE() {
//        map.put(NonTerminal.VARIABLE, new HashSet<>());
//        map.get(NonTerminal.VARIABLE).add(Terminal.EQUALS);
//    }
//    private void configureVARIABLE_OPT() {
//        map.put(NonTerminal.VARIABLE_OPT, new HashSet<>());
//        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.EQUALS);
//    }
//    private void configureVALUE() {
//        map.put(NonTerminal.VALUE, new HashSet<>());
//    }
//    private void configureARRAY() {
//        map.put(NonTerminal.ARRAY, new HashSet<>());
//    }
//    private void configureARRAY_ELEMS() {
//        map.put(NonTerminal.ARRAY_ELEMS, new HashSet<>());
//        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.RIGHT_CURLY);
//    }
//    private void configureOTHER_ELEMS() {
//        map.put(NonTerminal.OTHER_ELEMS, new HashSet<>());
//        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.RIGHT_CURLY);
//    }
//
//    private void configureINC_DEC_STATEMENT(){
//
//    }
//
//    private void configureIO_STMT(){
//
//    }
//    private void configureIF_STMT(){
//
//    }
//    private void configureELSE_STMT(){
//
//    }
//    private void configureFOR_STMT(){
//
//    }
//    private void configureRETURN_STMT(){
//
//    }
//    private void configureFUNCTION_STMT(){
//
//    }
//    private void configureFUNC_EXPR(){
//
//    }
//    private void configureARGUMENTS(){
//
//    }
//    private void configureARGUMENT(){
//
//    }
//    private void configureOTHER_ARGS(){
//
//    }
//    private void configureMUL_OP(){
//        }
//    private void configureADD_OP(){
//
//    }
//    private void configureREL_OP(){
//
//    }
//    private void configureOR_OP(){
//
//    }
//    private void configureAND_OP(){
//
//    }
//    private void configureNUM_EXPR(){
//
//    }
//    private void configureN_(){
//        }
//    private void configureT(){
//
//    }
//    private void configureT_(){
//
//    }
//    private void configureF(){
//
//    }
//    private void configureBOOL_EXPR(){
//
//    }
//    private void configureB_(){
//
//    }
//    private void configureX(){
//
//    }
//    private void configureX_(){
//
//    }
//    private void configureY(){
//
//    }

}


