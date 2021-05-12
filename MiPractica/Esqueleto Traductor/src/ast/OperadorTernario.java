/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	OperadorTernario:expression -> condicion:expression  valorVerdadero:expression  valorFalso:expression

public class OperadorTernario extends AbstractExpression {

	public OperadorTernario(Expression condicion, Expression valorVerdadero, Expression valorFalso) {
		this.condicion = condicion;
		this.valorVerdadero = valorVerdadero;
		this.valorFalso = valorFalso;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, valorVerdadero, valorFalso);
	}

	public OperadorTernario(Object condicion, Object valorVerdadero, Object valorFalso) {
		this.condicion = (Expression) getAST(condicion);
		this.valorVerdadero = (Expression) getAST(valorVerdadero);
		this.valorFalso = (Expression) getAST(valorFalso);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, valorVerdadero, valorFalso);
	}

	public Expression getCondicion() {
		return condicion;
	}
	public void setCondicion(Expression condicion) {
		this.condicion = condicion;
	}

	public Expression getValorVerdadero() {
		return valorVerdadero;
	}
	public void setValorVerdadero(Expression valorVerdadero) {
		this.valorVerdadero = valorVerdadero;
	}

	public Expression getValorFalso() {
		return valorFalso;
	}
	public void setValorFalso(Expression valorFalso) {
		this.valorFalso = valorFalso;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression condicion;
	private Expression valorVerdadero;
	private Expression valorFalso;

	public String toString() {
       return "{condicion:" + getCondicion() + ", valorVerdadero:" + getValorVerdadero() + ", valorFalso:" + getValorFalso() + "}";
   }
}
