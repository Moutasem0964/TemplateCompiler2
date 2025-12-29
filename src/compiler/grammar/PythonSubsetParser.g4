parser grammar PythonSubsetParser;

@header {
    package compiler.parser;
}

options {
    tokenVocab = PythonSubsetLexer;
}

// Program
file_input: (NEWLINE | stmt)* EOF;

// Statements
stmt
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : assign_stmt
    | return_stmt
    | global_stmt
    | import_stmt
    | from_import_stmt
    | expr_stmt
    ;

compound_stmt
    : function_def
    | if_stmt
    | for_stmt
    ;

// Import statements
import_stmt: IMPORT dotted_name (AS NAME)?;
from_import_stmt: FROM dotted_name IMPORT (STAR | import_as_names);
import_as_names: import_as_name (COMMA import_as_name)*;
import_as_name: NAME (AS NAME)?;
dotted_name: NAME (DOT NAME)*;

// Function definition with decorators
function_def
    : decorator* DEF NAME LPAREN parameters? RPAREN COLON suite
    ;

// Decorator
decorator
    : DECORATOR dotted_name (LPAREN arglist? RPAREN)? NEWLINE
    ;

parameters: parameter (COMMA parameter)*;
parameter: NAME (EQUAL test)?;

suite
    : simple_stmt
    | NEWLINE INDENT stmt+ DEDENT
    ;

// Control flow
if_stmt
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?
    ;

for_stmt
    : FOR NAME IN test COLON suite
    ;

// Assignment
assign_stmt
    : NAME EQUAL test
    | NAME PLUSEQUAL test
    | NAME MINUSEQUAL test
    ;

global_stmt: GLOBAL NAME (COMMA NAME)*;

return_stmt: RETURN test?;

expr_stmt: test;

// Expressions
test: or_test;

or_test: and_test (OR and_test)*;

and_test: not_test (AND not_test)*;

not_test: NOT not_test | comparison;

comparison: arith_expr (comp_op arith_expr)*;

comp_op: LESS | GREATER | EQEQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL | IN;

arith_expr: term ((PLUS | MINUS) term)*;

term: factor ((STAR | SLASH | PERCENT | DOUBLESLASH) factor)*;

factor: (PLUS | MINUS) factor | power;

power: atom_expr (DOUBLESTAR factor)?;

atom_expr
    : atom trailer*
    ;

trailer
    : LPAREN arglist? RPAREN       # CallTrailer
    | LPAREN genexpr_inner RPAREN  # GenExprTrailer
    | LBRACK subscript RBRACK      # IndexTrailer
    | DOT NAME                     # AttrTrailer
    ;

subscript: test;

atom
    : LPAREN testlist_comp? RPAREN             # ParenAtom
    | LBRACK testlist_comp? RBRACK             # ListAtom
    | LBRACE dictorsetmaker? RBRACE            # DictAtom
    | NAME                                     # NameAtom
    | NUMBER                                   # NumberAtom
    | STRING+                                  # StringAtom
    | TRUE                                     # TrueAtom
    | FALSE                                    # FalseAtom
    | NONE                                     # NoneAtom
    ;

// Test list or comprehension - used for both () and []
testlist_comp
    : test comp_for                            // Generator/comprehension
    | test (COMMA test)* COMMA?                // Tuple/list
    ;

// Generator expression inside function call: func(x for x in y)
genexpr_inner: test comp_for;

// Comprehension clause
comp_for: FOR NAME IN or_test (IF or_test)?;

// Dictionary maker
dictorsetmaker
    : dict_item (COMMA dict_item)* COMMA?
    | test (comp_for | (COMMA test)* COMMA?)
    ;

dict_item: (STRING | NAME) COLON test;

// Function call arguments - now supports generator expressions
arglist
    : argument (COMMA argument)* COMMA?
    | genexpr_inner                            // Allow: func(x for x in y)
    ;

argument
    : NAME EQUAL test    # KeywordArgument
    | test               # PositionalArgument
    ;