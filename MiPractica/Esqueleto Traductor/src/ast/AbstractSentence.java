/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

public abstract class AbstractSentence extends AbstractAST implements Sentence {
    protected FunDefinition definition;

    public FunDefinition getFunDefinition() {
        return definition;
    }

    public void setFunDefinition(FunDefinition definition) {
        this.definition = definition;
    }
}
