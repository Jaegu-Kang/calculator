package calculatorStep2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 계산 기록을 담당할 Calculator 객체를 생성합니다.
        Calculator cal = new Calculator();
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다
        Scanner sc = new Scanner(System.in);
        // exit를 입력하기 전까지 반복되는 계산기 실행
        while (true) {
            // 사용자에게 보여주는 메뉴 화면을 출력합니다.
            System.out.println("======= 메뉴 선택 =======");
            System.out.println("계산:    +, -, *, /  입력");
            System.out.println("종료:      exit      입력");
            System.out.println("기록확인:   record    입력");
            System.out.println("기록삭제:   remove    입력");
            System.out.print("원하는 메뉴를 입력하세요:");
            // 사용자가 입력한 문자열을 읽어 옵니다.
            String menu = sc.next();
            // 입력한 문제열에 따라서 기능을 수행하기 위한 switch 문
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
                // 입력 받은 문자가 사칙 연산 기록일때
                case "+", "-", "*", "/" :
                    // 첫번째 숫자를 입력 받습니다.
                    System.out.println("첫번째 숫자를 입력하세요: ");
                    int a = sc.nextInt();
                    // 두번째 숫자를 입력 받습니다.
                    System.out.println("두번째 숫자를 입력하세요: ");
                    int b = sc.nextInt();
                    // 입력 받은 문자가 + 일때 덧셈 연산을 수행하는 메서드를 Calculator 객체에서 호출하고 그 결과를 출력합니다.
                    if (menu.equals("+")){
                        System.out.println("결과 " + a + " + " + b + " = " + cal.sum(a, b));
                    // 입력 받은 문자가 - 일때 뺄셈 연산을 수행하는 메서드를 Calculator 객체에서 호출하고 그 결과를 출력합니다.
                    } else if (menu.equals("-")) {
                        System.out.println("결과 " + a + " - " + b + " = " + cal.sub(a, b));
                    // 입력 받은 문자가 * 일때 곱셈 연산을 수행하는 메서드를 Calculator 객체에서 호출하고 그 결과를 출력합니다.
                    } else if (menu.equals("*")) {
                        System.out.println("결과 " + a + " * " + b + " = " + cal.mul(a, b));
                    // 입력 받은 문자가 / 일때 나눗셈 연산을 수행하는 메서드를 Calculator 객체에서 호출하고 그 결과를 출력합니다.
                    } else if (menu.equals("/")) {
                        // 만약 입력 받은 두번째 숫자가 0일 경우 에러 메세지를 출력합니다.
                        if (b == 0){
                            System.out.println("나눗셈 연산에서 분모에 0이 입력될수 없습니다.");
                        } else {
                            System.out.println("결과 " + a + " / " + b + " = " + cal.div(a,b));
                        }
                }
            }
        }
    }
}


//            System.out.println("첫번째 숫자를 입력하세요: ");
//            int a = sc.nextInt();
//
//            System.out.println("두번째 숫자를 입력하세요: ");
//            int b = sc.nextInt();
//
//            if (c.equals("exit")) {
//                System.out.println("계산기를 종료합니다.");
//                break;
//            } else if (c.equals("+")) {
//                System.out.println("결과 = " + cal.sum(a, b));
//            } else if (c.equals("-")) {
//                System.out.println("결과 = " + cal.sub(a, b));
//            } else if (c.equals("*")) {
//                System.out.println("결과 = " + cal.mul(a, b));
//            } else if (c.equals("/")) {
//                if (b == 0){
//                    System.out.println("나눗셈 연산에서 분모에 0이 입력될수 없습니다.");
//                } else {
//                    System.out.println("결과 = " + cal.div(a, b));
//                }
//
//            } else if (c.equals("callist")) {
//                ArrayList<Integer> calList = cal.getCalList();
//                System.out.println("계산기록은: ");
//                for (Integer callist : calList){
//                    System.out.println(callist);
//                }
//            } else if (c.equals("remove")) {
//                cal.remove();
//
//            }