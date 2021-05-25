/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	structType:type -> fields:structField*

public class StructType extends AbstractType {

	private List<StructField> fields;

	public StructType(List<StructField> fields) {
		this.fields = fields;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(fields);
	}

	public StructType(Object fields) {
		this.fields = this.<StructField>getAstFromContexts(fields);

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(fields);
	}

	public List<StructField> getFields() {
		return fields;
	}

	public void setFields(List<StructField> fields) {
		this.fields = fields;
	}

	@Override
	public char getSuffix() {
		return ' ';
	}

	@Override
	public String getMAPLName() {
		return "";
	}

	@Override
	public int getSize() {
		int s = 0;
		for (StructField child : getFields())
			s = s + child.getType().getSize();
		return s;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{fields: " + getFields() + "}";
	}

}
