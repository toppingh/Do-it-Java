package LoopControlStatement.ex02;

public class WhileControlStatement {
    public static void main(String[] args) {

        // 1. while 기본 문법 구조
        int a = 0;
        while(a < 10) {
            System.out.print(a + " ");
            a++;
        } // 0, 1, ..., 9
        System.out.println();

        // for문으로 변환
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int b = 10;
        while(b > 0) {
            System.out.print(b + " ");
            b--;
        } // 10, 9, ..., 1
        System.out.println();

        // for문으로 변환
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while의 특수한 형태(무한루프)
//        while(true) {
//            System.out.println("무한루프");
//        } // 조건식 (true) 생략 불가능

        // 3. 무한루프 탈출
        int c = 0;
        while(true) {
            if (c > 10) {
                break;
            }
            System.out.print(c + " ");
            c++;
        } // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        System.out.println();
    }
}
