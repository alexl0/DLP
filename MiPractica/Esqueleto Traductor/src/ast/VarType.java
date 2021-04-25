/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	varType:type -> type:String

public class VarType extends AbstractType {

	public String type;
	public StructDefinition structDefinition;

	public VarType(String type) {
		this.type = type;
	}

	public VarType(Object type) {
		this.type = (type instanceof Token) ? ((Token) type).getText() : (String) type;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(type);
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public StructDefinition getStructDefinition() {
		return structDefinition;
	}

	public void setStructDefinition(StructDefinition structDefinition) {
		this.structDefinition = structDefinition;
	}

	public String toString() {
		return "{type:" + getType() + "}";
	}

	public StructField getField(String nameOfField) {
		for (StructField field : structDefinition.getDefinitions()) {
			if (nameOfField.equals(field.getName())) {
				return field;
			}
		}

		return null;
	}
}
