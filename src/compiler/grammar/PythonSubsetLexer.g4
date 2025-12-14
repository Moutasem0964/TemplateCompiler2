lexer grammar PythonSubsetLexer;

@header {
    package compiler.parser;
}

NEWLINE     : ('\r'? '\n' | '\r')+ ;
WS          : [ \t]+ -> skip ;

DEF         : 'def' ;
IF          : 'if' ;
ELIF        : 'elif' ;
ELSE        : 'else' ;
FOR         : 'for' ;
IN          : 'in' ;
RETURN      : 'return' ;
TRUE        : 'true' ;
FALSE       : 'false' ;

EQ          : '=' ;
EQEQ        : '==' ;
LT          : '<' ;
GT          : '>' ;
LTEQ        : '<=' ;
GTEQ        : '>=' ;
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;

LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACK      : '[' ;
RBRACK      : ']' ;
COLON       : ':' ;
DOT         : '.' ;
COMMA       : ',' ;

NUMBER      : [0-9]+ ('.' [0-9]+)? ;
STRING      : '"' (~["\\\r\n] | '\\' .)* '"'
            | '\'' (~['\\\r\n] | '\\' .)* '\'' ;

NAME        : [a-zA-Z_][a-zA-Z0-9_]* ;

COMMENT     : '#' ~[\r\n]* -> skip ;