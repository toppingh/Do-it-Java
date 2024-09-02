package ControlStatement.ex02;

public class SwitchControlStatement {
    public static void main(String[] args) {

        // 1. break이 포함되지 않는 경우
        int value1 = 2;
        switch(value1) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        } // BCD 출력
        System.out.println();

        // 2. break 포함된 경우
        int value2 = 5;
        switch(value2) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break; // break가 없고 value2 값이 2일 경우 B, C 출력 후 break
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D"); // 실행
        } // D

        // if - else문으로 변환
        if (value2 == 1) {
            System.out.println("A");
        } else if (value2 == 2) {
            System.out.println("B");
        } else if (value2 == 3) {
            System.out.println("C");
        } else {
            System.out.println("D"); // 실행
        }

        }
}
