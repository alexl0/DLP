/**
 * Examen 6 Julio 2021 DLP Pregunta 1
 * Se ha modificado el fichero MiPractica/Esqueleto Traductor/abstracta.txt:
 * En la línea 34 se ha añadido la sentencia "RegAsig".
 * Al igual que "assignment", necesita dos expresiones llamadas "left" y "right".
 * Al pasar la gramática abstracta por VGen, se ha creado la clase  RegAsig.java,
 * y se han modificado ligeramente las clases ASTPrinter.java, DefaultVisitor.java, Visitor.java y PlantillaParaVisitors.txt
 */

/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

public interface AST {

    public Object accept(Visitor visitor, Object param);

    Position getStart();

    Position getEnd();

    public void setPositions(Object... children);

}
