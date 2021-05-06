/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	charType:type -> 

public class CharType extends AbstractType {

	private int memorySize = 1;

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{CharType}";
	}

	@Override
	public int getSize() {
		return memorySize;
	}

	@Override
	public String getMAPLName() {
        return "char";
	}

	@Override
	public char getSuffix() {
        return 'b';
	}
}
