package calculatorStep3;

import java.util.function.BiFunction;
// 사칙연산 기호를 보관하는 enum
public enum OperatorType {
    // 람다식 생성 a, b -> 연산
    SUM("+", (a, b) -> a + b),
    SUB("-", (a, b) -> a - b),
    MUL("*", (a, b) -> a * b),
    DIV("/", (a, b) -> a / b);

    // 사칙연산 기호를 저장하는 변수
    private final String type;

    // 두개의 int를 받아 하나의 int로 반환
    private final BiFunction<Integer, Integer, Integer> oper;

    // 생성자
    OperatorType(String type, BiFunction<Integer, Integer, Integer> oper) {
        this.type = type;
        this.oper = oper;
    }

    // 사칙연산 기호를 꺼내주는 게터
    public String getType()
    {return type;}
    // 외부에서 a, b가 들어오면 저장해둔 람다식을 실행해주는 메서드
    public int cal(int a, int b) {
        return oper.apply(a, b);
    }
}
