package compiler.symbol;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.*;
import compiler.ast.nodes.css.*;
import compiler.ast.nodes.html.HtmlElementNode;
import compiler.ast.nodes.jinja.*;
import compiler.ast.nodes.python.*;
import compiler.ast.visitors.AstVisitor;

public class SymbolTableVisitor implements AstVisitor<Void> {

    private Scope currentScope;
    private Scope globalScope;

    public SymbolTableVisitor() {
        globalScope = new Scope("global", null);
        currentScope = globalScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public void printSymbolTable() {
        printScope(globalScope, 0);
    }

    private void printScope(Scope scope, int indent) {
        String indentStr = "  ".repeat(indent);
        System.out.println(indentStr + "Scope: " + scope.getName());

        if (!scope.getSymbols().isEmpty()) {
            System.out.println(indentStr + "Symbols:");
            for (Symbol symbol : scope.getSymbols().values()) {
                System.out.println(indentStr + "  " + symbol.getName() +
                        ": " + symbol.getType() +
                        " (line " + symbol.getLine() + ")");
            }
        }

        for (Scope child : scope.getChildren()) {
            System.out.println();
            printScope(child, indent + 1);
        }
    }

    private void visitChildren(AstNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
    }

    // ========== PYTHON FILE ==========

    @Override
    public Void visitPythonFile(PythonFileNode node) {
        visitChildren(node);
        return null;
    }

    // ========== PYTHON STATEMENTS ==========

    @Override
    public Void visitDef(DefNode node) {
        Symbol funcSymbol = new Symbol(node.getName(), "function", node.getLine());
        currentScope.define(funcSymbol);

        Scope funcScope = new Scope(node.getName(), currentScope);
        currentScope.addChild(funcScope);
        Scope previousScope = currentScope;
        currentScope = funcScope;

        for (String param : node.getParams()) {
            Symbol paramSymbol = new Symbol(param, "parameter", node.getLine());
            currentScope.define(paramSymbol);
        }

        visitChildren(node);

        currentScope = previousScope;
        return null;
    }

    @Override
    public Void visitAssign(AssignNode node) {
        if (!node.getChildren().isEmpty()) {
            AstNode target = node.getChildren().get(0);
            if (target instanceof NameNode) {
                String varName = ((NameNode) target).getName();
                Symbol varSymbol = new Symbol(varName, "variable", node.getLine());
                currentScope.define(varSymbol);
            }

            if (node.getChildren().size() > 1) {
                node.getChildren().get(1).accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitFor(ForNode node) {
        Symbol loopVar = new Symbol(node.getVarName(), "loop_variable", node.getLine());
        currentScope.define(loopVar);

        visitChildren(node);
        return null;
    }

    @Override
    public Void visitIf(IfNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitReturn(ReturnNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitGlobal(GlobalNode node) {
        for (AstNode child : node.getChildren()) {
            if (child instanceof NameNode) {
                String varName = ((NameNode) child).getName();
                Symbol globalRef = new Symbol(varName, "global_ref", node.getLine());
                currentScope.define(globalRef);
            }
        }
        return null;
    }

    @Override
    public Void visitImport(ImportNode node) {
        if (!node.getChildren().isEmpty()) {
            AstNode moduleNameNode = node.getChildren().get(0);
            if (moduleNameNode instanceof NameNode) {
                String moduleName = ((NameNode) moduleNameNode).getName();
                if (node.getChildren().size() > 1) {
                    AstNode aliasNode = node.getChildren().get(1);
                    if (aliasNode instanceof NameNode) {
                        moduleName = ((NameNode) aliasNode).getName();
                    }
                }
                Symbol importSymbol = new Symbol(moduleName, "import", node.getLine());
                currentScope.define(importSymbol);
            }
        }
        return null;
    }

    @Override
    public Void visitFromImport(FromImportNode node) {
        for (int i = 1; i < node.getChildren().size(); i++) {
            AstNode nameNode = node.getChildren().get(i);
            if (nameNode instanceof NameNode) {
                String name = ((NameNode) nameNode).getName();
                Symbol importSymbol = new Symbol(name, "import", node.getLine());
                currentScope.define(importSymbol);
            }
        }
        return null;
    }

    @Override
    public Void visitSuite(SuiteNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDecorator(DecoratorNode node) {
        visitChildren(node);
        return null;
    }

    // ========== PYTHON EXPRESSIONS ==========

    @Override
    public Void visitName(NameNode node) {
        Symbol symbol = currentScope.resolve(node.getName());
        return null;
    }

    @Override
    public Void visitCall(CallNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitAttrAccess(AttrAccessNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitBinOp(BinOpNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitUnaryOp(UnaryOpNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitNot(NotNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitSubscript(SubscriptNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitList(ListNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitDict(DictNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitTuple(TupleNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitListComp(ListCompNode node) {

        if (node.getChildren().size() >= 3) {
            node.getChildren().get(2).accept(this);

            AstNode loopVarNode = node.getChildren().get(1);
            if (loopVarNode instanceof NameNode) {
                String varName = ((NameNode) loopVarNode).getName();
                Symbol compVar = new Symbol(varName, "comp_variable", node.getLine());
                currentScope.define(compVar);
            }

            node.getChildren().get(0).accept(this);

            if (node.getChildren().size() > 3) {
                node.getChildren().get(3).accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitGeneratorExpr(GeneratorExprNode node) {
        if (node.getChildren().size() >= 3) {
            node.getChildren().get(2).accept(this);

            AstNode loopVarNode = node.getChildren().get(1);
            if (loopVarNode instanceof NameNode) {
                String varName = ((NameNode) loopVarNode).getName();
                Symbol genVar = new Symbol(varName, "gen_variable", node.getLine());
                currentScope.define(genVar);
            }

            node.getChildren().get(0).accept(this);

            if (node.getChildren().size() > 3) {
                node.getChildren().get(3).accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitKeywordArg(KeywordArgNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitString(StringNode node) {
        // Literals don't affect symbol table
        return null;
    }

    @Override
    public Void visitNumber(NumberNode node) {
        // Literals don't affect symbol table
        return null;
    }

    // ========== TEMPLATE NODES ==========

    @Override
    public Void visitTemplate(TemplateNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitText(TextNode node) {
        return null;
    }

    @Override
    public Void visitHtmlElement(HtmlElementNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitJinjaExpr(JinjaExprNode node) {
        visitChildren(node);
        return null;
    }

    @Override
    public Void visitJinjaStmt(JinjaStmtNode node) {
        visitChildren(node);
        return null;
    }

    // ========== CSS NODES ==========

    @Override
    public Void visitCssStylesheet(CssStylesheetNode node) {
        return null;
    }

    @Override
    public Void visitCssRule(CssRuleNode node) {
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) {
        return null;
    }
}