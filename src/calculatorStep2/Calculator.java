package calculatorStep2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> calList = new ArrayList<>();

    int sum(int a, int b) {
        int result = a + b;
        calList.add(result);
        return result;
    }

    int sub(int a, int b) {
        int result = a - b;
        calList.add(result);
        return result;
    }

    int mul(int a, int b) {
        int result = a * b;
        calList.add(result);
        return result;
    }

    int div(int a, int b) {
        int result = a / b;
        calList.add(result);
        return result;
    }

    public ArrayList<Integer> getCalList(){
        return this.calList;
    }

    public void setCalList(ArrayList<Integer> calList) {
        this.calList = calList;
    }

    public void remove() {
        int removeCallist = calList.remove(0);
        System.out.println(" 기록이 삭제되었습니다. " + removeCallist);
    }
}

