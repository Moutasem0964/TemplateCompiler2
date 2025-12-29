package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class ListCompNode extends ExprNode {
    public ListCompNode(int line) {
        super("ListComp", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitListComp(this);
    }
}