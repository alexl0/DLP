/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

public interface Expression extends AST {

    boolean isModificable();
    void setModificable(boolean modificable);
    Type getType();
    void setType(Type type);

}
