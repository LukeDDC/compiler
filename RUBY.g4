grammar RUBY;

program
  : declaration_statement* function_declaration*
  ;

function_declaration
  : DEF  ID '(' parameters? ')' ':' type NEW_LINE function_body END terminator
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

for_statement: FOR (expression | declaration_statement | assign_statement) SEMICOLON conditional_expression_list SEMICOLON assign_statement? NEW_LINE statement_body END terminator;

puts_statement: PUTS LPAREN (ID | expression ) RPAREN terminator;

gets_statement: GETS LPAREN RPAREN terminator;

if_statement:
  IF conditional_expression_list NEW_LINE statement_body END terminator
  | IF conditional_expression_list NEW_LINE statement_body ELSE statement_body END terminator
  ;
while_statement:
  WHILE conditional_expression_list NEW_LINE statement_body END terminator;

do_while_statement:
  DO statement_body NEW_LINE WHILE conditional_expression_list terminator;

type: INT_T
  | FLOAT_T
  | STRING_T
  | VOID_T
  ;

expression
  : expression '*' expression #Mult
  | expression '/' expression #Div
  | expression '-' expression #Sub
  | expression '+' expression #Add
  | '(' expression ')'        #Enclouse
  | ID                        #Variable
  | INT                       #Int
  | FLOAT                     #Float
  | STRING                    #String
  | BOOL_T                    #Bool
  ;

expression_list
  : expression (',' expression)*
  ;

conditional_expression_list:
  conditional_expression_list (AND | OR) conditional_expression
  | conditional_expression
  ;

conditional_expression:
  expression conditional_operator expression
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