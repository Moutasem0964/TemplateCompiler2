package compiler.symbol;

import java.util.*;

public class Scope {
    private final String name;
    private final Scope parent;
    private final Map<String, Symbol> symbols;
    private final List<Scope> children;

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        this.symbols = new LinkedHashMap<>(); // Preserve insertion order
        this.children = new ArrayList<>();
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }

        // Search in parent scope
        if (parent != null) {
            return parent.resolve(name);
        }

        return null;
    }

    public Symbol resolveLocal(String name) {
        return symbols.get(name);
    }

    public void addChild(Scope child) {
        children.add(child);
    }

    public boolean isDefined(String name) {
        return symbols.containsKey(name);
    }

    public String getName() {
        return name;
    }

    public Scope getParent() {
        return parent;
    }

    public Map<String, Symbol> getSymbols() {
        return Collections.unmodifiableMap(symbols);
    }

    public List<Scope> getChildren() {
        return Collections.unmodifiableList(children);
    }


    public String getFullPath() {
        if (parent == null) {
            return name;
        }
        return parent.getFullPath() + "." + name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scope: ").append(name);
        if (parent != null) {
            sb.append(" (parent: ").append(parent.getName()).append(")");
        }
        sb.append("\n");

        if (!symbols.isEmpty()) {
            sb.append("Symbols:\n");
            for (Symbol symbol : symbols.values()) {
                sb.append("  ").append(symbol).append("\n");
            }
        }

        return sb.toString();
    }
}