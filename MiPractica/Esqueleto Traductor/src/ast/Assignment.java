/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.List;

import org.antlr.v4.runtime.*;

import visitor.*;

//	assignment:sentence -> left:expression  right:expression

public class Assignment extends AbstractSentence {

	public Assignment(List<Expression> left, List<Expression> right) {
		this.left = left;
		this.right = right;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, right);
	}

	public Assignment(Object left, Object right) {
		this.left = (List<Expression>) getAST(left);
		this.right = (List<Expression>) getAST(right);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, right);
	}

	public List<Expression> getLeft() {
		return left;
	}
	public void setLeft(List<Expression> left) {
		this.left = left;
	}

	public List<Expression> getRight() {
		return right;
	}
	public void setRight(List<Expression> right) {
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Expression> left;
	private List<Expression> right;

	public String toString() {
       return "{left:" + getLeft() + ", right:" + getRight() + "}";
   }
}
