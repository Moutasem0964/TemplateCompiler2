package compiler.symbol;

public class Symbol {
    private final String name;
    private final String type; // optional, e.g., "variable", "loop_var"

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}