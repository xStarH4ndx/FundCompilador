grammar OlmosType;

// Reglas principales
program : statement+ ;

statement 
    : variableDeclaration 
    | ifStatement 
    | whileLoop 
    | forLoop 
    | printStatement 
    | expression ';' 
    ;

variableDeclaration 
    : type ID '=' expression ';' 
    ;

type : 'int' | 'string' | 'double' ;

ifStatement 
    : 'olmosCondition' '(' condition ')' '{' statement* '}' ('else' '{' statement* '}')? 
    ;

whileLoop 
    : 'nachitoWhile' '(' condition ')' '{' statement* '}' 
    ;

forLoop 
    : 'olmosRepite' '(' variableDeclaration condition ';' expression ')' '{' statement* '}'
    ;

printStatement 
    : ('saldanoSay.print' '(' (STRING | expression) ')' ';' 
    | 'saldanoSay.println' '(' (STRING | expression) ')' ';' 
    );

condition 
    : logicalExpression 
    ;

logicalExpression 
    : comparisonExpression (('&&' | '||') comparisonExpression)* 
    ;

comparisonExpression 
    : expression comparisonOp expression 
    | expression 
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

STRING : '"' (~["\\] | '\\' .)* '"' ; // Mejor manejo de cadenas, permite escapar comillas y barras invertidas.

WS : [ \t\r\n]+ -> skip ;

COMMENT : '//' ~[\r\n]* -> skip ;
