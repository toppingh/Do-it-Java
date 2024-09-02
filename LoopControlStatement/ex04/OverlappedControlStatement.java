package LoopControlStatement.ex04;

public class OverlappedControlStatement {
    public static void main(String[] args) {

        // 1. if-if 중복
        int value1 = 5;
        int value2 = 3;
        if (value1 > 5) {
            if (value2 < 2) {
                System.out.println("실행1");
            } else {
                System.out.println("실행2");
            }
        } else {
            System.out.println("실행3"); // 출력
        }

        // 2. switch-for 중복
        int value3 = 2;
        switch(value3) {
            case 1:
                for(int k = 0; k < 10; k++) {
                    System.out.print(k + " ");
                }
                break;
            case 2:
                for(int k = 10; k > 0; k--) {
                    System.out.print(k + " ");
                }
                break;
            case 3:
                for(int k = 0; k > 10; k+=2) {
                    System.out.print(k + " ");
                }
                break;
            // ...
        }
        System.out.println();

        // 3. for-for-if 중복
        for (int i = 0; i < 3; i++) { // 3번
            for(int j = 0; j < 5; j++) { // 5번, 총 15번
                System.out.println(i + " " + j);
                if (i == j) {
                    System.out.println("i == j");
                }
            }
        }
    }
}
