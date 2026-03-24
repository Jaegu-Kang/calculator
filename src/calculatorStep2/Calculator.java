package calculatorStep2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<String> record = new ArrayList<>();

    int sum(int a, int b) {
        int result = a + b;
        record.add(a + " + " + b + " = " + result);
        return result;
    }

    int sub(int a, int b) {
        int result = a - b;
        record.add(a + " - " + b + " = " + result);
        return result;
    }

    int mul(int a, int b) {
        int result = a * b;
        record.add(a + " * " + b + " = " +result);
        return result;
    }

    int div(int a, int b) {
        int result = a / b;
        record.add(a + " / " + b + " = " + result);
        return result;
    }

    public ArrayList<String> getRecord() {
        return this.record;
    }

    public void setRecord(ArrayList<String> record) {
        this.record = record;
    }

    public void remove() {
        String removeRecord = record.remove(0);
        System.out.println(" 기록이 삭제되었습니다. " + removeRecord);
    }
}

