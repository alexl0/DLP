/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    // # ----------------------------------------------------------
    /*
     * Poner aquí los visit.
     *
     * Si se ha usado VGen, solo hay que copiarlos de la clase
     * 'visitor/_PlantillaParaVisitors.txt'.
     */

    // public Object visit(Program prog, Object param) {
    // ...
    // }

    // class FunDefinition { String name; List<Definition> params; Type return_t;
    // List<VarDefinition> definitions; List<Sentence> sentences; }
    public Object visit(FunDefinition node, Object param) {

        super.visit(node, param);

        predicado(tipoSimple(node.getReturn_t()), "The return of a function must be a simple type", node);

        return null;
    }

    // class Read { Expression expression; }
    public Object visit(Read node, Object param) {

        super.visit(node, param);

        predicado(node.getExpression().isModificable(), "The expression is not modifiable ", node);

        return null;
    }

    // class Variable { String name; }
    public Object visit(Variable node, Object param) {
        node.setType(node.getVarDefinition().getType());
        node.setModificable(true);
        return null;
    }

    // class FuncInvocationExpression { String name; List<Expression> params; }
    public Object visit(FuncInvocationExpression node, Object param) {
        super.visit(node, param);

        predicado(node.getParams().size() == node.getDefinition().getParams().size(),
                "The number of arguments of " + node.getName() + " does not match the definition", node);

        if (node.getParams().size() == node.getDefinition().getParams().size()) {
            for (int i = 0; i < node.getParams().size(); i++) {
                predicado(
                        node.getParams().get(i).getType().getClass()
                                .equals(node.getDefinition().getParams().get(i).getType().getClass()),
                        "The type of the argument " + node.getParams().get(i) + " does not match the definition", node);
            }
        }
        node.setType(node.getDefinition().getReturn_t());
        node.setModificable(false);

        return null;
    }

    // class FuncInvocation { String name; List<Expression> params; }
    public Object visit(FuncInvocation node, Object param) {

        super.visit(node, param);

        predicado(node.getParams().size() == node.getFunDefinition().getParams().size(),
                "The number of arguments of " + node.getName() + " does not match the definition", node);

        if (node.getParams().size() == node.getFunDefinition().getParams().size()) {
            for (int i = 0; i < node.getParams().size(); i++) {
                predicado(
                        node.getParams().get(i).getType().getClass()
                                .equals(node.getFunDefinition().getParams().get(i).getType().getClass()),
                        "The type of the argument " + node.getParams().get(i) + " does not match the definition", node);
            }
        }

        return null;
    }

    // class IntConstant { String value; }
    public Object visit(IntConstant node, Object param) {
        node.setType(new IntType());
        node.setModificable(false);
        return null;
    }

    // class RealConstant { String value; }
    public Object visit(RealConstant node, Object param) {
        node.setType(new RealType());
        node.setModificable(false);
        return null;
    }

    // class CharConstant { String value; }
    public Object visit(CharConstant node, Object param) {
        node.setType(new CharType());
        node.setModificable(false);
        return null;
    }

    // class VoidConstant { }
    public Object visit(VoidConstant node, Object param) {
        node.setType(new VoidType());
        node.setModificable(false);
        return null;
    }

    // class ArithmeticExpression { Expression left; String operator; Expression
    // right; }
    public Object visit(ArithmeticExpression node, Object param) {
        super.visit(node, param);

        predicado(node.getLeft().getType().getClass().equals(node.getRight().getType().getClass()),
                "The operands must be of the same type", node);

        predicado(
                node.getLeft().getType().getClass().equals(IntType.class)
                        || node.getLeft().getType().getClass().equals(RealType.class),
                "The operands must be of type integer or real", node);

        node.setType(node.getLeft().getType());
        node.setModificable(false);
        return null;
    }

    // class ArrayType { IntConstant size; Type type; }
    public Object visit(ArrayType node, Object param) {
        super.visit(node, param);

        predicado(Integer.parseInt(node.getSize().getValue()) > 0, "The size of the array must be greater than zero",
                node);

        return null;
    }

    // class Print { Expression expression; }
    public Object visit(Print node, Object param) {
        super.visit(node, param);

        if (!(node.getExpression().getType().getClass().equals(ErrorType.class)))
            predicado(isPrimitive(node.getExpression().getType()),
                    "The expression to be printed must be of simple type", node);

        return null;
    }

    // class Printsp { Expression expression; }
    public Object visit(Printsp node, Object param) {
        super.visit(node, param);

        if (!(node.getExpression().getType().getClass().equals(ErrorType.class)))
            predicado(isPrimitive(node.getExpression().getType()),
                    "The expression to be printed must be of simple type", node);

        return null;
    }

    // class Println { Expression expression; }
    public Object visit(Println node, Object param) {
        super.visit(node, param);

        if (!(node.getExpression().getType().getClass().equals(ErrorType.class)))
            predicado(isPrimitive(node.getExpression().getType()),
                    "The expression to be printed must be of simple type", node);

        return null;
    }

    // class LogicalExpression { Expression left; String operator; Expression right;
    // }
    public Object visit(LogicalExpression node, Object param) {
        super.visit(node, param);

        predicado(node.getLeft().getType().getClass().equals(node.getRight().getType().getClass())),
                "The operands must be of the same type", node);

        predicado((node.getLeft().getType().getClass().equals(IntType.class)), "Operands must be of type integer", node);

        node.setType(new IntType());
        node.setModificable(false);

		return null;
	}

    // class UnaryExpression { String operator; Expression expr; }
    public Object visit(UnaryExpression node, Object param) {
        super.visit(node, param);

        predicado(node.getExpr().getType().getClass().equals(IntType.class), "Los operandos deben ser de tipo entero",
                node);

        node.setType(new IntType());
        node.setModificable(false);
        return null;
    }
    // ...
    // ...
    // ...

    // class While { Expression expression; List<Sentence> sentence; }
    public Object visit(While node, Object param) {
        super.visit(node, param);

        predicado(node.getExpression().getType().getClass().equals(IntType.class),
                "La condición debe ser de tipo entero", node);

        return null;
    }
    // # ----------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    // class IfElse { Expression expression; List<Sentence> if_s; List<Sentence>
    // else_s; }
    public Object visit(IfElse node, Object param) {
        boolean hasReturn = node.getFunDefinition().hasReturn();

        super.visit(node, param);

        predicado(node.getExpression().getType().getClass().equals(IntType.class),
                "La condición debe ser de tipo entero", node);

        boolean returnIf = false;
        boolean returnElse = false;

        if (node.getIf_s() != null)
            for (Sentence child : node.getIf_s())
                if (child instanceof Return)
                    returnIf = true;

        if (node.getElse_s() != null)
            for (Sentence child : node.getElse_s())
                if (child instanceof Return)
                    returnElse = true;

        if (!hasReturn)
            node.getFunDefinition().setReturn(returnIf && returnElse);

        return null;
    }

    private boolean tipoSimple(Type tipo) {
        if (tipo instanceof CharType)
            return true;
        if (tipo instanceof IntType)
            return true;
        if (tipo instanceof RealType)
            return true;
        return false;
    }

    /**
     * predicado. Método auxiliar para implementar los predicados. Borrar si no se
     * quiere usar.
     *
     * Ejemplos de uso (suponiendo que existe un método "esPrimitivo(expr)"):
     *
     * 1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
     * primitivo", expr.getStart()); 2. predicado(esPrimitivo(expr.tipo), "La
     * expresión debe ser de un tipo primitivo", expr); // Se asume getStart() 3.
     * predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
     * primitivo");
     *
     * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero
     * fuente donde estaba el nodo (y así poder dar información más detallada de la
     * posición del error). Si se usa VGen, dicho método habrá sido generado en
     * todos los nodos del AST. No es obligatorio llamar a getStart() (ejemplo 2),
     * ya que si se pasa el nodo, se usará por defecto dicha posición. Si no se
     * quiere imprimir la posición del fichero, se puede omitir el tercer argumento
     * (ejemplo 3).
     *
     * @param condition     Debe cumplirse para que no se produzca un error
     * @param errorMessage  Se imprime si no se cumple la condición
     * @param posicionError Fila y columna del fichero donde se ha producido el
     *                      error.
     */

    private void predicado(boolean condition, String errorMessage, AST node) {
        predicado(condition, errorMessage, node.getStart());
    }

    private void predicado(boolean condition, String errorMessage, Position position) {
        if (!condition)
            errorManager.notify("Type Checking", errorMessage, position);
    }

    private void predicado(boolean condition, String errorMessage) {
        predicado(condition, errorMessage, (Position) null);
    }

    private ErrorManager errorManager;

    private boolean isPrimitive(Type type) {
        return (new CharType().getClass().equals(type.getClass()) || new IntType().getClass().getClass().equals(type)
                || new RealType().getClass().getClass().equals(type));
    }
}
