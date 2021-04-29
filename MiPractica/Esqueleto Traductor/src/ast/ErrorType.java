/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	errorType:type -> 

public class ErrorType extends AbstractType {

	private int memorySize = 0;

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{ErrorType}";
	}

	@Override
	public int getSize() {
		return memorySize;
	}
}
