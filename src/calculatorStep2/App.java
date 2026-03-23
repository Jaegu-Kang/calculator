package calculatorStep2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.println("두번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: (종료하려면 exit를 입력하세요) ");
            String c = sc.next();

            if (c.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (c.equals("+")) {
                System.out.println("결과 = " + cal.sum(a, b));
            } else if (c.equals("-")) {
                System.out.println("결과 = " + cal.sub(a, b));
            } else if (c.equals("*")) {
                System.out.println("결과 = " + cal.mul(a, b));
            } else if (c.equals("/")) {
                if (b == 0){
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될수 없습니다.");
                } else {
                    System.out.println("결과 = " + cal.div(a, b));
                }

            }
        }
    }
}