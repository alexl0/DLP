package codegeneration;

import ast.*;
import ast.VarDefinition.*;
import visitor.*;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

    /*
     * Poner aquí los visit.
     *
     * Si se ha usado VGen, solo hay que copiarlos de la clase
     * 'visitor/_PlantillaParaVisitors.txt'.
     */

    // public Object visit(Program prog, Object param) {
    // ...
    // }

    private int currentAddress = 0;

    public Object visit(StructDefinition node, Object param) {
        super.visit(node, param);

        int address = 0;

        for (StructField child : node.getDefinitions()) {
            address += (int) child.accept(this, address);
        }

        return null;
    }

    public Object visit(StructField node, Object param) {
        super.visit(node, param);

        int address = 0;

        if (param instanceof Integer)
            address = (int) param;

        node.setAddress(address);

        return node.getType().getSize();
    }

    public Object visit(VarDefinition node, Object param) {
        super.visit(node, param);

        if (node.getScope().equals(VarScope.GLOBAL)) {
            node.setAddress(currentAddress);
            currentAddress += node.getType().getSize();
        }

        return null;
    }

    public Object visit(FunDefinition node, Object param) {
        super.visit(node, param);

        int bp = 4;

        for (int i = node.getParams().size() - 1; i >= 0; i--) {
            node.getParams().get(i).setAddress(bp);
            bp += node.getParams().get(i).getType().getSize();
        }

        bp = 0;

        for (VarDefinition child : node.getDefinitions()) {
            bp -= child.getType().getSize();
            child.setAddress(bp);
        }

        return null;
    }

}
