//FALTA EL EOF

grammar Grammar
	;
import Lexicon
	;

start: definicion+;

definicion: defVar
	;

defVar: 'var' IDENT ':' tipo ';'
	;

tipo: 'int'
	| 'float'
	| 'char'
	| '[' LITENT ']' tipo
	| IDENT
	;
