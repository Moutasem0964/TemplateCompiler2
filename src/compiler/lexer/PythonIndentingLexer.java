package compiler.lexer;

import compiler.parser.PythonSubsetLexer;
import org.antlr.v4.runtime.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PythonIndentingLexer implements TokenSource {

    private final PythonSubsetLexer lexer;
    private final Queue<Token> tokenQueue = new LinkedList<>();
    private final Stack<Integer> indentStack = new Stack<>();

    private int bracketDepth = 0;

    private boolean checkIndentNext = false;

    private Token lastNewlineToken = null;

    private boolean lastWasNewline = false;

    public PythonIndentingLexer(PythonSubsetLexer lexer) {
        this.lexer = lexer;
        indentStack.push(0);
    }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) {
            Token t = tokenQueue.poll();
            lastWasNewline = (t.getType() == PythonSubsetLexer.NEWLINE);
            return t;
        }

        while (true) {
            Token token = lexer.nextToken();
            int type = token.getType();

            if (token.getChannel() == Lexer.HIDDEN) {
                continue;
            }

            if (type == PythonSubsetLexer.LPAREN ||
                    type == PythonSubsetLexer.LBRACK ||
                    type == PythonSubsetLexer.LBRACE) {
                bracketDepth++;
            } else if (type == PythonSubsetLexer.RPAREN ||
                    type == PythonSubsetLexer.RBRACK ||
                    type == PythonSubsetLexer.RBRACE) {
                if (bracketDepth > 0) bracketDepth--;
            }

            if (type == PythonSubsetLexer.NEWLINE && bracketDepth > 0) {
                continue;
            }

            if (type == PythonSubsetLexer.NEWLINE) {
                if (lastWasNewline) {
                    continue;
                }

                checkIndentNext = true;
                lastNewlineToken = token;
                lastWasNewline = true;
                return token;
            }

            if (type == PythonSubsetLexer.EOF) {
                while (indentStack.size() > 1) {
                    indentStack.pop();
                    tokenQueue.add(createToken(PythonSubsetLexer.DEDENT, "<<<DEDENT>>>", token));
                }
                tokenQueue.add(token);
                lastWasNewline = false;
                return tokenQueue.poll();
            }

            if (checkIndentNext) {
                checkIndentNext = false;

                int currentIndent = token.getCharPositionInLine();
                int previousIndent = indentStack.peek();

                if (currentIndent > previousIndent) {
                    indentStack.push(currentIndent);
                    tokenQueue.add(token);
                    lastWasNewline = false;
                    return createToken(PythonSubsetLexer.INDENT, "<<<INDENT>>>",
                            lastNewlineToken != null ? lastNewlineToken : token);

                } else if (currentIndent < previousIndent) {
                    while (indentStack.size() > 1 && indentStack.peek() > currentIndent) {
                        indentStack.pop();
                        tokenQueue.add(createToken(PythonSubsetLexer.DEDENT, "<<<DEDENT>>>",
                                lastNewlineToken != null ? lastNewlineToken : token));
                    }
                    tokenQueue.add(token);
                    lastWasNewline = false;
                    return tokenQueue.poll();
                }
            }

            lastWasNewline = false;
            return token;
        }
    }

    private Token createToken(int type, String text, Token positionToken) {
        CommonToken token = new CommonToken(type, text);
        token.setLine(positionToken.getLine());
        token.setCharPositionInLine(positionToken.getCharPositionInLine());
        token.setStartIndex(positionToken.getStartIndex());
        token.setStopIndex(positionToken.getStartIndex());
        return token;
    }

    @Override
    public int getLine() {
        return lexer.getLine();
    }

    @Override
    public int getCharPositionInLine() {
        return lexer.getCharPositionInLine();
    }

    @Override
    public CharStream getInputStream() {
        return lexer.getInputStream();
    }

    @Override
    public String getSourceName() {
        return lexer.getSourceName();
    }

    @Override
    public void setTokenFactory(TokenFactory<?> factory) {
        lexer.setTokenFactory(factory);
    }

    @Override
    public TokenFactory<?> getTokenFactory() {
        return lexer.getTokenFactory();
    }
}