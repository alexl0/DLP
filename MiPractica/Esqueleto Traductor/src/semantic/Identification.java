/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import ast.*;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

	private ContextMap cm=new ContextMap();

	public Identification(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// # ----------------------------------------------------------
	/*
	 * Poner aquí los visit.
	 *
	 * Si se ha usado VGen, solo hay que copiarlos de la clase 'visitor/_PlantillaParaVisitors.txt'.
	 */

	// public Object visit(Program prog, Object param) {
	//      ...
	// }

	// ...
	// ...
	// ...

	// # --------------------------------------------------------
	// Métodos auxiliares recomendados (opcionales) -------------

	//	class VarDefinition { String name;  Type type; }
	public Object visit(VarDefinition node, Object param) {
		super.visit(node, param);

		if(cm.getFromTop(node.getName())!=null)
			this.error(node.getName(), node.getStart());
		else
			cm.put(param,  node);

		return null;
	}

	//	class StructDefinition { VarType name;  List<StructField> definitions; }
	public Object visit(StructDefinition node, Object param) {
		if(cm.getFromTop(node.getName().getType())!=null)
			this.error(node.getName().getType(), node.getStart());
		else
			cm.put(param,  node);

		cm.set();
		super.visit(node, param);
		cm.reset();

		return null;
	}

	//	class FunDefinition { String name;  List<Definition> params;  Type return_t;  List<VarDefinition> definitions;  List<Sentence> sentences; }
	public Object visit(FunDefinition node, Object param) {

		if(cm.getFromTop(node.getName())!=null)
			this.error(node.getName(), node.getStart());
		else
			cm.put(param,  node);

		cm.set();
		super.visit(node, param);
		cm.reset();

		return null;
	}

	//	class FuncInvocation { String name;  List<Expression> params; }
	public Object visit(FuncInvocation node, Object param) {

		//Obtener de la pila
		Object o=cm.getFromAny(node.getName());

		//Comprobar que la variable está definida. Si no lo está, lanzar un error.
		if(o==null)
			this.error(node.getName(), node.getStart());

		//Comprobar que la definicion es de lo que tienes que ser (funcInvocation que es de tipo funcion)
		else if(! (o instanceof FunDefinition))
			this.error(node.getName(), node.getStart());

		//Asociar lo que encuentre al nodo
		node.setDefinition((FunDefinition)o);

		super.visit(node, param);

		return null;
	}

	//	class Variable { String name; }
	public Object visit(Variable node, Object param) {

		//Obtener de la pila
		Object o = cm.getFromAny(node.getName());

		//Comprobar que la variable está definida. Si no lo está, lanzar un error.
		if(o==null)
			this.error(node.getName(), node.getStart());

		//Comprobar que la definicion es de lo que tienes que ser (funcInvocation que es de tipo funcion)
		else if(! (o instanceof VarDefinition))
			this.error(node.getName(), node.getStart());

		//Asociar lo que encuentre al nodo
		node.setVariable((VarDefinition)o);

		return null;
	}

	//	class VarType { String type; }
	public Object visit(VarType node, Object param) {

		//Obtener de la pila
		Object o = cm.getFromAny(node.getStructDefinition().getName().getType());

		//Comprobar que la variable está definida. Si no lo está, lanzar un error.
		if(o==null)
			this.error(node.getStructDefinition().getName().getType(), node.getStart());

		//Comprobar que la definicion es de lo que tienes que ser (funcInvocation que es de tipo funcion)
		else if(! (o instanceof StructDefinition))
			this.error(node.getStructDefinition().getName().getType(), node.getStart());

		//Asociar lo que encuentre al nodo
		node.setStructDefinition((StructDefinition)o);

		return null;
	}

	private void error(String msg) {
		error(msg, null);
	}

	private void error(String msg, Position position) {
		errorManager.notify("Identification", msg, position);
	}


	private ErrorManager errorManager;
}
