package compiler.lexer;

import compiler.parser.PythonSubsetLexer;
import compiler.parser.PythonSubsetParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PythonIndentingLexer extends PythonSubsetLexer {

    private final Stack<Integer> indentStack = new Stack<>();
    private final Queue<Token> tokenQueue = new LinkedList<>();

    // Use the parser's token constants - ANTLR generates them for referenced tokens
    private static final int INDENT_TYPE = PythonSubsetParser.INDENT;
    private static final int DEDENT_TYPE = PythonSubsetParser.DEDENT;

    public PythonIndentingLexer(CharStream input) {
        super(input);
        indentStack.push(0); // base indentation level
    }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        Token token = super.nextToken();

        if (token.getType() == PythonSubsetLexer.EOF) {
            emitDedentsToBase(token);
            if (!tokenQueue.isEmpty()) {
                return tokenQueue.poll();
            }
            return token;
        }

        if (token.getType() == PythonSubsetLexer.NEWLINE) {
            handleNewline(token);
        }

        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

        return token;
    }

    private void handleNewline(Token newlineToken) {
        // Measure indentation after the newline
        int start = getCharIndex();
        int indent = 0;

        while (true) {
            int la = _input.LA(1);
            if (la == ' ') {
                indent++;
                _input.consume();
            } else if (la == '\t') {
                indent += 4; // adjust tab size if needed (4 or 8)
                _input.consume();
            } else if (la == '\r' || la == '\n') {
                // extra newline - ignore for indentation
                _input.consume();
            } else {
                break;
            }
        }
        _input.seek(start); // reset position

        int current = indentStack.peek();

        if (indent > current) {
            indentStack.push(indent);
            tokenQueue.add(createSyntheticToken(INDENT_TYPE, newlineToken));
        } else if (indent < current) {
            while (indentStack.peek() > indent && indentStack.size() > 1) {
                indentStack.pop();
                tokenQueue.add(createSyntheticToken(DEDENT_TYPE, newlineToken));
            }
        }
        // Keep the original NEWLINE token for simple statements
    }

    private void emitDedentsToBase(Token eofToken) {
        while (indentStack.size() > 1) {
            indentStack.pop();
            tokenQueue.add(createSyntheticToken(DEDENT_TYPE, eofToken));
        }
    }

    private Token createSyntheticToken(int type, Token original) {
        CommonToken token = new CommonToken(new Pair<>(_tokenFactorySourcePair.a, _input),
                type, DEFAULT_TOKEN_CHANNEL, original.getStartIndex(), original.getStopIndex());
        token.setLine(original.getLine());
        token.setCharPositionInLine(original.getCharPositionInLine());
        token.setText("<synthetic:" + getVocabulary().getSymbolicName(type) + ">");
        return token;
    }
}