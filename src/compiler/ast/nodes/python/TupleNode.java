package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class TupleNode extends ExprNode {
    public TupleNode(int line) {
        super("Tuple", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitTuple(this);
    }
}