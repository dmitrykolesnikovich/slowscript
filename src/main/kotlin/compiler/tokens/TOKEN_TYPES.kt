package compiler.tokens

enum class TOKEN_TYPES {

    COMMA, LEFT_BRACE, RIGHT_BRACE, IF, RIGHT_PAREN, LEFT_PAREN,
    SEMICOLON, ASSIGNMENT, LEFT_TRIANGLE, RIGHT_TRIANGLE, LESS_THAN_OR_EQUAL, GREAT_THAN_OR_EQUAL, NOT_EQUAL,
    PLUS, MINUS, MODULUS, STRING, NUMBER, NULL, CLASS, RETURN, DOT, NOT, EQUAL_EQUAL,
    INCREMENT, DECREMENT, COLON, DIVIDE, AND, OR, SUPER, TRUE, FALSE, PLUS_EQUALS, MINUS_EQUALS, MOD_EQUALS,
    DIV_EQUALS, ELSE, LOOP, WHILE, MULT, MULT_EQUAL, IDENTIFIER, FROM, THIS, END, QUESTION,
    AS, ARROW, INSTANCE, INIT_BLOCK, MODULE,

    MUTABLE_VARIABLE, TASK, NaN, DISPLAY
}