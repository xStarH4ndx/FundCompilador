grammar OlmosSimple;

// Reglas principales
program 
    : statement+ 
    ;

statement 
    : variableDeclaration 
    | assignmentStatement 
    | printStatement 
    | conditionalStatement
    | whileLoop
    | forLoop
    | functionDeclaration
    | functionCall ';' 
    | expression ';' 
    ;

// Declaración de variables
variableDeclaration 
    : type ID '=' expression ';' 
    ;

// Asignación de variables
assignmentStatement 
    : ID '=' expression ';' 
    ;

// Tipos de datos
type 
    : 'saldanoInt' 
    | 'saldanoString' 
    | 'saldanoDouble' 
    ;

// Declaración de funciones
functionDeclaration 
    : 'function' ID '(' paramList? ')' block
    ;

paramList
    : param (',' param)* 
    ;

param
    : type ID
    ;

// Bloques de código
block 
    : '{' statement* '}' 
    ;

// Imprimir en consola
printStatement 
    : 'print' '(' (STRING | expression) ')' ';' 
    ;

// Estructura condicional
conditionalStatement 
    : 'pan' '(' condition ')' block 
      ('queso pan' '(' condition ')' block )* 
      ('queso' block)? 
    ;

// Bucles
whileLoop 
    : 'nachoWhile' '(' condition ')' block
    ;

forLoop 
    : 'nachoFor' '(' variableDeclaration condition ';' expression ')' block
    ;

// Condiciones
condition 
    : expression comparisonOp expression 
    ;

comparisonOp 
    : '==' | '!=' | '<' | '>' | '<=' | '>=' 
    ;

// Expresiones
expression 
    : expression op=('*' | '/' | '%') expression # MultiplicativeExpression
    | expression op=('+' | '-') expression       # AdditiveExpression
    | functionCall                               # FunctionCallExpression
    | term                                       # TermExpression
    ;

// Términos
term 
    : ID 
    | NUMBER
    | DOUBLE
    | STRING
    | '(' expression ')'
    ;

// Llamadas a funciones
functionCall
    : ID '(' (expression (',' expression)*)? ')'
    ;

// Tokens
ID : [a-zA-Z_][a-zA-Z0-9_]* ;

NUMBER : [0-9]+ ;

DOUBLE : [0-9]+ '.' [0-9]+ ;

STRING : '"' (~["\\] | '\\' .)* '"' ;

WS : [ \t\r\n]+ -> skip ;  // Ignorar espacios en blanco

COMMENT : '//' ~[\r\n]* -> skip ;  // Ignorar comentarios
