package compiler.ast.visitors;

import compiler.ast.core.AstNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;

public class AstDiagramVisitor {

    private final StringBuilder dot = new StringBuilder();
    private final Map<AstNode, String> nodeIds = new IdentityHashMap<>();
    private int idCounter = 0;


    public void generate(AstNode root, String filePath) throws IOException {
        dot.setLength(0);
        nodeIds.clear();
        idCounter = 0;

        dot.append("digraph AST {\n");
        dot.append("  rankdir=TB;\n");
        dot.append("  node [shape=box, fontname=\"Courier\"];\n");

        visit(root);

        dot.append("}\n");

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(dot.toString());
        }
    }

    private void visit(AstNode node) {
        String nodeId = getNodeId(node);

        dot.append("  ")
                .append(nodeId)
                .append(" [label=\"")
                .append(node.getClass().getSimpleName())
                .append("\\nline ")
                .append(node.getLine())
                .append("\"];\n");

        for (AstNode child : node.getChildren()) {
            String childId = getNodeId(child);
            dot.append("  ")
                    .append(nodeId)
                    .append(" -> ")
                    .append(childId)
                    .append(";\n");

            visit(child);
        }
    }

    private String getNodeId(AstNode node) {
        return nodeIds.computeIfAbsent(node, n -> "n" + (++idCounter));
    }
}
