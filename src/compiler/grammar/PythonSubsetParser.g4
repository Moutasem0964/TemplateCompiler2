parser grammar PythonSubsetParser;

@header {
    package compiler.parser;
}

options {
    tokenVocab = PythonSubsetLexer;
}

file_input: (NEWLINE | stmt)* EOF;

stmt
    : simple_stmt      #SimpleStatement
    | compound_stmt    #CompoundStatement
    ;

simple_stmt
    : small_stmt NEWLINE
    ;

small_stmt
    : assign_stmt       #AssignSmallStmt
    | return_stmt       #ReturnSmallStmt
    | global_stmt       #GlobalSmallStmt
    | import_stmt       #ImportSmallStmt
    | from_import_stmt  #FromImportSmallStmt
    | expr_stmt         #ExprSmallStmt
    ;

compound_stmt
    : function_def  #FunctionDefStmt
    | if_stmt       #IfCompoundStmt
    | for_stmt      #ForCompoundStmt
    ;

import_stmt: IMPORT dotted_name (AS NAME)?;
from_import_stmt: FROM dotted_name IMPORT (STAR | import_as_names);
import_as_names: import_as_name (COMMA import_as_name)*;
import_as_name: NAME (AS NAME)?;
dotted_name: NAME (DOT NAME)*;

function_def
    : decorator* DEF NAME LPAREN parameters? RPAREN COLON suite
    ;

decorator
    : DECORATOR dotted_name (LPAREN arglist? RPAREN)? NEWLINE
    ;

parameters: parameter (COMMA parameter)*;
parameter: NAME (EQUAL test)?;

suite
    : simple_stmt                      #InlineSuite
    | NEWLINE INDENT stmt+ DEDENT      #BlockSuite
    ;

if_stmt
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?
    ;

for_stmt
    : FOR NAME IN test COLON suite
    ;

assign_stmt
    : NAME EQUAL test       #SimpleAssign
    | NAME PLUSEQUAL test   #PlusAssign
    | NAME MINUSEQUAL test  #MinusAssign
    ;

global_stmt: GLOBAL NAME (COMMA NAME)*;

return_stmt: RETURN test?;

expr_stmt: test;

test: or_test;

or_test
    : and_test (OR and_test)*
    ;

and_test
    : not_test (AND not_test)*
    ;

not_test
    : NOT not_test   #NotExpr
    | comparison     #ComparisonExpr
    ;

comparison: arith_expr (comp_op arith_expr)*;

comp_op
    : LESS         #LessOp
    | GREATER      #GreaterOp
    | EQEQUAL      #EqualOp
    | GREATEREQUAL #GreaterEqualOp
    | LESSEQUAL    #LessEqualOp
    | NOTEQUAL     #NotEqualOp
    | IN           #InOp
    ;

arith_expr: term ((PLUS | MINUS) term)*;

term: factor ((STAR | SLASH | PERCENT | DOUBLESLASH) factor)*;

factor
    : (PLUS | MINUS) factor  #UnaryFactor
    | power                  #PowerFactor
    ;

power: atom_expr (DOUBLESTAR factor)?;

atom_expr
    : atom trailer*
    ;

trailer
    : LPAREN arglist? RPAREN       #CallTrailer
    | LPAREN genexpr_inner RPAREN  #GenExprTrailer
    | LBRACK subscript RBRACK      #IndexTrailer
    | DOT NAME                     #AttrTrailer
    ;

subscript: test;

atom
    : LPAREN testlist_comp? RPAREN             #ParenAtom
    | LBRACK testlist_comp? RBRACK             #ListAtom
    | LBRACE dictorsetmaker? RBRACE            #DictAtom
    | NAME                                     #NameAtom
    | NUMBER                                   #NumberAtom
    | STRING+                                  #StringAtom
    | TRUE                                     #TrueAtom
    | FALSE                                    #FalseAtom
    | NONE                                     #NoneAtom
    ;

testlist_comp
    : test comp_for              #ComprehensionTestList
    | test (COMMA test)* COMMA?  #TupleTestList
    ;

genexpr_inner: test comp_for;

comp_for: FOR NAME IN or_test (IF or_test)?;

dictorsetmaker
    : dict_item (COMMA dict_item)* COMMA?      #DictMaker
    | test (comp_for | (COMMA test)* COMMA?)   #SetMaker
    ;

dict_item: (STRING | NAME) COLON test;

arglist
    : argument (COMMA argument)* COMMA?
    | genexpr_inner
    ;

argument
    : NAME EQUAL test    #KeywordArgument
    | test               #PositionalArgument
    ;