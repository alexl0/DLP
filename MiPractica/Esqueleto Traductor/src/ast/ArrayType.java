/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	arrayType:type -> size:intConstant  type:type

public class ArrayType extends AbstractType {

	private IntConstant sizeNumberOfElements;
	private Type type;

	private int memorySize;

	public ArrayType(IntConstant sizeNumberOfElements, Type type) {
		this.sizeNumberOfElements = sizeNumberOfElements;
		this.type = type;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(sizeNumberOfElements, type);
	}

	public ArrayType(Object sizeNumberOfElements, Object type) {
		this.sizeNumberOfElements = (IntConstant) getAST(sizeNumberOfElements);
		this.type = (Type) getAST(type);

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(sizeNumberOfElements, type);
	}

	/**
	 * It refers to how many items the array has.
	 * 
	 * @return how many items the array has
	 */
	public IntConstant getSizeNumberOfElements() {
		return sizeNumberOfElements;
	}

	public void setSizeNumberOfElements(IntConstant sizeNumberOfElements) {
		this.sizeNumberOfElements = sizeNumberOfElements;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{size:" + getSizeNumberOfElements() + ", type:" + getType() + "}";
	}

	/**
	 * It refers to de amount of memory positions that the array take place.
	 */
	@Override
	public int getSize() {
		this.setMemorySize();
		return memorySize;
	}

	public void setMemorySize() {
		memorySize = Integer.parseInt(sizeNumberOfElements.getValue()) * type.getSize();
	}

}
