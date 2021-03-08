grammar Grammar;
import Lexicon;
@parser::header {
    import ast.*;
}
start returns[Program ast]
	:definiciones { $ast=new Program($definiciones.list); } EOF;

definiciones returns[List<Definicion> list = new ArrayList<Definicion>();]
	: (definicion { $list.add($definicion.ast); })+;

definicion returns[Definition ast]
	:defVar
	| defStruct
	| defFunc;

sentencias: sentencia*;

sentencia:
	'read' expr ';'
	| 'print' expr ';'
	| 'printsp' expr ';'
	| 'println' expr ';'
	| defWhile
	| defIf
	| l = expr '=' r = expr ';'
	| 'return' expr? ';'
	| expr ';'
	| IDENT '(' params ')' ';';

expr:
	expr '.' IDENT
	| expr '[' expr ']'
	| l = expr op = ('*' | '/') r = expr
	| l = expr op = ('+' | '-') r = expr
	| '(' expr ')'
	| IDENT
	| IDENT '(' (expr ',')* expr ')'
	| LITENT
	| LITREAL
	| LITCHAR
	| '<' tipo '>' '(' expr ')'
	| '\'' IDENT '\'';

cond:
	expr ('<' | '>' | '<=' | '>=' | '==' | '!=') expr
	| cond ('&&' | '||') cond
	| 'true'
	| 'false';

defVar: 'var' IDENT ':' tipo ';';

defStruct: 'struct' IDENT '{' campos '}' ';';

campos: campo*;

campo: IDENT ':' tipo ';';

defFunc:
	IDENT '(' params ')' (':' tipo)? '{' defLocales sentencias '}';

params: (param ',')* param |;

param: IDENT ':' tipo;

defLocales: defLocal*;

defLocal: defVar | defStruct;

tipo: 'int' | 'float' | 'char' | '[' LITENT ']' tipo | IDENT;

defWhile: 'while' '(' cond ')' '{' sentencias '}';

defIf:
	'if' '(' cond ')' '{' sentencias '}' (
		'else' '{' sentencias '}'
	)?;