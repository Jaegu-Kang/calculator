package calculatorStep2;

import java.util.ArrayList;

public class Calculator {

    // 기록 저장을 위한 Arraylist 생성
    // 처음에 Integer로 설정했으나 기록이 123, 456, 789 처럼 가독성이 떨어지게 출력되어
    // 수식 전체를 보기좋게 저장하기 위해 String 타입으로 수정했습니다.
    private ArrayList<String> record = new ArrayList<>();
    //덧셈 연산을 수행하고 그 결과를 저장합니다.
    int sum(int a, int b) {
        int result = a + b;
        record.add(a + " + " + b + " = " + result);
        return result;
    }
    // 뺄셈 연산을 수행하고 그 결과를 저장합니다.
    int sub(int a, int b) {
        int result = a - b;
        record.add(a + " - " + b + " = " + result);
        return result;
    }
    // 곱셈 연산을 수행하고 그 결과를 저장합니다.
    int mul(int a, int b) {
        int result = a * b;
        record.add(a + " * " + b + " = " +result);
        return result;
    }
    // 나눗셈 연산을 수행하고 그 결과를 저장합니다.
    int div(int a, int b) {
        int result = a / b;
        record.add(a + " / " + b + " = " + result);
        return result;
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

