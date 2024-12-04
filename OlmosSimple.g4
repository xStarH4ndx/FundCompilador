grammar OlmosSimple;

// Reglas principales
program : statement+ ;

statement 
    : variableDeclaration 
    | printStatement 
    | ifStatement 
    | expression ';' 
    ;

variableDeclaration 
    : type ID '=' expression ';' 
    ;

type : 'int' | 'string' | 'double' ;

ifStatement 
    : 'if' '(' condition ')' '{' statement* '}' ('else' '{' statement* '}')?
    ;

printStatement 
    : 'print' '(' (STRING | expression) ')' ';' 
    ;

condition 
    : expression comparisonOp expression 
    ;

comparisonOp 
    : '==' | '!=' | '<' | '>' | '<=' | '>=' 
    ;

expression 
    : term (('+' | '-' | '*' | '/' | '%') term)* 
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
