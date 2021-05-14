package terminal;

public enum Terminal {
    /*data types*/
    INT, FLOAT,

    /*value identifiers*/
    INT_VAL, FLOAT_VAL, IDENTIFIER,

    /*all paranthesis*/
    LEFT_PARA, RIGHT_PARA, LEFT_CURLY, RIGHT_CURLY, LEFT_SQ, RIGHT_SQ,

    /*all comparison operators*/
    EQUALS, NOT_EQ, LESSER, LESSER_EQ, GREATER, GREATER_EQ,

    /*conjunctives*/
    AND, OR,

    /*operators*/
    INCREMENT, DECREMENT, ADD, SUBSTRACT, DIVIDE, MULTIPLY,

    /*conditional branching and looping*/
    IF, ELSE, FOR,

    /*io options*/
    PRINT, INPUT,

    /*end line or statement delimeter*/
    COMMA, SEMICOLON,

    /*end of file*/
    EOF;
}

/*
+ NCREMENT = ++
+DECREMENT = --
+MULTIPLY = *
+DIVIDE = /
+ADD = +
+SUBSTRACT = -
+EQUALS = ==
+NOT_EQ = !=
+LESSER = <
+LESSER_EQ = <=
+GREATER = >
+GREATER_EQ = >=
+AND = ???????????????????????????????
+OR = ||
+ASSIGN = =
+LEFT_PARA = (
+RIGHT_PARA = )
+LEFT_CURLY = {
+RIGHT_CURLY = }
+LEFT_SQ = [
+RIGHT_SQ = ]
+SEMICOLON = ;
+COMMA = ,
+EOF = eof
+INT = int
+FLOAT = float
+IF = if
+ELSE = else
+FOR = for
+PRINT = print
+INPUT = input
+INT_VAL = [-+]?\d+
+FLOAT_VAL = [-+]?\d*.\d+
+IDENTIFIER = \w+
*/