package ControlStatement.ex01;

public class IfControlStatement {
    public static void main(String[] args) {

        // 1. Type1 : if
        int value1 = 5;
        if (value1 > 3) {
            System.out.println("실행1");
        }
        if (value1 < 5) {
            System.out.println("실행2");
        }

        boolean bool1 = true;
        boolean bool2 = false;

        if (bool1) {
            System.out.println("실행3");
        }
        if (bool2) {
            System.out.println("실행4");
        }

        // 2. Type2 : if - else
        int value2 = 10;
        if (value2 > 3) {
            System.out.println("실행5"); // 실행
        } else {
            System.out.println("실행6"); // 실행x
        }

        // 삼항 연산자 변환
        System.out.println((value2 > 3) ? "실행5" : "실행6"); // 실행5

        // 3. Type3 : if - else if - else if - else
        int value3 = 89;
        if (value3 > 90) {
            System.out.println("A학점");
        } else if (value3 >= 80) {
            System.out.println("B학점"); // 실행
        } else if (value3 >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("F학점");
        }

        // 범위가 겹치는 경우 순서 중요!
        if (value3 > 70) {
            System.out.println("C학점");
        } else if (value3 >= 90) {
            System.out.println("A학점");
        } else if (value3 >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("F학점");
        }

        // 순서를 상관하지 않고싶을 때 - 정확한 범위로 조건
        if (value3 >= 70 && value3 < 80) {
            System.out.println("C학점");
        } else if (value3 >= 80 && value3 < 90) {
            System.out.println("B학점");
        } else if (value3 >= 90) {
            System.out.println("A학점");
        } else {
            System.out.println("F학점");
        }
    }
}
