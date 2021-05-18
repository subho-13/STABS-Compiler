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
    private void configureFUNCTIONS() {
        map.put(NonTerminal.FUNCTIONS, new HashSet<>());
    }
    private void configureFUNCTION() {
        map.put(NonTerminal.FUNCTION, new HashSet<>());
    }
    private void configurePARAMETERS() {
        map.put(NonTerminal.PARAMETERS, new HashSet<>());
        map.get(NonTerminal.PARAMETERS).add(Terminal.RIGHT_PARA);
    }
    private void configurePARAMETER() {
        map.put(NonTerminal.PARAMETER, new HashSet<>());
    }
    private void configureOTHER_PARAMS() {
        map.put(NonTerminal.OTHER_PARAMS, new HashSet<>());
    }
    private void configureTYPE() {
        map.put(NonTerminal.TYPE, new HashSet<>());
    }
    private void configureTYPE_PART1() {
        map.put(NonTerminal.TYPE_PART_1, new HashSet<>());
    }
    private void configureTYPE_PART2() {
        map.put(NonTerminal.TYPE_PART_2, new HashSet<>());
    }
    private void configureBLOCK() {
        map.put(NonTerminal.BLOCK, new HashSet<>());
    }
    private void configureSTATEMENTS() {
        map.put(NonTerminal.STATEMENTS, new HashSet<>());
        map.get(NonTerminal.STATEMENTS).add(Terminal.RIGHT_CURLY);
    }
    private void configureSTATEMENT() {
        map.put(NonTerminal.STATEMENT, new HashSet<>());
    }
    private void configureCOMPOUND_STMT() {
        map.put(NonTerminal.COMPOUND_STMT, new HashSet<>());
    }
    private void configureDECLARATION() {
        map.put(NonTerminal.DECLARATION, new HashSet<>());
    }
    private void configureIDENTIFIERS() {
        map.put(NonTerminal.IDENTIFIERS, new HashSet<>());
    }
    private void configureOTHER_IDS() {
        map.put(NonTerminal.OTHER_IDS, new HashSet<>());
    }
    private void configureASSIGNMENT() {
        map.put(NonTerminal.ASSIGNMENT, new HashSet<>());
    }
    private void configureVARIABLE() {
        map.put(NonTerminal.VARIABLE, new HashSet<>());
        map.get(NonTerminal.VARIABLE).add(Terminal.EQUALS);
    }
    private void configureVARIABLE_OPT() {
        map.put(NonTerminal.VARIABLE_OPT, new HashSet<>());
        map.get(NonTerminal.VARIABLE_OPT).add(Terminal.EQUALS);
    }
    private void configureVALUE() {
        map.put(NonTerminal.VALUE, new HashSet<>());
    }
    private void configureARRAY() {
        map.put(NonTerminal.ARRAY, new HashSet<>());
    }
    private void configureARRAY_ELEMS() {
        map.put(NonTerminal.ARRAY_ELEMS, new HashSet<>());
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.RIGHT_CURLY);
    }
    private void configureOTHER_ELEMS() {
        map.put(NonTerminal.OTHER_ELEMS, new HashSet<>());
        map.get(NonTerminal.ARRAY_ELEMS).add(Terminal.RIGHT_CURLY);
    }

    private void configureINC_DEC_STATEMENT(){

    }

    private void configureIO_STMT(){

    }
    private void configureIF_STMT(){

    }
    private void configureELSE_STMT(){

    }
    private void configureFOR_STMT(){

    }
    private void configureRETURN_STMT(){

    }
    private void configureFUNCTION_STMT(){

    }
    private void configureFUNC_EXPR(){

    }
    private void configureARGUMENTS(){

    }
    private void configureARGUMENT(){

    }
    private void configureOTHER_ARGS(){

    }
    private void configureMUL_OP(){
        }
    private void configureADD_OP(){

    }
    private void configureREL_OP(){

    }
    private void configureOR_OP(){

    }
    private void configureAND_OP(){

    }
    private void configureNUM_EXPR(){

    }
    private void configureN_(){
        }
    private void configureT(){

    }
    private void configureT_(){

    }
    private void configureF(){

    }
    private void configureBOOL_EXPR(){

    }
    private void configureB_(){

    }
    private void configureX(){

    }
    private void configureX_(){

    }
    private void configureY(){

    }

}


