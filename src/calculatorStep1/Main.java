package calculatorStep1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 기호를 입력하세요: (종료하려면 exit를 입력하세요) ");
            String c = sc.nextLine();

            if (c.equals("exit")){
                System.out.println("계산기를 종료합니다.");
                break;
            }
            else if (c.equals("+")) {
                System.out.println("결과 = " + (a + b));
            } else if (c.equals("-")) {
                System.out.println("결과 = " + (a - b));
            } else if (c.equals("*")) {
                System.out.println("결과 = " + (a * b));
            } else if (c.equals("/")) {
                System.out.println("결과 = " + (a - b));
            }


        }
    }
}