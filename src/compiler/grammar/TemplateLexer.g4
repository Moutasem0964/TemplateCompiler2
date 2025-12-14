lexer grammar TemplateLexer;

@header {
    package compiler.parser;
}

// Default mode
OPEN_EXPR       : '{{' -> pushMode(PY_EXPR_MODE);
OPEN_STMT       : '{%' -> pushMode(PY_STMT_MODE);
OPEN_COMMENT    : '{#' -> skip, pushMode(COMMENT_MODE);

TAG_START       : '<' -> pushMode(HTML_TAG_MODE);

TEXT            : (~[<{] | '{' ~[{%#] | '<' ~[a-zA-Z/])+ ;

WS              : [ \t\r\n]+ -> channel(HIDDEN);

// ====================== PYTHON EXPR MODE ======================
mode PY_EXPR_MODE;

CLOSE_EXPR      : '}}' -> popMode;
PY_EXPR_CONTENT : (~[}] | '}' ~[}])+ ;

// ====================== PYTHON STMT MODE ======================
mode PY_STMT_MODE;

CLOSE_STMT      : '%}' -> popMode;
PY_STMT_CONTENT : (~[%] | '%' ~[}])+ ;

// ====================== COMMENT MODE ======================
mode COMMENT_MODE;

CLOSE_COMMENT   : '#}' -> popMode;
COMMENT_CONTENT : .+? ;

// ====================== HTML TAG MODE ======================
mode HTML_TAG_MODE;

TAG_END         : '>' -> popMode;
TAG_SLASH_CLOSE : '/>' -> popMode;
SLASH           : '/';
EQUALS          : '=';

TAG_NAME        : [a-zA-Z][a-zA-Z0-9:-]* ;

// Match both "style" and "STYLE" etc.
STYLE_TAG       : [sS][tT][yY][lL][eE] ;

ATTR_VALUE      : '"' (~["\r\n])* '"'
                | '\'' (~['\r\n])* '\'' ;

TAG_WS          : [ \t\r\n]+ -> channel(HIDDEN);