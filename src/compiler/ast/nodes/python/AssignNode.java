package compiler.ast.nodes.python;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class AssignNode extends StmtNode {
    private String operator = "=";

    public AssignNode(int line) {
        super("Assign", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitAssign(this);
    }
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isAugmented() {
        return !operator.equals("=");
    }

    @Override
    public String toString() {
        return "AssignNode[" + operator + "]";
    }
}