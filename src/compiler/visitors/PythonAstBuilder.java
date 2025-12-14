package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.python.*;
import compiler.lexer.PythonIndentingLexer;
import compiler.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class PythonAstBuilder extends PythonSubsetParserBaseVisitor<AstNode> {

    private final int baseLine;

    public PythonAstBuilder(int baseLine) {
        this.baseLine = baseLine;
    }

    private int adjustLine(int parserLine) {
        return baseLine + parserLine - 1;
    }

    // Main helper used by TemplateAstBuilder for {{ }} and {% %}
    public AstNode parsePythonCode(String code, int startLine) {
        if (code == null || code.trim().isEmpty()) return null;

        CharStream input = CharStreams.fromString(code + "\n"); // add newline to help simple statements
        PythonIndentingLexer lexer = new PythonIndentingLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);
        parser.removeErrorListeners(); // optional

        PythonSubsetParser.ProgramContext programCtx = parser.program();
        return visit(programCtx);
    }

    @Override
    public AstNode visitProgram(PythonSubsetParser.ProgramContext ctx) {
        List<AstNode> statements = new ArrayList<>();
        for (PythonSubsetParser.StmtContext stmtCtx : ctx.stmt()) {
            AstNode stmt = visit(stmtCtx);
            if (stmt != null) statements.add(stmt);
        }
        if (statements.isEmpty()) return null;
        return statements.size() == 1 ? statements.get(0) : statements.get(0); // most Jinja cases have one
    }

    @Override
    public AstNode visitSimple(PythonSubsetParser.SimpleContext ctx) {
        return visit(ctx.simpleStmt());
    }

    @Override
    public AstNode visitCompound(PythonSubsetParser.CompoundContext ctx) {
        return visit(ctx.compoundStmt());
    }

    @Override
    public AstNode visitExprStmt(PythonSubsetParser.ExprStmtContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public AstNode visitAssign(PythonSubsetParser.AssignContext ctx) {
        AssignNode node = new AssignNode(adjustLine(ctx.start.getLine()));
        NameNode target = new NameNode(ctx.NAME().getText(), adjustLine(ctx.NAME().getSymbol().getLine()));
        AstNode value = visit(ctx.expr());
        node.addChild(target);
        node.addChild(value);
        return node;
    }

    @Override
    public AstNode visitIfRule(PythonSubsetParser.IfRuleContext ctx) {
        return visit(ctx.ifStmt());
    }

    @Override
    public AstNode visitForRule(PythonSubsetParser.ForRuleContext ctx) {
        return visit(ctx.forStmt());
    }

    @Override
    public AstNode visitIfStmt(PythonSubsetParser.IfStmtContext ctx) {
        IfNode node = new IfNode(adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.test(0))); // condition
        node.addChild(visit(ctx.suite(0))); // then body
        // elif/else can be added later if needed
        return node;
    }

    @Override
    public AstNode visitForStmt(PythonSubsetParser.ForStmtContext ctx) {
        String varName = ctx.NAME().getText();
        ForNode node = new ForNode(varName, adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.expr())); // iterable
        node.addChild(visit(ctx.suite())); // body
        return node;
    }

    @Override
    public AstNode visitSuite(PythonSubsetParser.SuiteContext ctx) {
        List<AstNode> stmts = new ArrayList<>();
        if (ctx.simpleStmt() != null) {
            AstNode s = visit(ctx.simpleStmt());
            if (s != null) stmts.add(s);
        } else {
            for (PythonSubsetParser.StmtContext s : ctx.stmt()) {
                AstNode stmt = visit(s);
                if (stmt != null) stmts.add(stmt);
            }
        }
        if (stmts.isEmpty()) return null;
        return stmts.size() == 1 ? stmts.get(0) : stmts.get(0);
    }

    @Override
    public AstNode visitTest(PythonSubsetParser.TestContext ctx) {
        return visit(ctx.expr());
    }

    // Fixed BinOp cases — no ctx.op, use the token methods
    @Override
    public AstNode visitMulDiv(PythonSubsetParser.MulDivContext ctx) {
        String op = ctx.STAR() != null ? "*" : "/";
        BinOpNode node = new BinOpNode(op, adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.expr(0)));
        node.addChild(visit(ctx.expr(1)));
        return node;
    }

    @Override
    public AstNode visitAddSub(PythonSubsetParser.AddSubContext ctx) {
        String op = ctx.PLUS() != null ? "+" : "-";
        BinOpNode node = new BinOpNode(op, adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.expr(0)));
        node.addChild(visit(ctx.expr(1)));
        return node;
    }

    @Override
    public AstNode visitComparison(PythonSubsetParser.ComparisonContext ctx) {
        String op;
        if (ctx.LT() != null) op = "<";
        else if (ctx.LTEQ() != null) op = "<=";
        else if (ctx.GT() != null) op = ">";
        else if (ctx.GTEQ() != null) op = ">=";
        else op = "=="; // EQEQ
        BinOpNode node = new BinOpNode(op, adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.expr(0)));
        node.addChild(visit(ctx.expr(1)));
        return node;
    }

    @Override
    public AstNode visitAtomExpr(PythonSubsetParser.AtomExprContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public AstNode visitName(PythonSubsetParser.NameContext ctx) {
        return new NameNode(ctx.NAME().getText(), adjustLine(ctx.start.getLine()));
    }

    @Override
    public AstNode visitNumber(PythonSubsetParser.NumberContext ctx) {
        return new NumberNode(ctx.NUMBER().getText(), adjustLine(ctx.start.getLine()));
    }

    @Override
    public AstNode visitString(PythonSubsetParser.StringContext ctx) {
        String text = ctx.STRING().getText();
        String value = text.substring(1, text.length() - 1);
        return new StringNode(value, adjustLine(ctx.start.getLine()));
    }

    @Override
    public AstNode visitAttrAccess(PythonSubsetParser.AttrAccessContext ctx) {
        AttrAccessNode node = new AttrAccessNode(adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.atom()));
        node.addChild(new NameNode(ctx.NAME().getText(), adjustLine(ctx.NAME().getSymbol().getLine())));
        return node;
    }

    @Override
    public AstNode visitCall(PythonSubsetParser.CallContext ctx) {
        CallNode node = new CallNode(adjustLine(ctx.start.getLine()));
        node.addChild(visit(ctx.atom()));
        if (ctx.arglist() != null) {
            for (PythonSubsetParser.ExprContext arg : ctx.arglist().expr()) {
                node.addChild(visit(arg));
            }
        }
        return node;
    }
}