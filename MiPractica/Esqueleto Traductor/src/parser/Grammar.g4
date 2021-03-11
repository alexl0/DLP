grammar Grammar
	;

import Lexicon
	;

@parser::header {
    import ast.*;
	import ast.VarDefinition.VarScope;
}

start returns[Program ast]
	: definitions { $ast=new Program($definitions.list); } EOF
	;

definitions returns[List<Definition> list = new ArrayList<Definition>();]
	: (definition { $list.add($definition.ast); })+
	;

definition returns[Definition ast]
	: defVar			{$ast=$defVar.ast;}
	| defStruct			{$ast=$defStruct.ast;}
	| defFunc			{$ast= $defFunc.ast;}
	;

sentencias returns [List<Sentence> list = new ArrayList<>();]
	: (sentencia {$list.add($sentencia.ast);})*
	;

sentencia returns [Sentence ast]
	: 'read' expr ';' 			{$ast = new Read($expr.ast);}
	| 'print' expr ';' 			{$ast = new Print($expr.ast);}
	| 'printsp' expr ';' 		{$ast = new Printsp($expr.ast);}
	| 'println' expr ';' 		{$ast = new Println($expr.ast);}
	| 'println' ';'				{$ast = new Println(new VoidConstant());}
	| defWhile					{$ast = $defWhile.ast;}
	| defIf						{$ast = $defIf.ast;}
	| l = expr '=' r = expr ';'	{$ast = new Assignment($l.ast, $r.ast);}
	| 'return' expr ';'			{$ast = new Return($expr.ast);}
	| 'return' ';'				{$ast = new Return(new VoidConstant());}
	| IDENT '(' exprs ')' ';'	{$ast = new FuncInvocation($IDENT, $exprs.list);}
	;

exprs returns [List<Expression> list = new ArrayList<Expression>()]
	: ((expr { $list.add($expr.ast); } ',')* expr { $list.add($expr.ast); })?
	;

expr returns[Expression ast]
	: expr '.' expr						{ $ast = new FieldAccessExpression($expr.ast,$IDENT); }
	| e1=expr '[' e2=expr ']'				{ $ast = new IndexExpression($e1.ast,$e2.ast); }
	| l = expr op = ('*' | '/') r = expr	{ $ast = new ArithmeticExpression($l.ast,$op,$r.ast); }
	| l = expr op = ('+' | '-') r = expr	{ $ast = new ArithmeticExpression($l.ast,$op,$r.ast); }
	| '(' expr ')'							{ $ast = $expr.ast; }
	| IDENT									{ $ast = new Variable($IDENT); }
	| IDENT '(' exprs ')'					{ $ast = new FuncInvocationExpression($IDENT,$exprs.list); }
	| LITENT								{ $ast = new IntConstant($LITENT); }
	| LITREAL								{ $ast = new RealConstant($LITREAL); }
	| LITCHAR								{ $ast = new CharConstant($LITCHAR); }
	| '<' type '>' '(' expr ')'				{ $ast = new CastExpression($type.ast,$expr.ast); }
	| l=expr op=( '!=' | '==' | '>' | '<' | '>=' | '<=' ) r=expr	{ $ast = new ComparableExpression($l.ast,$op,$r.ast); }
	| l=expr op=('&&' | '||') r=expr		{ $ast = new LogicalExpression($l.ast,$op,$r.ast); }
	| op='!' expr							{ $ast = new UnaryExpression($op,$expr.ast); }
	| '\'' IDENT '\''
	;

defVars returns[List<Definition> list = new ArrayList<Definition>();]
	: ('var' IDENT ':' type ';' { $list.add(new VarDefinition($IDENT,$type.ast,VarScope.LOCAL)); })*
	;

defVar returns[Definition ast]
	: 'var' IDENT ':' type ';' {$ast=new VarDefinition($IDENT, $type.ast, VarScope.GLOBAL);}
	;

defStruct returns[StructDefinition ast]
	: 'struct' IDENT '{' fields '}' ';' { $ast = new StructDefinition(new VarType($IDENT),$fields.list); }
	;

defFunc returns[FunDefinition ast]
	: IDENT '(' params ')' (':' type)	'{' defVars sentencias '}'	{ $ast = new FunDefinition($IDENT, $params.list, $type.ast,			$defVars.list, $sentencias.list); }
	| IDENT '(' params ')'  			'{' defVars sentencias '}'	{ $ast = new FunDefinition($IDENT, $params.list, new VoidType(),	$defVars.list, $sentencias.list); }
	;

defWhile returns [While ast]
	: 'while' '(' expr ')' '{' sentencias '}'	{ $ast = new While($expr.ast, $sentencias.list); }
	;

defIf returns [IfElse ast]
	: 'if' '(' expr ')' '{' sentencias '}'														{ $ast = new IfElse($expr.ast, $sentencias.list, 	null); }
	| 'if' '(' expr ')' '{' ifSentences=sentencias '}' 'else' '{' elseSentences=sentencias '}'	{ $ast = new IfElse($expr.ast, $ifSentences.list, 	$elseSentences.list); }
	;

type returns[Type ast]
	: i='int' 				{$ast=new IntType(); $ast.setPositions($i);}
	| f='float' 			{$ast=new RealType(); $ast.setPositions($f);}
	| c='char' 				{$ast=new CharType(); $ast.setPositions($c);}
	| '[' LITENT ']' type 	{$ast=new ArrayType(new IntConstant($LITENT), $type.ast);}
	| IDENT					{$ast=new VarType($IDENT);}
	;

params returns [List<VarDefinition> list = new ArrayList<VarDefinition>()]
	: (param {$list.add($param.ast);} ',')* param{$list.add($param.ast);}
	|
	;

param returns[VarDefinition ast]
	: IDENT ':' type { $ast = new VarDefinition($IDENT,$type.ast,VarScope.PARAM); }
	;

fields returns[List<StructField> list = new ArrayList<StructField>();]
	: (IDENT ':' type ';'{ $list.add(new StructField($IDENT,$type.ast)); })+
	;
