package codegeneration;

import java.io.*;
import java.util.*;
import ast.*;
import ast.VarDefinition.VarScope;
import visitor.*;

enum CodeFunction {
    ADDRESS, VALUE
}

public class CodeSelection extends DefaultVisitor {

    private Map<String, String> instruction = new HashMap<String, String>();
    private int ifCount = 0;
    private int whileCount = 0;

    public CodeSelection(Writer writer, String sourceFile) {
        this.writer = new PrintWriter(writer);
        this.sourceFile = sourceFile;
        instruction.put("+", "add");
        instruction.put("-", "sub");
        instruction.put("*", "mul");
        instruction.put("/", "div");
        instruction.put("&&", "and");
        instruction.put("||", "or");
        instruction.put("!", "not");
        instruction.put(">", "gt");
        instruction.put("<", "lt");
        instruction.put(">=", "ge");
        instruction.put("<=", "le");
        instruction.put("==", "eq");
        instruction.put("!=", "ne");
    }

    // # ----------------------------------------------------------
    /*
     * Poner aquí los visit.
     *
     * Si se ha usado VGen, solo hay que copiarlos de la clase 'visitor/_PlantillaParaVisitors.txt'.
     */

    // Ejemplo:
    //
    // public Object visit(Program node, Object param) {
    //      out("#source \"" + sourceFile + "\"");
    //      out("call main");
    //      out("halt");
    //
    //      super.visit(node, param); // Recorrer los hijos
    //      return null;
    // }


    // # ----------------------------------------------------------
    public Object visit(Program node, Object param) {
        out("#source \"" + sourceFile + "\"");
        out("call" + " " + "main");
        out("halt");
        visitChildren(node.getDefinitions(), param);

        return null;
    }

    public Object visit(VarDefinition node, Object param) {
        out("#" + node.getScope().toString() + " " + node.getName() + ":" + node.getType().getMAPLName());

        /*if (node.getValue() != null) {
            // Direccion
            if (node.getScope().equals(VarScope.GLOBAL)) {
                out("pusha " + node.getAddress());
                // Valor
                if (node.getValue() instanceof Character) {
                    out("pushb " + (Character) node.getValue());
                    out("storeb");
                } else if (node.getValue() instanceof Integer) {
                    out("push " + (Integer) node.getValue());
                    out("store");
                } else if (node.getValue() instanceof Double) {
                    out("pushf " + (Double) node.getValue());
                    out("storef");
                }
            }
        }*/

        return null;
    }

    public Object visit(StructDefinition node, Object param) {
        String type="#type " + (node.getName().getType()) + " :{";
        out(type);
        visitChildren(node.getDefinitions(), param);

        out("}");

        return null;
    }

    public Object visit(FunDefinition node, Object param) {
        out(node.getName() + ":");
        out("#FUNC" + " " + node.getName());
        out("#RET" + " " + node.getReturn_t().getMAPLName());
        visitChildren(node.getParams(), CodeFunction.ADDRESS);
        node.getReturn_t().accept(this, CodeFunction.VALUE);
        visitChildren(node.getDefinitions(), CodeFunction.ADDRESS);

        int localesSize = 0;
        for (VarDefinition varDef : node.getDefinitions()){
            localesSize = localesSize + varDef.getType().getSize();
        }

        out("enter " + localesSize);

        if (node.getDefinitions() != null)
            for (VarDefinition def : node.getDefinitions()) {
                if (def.getScope().equals(VarScope.LOCAL) && def.getValue()!=null) {
                    //Direccion
                    out("pusha BP");
                    out("push" + " " + def.getAddress());
                    out("add");
                    // Valor
                    out("push" + def.getType().getSuffix() + " " + def.getValue());
                    out("store" + def.getType().getSuffix());
                }
            }

        visitChildren(node.getSentences(), param);

        if (! (node.getReturn_t() instanceof VoidType)) {
            return null;
        }
        else{
            int parametersSize = 0;
            for (VarDefinition varDef2 : node.getParams()){
                parametersSize = parametersSize + varDef2.getType().getSize();
            }
            out("ret " + node.getReturn_t().getSize() + "," + localesSize + "," + parametersSize);
        }

        return null;
    }

    public Object visit(StructField node, Object param) {
        String output="\t" + node.getName() + ":" + node.getType().getMAPLName();
        out(output);

        return null;
    }

    public Object visit(Print node, Object param) {
        line(node);

        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());

        return null;
    }

    public Object visit(Printsp node, Object param) {
        line(node);

        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());
        out("pushb" + " " + "32");
        out("outb");

        return null;
    }

    public Object visit(Println node, Object param) {
        line(node);

        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());
        out("pushb" + " " + "10");
        out("outb");

        return null;
    }

    public Object visit(Read node, Object param) {
        line(node);

        node.getExpression().accept(this, CodeFunction.ADDRESS);
        out("in", node.getExpression().getType());
        out("store", node.getExpression().getType());

        return null;
    }

    public Object visit(Assignment node, Object param) {
        line(node);

        node.getLeft().accept(this, CodeFunction.ADDRESS);
        node.getRight().accept(this, CodeFunction.VALUE);
        out("store", node.getLeft().getType());

        return null;
    }

    public Object visit(Return node, Object param) {
        line(node);
        node.getExpression().accept(this, CodeFunction.VALUE);

        int parametersSize = 0;
        for (VarDefinition varDef : node.getFunDefinition().getParams()){
            parametersSize = parametersSize + varDef.getType().getSize();
        }

        int localesSize = 0;
        for (VarDefinition varDef2 : node.getFunDefinition().getDefinitions()){
            localesSize = localesSize + varDef2.getType().getSize();
        }

        String stringOut="ret" + " " + node.getExpression().getType().getSize() + "," + localesSize + "," + parametersSize;
        out(stringOut);

        return null;
    }

    public Object visit(IfElse node, Object param) {
        line(node);

        int nCount = ifCount++;
        node.getExpression().accept(this, CodeFunction.VALUE);
        if (node.getElse_s() == null){
            out("jz end_if_else_" + nCount);
        }
        else{
            out("jz else_" + nCount);
        }

        if (node.getIf_s() != null){
            visitChildren(node.getIf_s(), param);
        }
        out("jmp end_if_else_" + nCount);

        if (node.getElse_s() != null) {
            out("else_" + nCount + ":");
            visitChildren(node.getElse_s(), param);
        }

        String endIE="end_if_else_" + nCount + ":";
        out(endIE);

        return null;
    }

    public Object visit(While node, Object param) {
        line(node);
        int nWhile = whileCount++;
        out("while_" + nWhile + ":");
        node.getExpression().accept(this, CodeFunction.VALUE);
        out("jz end_while_" + nWhile);

        if (node.getSentence() != null){
            visitChildren(node.getSentence(), param);
        }
        out("jmp while_" + nWhile);
        out("end_while_" + nWhile + ":");

        return null;
    }

    public Object visit(FuncInvocation node, Object param) {
        line(node);

        visitChildren(node.getParams(), CodeFunction.VALUE);
        out("call" + " " + node.getName());
        if (node.getFunDefinition().getReturn_t() instanceof VoidType){
            return null;
        }
        else{
            out("pop", node.getFunDefinition().getReturn_t());
        }

        return null;
    }

    public Object visit(Variable node, Object param) {
        if (((CodeFunction) param) != CodeFunction.VALUE) {
            assert (param == CodeFunction.ADDRESS);
            if (node.getVarDefinition().getScope().equals(VarScope.GLOBAL)){
                out("pusha " + node.getVarDefinition().getAddress());
            }
            else {
                out("pusha BP");
                out("push" + " " + node.getVarDefinition().getAddress());
                out("add");
            }
        } else {
            visit(node, CodeFunction.ADDRESS);
            out("load", node.getType());
        }
        return null;
    }

    public Object visit(IntConstant node, Object param) {
        assert (param == CodeFunction.VALUE);
        out("push" + " " + node.getValue());

        return null;
    }

    public Object visit(RealConstant node, Object param) {
        assert (param == CodeFunction.VALUE);
        out("pushf" + " " + node.getValue());

        return null;
    }

    public Object visit(CharConstant node, Object param) {
        assert (param == CodeFunction.VALUE);
        int charac = (int) node.getValue().charAt(1);
        if (charac == '\\' && node.getValue().charAt(2) == 'n'){
            charac = 10;
        }
        out("pushb" + " " + charac);

        return null;
    }

    public Object visit(FuncInvocationExpression node, Object param) {
        visitChildren(node.getParams(), CodeFunction.VALUE);
        out("call" + " " + node.getName());

        return null;
    }

    public Object visit(ArithmeticExpression node, Object param) {
        assert (param == CodeFunction.VALUE);
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getRight().accept(this, CodeFunction.VALUE);

        char sufix=node.getLeft().getType().getSuffix();
        String instr = instruction.get(node.getOperator());
        if(sufix == 'f')
            instr += sufix;
        out(instr);

        return null;
    }

    public Object visit(LogicalExpression node, Object param) {
        assert (param == CodeFunction.VALUE);
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getRight().accept(this, CodeFunction.VALUE);
        String instr=instruction.get(node.getOperator());
        out(instr);

        return null;
    }

    public Object visit(UnaryExpression node, Object param) {
        assert (param == CodeFunction.VALUE);
        node.getExpr().accept(this, CodeFunction.VALUE);
        String instr=instruction.get(node.getOperator());
        out(instr);

        return null;
    }

    public Object visit(ComparableExpression node, Object param) {
        assert (param == CodeFunction.VALUE);
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getRight().accept(this, CodeFunction.VALUE);

        char sufix=node.getLeft().getType().getSuffix();
        String instr = instruction.get(node.getOperator());
        if(sufix == 'b' || sufix == 'f')
            instr += sufix;
        out(instr);

        return null;
    }

    public Object visit(CastExpression node, Object param) {
        assert (param == CodeFunction.VALUE);
        node.getExpr().accept(this, CodeFunction.VALUE);
        String output=node.getExpr().getType().getSuffix() + "2" + node.getCastingType().getSuffix();
        out(output);

        return null;
    }

    public Object visit(FieldAccessExpression node, Object param) {
        if (((CodeFunction) param) != CodeFunction.VALUE) {
            assert (param == CodeFunction.ADDRESS);
            node.getExpr().accept(this, CodeFunction.ADDRESS);
            out("push" + " " + ((VarType) node.getExpr().getType()).getField(node.getName()).getAddress());
            out("add");
        } else {
            visit(node, CodeFunction.ADDRESS);
            out("load", node.getType());
        }
        return null;
    }

    public Object visit(IndexExpression node, Object param) {
        if (((CodeFunction) param) != CodeFunction.VALUE) {
            assert (param == CodeFunction.ADDRESS);
            node.getExpr().accept(this, CodeFunction.ADDRESS);
            node.getIndex().accept(this, CodeFunction.VALUE);
            out("push" + " " + node.getType().getSize());
            out("mul");
            out("add");
        } else {
            visit(node, CodeFunction.ADDRESS);
            out("load", node.getType());
        }
        return null;
    }

    // # ----------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    // Imprime una línea en el fichero de salida
     private void out(String instruction) {
        writer.println(instruction);
    }

    private void out(String instruccion, Type tipo) {
        out(instruccion + tipo.getSuffix());
    }

    private void line(AST node) {
        line(node.getEnd());
    }

    private void line(Position pos) {
        if (pos != null)
            out("\n#line " + pos.getLine());
        else
            System.out.println("#line no generado. Se ha pasado una Position null. Falta información en el AST");
    }

    private PrintWriter writer;
    private String sourceFile;
}
