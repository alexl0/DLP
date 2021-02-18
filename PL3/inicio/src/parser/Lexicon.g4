lexer grammar Lexicon;

LITENT : [0-9]+;
IDENT : [a-zA-Z_][a-zA-Z_0-9]*

WHITESPACE : [ \t\r\n]+ -> skip;
