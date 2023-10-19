grammar Output;

// LEXER
DIGIT : [0-9]+ ;
LETTER : [a-zA-Z] ;
SYMBOL : '~' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '=' | '{' | '}' | '[' | ']' | '|' | '\\' | '/' | ':' | ';' | '"' | '\'' | '<' | '>' | ',' | '.' | '?' | 'ε' | ' ' ;
SPECIAL_CHAR : '_' | '$' ;
BOOLEAN : 'true' | 'false' ;
OBJECT_INSTANCE : 'System.out' ;

// PARSER
identifier_chars : LETTER | DIGIT | SPECIAL_CHAR ;
exponent : ('E' | 'e') DIGIT DIGIT* ;
floating_point_literal : (DIGIT DIGIT* '.' DIGIT* | DIGIT* '.' DIGIT DIGIT*) exponent? 'f'? ;
integer_literal : DIGIT DIGIT* exponent ;
variable : (LETTER | SPECIAL_CHAR) identifier_chars* ;
character : LETTER | SYMBOL | DIGIT ;
boolean_literal : '!'? ('(' BOOLEAN ')' | BOOLEAN) ;
string_content : character character* ;
string_literal : (primary_expression '+')* '"' string_content '"' ('+' primary_expression)* ;
primary_expression : variable | boolean_literal | character | method_statement | arithmetic_operations | array_index ;
number_operator : '-'? (integer_literal | floating_point_literal | variable) ;
arithmetic_operations : '-'? ('(' number_operator ')' | number_operator) (( '-' | '+' | '*' | '/' | '%') (number_operator | '(' number_operator ')'))* ;
method_statement : variable '()' ('+' variable '()')* ;
array_index : variable '[' integer_literal ']' ('[' integer_literal ']')* ;
expressions : string_literal | primary_expression ;
format_arguments : expressions (',' expressions)* ;
format_string : '"' (string_content | '%' ('s' | 'S' | 'c' | 'C' | 'b' | 'B'| 'd' | 'f' | floating_point_literal | 'n'))* '"';
object_instance : 'System.out' ;

program : statements ;
statements : output_statement output_statement* ;
output_statement : print_statement ';' ;
print_statement :  object_instance  ( '.print(' expressions ')'
                                    | '.println(' expressions ')'
                                    | '.printf(' format_string (',' format_arguments)? ')' ) ;