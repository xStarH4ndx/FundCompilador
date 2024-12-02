grammar OlmosTypes;

// Reglas principales
program : statement+ ;
statement : variableDeclaration
          | functionDeclaration
          | controlFlow
          | printStatement
          | inputStatement
          | returnStatement
          | listDeclaration
          | expression ';' ;

// Declaración de variables
variableDeclaration : 'Saldano' type ID '=' expression ';' ;
type : 'int' | 'float' | 'string' | 'bool' | 'list' ;

// Declaración de listas
listDeclaration : 'SaldanosList' '=' '[' (expression (',' expression)*)? ']' ';' ;

// Declaración de funciones
functionDeclaration : 'defOlmos' ID '(' parameterList? ')' '(' type ')' '{' statement* '}' ;
parameterList : parameter (',' parameter)* ;
parameter : type ID ;
returnStatement : 'OlmosReturn' expression ';' ;

// Control de flujo
controlFlow : ifStatement | whileLoop | forLoop ;
ifStatement : 'Olmos' 'say' '(' condition ')' '{' statement* '}' ( 'else' '{' statement* '}' )? ;
whileLoop : 'nachoWhile' '(' condition ')' '{' statement* '}' ;
forLoop : 'paltaFor' '(' variableDeclaration condition ';' expression ')' '{' statement* '}' ;

// Condiciones y expresiones
condition : logicalExpression ;
logicalExpression : comparisonExpression (('&&' | '||') comparisonExpression)* ;
comparisonExpression : expression comparisonOp expression | expression ;
comparisonOp : '==' | '!=' | '<' | '>' | '<=' | '>=' ;
expression : term (('+' | '-' | '*' | '/' | '%' | '=') term)* ;
term : ID | NUMBER | STRING | FLOAT '(' expression ')' | functionCall ;
functionCall : ID '(' argumentList? ')' ;
argumentList : expression (',' expression)* ;

// Entrada y salida
printStatement : 'saldanosprint' '(' (STRING | expression) ')' ';' ;
inputStatement : 'Saldano' type ID '=' 'olmosKeep' '(' STRING ')' ';' ;

// Tokens
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER : [0-9]+ ;
STRING : '"' ~["]* '"' ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
