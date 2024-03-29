/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	intType:type -> 

public class IntType extends AbstractType {

	private int memorySize = 2;

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{IntType}";
	}

	public int getSize() {
		return memorySize;
	}

	@Override
	public String getMAPLName() {
        return "int";
	}

	@Override
	public char getSuffix() {
        return 'i';
	}
}
