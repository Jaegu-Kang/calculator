package calculatorStep3;

public enum OperatorType {
    SUM("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String type;

    OperatorType(String type) {
        this.type = type;
    }
    public String getType() {return type;}
}
