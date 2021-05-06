/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	realType:type -> 

public class RealType extends AbstractType {

	private int memorySize = 4;

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{RealType}";
	}

	public int getSize() {
		return memorySize;
	}

	@Override
	public String getMAPLName() {
        return "float";
	}

	@Override
	public char getSuffix() {
        return 'f';
	}
}
