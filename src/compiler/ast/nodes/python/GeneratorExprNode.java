package compiler.ast.nodes.python;

import compiler.ast.core.ExprNode;
import compiler.ast.visitors.AstVisitor;

public class GeneratorExprNode extends ExprNode {
    public GeneratorExprNode(int line) {
        super("GeneratorExpr", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitGeneratorExpr(this);
    }
}