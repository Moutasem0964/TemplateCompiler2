package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class SubscriptNode extends ExprNode {
    public SubscriptNode(int line) {
        super("Subscript", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitSubscript(this);
    }
}