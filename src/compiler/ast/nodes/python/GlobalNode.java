package compiler.ast.nodes.python;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class GlobalNode extends StmtNode {
    public GlobalNode(int line) {
        super("Global", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitGlobal(this);
    }
}