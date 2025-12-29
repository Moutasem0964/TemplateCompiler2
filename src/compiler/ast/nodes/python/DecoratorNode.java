package compiler.ast.nodes.python;

import compiler.ast.core.AstNode;
import compiler.ast.visitors.AstVisitor;

public class DecoratorNode extends AstNode {
    public DecoratorNode(int line) {
        super("Decorator", line);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visitDecorator(this);
    }
}