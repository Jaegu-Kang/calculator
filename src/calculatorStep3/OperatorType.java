package calculatorStep3;

import java.util.function.BiFunction;

public enum OperatorType {
    SUM("+", (a, b) -> a + b),
    SUB("-", (a, b) -> a - b),
    MUL("*", (a, b) -> a * b),
    DIV("/", (a, b) -> a / b);

    private final String type;
    private final BiFunction<Integer, Integer, Integer> oper;

    OperatorType(String type, BiFunction<Integer, Integer, Integer> oper) {
        this.type = type;
        this.oper = oper;
    }
    public String getType()
    {return type;}
    public int cal(int a, int b) {
        return oper.apply(a, b);
    }
}
