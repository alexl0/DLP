/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	plusplusExpression:expression -> expr:expression

public class PlusplusExpression extends AbstractExpression {

	public PlusplusExpression(Expression expr) {
		this.expr = expr;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr);
	}

	public PlusplusExpression(Object expr) {
		this.expr = (Expression) getAST(expr);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr);
	}

	public Expression getExpr() {
		return expr;
	}
	public void setExpr(Expression expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression expr;

	public String toString() {
       return "{expr:" + getExpr() + "}";
   }
}
