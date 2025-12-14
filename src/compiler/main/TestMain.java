package compiler.main;

import compiler.ast.core.AstNode;
import compiler.ast.visitors.PrintVisitor;
import compiler.visitors.TemplateAstBuilder;
import compiler.parser.*;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.net.URL;
import java.nio.file.*;

public class TestMain {
    public static void main(String[] args) throws Exception {
        String[] templateNames = {
                "compiler/main/resources/templates/list_products.jinja",
                "compiler/main/resources/templates/add_product.jinja",
                "compiler/main/resources/templates/product_detail.jinja"
        };

        TemplateAstBuilder builder = new TemplateAstBuilder();
        PrintVisitor printer = new PrintVisitor();

        for (String name : templateNames) {
            URL resource = TestMain.class.getClassLoader().getResource(name);
            if (resource == null) {
                System.err.println("Template not found: " + name);
                continue;
            }

            String content = Files.readString(Paths.get(resource.toURI()));

            CharStream input = CharStreams.fromString(content);
            TemplateLexer lexer = new TemplateLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TemplateParser parser = new TemplateParser(tokens);

            TemplateParser.TemplateContext tree = parser.template();
            AstNode ast = builder.visit(tree);

            System.out.println("=== AST for " + name + " ===");
            printer.printTree(ast);
            System.out.println("\n");
        }
    }
}