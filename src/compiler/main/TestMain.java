package compiler.main;

import compiler.ast.core.AstNode;
import compiler.ast.visitors.AstDiagramVisitor;
import compiler.ast.visitors.PrintVisitor;
import compiler.lexer.PythonIndentingLexer;
import compiler.symbol.SymbolTableVisitor;
import compiler.visitors.*;
import compiler.parser.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) {
        String basePath = "src/compiler/main/test_app/";

        try {
            // ================= PYTHON =================
            System.out.println("=".repeat(80));
            System.out.println("PARSING PYTHON FILE: app.py");
            System.out.println("=".repeat(80));

            AstNode pythonAst = parsePythonFile(basePath + "app.py");

            // ================= TEMPLATES =================
            System.out.println("\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: list_products.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/list_products.jinja");

            System.out.println("\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: add_product.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/add_product.jinja");

            System.out.println("\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: product_detail.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/product_detail.jinja");

            // ================= CSS =================
            System.out.println("\n" + "=".repeat(80));
            System.out.println("PARSING CSS FILE: style.css");
            System.out.println("=".repeat(80));
            parseCSSFile(basePath + "resources/css/style.css");

            // ================= SYMBOL TABLE =================
            if (pythonAst != null) {
                System.out.println("\n" + "=".repeat(80));
                System.out.println("SYMBOL TABLE");
                System.out.println("=".repeat(80));

                SymbolTableVisitor symbolVisitor = new SymbolTableVisitor();
                pythonAst.accept(symbolVisitor);
                symbolVisitor.printSymbolTable();
            }

            System.out.println("\n" + "=".repeat(80));
            System.out.println("ALL FILES PARSED SUCCESSFULLY!");
            System.out.println("=".repeat(80));

        } catch (Exception e) {
            System.err.println("Error during parsing:");
            e.printStackTrace();
        }
    }

    // ======================= PYTHON ==========================
    private static AstNode parsePythonFile(String filename) throws IOException {
        System.out.println();

        CharStream input = CharStreams.fromFileName(filename);
        PythonSubsetLexer baseLexer = new PythonSubsetLexer(input);
        PythonIndentingLexer lexer = new PythonIndentingLexer(baseLexer);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);

        PythonSubsetParser.File_inputContext tree = parser.file_input();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in Python file!");
            return null;
        }

        PythonAstBuilder builder = new PythonAstBuilder();
        AstNode ast = builder.visit(tree);

        if (ast != null) {
            new PrintVisitor().printTree(ast);
            AstDiagramVisitor diagramVisitor = new AstDiagramVisitor();
            diagramVisitor.generate(ast, "src/compiler/main/output/python_ast.dot");
        }

        return ast;
    }

    // ====================== TEMPLATE =========================
    private static AstNode parseTemplateFile(String filename) throws IOException {
        System.out.println();

        CharStream input = CharStreams.fromFileName(filename);
        TemplateLexer lexer = new TemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateParser parser = new TemplateParser(tokens);

        TemplateParser.TemplateContext tree = parser.template();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in template file!");
            return null;
        }

        TemplateAstBuilder builder = new TemplateAstBuilder();
        AstNode ast = builder.visit(tree);

        if (ast != null) {
            new PrintVisitor().printTree(ast);
            AstDiagramVisitor diagramVisitor = new AstDiagramVisitor();
            String name = filename.substring(filename.lastIndexOf('/') + 1)
                    .replace(".jinja", "");
            diagramVisitor.generate(ast, "src/compiler/main/output/template_" + name + "_ast.dot");
        }

        return ast;
    }

    // ========================= CSS ===========================
    private static AstNode parseCSSFile(String filename) throws IOException {
        System.out.println();

        CharStream input = CharStreams.fromFileName(filename);
        CSSLexer lexer = new CSSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSSParser parser = new CSSParser(tokens);

        CSSParser.StylesheetContext tree = parser.stylesheet();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in CSS file!");
            return null;
        }

        CssAstBuilder builder = new CssAstBuilder();
        AstNode ast = builder.visit(tree);

        if (ast != null) {
            new PrintVisitor().printTree(ast);
            AstDiagramVisitor diagramVisitor = new AstDiagramVisitor();
            diagramVisitor.generate(ast, "src/compiler/main/output/css_ast.dot");
        }

        return ast;
    }
}
