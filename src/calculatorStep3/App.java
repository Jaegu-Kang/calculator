package calculatorStep3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 계산 기록을 담당할 Calculator 객체를 생성합니다.
        // 제네릭 사용에 따른 타입 명시
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다
        Scanner sc = new Scanner(System.in);
        // exit를 입력하기 전까지 반복되는 계산기 실행
        while (true) {
            // 사용자에게 보여주는 메뉴 화면을 출력합니다.
            System.out.println("======= 메뉴 선택 =======");
            System.out.println("계산:       +, -, *, /    입력");
            System.out.println("종료:           exit      입력");
            System.out.println("기록확인:        record    입력");
            System.out.println("기록삭제:        remove    입력");
            System.out.println("기록검색(큰수):   search1   입력");
            System.out.println("기록검색(작은수): search2   입력");
            System.out.print("원하는 메뉴를 입력하세요:");
            // 사용자가 입력한 문자열을 읽어 옵니다.
            String menu = sc.next();
            // 입력한 문자열에 따라서 기능을 수행하기 위한 switch 문
            switch (menu) {
                // 입력 받은 문자가 exit 일때 프로그램을 종료합니다.
                case "exit":
                    System.out.println("계산기를 종료합니다");
                    return;
                // 입력 받은 문자가 record 일때 계산기록을 출력합니다.
                case "record":
                    // Calculator 객체에 있는 기록을 호출합니다.
                    ArrayList<String> record = cal.getRecord();
                    System.out.println("계산 기록은: ");
                    // 기록을 보기좋게 한줄씩 출력합니다.
                    for (String history : record) {
                        System.out.println(history);
                    }
                    break;
                // 가장 오래된 기록(배열중 0번)을 삭제합니다.
                case "remove":
                    cal.remove();
                    break;
                // 입력 받은 문자가 search1일때 입력한 값보다 큰 값을 검색하는 기능
                case "search1":
                    System.out.println("어떤 값보다 큰 값을 검색할까요?");
                    System.out.print("숫자 입력: ");
                    double thisNum1 = sc.nextDouble();
                    System.out.println("검색 결과는: ");
                    cal.biggertThan(thisNum1);
                    break;
                // 입력 받은 문자가 search2일때 입력한 값보다 작은 값을 검색하는 기능
                case "search2":
                    System.out.println("어떤 값보다 작은 값을 검색할까요?");
                    System.out.print("숫자 입력: ");
                    double thisNum2 = sc.nextDouble();
                    System.out.println("검색 결과는: ");
                    cal.smallThan(thisNum2);
                    break;

                // 입력 받은 문자가 사칙 연산 기록일때
                case "+", "-", "*", "/" :
                    // 첫번째 숫자를 입력 받습니다.
                    // 소숫점 입력도 받을 수 있도록 double 타입으로 변경
                    System.out.println("첫번째 숫자를 입력하세요: ");
                    double a = sc.nextDouble();
                    // 두번째 숫자를 입력 받습니다.
                    // 소숫점 입력도 받을 수 있도록 double 타입으로 변경
                    System.out.println("두번째 숫자를 입력하세요: ");
                    double b = sc.nextDouble();
                    // 입력 받은 문자에 맞춰 enum을 calculate 메서드에 전달합니다.
                    if (menu.equals("+")){
                        System.out.println("결과 " + a + " + " + b + " = " + cal.calculate(a, b, OperatorType.SUM));
                    } else if (menu.equals("-")) {
                        System.out.println("결과 " + a + " - " + b + " = " + cal.calculate(a, b, OperatorType.SUB));
                    } else if (menu.equals("*")) {
                        System.out.println("결과 " + a + " * " + b + " = " + cal.calculate(a, b, OperatorType.MUL));
                    } else if (menu.equals("/")) {
                        // 만약 입력 받은 두번째 숫자가 0일 경우 에러 메세지를 출력합니다.
                        if (b == 0){
                            System.out.println("나눗셈 연산에서 분모에 0이 입력될수 없습니다.");
                        } else {
                            System.out.println("결과 " + a + " / " + b + " = " + cal.calculate(a, b, OperatorType.DIV));
                        }
                    }
            }
        }
    }
}