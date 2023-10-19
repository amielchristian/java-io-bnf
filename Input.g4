grammar Input;

// LEXER
CLASS : 'File' | 'FileInputStream' | 'BufferedReader' | 'PrintWriter' | 'InputStreamReader' | 'DataInputStream' | 'RandomAccessFile' | 'CharArrayReader' | 'StringBufferInputStream' | 'LineNumberReader' | 'StreamTokenizer' | 'FilterReader' | 'FilterInputStream' | 'PipedReader' | 'PushbackReader' ;
SCANNER_CLASS : 'Scanner' ;
SYSTEM_IN : 'System.in' ;
INPUT_METHOD : 'nextInt' | 'nextDouble' | 'nextFloat' | 'nextLine' | 'next' | 'nextBoolean' | 'nextByte' | 'nextShort' | 'nextLong' ;
DATA_TYPE : 'int' | 'double' | 'float' | 'String' | 'char' | 'boolean' | 'byte' | 'short' | 'long' ;
DIGIT : [0-9]+ ;
LETTER : [a-zA-Z] ;
SYMBOL : '~' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '=' | '{' | '}' | '[' | ']' | '|' | '\\' | '/' | ':' | ';' | '"' | '\'' | '<' | '>' | ',' | '.' | '?' | 'ε' ;
BOOLEAN : 'true' | 'false' ;

// PARSER
input_statement: scanner_declaration input_expression | solitary_input_expression ;
scanner_declaration: SCANNER_CLASS variable_name '=' new_scanner ';' ;
input_expression: variable_declaration '=' variable_name '.' INPUT_METHOD '(' radix? ')' ';' ;
solitary_input_expression: variable_declaration '=' new_scanner '.' INPUT_METHOD '(' radix? ')' ';' ;
new_scanner: 'new' package '(' (variable_name | SYSTEM_IN) ')' ;

package: 'java.util.'? SCANNER_CLASS ;
class_instance : 'new' CLASS '(' (STRING | variable_name | CLASS_INSTANCE | EPSILON) ')' ;
radix : num | EPSILON | variable_name ;
variable_declaration: DATA_TYPE? variable_name ;
variable_name: (special_char | LETTER) (num|LETTER|special_char)* ;

special_char : '_' | '$' ;
num : DIGIT num* ;