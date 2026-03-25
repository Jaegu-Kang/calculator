package calculatorStep3;

import java.util.ArrayList;

// 숫자 타입만 받을수 있도록 고정
public class ArithmeticCalculator<T extends Number> {

    // 계산 기록을 저장하는 리스트
    private ArrayList<String> record = new ArrayList<>();

    // 스트림 사용을 위한 계산 결과값만 저장하는 리스트
    private ArrayList<Double> results = new ArrayList<>();

    // enum을 활용하여 연산 메서드를 통합
    // 매개변수 a, b를 타입 T로 변경, 반환타입을 double로 변경: 나중에 발견
    public double calculate(T a, T b, OperatorType type) {

        // T로 들어온 값을 모두 double로 변경
        double a1 = a.doubleValue();
        double b1 = b.doubleValue();

        // enum에게 a, b를 넘겨줍니다.
        double result = type.cal(a1, b1);

        // 계산기록 전체를 저장합니다.
        record.add(a + type.getType() + b +" = " + result);

        // 스트림활용을 위해 계산 결과 값만 저장합니다.
        results.add(result);

        return result;
    }

    // 스트림을 활용한 조회 메서드
    public void biggertThan(double thisNum1) {
        // 계산 결과 값을 스트림에 호출합니다.
        results.stream()
                // 입력한 값 thisNum 보다 큰값만 걸러내고 그 값을 출력합니다.
                .filter(result -> result > thisNum1)
                .forEach(result -> System.out.println(result));
    }

    public void smallThan(double thisNum2) {
        results.stream()
                .filter(result -> result < thisNum2)
                .forEach(result -> System.out.println(result));
    }

    // 누적된 계산 기록을 반환합니다.
    public ArrayList<String> getRecord() {
        return this.record;
    }
    // 새로운 계산 기록을 저장합니다.
    public void setRecord(ArrayList<String> record) {
        this.record = record;
    }
    // 가장 오래된 기록(배열 중 0번)을 삭제하고 삭제된 기록을 removeRecord에 담아서 보여줍니다.
    public void remove() {
        String removeRecord = record.remove(0);
        System.out.println("기록이 삭제되었습니다. " + removeRecord);
    }
}

//    int sum(int a, int b) {
//        int result = a + b;
//        record.add(a + " + " + b + " = " + result);
//        return result;
//    }
//    // 뺄셈 연산을 수행하고 그 결과를 저장합니다.
//    int sub(int a, int b) {
//        int result = a - b;
//        record.add(a + " - " + b + " = " + result);
//        return result;
//    }
//    // 곱셈 연산을 수행하고 그 결과를 저장합니다.
//    int mul(int a, int b) {
//        int result = a * b;
//        record.add(a + " * " + b + " = " +result);
//        return result;
//    }
//    // 나눗셈 연산을 수행하고 그 결과를 저장합니다.
//    int div(int a, int b) {
//        int result = a / b;
//        record.add(a + " / " + b + " = " + result);
//        return result;
//    }
