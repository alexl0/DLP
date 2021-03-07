lexer grammar Lexicon;

DATA: 'DATA';
CODE: 'CODE';

PRINT: 'print';

INT: 'int';
FLOAT: 'float';

LITENT: [0-9]+;
LITREAL: [0-9]+ '.' [0-9]+;
LITCHAR: '\'' ~[\r\n\t] '\'' | '\'\\n\'';
IDENT: [a-zA-Z][a-zA-Z0-9_]*;

PLUS: '+';
MULT: '*';
SUB: '-';
DIV: '/';

SEMICOLON: ';';

ASSIGN: '=';

OPEN_PAREN: '(';
CLOSE_PAREN: ')';

LINE_COMMENT: '//' (~'\n')* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

WHITESPACE: [ \t\r\n]+ -> skip;