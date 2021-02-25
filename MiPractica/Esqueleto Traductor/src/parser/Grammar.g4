grammar Grammar
	;
import Lexicon
	;

start: definicion+;

definicion: defVar
	| defFunc
	| defStruct
	;

defVar: 'var' IDENT ':' tipo ';'
	;

tipo: 'int'
	| 'float'
	| 'char'
	| '[' LITENT ']' tipo
	| IDENT
	;

defFunc: 'F'
	;


defStruct: 'S'
	;