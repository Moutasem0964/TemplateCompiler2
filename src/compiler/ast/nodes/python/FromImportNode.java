package compiler.ast.nodes.python;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class FromImportNode extends StmtNode {
    public FromImportNode(int line) {
        super("FromImport", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitFromImport(this);
    }
}