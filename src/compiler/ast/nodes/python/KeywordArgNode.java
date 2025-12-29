package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class KeywordArgNode extends ExprNode {
    public KeywordArgNode(int line) {
        super("KeywordArg", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitKeywordArg(this);
    }
}