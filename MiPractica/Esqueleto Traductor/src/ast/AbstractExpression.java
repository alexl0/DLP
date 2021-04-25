/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

public abstract class AbstractExpression extends AbstractAST implements Expression {
    public Type type;
    public boolean modificable;

    @Override
    public boolean isModificable() {
        return modificable;
    }

    @Override
    public void setModificable(boolean modificable) {
        this.modificable = modificable;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
