grammar Output;

// LEXER
DIGIT : [0-9]+ ;
LETTER : [a-zA-Z] ;
SYMBOL : '~' | '!' | '@' | '#' | '$' | '^' | '&' | '*' | '(' | ')' | '_' | '{' | '}' | '[' | ']' | '|' | '\\' | ':' | ';' | '"' | '\'' | '<' | '>' | ',' | '.' | '?' | 'ε' | ' ' ;
OPERATORS: '-' | '+' | '=' | '/' | '%' ;
SPECIAL_CHAR : '_' | '$' ;
BOOLEAN : 'true' | 'false' ;
OBJECT_INSTANCE : 'System.out' ;

// PARSER
identifier_chars : LETTER | DIGIT | SPECIAL_CHAR ;
floating_point_literal : (DIGIT DIGIT* '.' DIGIT* | DIGIT* '.' DIGIT DIGIT*) ;
integer_literal : DIGIT DIGIT* ;
variable : (LETTER | SPECIAL_CHAR) identifier_chars* ;
character : LETTER | SYMBOL | DIGIT | OPERATORS;
character_literal : '\'' character '\'' ;
boolean_literal : '!'* ('(' BOOLEAN ')' | BOOLEAN) ;
string_content : (character | '+' | '-' | '*' | '/' | '!')+ ;
string_literal : (primary_expression '+')* '"' string_content? '"' ('+' primary_expression)* | '(' string_literal ')';
primary_expression : variable | boolean_literal | character_literal | method_statement | arithmetic_operations | array_index ;
number_operator : '-'? (integer_literal | floating_point_literal | variable) ;
arithmetic_operations : '-'? ('(' number_operator ')' | number_operator) (( '-' | '+' | '*' | '/' | '%') ( number_operator | '(' number_operator ')'))* ;
method_statement : variable '()' ('+' variable '()')* ;
array_index : variable '[' integer_literal ']' ('[' integer_literal ']')* ;
expressions : string_literal | primary_expression | '(' string_literal ')' | '(' primary_expression ')' ;
format_arguments : expressions (',' expressions)* ;
format_string : '"' (string_content | ('%s' | '%S' | '%c' | '%C' | '%b' | '%B'| '%d' | '%f' | '%' floating_point_literal | '%n'))* '"';

program : statements ;
statements : output_statement output_statement* ;
output_statement : print_statement ';' ;
print_statement :  OBJECT_INSTANCE  ( '.print(' expressions ')'
                                    | '.println(' expressions? ')' 
                                    | '.printf(' format_string ( ',' format_arguments)?  ')' ) ;