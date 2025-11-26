grammar hello;            // Define a grammar called Hello

/** Parser rules (with uppercase)*/
r  : 'hello' ID ;  // match keyword hello followed by an identifier

/** Lexer rules (with lowercase) */
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)