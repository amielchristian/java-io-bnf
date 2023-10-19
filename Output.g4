grammar Output;

// LEXER
DIGIT : [0-9]+ ;
LETTER : [a-zA-Z] ;
SYMBOL : '~' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '=' | '{' | '}' | '[' | ']' | '|' | '\\' | '/' | ':' | ';' | '"' | '\'' | '<' | '>' | ',' | '.' | '?' | 'ε' ;
SPECIAL_CHAR : '_' | '$' ;
BOOLEAN : 'true' | 'false' ;
BINARY_OPERATOR : '+' | '-' | '*' | '/' | '==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||';
UNARY_OPERATOR : '!' ;

// PARSER
identifier_chars : LETTER | DIGIT | SPECIAL_CHAR ;
identifier : (LETTER | SPECIAL_CHAR) identifier_chars* ;
exponent : (('e' | 'E') DIGIT DIGIT*)? ;
floating_point_literal : (DIGIT DIGIT* '.' DIGIT* | DIGIT* '.' DIGIT DIGIT*)
                         exponent? 'f'? ;
integer_literal : DIGIT DIGIT* exponent?;
number_literal : '-'? (floating_point_literal | integer_literal) ;
variable : identifier ;
character : LETTER | SYMBOL | DIGIT ;
boolean_literal : UNARY_OPERATOR? '('? BOOLEAN ')'? ;
string_content : character character? ;
//string_literal : '"' string_content '"' ('+' expressions)* ;
//arithmetic_operations : number_literal ('+' | '-' | '*' | '/') number_literal ;
//binary_expression : UNARY_OPERATOR? '(' primary_expression BINARY_OPERATOR primary_expression ')' ;
//parenthesized_expression : '(' (BINARY_OPERATOR | arithmetic_operations) ')' ;