lexer grammar PythonSubsetLexer;

@header {
    package compiler.parser;
}

// Keywords
DEF: 'def';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
RETURN: 'return';
IMPORT: 'import';
FROM: 'from';
AS: 'as';
GLOBAL: 'global';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';
OR: 'or';
AND: 'and';
NOT: 'not';

// Operators
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
DOUBLESTAR: '**';
DOUBLESLASH: '//';

EQUAL: '=';
PLUSEQUAL: '+=';
MINUSEQUAL: '-=';

EQEQUAL: '==';
NOTEQUAL: '!=';
LESS: '<';
GREATER: '>';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';

// Delimiters
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
DOT: '.';
ARROW: '->';

// Decorator - just the @ symbol
DECORATOR: '@';

// String literals
STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

// Numbers
NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

// Identifiers - must come after keywords
NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Newlines - important for Python!
NEWLINE: ('\r'? '\n' | '\r');

// Indentation tokens - managed by PythonIndentingLexer
INDENT: '<<<INDENT>>>';
DEDENT: '<<<DEDENT>>>';

// Whitespace - send to hidden channel (but we read position for indentation)
WS: [ \t]+ -> channel(HIDDEN);

// Comments
COMMENT: '#' ~[\r\n]* -> skip;