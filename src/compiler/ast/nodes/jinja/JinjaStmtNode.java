package compiler.ast.nodes.jinja;

import compiler.ast.core.StmtNode;
import compiler.ast.visitors.AstVisitor;

public class JinjaStmtNode extends StmtNode {
    public JinjaStmtNode(int line) {
        super("JinjaStmt", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitJinjaStmt(this);
    }
}