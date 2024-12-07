grammar OlmosSimple;

// Reglas principales
program : statement+ ;

statement 
    : variableDeclaration 
    | printStatement 
    | conditionalStatement
    | whileLoop
    | forLoop
    | expression ';' 
    ;

variableDeclaration 
    : type ID '=' expression ';' 
    ;

type 
    : 'saldanoInt' 
    | 'saldanoString' 
    | 'saldanoDouble' 
    ;

conditionalStatement 
    : 'pan' '(' condition ')' block ('queso pan' '(' condition ')' block )* ('queso' block)? 
    ;

whileLoop 
    : 'nachoWhile' '(' condition ')' block
    ;

forLoop 
    : 'nachoFor' '(' variableDeclaration condition ';' expression ')' block
    ;

block : '{' statement* '}' ;

printStatement 
    : 'print' '(' (STRING | expression) ')' ';' 
    ;

condition 
    : expression comparisonOp expression 
    ;

comparisonOp 
    : '==' | '!=' | '<' | '>' | '<=' | '>=' 
    ;

// Actualizamos la regla de expresiones
expression 
    : ID '=' expression                          # AssignmentExpression
    | expression op=('*' | '/' | '%') expression # MultiplicativeExpression
    | expression op=('+' | '-') expression       # AdditiveExpression
    | term                                       # TermExpression
    ;

term 
    : ID 
    | NUMBER
    | DOUBLE
    | STRING
    | '(' expression ')'
    ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;

NUMBER : [0-9]+ ;

DOUBLE : [0-9]+ '.' [0-9]+ ;

STRING : '"' (~["\\] | '\\' .)* '"' ;

WS : [ \t\r\n]+ -> skip ;  // Ignorar espacios en blanco
COMMENT : '//' ~[\r\n]* -> skip ;  // Ignorar comentarios
