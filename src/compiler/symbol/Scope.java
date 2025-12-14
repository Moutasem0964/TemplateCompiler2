package compiler.symbol;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final Scope parent;
    private final Map<String, Symbol> symbols = new HashMap<>();

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol lookup(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;
        if (parent != null) return parent.lookup(name);
        return null;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    public Scope getParent() {
        return parent;
    }
}