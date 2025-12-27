package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.python.*;
import compiler.parser.PythonSubsetParser.*;
import compiler.parser.PythonSubsetParserBaseVisitor;

public class PythonAstBuilder extends PythonSubsetParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitFile_input(File_inputContext ctx) {
        // Create a container node for all statements
        AstNode root = new AstNode("PythonFile", ctx.getStart().getLine()) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        for (StmtContext stmt : ctx.stmt()) {
            AstNode stmtNode = visit(stmt);
            if (stmtNode != null) {
                root.addChild(stmtNode);
            }
        }

        return root;
    }

    // ========== STATEMENTS ==========

    @Override
    public AstNode visitFunctionDefinition(FunctionDefinitionContext ctx) {
        return visit(ctx.function_def());
    }

    @Override
    public AstNode visitFunction_def(Function_defContext ctx) {
        int line = ctx.getStart().getLine();
        String funcName = ctx.NAME().getText();

        DefNode defNode = new DefNode(funcName, line);

        // Add parameters
        if (ctx.parameters() != null) {
            for (ParameterContext param : ctx.parameters().parameter()) {
                defNode.addParam(param.NAME().getText());
            }
        }

        // Add body
        AstNode body = visit(ctx.suite());
        if (body != null) {
            defNode.addChild(body);
        }

        return defNode;
    }

    @Override
    public AstNode visitAssignStatement(AssignStatementContext ctx) {
        return visit(ctx.assign_stmt());
    }

    @Override
    public AstNode visitAssign_stmt(Assign_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        AssignNode assignNode = new AssignNode(line);

        // Add target
        NameNode target = new NameNode(ctx.NAME().getText(), line);
        assignNode.addChild(target);

        // Add value
        AstNode value = visit(ctx.expr());
        if (value != null) {
            assignNode.addChild(value);
        }

        return assignNode;
    }

    @Override
    public AstNode visitForStatement(ForStatementContext ctx) {
        return visit(ctx.for_stmt());
    }

    @Override
    public AstNode visitFor_stmt(For_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        String varName = ctx.NAME().getText();

        ForNode forNode = new ForNode(varName, line);

        // Add iterable
        AstNode iterable = visit(ctx.expr());
        if (iterable != null) {
            forNode.addChild(iterable);
        }

        // Add body
        AstNode body = visit(ctx.suite());
        if (body != null) {
            forNode.addChild(body);
        }

        return forNode;
    }

    @Override
    public AstNode visitIfStatement(IfStatementContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public AstNode visitIf_stmt(If_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        IfNode ifNode = new IfNode(line);

        // Add main if condition
        AstNode condition = visit(ctx.expr(0));
        if (condition != null) {
            ifNode.addChild(condition);
        }

        // Add then block
        AstNode thenBlock = visit(ctx.suite(0));
        if (thenBlock != null) {
            ifNode.addChild(thenBlock);
        }

        // Add elif blocks
        for (int i = 1; i < ctx.expr().size(); i++) {
            AstNode elifCondition = visit(ctx.expr(i));
            if (elifCondition != null) {
                ifNode.addChild(elifCondition);
            }
            AstNode elifBlock = visit(ctx.suite(i));
            if (elifBlock != null) {
                ifNode.addChild(elifBlock);
            }
        }

        // Add else block if exists
        if (ctx.ELSE() != null) {
            int elseIndex = ctx.suite().size() - 1;
            AstNode elseBlock = visit(ctx.suite(elseIndex));
            if (elseBlock != null) {
                ifNode.addChild(elseBlock);
            }
        }

        return ifNode;
    }

    @Override
    public AstNode visitExpressionStatement(ExpressionStatementContext ctx) {
        return visit(ctx.expr_stmt());
    }

    @Override
    public AstNode visitExpr_stmt(Expr_stmtContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public AstNode visitImportStatement(ImportStatementContext ctx) {
        return visit(ctx.import_stmt());
    }

    @Override
    public AstNode visitFromImportStatement(FromImportStatementContext ctx) {
        return visit(ctx.from_import_stmt());
    }

    @Override
    public AstNode visitGlobalStatement(GlobalStatementContext ctx) {
        return visit(ctx.global_stmt());
    }

    @Override
    public AstNode visitReturnStatement(ReturnStatementContext ctx) {
        return visit(ctx.return_stmt());
    }

    @Override
    public AstNode visitReturn_stmt(Return_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode returnNode = new AstNode("Return", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        if (ctx.expr() != null) {
            AstNode value = visit(ctx.expr());
            if (value != null) {
                returnNode.addChild(value);
            }
        }

        return returnNode;
    }

    // ========== SUITE ==========

    @Override
    public AstNode visitSuite(SuiteContext ctx) {
        if (ctx.simple_stmt() != null) {
            return visit(ctx.simple_stmt().stmt());
        } else {
            AstNode suite = new AstNode("Suite", ctx.getStart().getLine()) {
                @Override
                public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                    return null;
                }
            };

            for (StmtContext stmt : ctx.stmt()) {
                AstNode stmtNode = visit(stmt);
                if (stmtNode != null) {
                    suite.addChild(stmtNode);
                }
            }

            return suite;
        }
    }

    // ========== EXPRESSIONS ==========

    @Override
    public AstNode visitNameExpression(NameExpressionContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode(ctx.NAME().getText(), line);
    }

    @Override
    public AstNode visitNumberLiteral(NumberLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NumberNode(ctx.NUMBER().getText(), line);
    }

    @Override
    public AstNode visitStringLiteral(StringLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        return new StringNode(text, line);
    }

    @Override
    public AstNode visitTrueLiteral(TrueLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("True", line);
    }

    @Override
    public AstNode visitFalseLiteral(FalseLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("False", line);
    }

    @Override
    public AstNode visitNoneLiteral(NoneLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode("None", line);
    }

    @Override
    public AstNode visitAttributeAccess(AttributeAccessContext ctx) {
        int line = ctx.getStart().getLine();
        AttrAccessNode attrNode = new AttrAccessNode(line);

        AstNode obj = visit(ctx.expr());
        if (obj != null) {
            attrNode.addChild(obj);
        }

        NameNode attr = new NameNode(ctx.NAME().getText(), line);
        attrNode.addChild(attr);

        return attrNode;
    }

    @Override
    public AstNode visitFunctionCall(FunctionCallContext ctx) {
        int line = ctx.getStart().getLine();
        CallNode callNode = new CallNode(line);

        AstNode func = visit(ctx.expr());
        if (func != null) {
            callNode.addChild(func);
        }

        if (ctx.arguments() != null) {
            for (ArgumentContext arg : ctx.arguments().argument()) {
                AstNode argNode = visit(arg.expr());
                if (argNode != null) {
                    callNode.addChild(argNode);
                }
            }
        }

        return callNode;
    }

    @Override
    public AstNode visitSubscript(SubscriptContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode subscriptNode = new AstNode("Subscript", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        AstNode obj = visit(ctx.expr(0));
        if (obj != null) {
            subscriptNode.addChild(obj);
        }

        AstNode index = visit(ctx.expr(1));
        if (index != null) {
            subscriptNode.addChild(index);
        }

        return subscriptNode;
    }

    @Override
    public AstNode visitUnaryMinus(UnaryMinusContext ctx) {
        int line = ctx.getStart().getLine();
        BinOpNode unaryNode = new BinOpNode("-", line);

        AstNode expr = visit(ctx.expr());
        if (expr != null) {
            unaryNode.addChild(expr);
        }

        return unaryNode;
    }

    @Override
    public AstNode visitMulDivOp(MulDivOpContext ctx) {
        int line = ctx.getStart().getLine();
        String op = ctx.op.getText();

        BinOpNode binOpNode = new BinOpNode(op, line);

        AstNode left = visit(ctx.expr(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.expr(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitAddSubOp(AddSubOpContext ctx) {
        int line = ctx.getStart().getLine();
        String op = ctx.op.getText();

        BinOpNode binOpNode = new BinOpNode(op, line);

        AstNode left = visit(ctx.expr(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.expr(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitComparison(ComparisonContext ctx) {
        int line = ctx.getStart().getLine();
        String op = ctx.op.getText();

        BinOpNode binOpNode = new BinOpNode(op, line);

        AstNode left = visit(ctx.expr(0));
        if (left != null) {
            binOpNode.addChild(left);
        }

        AstNode right = visit(ctx.expr(1));
        if (right != null) {
            binOpNode.addChild(right);
        }

        return binOpNode;
    }

    @Override
    public AstNode visitParenExpression(ParenExpressionContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public AstNode visitListExpression(ListExpressionContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode listNode = new AstNode("List", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        if (ctx.list_literal().expr() != null) {
            for (ExprContext expr : ctx.list_literal().expr()) {
                AstNode elem = visit(expr);
                if (elem != null) {
                    listNode.addChild(elem);
                }
            }
        }

        return listNode;
    }

    @Override
    public AstNode visitDictExpression(DictExpressionContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode dictNode = new AstNode("Dict", line) {
            @Override
            public <R> R accept(compiler.ast.visitors.AstVisitor<R> visitor) {
                return null;
            }
        };

        if (ctx.dict_literal().dict_pair() != null) {
            for (Dict_pairContext pair : ctx.dict_literal().dict_pair()) {
                String key = pair.STRING().getText();
                key = key.substring(1, key.length() - 1);
                dictNode.addChild(new StringNode(key, line));

                AstNode value = visit(pair.expr());
                if (value != null) {
                    dictNode.addChild(value);
                }
            }
        }

        return dictNode;
    }
}