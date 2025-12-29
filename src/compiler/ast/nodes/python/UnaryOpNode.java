package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class UnaryOpNode extends ExprNode {
    private final String operator;

    public UnaryOpNode(String operator, int line) {
        super("UnaryOp", line);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitUnaryOp(this);
    }
}