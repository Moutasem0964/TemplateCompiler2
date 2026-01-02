package compiler.visitors;

import compiler.ast.core.AstNode;
import compiler.ast.nodes.python.*;
import compiler.parser.PythonSubsetParser.*;
import compiler.parser.PythonSubsetParserBaseVisitor;

public class PythonAstBuilder extends PythonSubsetParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitFile_input(File_inputContext ctx) {
        PythonFileNode root = new PythonFileNode(1);
        for (StmtContext stmt : ctx.stmt()) {
            AstNode stmtNode = visit(stmt);
            if (stmtNode != null) {
                root.addChild(stmtNode);
            }
        }
        return root;
    }

    @Override
    public AstNode visitSimpleStatement(SimpleStatementContext ctx) {
        return visit(ctx.simple_stmt());
    }

    @Override
    public AstNode visitCompoundStatement(CompoundStatementContext ctx) {
        return visit(ctx.compound_stmt());
    }

    @Override
    public AstNode visitSimple_stmt(Simple_stmtContext ctx) {
        return visit(ctx.small_stmt());
    }

    @Override
    public AstNode visitAssignSmallStmt(AssignSmallStmtContext ctx) {
        return visit(ctx.assign_stmt());
    }

    @Override
    public AstNode visitReturnSmallStmt(ReturnSmallStmtContext ctx) {
        return visit(ctx.return_stmt());
    }

    @Override
    public AstNode visitGlobalSmallStmt(GlobalSmallStmtContext ctx) {
        return visit(ctx.global_stmt());
    }

    @Override
    public AstNode visitImportSmallStmt(ImportSmallStmtContext ctx) {
        return visit(ctx.import_stmt());
    }

    @Override
    public AstNode visitFromImportSmallStmt(FromImportSmallStmtContext ctx) {
        return visit(ctx.from_import_stmt());
    }

    @Override
    public AstNode visitExprSmallStmt(ExprSmallStmtContext ctx) {
        return visit(ctx.expr_stmt());
    }

    @Override
    public AstNode visitFunctionDefStmt(FunctionDefStmtContext ctx) {
        return visit(ctx.function_def());
    }

    @Override
    public AstNode visitIfCompoundStmt(IfCompoundStmtContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public AstNode visitForCompoundStmt(ForCompoundStmtContext ctx) {
        return visit(ctx.for_stmt());
    }

    @Override
    public AstNode visitExpr_stmt(Expr_stmtContext ctx) {
        return visit(ctx.test());
    }

    @Override
    public AstNode visitFunction_def(Function_defContext ctx) {
        int line = ctx.getStart().getLine();
        String funcName = ctx.NAME().getText();
        DefNode defNode = new DefNode(funcName, line);

        for (DecoratorContext dec : ctx.decorator()) {
            AstNode decoratorNode = visitDecorator(dec);
            if (decoratorNode != null) {
                defNode.addChild(decoratorNode);
            }
        }

        if (ctx.parameters() != null) {
            for (ParameterContext param : ctx.parameters().parameter()) {
                defNode.addParam(param.NAME().getText());
            }
        }

        AstNode body = visit(ctx.suite());
        if (body != null) {
            defNode.addChild(body);
        }
        return defNode;
    }

    @Override
    public AstNode visitDecorator(DecoratorContext ctx) {
        int line = ctx.getStart().getLine();
        StringBuilder decoratorName = new StringBuilder();
        for (int i = 0; i < ctx.dotted_name().NAME().size(); i++) {
            if (i > 0) decoratorName.append(".");
            decoratorName.append(ctx.dotted_name().NAME(i).getText());
        }

        DecoratorNode decoratorNode = new DecoratorNode(line);
        decoratorNode.addChild(new NameNode(decoratorName.toString(), line));

        if (ctx.arglist() != null) {
            if (ctx.arglist().argument() != null) {
                for (ArgumentContext arg : ctx.arglist().argument()) {
                    AstNode argNode = visit(arg);
                    if (argNode != null) {
                        decoratorNode.addChild(argNode);
                    }
                }
            }
        }
        return decoratorNode;
    }

    @Override
    public AstNode visitSimpleAssign(SimpleAssignContext ctx) {
        int line = ctx.getStart().getLine();
        AssignNode assignNode = new AssignNode(line);
        NameNode target = new NameNode(ctx.NAME().getText(), line);
        assignNode.addChild(target);
        AstNode value = visit(ctx.test());
        if (value != null) {
            assignNode.addChild(value);
        }
        return assignNode;
    }

    @Override
    public AstNode visitPlusAssign(PlusAssignContext ctx) {
        int line = ctx.getStart().getLine();
        AssignNode assignNode = new AssignNode(line);
        assignNode.setOperator("+=");
        NameNode target = new NameNode(ctx.NAME().getText(), line);
        assignNode.addChild(target);
        AstNode value = visit(ctx.test());
        if (value != null) {
            assignNode.addChild(value);
        }
        return assignNode;
    }

    @Override
    public AstNode visitMinusAssign(MinusAssignContext ctx) {
        int line = ctx.getStart().getLine();
        AssignNode assignNode = new AssignNode(line);
        assignNode.setOperator("-=");
        NameNode target = new NameNode(ctx.NAME().getText(), line);
        assignNode.addChild(target);
        AstNode value = visit(ctx.test());
        if (value != null) {
            assignNode.addChild(value);
        }
        return assignNode;
    }

    @Override
    public AstNode visitFor_stmt(For_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        String varName = ctx.NAME().getText();
        ForNode forNode = new ForNode(varName, line);

        AstNode iterable = visit(ctx.test());
        if (iterable != null) {
            forNode.addChild(iterable);
        }

        AstNode body = visit(ctx.suite());
        if (body != null) {
            forNode.addChild(body);
        }
        return forNode;
    }

    @Override
    public AstNode visitIf_stmt(If_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        IfNode ifNode = new IfNode(line);

        for (int i = 0; i < ctx.test().size(); i++) {
            AstNode condition = visit(ctx.test(i));
            if (condition != null) {
                ifNode.addChild(condition);
            }
            AstNode body = visit(ctx.suite(i));
            if (body != null) {
                ifNode.addChild(body);
            }
        }

        if (ctx.ELSE() != null) {
            AstNode elseBody = visit(ctx.suite(ctx.suite().size() - 1));
            if (elseBody != null) {
                ifNode.addChild(elseBody);
            }
        }
        return ifNode;
    }

    @Override
    public AstNode visitReturn_stmt(Return_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        ReturnNode returnNode = new ReturnNode(line);
        if (ctx.test() != null) {
            AstNode value = visit(ctx.test());
            if (value != null) {
                returnNode.addChild(value);
            }
        }
        return returnNode;
    }

    @Override
    public AstNode visitGlobal_stmt(Global_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        GlobalNode globalNode = new GlobalNode(line);
        for (var name : ctx.NAME()) {
            globalNode.addChild(new NameNode(name.getText(), line));
        }
        return globalNode;
    }

    @Override
    public AstNode visitImport_stmt(Import_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        ImportNode importNode = new ImportNode(line);

        StringBuilder moduleName = new StringBuilder();
        for (int i = 0; i < ctx.dotted_name().NAME().size(); i++) {
            if (i > 0) moduleName.append(".");
            moduleName.append(ctx.dotted_name().NAME(i).getText());
        }
        importNode.addChild(new NameNode(moduleName.toString(), line));

        if (ctx.AS() != null) {
            importNode.addChild(new NameNode(ctx.NAME().getText(), line));
        }
        return importNode;
    }

    @Override
    public AstNode visitFrom_import_stmt(From_import_stmtContext ctx) {
        int line = ctx.getStart().getLine();
        FromImportNode fromImportNode = new FromImportNode(line);

        StringBuilder moduleName = new StringBuilder();
        for (int i = 0; i < ctx.dotted_name().NAME().size(); i++) {
            if (i > 0) moduleName.append(".");
            moduleName.append(ctx.dotted_name().NAME(i).getText());
        }
        fromImportNode.addChild(new NameNode(moduleName.toString(), line));

        if (ctx.STAR() != null) {
            fromImportNode.addChild(new NameNode("*", line));
        } else if (ctx.import_as_names() != null) {
            for (Import_as_nameContext importName : ctx.import_as_names().import_as_name()) {
                fromImportNode.addChild(new NameNode(importName.NAME(0).getText(), line));
            }
        }
        return fromImportNode;
    }

    @Override
    public AstNode visitInlineSuite(InlineSuiteContext ctx) {
        return visit(ctx.simple_stmt());
    }

    @Override
    public AstNode visitBlockSuite(BlockSuiteContext ctx) {
        SuiteNode suite = new SuiteNode(ctx.getStart().getLine());
        for (StmtContext stmt : ctx.stmt()) {
            AstNode stmtNode = visit(stmt);
            if (stmtNode != null) {
                suite.addChild(stmtNode);
            }
        }
        return suite;
    }

    @Override
    public AstNode visitTest(TestContext ctx) {
        return visit(ctx.or_test());
    }

    @Override
    public AstNode visitOr_test(Or_testContext ctx) {
        if (ctx.and_test().size() == 1) {
            return visit(ctx.and_test(0));
        }
        int line = ctx.getStart().getLine();
        BinOpNode binOp = new BinOpNode("or", line);
        AstNode left = visit(ctx.and_test(0));
        if (left != null) binOp.addChild(left);
        AstNode right = visit(ctx.and_test(1));
        if (right != null) binOp.addChild(right);
        return binOp;
    }

    @Override
    public AstNode visitAnd_test(And_testContext ctx) {
        if (ctx.not_test().size() == 1) {
            return visit(ctx.not_test(0));
        }
        int line = ctx.getStart().getLine();
        BinOpNode binOp = new BinOpNode("and", line);
        AstNode left = visit(ctx.not_test(0));
        if (left != null) binOp.addChild(left);
        AstNode right = visit(ctx.not_test(1));
        if (right != null) binOp.addChild(right);
        return binOp;
    }

    @Override
    public AstNode visitNotExpr(NotExprContext ctx) {
        int line = ctx.getStart().getLine();
        NotNode notNode = new NotNode(line);
        AstNode operand = visit(ctx.not_test());
        if (operand != null) {
            notNode.addChild(operand);
        }
        return notNode;
    }

    @Override
    public AstNode visitComparisonExpr(ComparisonExprContext ctx) {
        return visit(ctx.comparison());
    }

    @Override
    public AstNode visitComparison(ComparisonContext ctx) {
        if (ctx.comp_op() == null || ctx.comp_op().isEmpty()) {
            return visit(ctx.arith_expr(0));
        }
        int line = ctx.getStart().getLine();
        String op = getCompOpText(ctx.comp_op(0));
        BinOpNode binOpNode = new BinOpNode(op, line);
        AstNode left = visit(ctx.arith_expr(0));
        if (left != null) {
            binOpNode.addChild(left);
        }
        AstNode right = visit(ctx.arith_expr(1));
        if (right != null) {
            binOpNode.addChild(right);
        }
        return binOpNode;
    }

    private String getCompOpText(Comp_opContext ctx) {
        if (ctx instanceof LessOpContext) return "<";
        if (ctx instanceof GreaterOpContext) return ">";
        if (ctx instanceof EqualOpContext) return "==";
        if (ctx instanceof GreaterEqualOpContext) return ">=";
        if (ctx instanceof LessEqualOpContext) return "<=";
        if (ctx instanceof NotEqualOpContext) return "!=";
        if (ctx instanceof InOpContext) return "in";
        return ctx.getText();
    }

    @Override
    public AstNode visitLessOp(LessOpContext ctx) { return null; }

    @Override
    public AstNode visitGreaterOp(GreaterOpContext ctx) { return null; }

    @Override
    public AstNode visitEqualOp(EqualOpContext ctx) { return null; }

    @Override
    public AstNode visitGreaterEqualOp(GreaterEqualOpContext ctx) { return null; }

    @Override
    public AstNode visitLessEqualOp(LessEqualOpContext ctx) { return null; }

    @Override
    public AstNode visitNotEqualOp(NotEqualOpContext ctx) { return null; }

    @Override
    public AstNode visitInOp(InOpContext ctx) { return null; }

    @Override
    public AstNode visitArith_expr(Arith_exprContext ctx) {
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0));
        }
        int line = ctx.getStart().getLine();
        String op = ctx.PLUS() != null && !ctx.PLUS().isEmpty() ? "+" : "-";
        BinOpNode binOpNode = new BinOpNode(op, line);
        AstNode left = visit(ctx.term(0));
        if (left != null) {
            binOpNode.addChild(left);
        }
        AstNode right = visit(ctx.term(1));
        if (right != null) {
            binOpNode.addChild(right);
        }
        return binOpNode;
    }

    @Override
    public AstNode visitTerm(TermContext ctx) {
        if (ctx.factor().size() == 1) {
            return visit(ctx.factor(0));
        }
        int line = ctx.getStart().getLine();
        String op = "*";
        if (ctx.SLASH() != null && !ctx.SLASH().isEmpty()) op = "/";
        else if (ctx.PERCENT() != null && !ctx.PERCENT().isEmpty()) op = "%";
        else if (ctx.DOUBLESLASH() != null && !ctx.DOUBLESLASH().isEmpty()) op = "//";

        BinOpNode binOpNode = new BinOpNode(op, line);
        AstNode left = visit(ctx.factor(0));
        if (left != null) {
            binOpNode.addChild(left);
        }
        AstNode right = visit(ctx.factor(1));
        if (right != null) {
            binOpNode.addChild(right);
        }
        return binOpNode;
    }

    @Override
    public AstNode visitUnaryFactor(UnaryFactorContext ctx) {
        int line = ctx.getStart().getLine();
        String op = ctx.PLUS() != null ? "+" : "-";
        UnaryOpNode unaryNode = new UnaryOpNode(op, line);
        AstNode operand = visit(ctx.factor());
        if (operand != null) {
            unaryNode.addChild(operand);
        }
        return unaryNode;
    }

    @Override
    public AstNode visitPowerFactor(PowerFactorContext ctx) {
        return visit(ctx.power());
    }

    @Override
    public AstNode visitPower(PowerContext ctx) {
        AstNode base = visit(ctx.atom_expr());
        if (ctx.factor() != null) {
            int line = ctx.getStart().getLine();
            BinOpNode powerNode = new BinOpNode("**", line);
            powerNode.addChild(base);
            AstNode exponent = visit(ctx.factor());
            if (exponent != null) {
                powerNode.addChild(exponent);
            }
            return powerNode;
        }
        return base;
    }

    @Override
    public AstNode visitSubscript(SubscriptContext ctx) {
        return visit(ctx.test());
    }

    @Override
    public AstNode visitNameAtom(NameAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NameNode(ctx.NAME().getText(), line);
    }

    @Override
    public AstNode visitNumberAtom(NumberAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new NumberNode(ctx.NUMBER().getText(), line);
    }

    @Override
    public AstNode visitStringAtom(StringAtomContext ctx) {
        int line = ctx.getStart().getLine();
        StringBuilder sb = new StringBuilder();
        for (var str : ctx.STRING()) {
            String text = str.getText();
            text = text.substring(1, text.length() - 1);
            sb.append(text);
        }
        return new StringNode(sb.toString(), line);
    }

    @Override
    public AstNode visitTrueAtom(TrueAtomContext ctx) {
        return new NameNode("True", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitFalseAtom(FalseAtomContext ctx) {
        return new NameNode("False", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitNoneAtom(NoneAtomContext ctx) {
        return new NameNode("None", ctx.getStart().getLine());
    }

    @Override
    public AstNode visitComprehensionTestList(ComprehensionTestListContext ctx) {
        int line = ctx.getStart().getLine();
        ListCompNode compNode = new ListCompNode(line);

        AstNode expr = visit(ctx.test());
        if (expr != null) {
            compNode.addChild(expr);
        }

        Comp_forContext compFor = ctx.comp_for();
        compNode.addChild(new NameNode(compFor.NAME().getText(), line));

        AstNode iter = visit(compFor.or_test(0));
        if (iter != null) {
            compNode.addChild(iter);
        }

        if (compFor.IF() != null && compFor.or_test().size() > 1) {
            AstNode cond = visit(compFor.or_test(1));
            if (cond != null) {
                compNode.addChild(cond);
            }
        }
        return compNode;
    }

    @Override
    public AstNode visitTupleTestList(TupleTestListContext ctx) {
        int line = ctx.getStart().getLine();
        if (ctx.test().size() == 1 && ctx.COMMA().isEmpty()) {
            return visit(ctx.test(0));
        }
        TupleNode tupleNode = new TupleNode(line);
        for (TestContext test : ctx.test()) {
            AstNode elem = visit(test);
            if (elem != null) {
                tupleNode.addChild(elem);
            }
        }
        return tupleNode;
    }

    @Override
    public AstNode visitParenAtom(ParenAtomContext ctx) {
        int line = ctx.getStart().getLine();

        if (ctx.testlist_comp() == null) {
            return new TupleNode(line);
        }

        Testlist_compContext testlistComp = ctx.testlist_comp();

        if (testlistComp instanceof ComprehensionTestListContext) {
            ComprehensionTestListContext compCtx = (ComprehensionTestListContext) testlistComp;
            GeneratorExprNode genNode = new GeneratorExprNode(line);

            AstNode expr = visit(compCtx.test());
            if (expr != null) {
                genNode.addChild(expr);
            }

            Comp_forContext compFor = compCtx.comp_for();
            genNode.addChild(new NameNode(compFor.NAME().getText(), line));

            AstNode iter = visit(compFor.or_test(0));
            if (iter != null) {
                genNode.addChild(iter);
            }

            if (compFor.IF() != null && compFor.or_test().size() > 1) {
                AstNode cond = visit(compFor.or_test(1));
                if (cond != null) {
                    genNode.addChild(cond);
                }
            }
            return genNode;
        }

        if (testlistComp instanceof TupleTestListContext) {
            TupleTestListContext tupleCtx = (TupleTestListContext) testlistComp;
            if (tupleCtx.test().size() == 1 && tupleCtx.COMMA().isEmpty()) {
                return visit(tupleCtx.test(0));
            }
            TupleNode tupleNode = new TupleNode(line);
            for (TestContext test : tupleCtx.test()) {
                AstNode elem = visit(test);
                if (elem != null) {
                    tupleNode.addChild(elem);
                }
            }
            return tupleNode;
        }

        return visit(testlistComp);
    }

    @Override
    public AstNode visitListAtom(ListAtomContext ctx) {
        int line = ctx.getStart().getLine();

        if (ctx.testlist_comp() == null) {
            return new ListNode(line);
        }

        Testlist_compContext testlistComp = ctx.testlist_comp();

        if (testlistComp instanceof ComprehensionTestListContext) {
            ComprehensionTestListContext compCtx = (ComprehensionTestListContext) testlistComp;
            ListCompNode compNode = new ListCompNode(line);

            AstNode expr = visit(compCtx.test());
            if (expr != null) {
                compNode.addChild(expr);
            }

            Comp_forContext compFor = compCtx.comp_for();
            compNode.addChild(new NameNode(compFor.NAME().getText(), line));

            AstNode iter = visit(compFor.or_test(0));
            if (iter != null) {
                compNode.addChild(iter);
            }

            if (compFor.IF() != null && compFor.or_test().size() > 1) {
                AstNode cond = visit(compFor.or_test(1));
                if (cond != null) {
                    compNode.addChild(cond);
                }
            }
            return compNode;
        }

        if (testlistComp instanceof TupleTestListContext) {
            TupleTestListContext tupleCtx = (TupleTestListContext) testlistComp;
            ListNode listNode = new ListNode(line);
            for (TestContext test : tupleCtx.test()) {
                AstNode elem = visit(test);
                if (elem != null) {
                    listNode.addChild(elem);
                }
            }
            return listNode;
        }

        return new ListNode(line);
    }

    @Override
    public AstNode visitDictMaker(DictMakerContext ctx) {
        int line = ctx.getStart().getLine();
        DictNode dictNode = new DictNode(line);

        for (Dict_itemContext item : ctx.dict_item()) {
            if (item.STRING() != null) {
                String key = item.STRING().getText();
                key = key.substring(1, key.length() - 1);
                dictNode.addChild(new StringNode(key, line));
            } else if (item.NAME() != null) {
                dictNode.addChild(new NameNode(item.NAME().getText(), line));
            }

            AstNode value = visit(item.test());
            if (value != null) {
                dictNode.addChild(value);
            }
        }
        return dictNode;
    }

    @Override
    public AstNode visitSetMaker(SetMakerContext ctx) {
        int line = ctx.getStart().getLine();
        ListNode setNode = new ListNode(line);
        for (TestContext test : ctx.test()) {
            AstNode elem = visit(test);
            if (elem != null) {
                setNode.addChild(elem);
            }
        }
        return setNode;
    }

    @Override
    public AstNode visitDictAtom(DictAtomContext ctx) {
        int line = ctx.getStart().getLine();
        if (ctx.dictorsetmaker() == null) {
            return new DictNode(line);
        }
        return visit(ctx.dictorsetmaker());
    }

    @Override
    public AstNode visitAtom_expr(Atom_exprContext ctx) {
        int line = ctx.getStart().getLine();
        AstNode current = visit(ctx.atom());

        if (ctx.trailer() == null || ctx.trailer().isEmpty()) {
            return current;
        }

        for (TrailerContext trailer : ctx.trailer()) {
            if (trailer instanceof CallTrailerContext) {
                CallNode callNode = new CallNode(line);
                callNode.addChild(current);

                CallTrailerContext call = (CallTrailerContext) trailer;
                if (call.arglist() != null) {
                    if (call.arglist().genexpr_inner() != null) {
                        AstNode genExpr = visitGenexpr_inner(call.arglist().genexpr_inner());
                        if (genExpr != null) {
                            callNode.addChild(genExpr);
                        }
                    } else if (call.arglist().argument() != null) {
                        for (ArgumentContext arg : call.arglist().argument()) {
                            AstNode argNode = visit(arg);
                            if (argNode != null) {
                                callNode.addChild(argNode);
                            }
                        }
                    }
                }
                current = callNode;

            } else if (trailer instanceof GenExprTrailerContext) {
                CallNode callNode = new CallNode(line);
                callNode.addChild(current);

                GenExprTrailerContext genTrailer = (GenExprTrailerContext) trailer;
                AstNode genExpr = visitGenexpr_inner(genTrailer.genexpr_inner());
                if (genExpr != null) {
                    callNode.addChild(genExpr);
                }
                current = callNode;

            } else if (trailer instanceof AttrTrailerContext) {
                AttrAccessNode attrNode = new AttrAccessNode(line);
                attrNode.addChild(current);

                AttrTrailerContext attr = (AttrTrailerContext) trailer;
                attrNode.addChild(new NameNode(attr.NAME().getText(), line));
                current = attrNode;

            } else if (trailer instanceof IndexTrailerContext) {
                SubscriptNode subscriptNode = new SubscriptNode(line);
                subscriptNode.addChild(current);

                IndexTrailerContext index = (IndexTrailerContext) trailer;
                AstNode indexExpr = visit(index.subscript());
                if (indexExpr != null) {
                    subscriptNode.addChild(indexExpr);
                }
                current = subscriptNode;
            }
        }
        return current;
    }

    public AstNode visitGenexpr_inner(Genexpr_innerContext ctx) {
        int line = ctx.getStart().getLine();
        GeneratorExprNode genNode = new GeneratorExprNode(line);

        AstNode expr = visit(ctx.test());
        if (expr != null) {
            genNode.addChild(expr);
        }

        Comp_forContext compFor = ctx.comp_for();
        genNode.addChild(new NameNode(compFor.NAME().getText(), line));

        AstNode iter = visit(compFor.or_test(0));
        if (iter != null) {
            genNode.addChild(iter);
        }

        if (compFor.IF() != null && compFor.or_test().size() > 1) {
            AstNode cond = visit(compFor.or_test(1));
            if (cond != null) {
                genNode.addChild(cond);
            }
        }
        return genNode;
    }

    @Override
    public AstNode visitPositionalArgument(PositionalArgumentContext ctx) {
        return visit(ctx.test());
    }

    @Override
    public AstNode visitKeywordArgument(KeywordArgumentContext ctx) {
        int line = ctx.getStart().getLine();
        KeywordArgNode kwNode = new KeywordArgNode(line);
        kwNode.addChild(new NameNode(ctx.NAME().getText(), line));
        AstNode value = visit(ctx.test());
        if (value != null) {
            kwNode.addChild(value);
        }
        return kwNode;
    }
}