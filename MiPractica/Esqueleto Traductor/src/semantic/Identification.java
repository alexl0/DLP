/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import java.util.HashMap;
import java.util.Map;

import ast.*;
import ast.VarDefinition.VarScope;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

	public Identification(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// # ----------------------------------------------------------
	/*
	 * Poner aquí los visit.
	 *
	 * Si se ha usado VGen, solo hay que copiarlos de la clase
	 * 'visitor/_PlantillaParaVisitors.txt'.
	 */

	// public Object visit(Program prog, Object param) {
	// ...
	// }

	// ...
	// ...
	// ...

	// class VarDefinition { String name; Type type; }
	public Object visit(VarDefinition node, Object param) {
		super.visit(node, param);

		if (varsContextMap.getFromTop(node.getName()) != null)
			error("Already defined Variable: " + node.getName(), node.getStart());

		node.setScope(param instanceof VarScope ? (VarScope) param : VarScope.GLOBAL);

		varsContextMap.put(node.getName(), node);

		return null;
	}

	// class StructDefinition { VarType name; List<StructField> definitions; }
	public Object visit(StructDefinition node, Object param) {
		if (varsContextMap.getFromAny(node.getName().getType()) != null)
			error("Already defined Struct: " + node.getName().getType(), node.getStart());

		varsContextMap.put(node.getName().getType(), node);
		structsMap.put(node.getName().getType(), node);

		varsContextMap.set();
		super.visit(node, param);
		varsContextMap.reset();

		return null;
	}

	// class FunDefinition { String name; List<Definition> params; Type return_t;
	// List<VarDefinition> definitions; List<Sentence> sentences; }
	public Object visit(FunDefinition node, Object param) {

		if (functionsMap.get(node.getName()) != null)
			error("Already defined Function: " + node.getName(), node.getStart());
		functionsMap.put(node.getName(), node);

		varsContextMap.set();
		super.visit(node, param);
		varsContextMap.reset();

		return null;
	}

	// class FuncInvocation { String name; List<Expression> params; }
	public Object visit(FuncInvocation node, Object param) {
		super.visit(node, param);

		FunDefinition definition = functionsMap.get(node.getName());

		if (definition == null)
			error("Undefined procedure: " + node.getName(), node.getStart());

		node.setFuncDefinition(definition);

		return null;
	}

	// class FuncInvocationExpression { String name; List<Expression> params; }
	public Object visit(FuncInvocationExpression node, Object param) {
		super.visit(node, param);

		FunDefinition definition = functionsMap.get(node.getName());

		if (definition == null)
			error("Undefined function: " + node.getName(), node.getStart());

		node.setDefinition(definition);

		return null;
	}

	// class Variable { String name; }
	public Object visit(Variable node, Object param) {

		Definition definition = varsContextMap.getFromAny(node.getName());

		if (definition == null)
			error("Undefined Variable: " + node.getName(), node.getStart());

		node.setVarDefinition((VarDefinition) definition);

		return null;
	}

	// class VarType { String type; }
	public Object visit(VarType node, Object param) {

		super.visit(node, param);

		StructDefinition definition = structsMap.get(node.getType());
		if (definition == null)
			error("Undefined Struct: " + node.getType(), node.getStart());

		node.setStructDefinition(definition);

		return null;
	}

	// class StructField { String name; Type type; }
	public Object visit(StructField node, Object param) {
		super.visit(node, param);

		Definition definition = varsContextMap.getFromTop(node.getName());

		if (definition != null)
			error("Field already defined on the struct" + node.getName(), node.getStart());

		node.setDefinition((StructDefinition) param);

		varsContextMap.put(node.getName(), node);

		return null;
	}

	// # --------------------------------------------------------
	// Métodos auxiliares recomendados (opcionales) -------------
	@SuppressWarnings("unused")
	private void error(String msg) {
		error(msg, null);
	}

	private void error(String msg, Position position) {
		errorManager.notify("Identification", msg, position);
	}

	private ErrorManager errorManager;
	private Map<String, StructDefinition> structsMap = new HashMap<String, StructDefinition>();
	private Map<String, FunDefinition> functionsMap = new HashMap<String, FunDefinition>();
	private ContextMap<String, Definition> varsContextMap = new ContextMap<String, Definition>();

}
