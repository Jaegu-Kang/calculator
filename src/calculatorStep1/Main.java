package calculatorStep1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 사용자의 입력을 받기 위한 Scanner 생성
        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            // 첫번째 숫자를 입력 받습니다.
            System.out.println("첫번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            // 두번째 숫자를 입력 받습니다.
            System.out.println("두번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            // 문자열을 입력 받습니다.
            System.out.println("사칙연산 기호를 입력하세요: (종료하려면 exit를 입력하세요) ");
            String c = sc.next();

            // 입력받은 문자가 exit 일 경우 프로그램을 종료합니다.
            if (c.equals("exit")){
                System.out.println("계산기를 종료합니다.");
                break;
            }// 입력 받은 문자가 + 일 경우 a, b 를 더해 결과를 출력합니다.
            else if (c.equals("+")) {
                System.out.println("결과 = " + (a + b));
            }// 입력 받은 문자가 - 일 경우 a, b 를 빼서 결과를 출력합니다.
            else if (c.equals("-")) {
                System.out.println("결과 = " + (a - b));
            }// 입력 받은 문자가 * 일 경우 a, b 를 곱해서 결과를 출력합니다.
            else if (c.equals("*")) {
                System.out.println("결과 = " + (a * b));
            }// 입력받은 문자가 / 일경우
            else if (c.equals("/")) {
                // b 가 0일 경우 에러메세지를 출력합니다.
                if (b == 0){
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될수 없습니다.");
                }// 아니라면 a, b 를 나누고 결과를 출력합니다.
                else {
                    System.out.println("결과 = " + (a - b));
                }
            }


        }
    }
}