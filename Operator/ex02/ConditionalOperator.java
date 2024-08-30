package Operator.ex02;

public class ConditionalOperator {
    public static void main(String[] args) {

        // 1. 삼항 연산자
        int value1 = (3 > 5) ? 6 : 9; // 거짓
        System.out.println(value1); // 9

        int value2 = (10 <= 21) ? 1 : 10; // 참
        System.out.println(value2); // 1

        int value3 = 3;
        System.out.println((value3 % 2 == 0) ? "짝수" : "홀수"); // 거짓, 홀수

        // if - else 구문으로 변환
        if (value3 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
