package calculatorStep2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("======= 메뉴 선택 =======");
            System.out.println("계산:    +, -, *, /  입력");
            System.out.println("종료:      exit      입력");
            System.out.println("기록확인:   record    입력");
            System.out.println("기록삭제:   remove    입력");
            System.out.print("원하는 메뉴를 입력하세요:");
            String menu = sc.next();

            switch (menu) {
                case "exit":
                    System.out.println("계산기를 종료합니다");
                    return;

                case "record":
                    ArrayList<String> record = cal.getRecord();
                    System.out.println("계산 기록은: ");
                    for (String history : record) {
                        System.out.println(history);
                    }
                    break;

                case "remove":
                    cal.remove();
                    break;

                case "+", "-", "*", "/" :
                    System.out.println("첫번째 숫자를 입력하세요: ");
                    int a = sc.nextInt();

                    System.out.println("두번째 숫자를 입력하세요: ");
                    int b = sc.nextInt();

                    if (menu.equals("+")){
                        System.out.println("결과 " + a + " + " + b + " = " + cal.sum(a, b));
                    } else if (menu.equals("-")) {
                        System.out.println("결과 " + a + " - " + b + " = " + cal.sub(a, b));
                    } else if (menu.equals("*")) {
                        System.out.println("결과 " + a + " * " + b + " = " + cal.mul(a, b));
                    } else if (menu.equals("/")) {
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