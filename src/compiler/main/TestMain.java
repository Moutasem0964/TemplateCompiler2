package compiler.main;

import compiler.ast.core.AstNode;
import compiler.ast.visitors.PrintVisitor;
import compiler.lexer.PythonIndentingLexer;
import compiler.visitors.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import compiler.parser.*;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) {
        String basePath = "src/compiler/main/test_app/";

        try {
            // Parse Python file
            System.out.println("=".repeat(80));
            System.out.println("PARSING PYTHON FILE: app.py");
            System.out.println("=".repeat(80));
            parsePythonFile(basePath + "app.py");

            // Parse Templates
            System.out.println("\n\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: list_products.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/list_products.jinja");

            System.out.println("\n\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: add_product.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/add_product.jinja");

            System.out.println("\n\n" + "=".repeat(80));
            System.out.println("PARSING TEMPLATE: product_detail.jinja");
            System.out.println("=".repeat(80));
            parseTemplateFile(basePath + "templates/product_detail.jinja");

            // Parse CSS
            System.out.println("\n\n" + "=".repeat(80));
            System.out.println("PARSING CSS FILE: style.css");
            System.out.println("=".repeat(80));
            parseCSSFile(basePath + "resources/css/style.css");

            System.out.println("\n\n" + "=".repeat(80));
            System.out.println("ALL FILES PARSED SUCCESSFULLY!");
            System.out.println("=".repeat(80));

        } catch (Exception e) {
            System.err.println("Error during parsing:");
            e.printStackTrace();
        }
    }

    private static void parsePythonFile(String filename) throws IOException {
        System.out.println("\n--- PYTHON AST ---\n");

        // Create lexer with indentation handling
        CharStream input = CharStreams.fromFileName(filename);
        PythonSubsetLexer baseLexer = new PythonSubsetLexer(input);
        PythonIndentingLexer lexer = new PythonIndentingLexer(baseLexer);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);

        // Parse the file
        PythonSubsetParser.File_inputContext parseTree = parser.file_input();

        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in Python file!");
            return;
        }

        // Build AST
        PythonAstBuilder astBuilder = new PythonAstBuilder();
        AstNode ast = astBuilder.visit(parseTree);

        // Print AST using the visitor pattern
        if (ast != null) {
            PrintVisitor printer = new PrintVisitor();
            printer.printTree(ast);
        } else {
            System.err.println("AST is null!");
        }
    }

    private static void parseTemplateFile(String filename) throws IOException {
        System.out.println("\n--- TEMPLATE AST ---\n");

        // Create lexer and parser
        CharStream input = CharStreams.fromFileName(filename);
        TemplateLexer lexer = new TemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateParser parser = new TemplateParser(tokens);

        // Parse the file
        TemplateParser.TemplateContext parseTree = parser.template();

        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in template file!");
            return;
        }

        // Build AST
        TemplateAstBuilder astBuilder = new TemplateAstBuilder();
        AstNode ast = astBuilder.visit(parseTree);

        // Print AST
        if (ast != null) {
            PrintVisitor printer = new PrintVisitor();
            printer.printTree(ast);
        } else {
            System.err.println("AST is null!");
        }
    }

    private static void parseCSSFile(String filename) throws IOException {
        System.out.println("\n--- CSS AST ---\n");

        // Create lexer and parser
        CharStream input = CharStreams.fromFileName(filename);
        CSSLexer lexer = new CSSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSSParser parser = new CSSParser(tokens);

        // Parse the file
        CSSParser.StylesheetContext parseTree = parser.stylesheet();

        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors found in CSS file!");
            return;
        }

        // Build AST
        CssAstBuilder astBuilder = new CssAstBuilder();
        AstNode ast = astBuilder.visit(parseTree);

        // Print AST
        if (ast != null) {
            PrintVisitor printer = new PrintVisitor();
            printer.printTree(ast);
        } else {
            System.err.println("AST is null!");
        }
    }
}