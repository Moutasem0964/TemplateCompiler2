package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class NotNode extends ExprNode {
    public NotNode(int line) {
        super("Not", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitNot(this);
    }
}