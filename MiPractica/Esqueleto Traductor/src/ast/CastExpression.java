/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	castExpression:expression -> type:type  expr:expression

public class CastExpression extends AbstractExpression {

	public CastExpression(Type type, Expression expr) {
		this.castingType = type;
		this.expr = expr;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, expr);
	}

	public CastExpression(Object type, Object expr) {
		this.castingType = (Type) getAST(type);
		this.expr = (Expression) getAST(expr);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, expr);
	}

	public Type getCastingType() {
		return castingType;
	}
	public void setCastingType(Type castingType) {
		this.castingType = castingType;
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

	private Type castingType;
	private Expression expr;

	public String toString() {
       return "{type:" + getType() + ", expr:" + getExpr() + "}";
   }
}
