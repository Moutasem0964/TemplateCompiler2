package compiler.ast.nodes.python;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class ImportNode extends StmtNode {
    public ImportNode(int line) {
        super("Import", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitImport(this);
    }
}