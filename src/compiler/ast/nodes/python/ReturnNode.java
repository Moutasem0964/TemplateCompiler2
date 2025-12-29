package compiler.ast.nodes.python;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class ReturnNode extends StmtNode {
    public ReturnNode(int line) {
        super("Return", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitReturn(this);
    }
}