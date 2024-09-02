package LoopControlStatement.ex01;

public class ForControlStatement {
    public static void main(String[] args) {
        
        // 1. for 기본 문법 구조
        int a;
        for(a = 0; a < 5; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) { // for문에서만 i 사용 가능
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        } // 10, 9, ..., 1
        System.out.println();

        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        } // 0, 2, 4, 6, 8
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        } // 0, 2, 4, 6, 8, 10, 12, 14, 16, 18
        System.out.println();
        
        // 2. for문의 특수한 형태 (무한 루프)
//        for (int i = 0; ; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (;;) {
//            System.out.println("무한루프");
//        }
        System.out.println();

        // 3. 무한루프 탈출 (break)
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
