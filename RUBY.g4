grammar RUBY;

program:
  statement+;

statement: declaration_statement
  | if_statement
  ;

declaration_statement: type ':' ID ASSIGN expression terminator;
if_statement:
  IF conditional_expression_list NEW_LINE statement_body END terminator
  | IF conditional_expression_list NEW_LINE statement_body ELSE statement_body END terminator
  ;

statement_body:
  statement
  | statement_body statement
  | terminator;

type: INT_T
  | FLOAT_T
  | STRING_T
  ;

expression: expression '*' expression
  | expression '/' expression
  | expression ('+' | '-') expression
  | '(' expression ')'
  | ID
  | INT
  | FLOAT
  | STRING
  | BOOL_T
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

// KEYWORDS TYPES
INT_T:    'Integer';
FLOAT_T:  'Float';
STRING_T: 'String';
BOOL_T: 'Bool';

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