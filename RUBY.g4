grammar RUBY;

program
  : declaration_statement* function_declaration*
  ;

function_declaration
  : DEF  ID '(' parameters? ')' ':' type new_line function_body END terminator
  ;

new_line
  : NEW_LINE #NewLine
  ;

function_body
  : (function_call | statement)+
  |
  ;

function_call
  : ID '(' expression_list? ')' terminator # FunctionCall
  ;

parameters
  : parameter (',' parameter)*
  ;

parameter
  : type ':' ID
  ;

statement
  : declaration_statement
  | if_statement
  | while_statement
  | do_while_statement
  | assign_statement
  | for_statement
  | puts_statement
  | gets_statement
  ;

statement_body
  : statement*
  ;

declaration_statement
  : type ':' ID (ASSIGN expression)? terminator
  ;

assign_statement
  : ID ASSIGN expression terminator #Assign;

for_statement: FOR (expression | declaration_statement | assign_statement) SEMICOLON conditional_expression_list SEMICOLON assign_statement? new_line statement_body END terminator;

puts_statement: PUTS LPAREN (ID | expression ) RPAREN terminator;

gets_statement: GETS LPAREN RPAREN terminator;

if_statement:
  IF conditional new_line statement_body END terminator
	| IF conditional new_line statement_body else_statement statement_body END terminator
  ;

else_statement
  : ELSE
  ;

while_statement:
  WHILE conditional new_line statement_body END terminator;

do_while_statement:
  DO statement_body new_line WHILE conditional terminator;

conditional
  : conditional_expression_list
  ;

type: INT_T
  | FLOAT_T
  | STRING_T
  | VOID_T
  ;

expression
  : expression aritmetic_operator expression #AritmeticOperation
  | '(' expression ')'        #Enclouse
  | ID                        #Variable
  | INT                       #Int
  | FLOAT                     #Float
  | STRING                    #String
  | BOOL_T                    #Bool
  ;

aritmetic_operator
  : '*' #Mult
  | '/' #Div
  | '-' #Sub
  | '+' #Add
  ;

expression_list
  : expression (',' expression)*
  ;

conditional_expression_list:
  conditional_expression_list logical_operator conditional_expression
  | conditional_expression
  ;

conditional_expression
  : expression conditional_operator expression
  | expression
  ;

logical_operator
  : AND
  | OR
  ;

terminator:
  | NEW_LINE
  | SEMICOLON
  | terminator SEMICOLON
  | terminator NEW_LINE
  ;

conditional_operator: EQUALS
    | NOT_EQUALS
    | GREATER_THAN
    | LESSER_THAN
    | GREATER_THAN_OR_EQUALS
    | LESSER_THAN_OR_EQUALS
    ;

// OPERATORS
GREATER_THAN_OR_EQUALS: '>=';
LESSER_THAN_OR_EQUALS:  '<=';
GREATER_THAN:           '>';
LESSER_THAN:            '<';
NOT_EQUALS:             '!=';
ASSIGN:                 '=';
EQUALS:                 '==';
AND:                    '&&';
OR:                     '||';
// MATH OPERATORS
ADD:                    '+';
SUB:                    '-';
MULT:                   '*';
DIV:                    '/';

// Separator
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMICOLON:          ';';
COMMA:              ',';
NEW_LINE:           '\r'? '\n';

// KEYWORDS
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
END: 'end';
FOR: 'for';
DEF: 'def';
GETS: 'gets';
PUTS: 'puts';

// KEYWORDS TYPES
INT_T:    'Integer';
FLOAT_T:  'Float';
STRING_T: 'String';
BOOL_T: 'Bool';
VOID_T: 'Void';

ID: LETTER+
  ;
INT: DIGIT+
  ;
FLOAT: DIGIT+ '.' DIGIT+
  ;
STRING: '"' .*? '"';

fragment LETTER:
  [a-zA-Z]
  | '_'
  ;

fragment DIGIT:
  [0-9]
  ;

WS : (' '|'\t')+ -> skip;
