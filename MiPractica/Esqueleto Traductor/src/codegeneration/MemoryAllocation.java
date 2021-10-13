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
        int addr = 0;
        for (StructField child : node.getDefinitions())
            addr = addr + (int) child.accept(this, addr);
        return null;
    }

    public Object visit(StructField node, Object param) {
        super.visit(node, param);
        int addr = 0;
        if (param instanceof Integer) {
            addr = (int) param;
        }
        node.setAddress(addr);
        return node.getType().getSize();
    }

    public Object visit(VarDefinition node, Object param) {
        super.visit(node, param);
        if (node.getScope().equals(VarScope.GLOBAL)) {
            node.setAddress(currentAddress);
            currentAddress = currentAddress + node.getType().getSize();
        }
        return null;
    }

    public Object visit(FunDefinition node, Object param) {
        super.visit(node, param);
        int BP = 4;
        int i = node.getParams().size() - 1;
        while (i >= 0) {
            node.getParams().get(i).setAddress(BP);
            BP += node.getParams().get(i).getType().getSize();
            i--;
        }
        BP = 0;
        for (VarDefinition child : node.getDefinitions()) {
            BP = BP - child.getType().getSize();
            child.setAddress(BP);
        }
        return null;
    }

}
