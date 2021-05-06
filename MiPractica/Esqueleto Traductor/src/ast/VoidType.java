/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	voidType:type -> 

public class VoidType extends AbstractType {

	private int memorySize = 0;

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{VoidType}";
	}

	@Override
	public int getSize() {
		return memorySize;
	}

	@Override
	public String getMAPLName() {
        return "void";
	}

	@Override
	public char getSuffix() {
        return ' ';
	}
}
