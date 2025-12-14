parser grammar TemplateParser;

options {
    tokenVocab = TemplateLexer;
}

@header {
    package compiler.parser;
}

template
    : part* EOF
    ;

part
    : TEXT                          # textPart
    | jinjaExpression               # exprPart
    | jinjaStatement                # stmtPart
    | htmlElement                   # htmlPart
    ;

jinjaExpression
    : OPEN_EXPR content=PY_EXPR_CONTENT CLOSE_EXPR   # jinjaExpr
    ;

jinjaStatement
    : OPEN_STMT content=PY_STMT_CONTENT CLOSE_STMT   # jinjaStmt
    ;

// Normal HTML tags
htmlElement
    : TAG_START name=TAG_NAME attributes? TAG_END
      content=part*
      TAG_START SLASH endName=TAG_NAME TAG_END               # fullTag

    | TAG_START name=TAG_NAME attributes? TAG_SLASH_CLOSE    # selfClosingTag

    // Special handling for <style> ... </style> (case-insensitive via STYLE_TAG)
    | TAG_START STYLE_TAG attributes? TAG_END
      cssContent=styleContent
      TAG_START SLASH STYLE_TAG TAG_END                       # styleTag
    ;

styleContent
    : (TEXT | jinjaExpression | jinjaStatement)*             # cssRawContent
    ;

attributes
    : (TAG_NAME EQUALS ATTR_VALUE)+
    ;