parser grammar PythonSubsetParser;

options {
    tokenVocab = PythonSubsetLexer;
}

@header {
    package compiler.parser;
}

// Entry point
program : stmt* EOF ;

// Statements
stmt
    : simpleStmt NEWLINE                    # simple
    | compoundStmt                          # compound
    ;

simpleStmt
    : expr                                  # exprStmt
    | NAME EQ expr                          # assign
    ;

compoundStmt
    : ifStmt                                # ifRule
    | forStmt                               # forRule
    ;

// If statement
ifStmt
    : IF test COLON suite
      (ELIF test COLON suite)*
      (ELSE COLON suite)?
    ;

// For statement
forStmt
    : FOR NAME IN expr COLON suite
    ;

// Suite (block)
suite
    : simpleStmt NEWLINE
    | NEWLINE INDENT stmt+ DEDENT
    ;

// Condition in if (alias for expr)
test : expr ;

// Expressions
expr
    : expr (STAR|SLASH) expr                # mulDiv
    | expr (PLUS|MINUS) expr                # addSub
    | expr (LT|LTEQ|GT|GTEQ|EQEQ) expr      # comparison
    | atom                                  # atomExpr
    ;

atom
    : NAME                                  # name
    | NUMBER                                # number
    | STRING                                # string
    | TRUE                                  # trueLit
    | FALSE                                 # falseLit
    | LPAREN expr RPAREN                    # paren
    | atom DOT NAME                         # attrAccess
    | atom LBRACK expr RBRACK               # subscript
    | atom LPAREN arglist? RPAREN           # call
    | listLiteral                           # list
    ;

listLiteral
    : LBRACK (expr (COMMA expr)*)? RBRACK
    ;

arglist
    : expr (COMMA expr)*
    ;

