package LoopControlStatement.ex03;

public class DoWhileControlStatement {
    public static void main(String[] args) {

        // 1. 반복횟수가 0인 경우 do-while과 while 비교
        int a = 0;
        while(a < 0) { // 시작하자마자 false로 실행 x
            System.out.print(a +" ");
            a++;
        } // 실행횟수 : 0번

        do {
            System.out.print(a + " ");
            a++;
        } while(a < 0); // do 실행 후 조건문 판단 즉, 일단 a를 print 한 후 조건 확인
        // 실행횟수 : 1번

        // 2. 반복횟수가 1인경우 do-while과 while 비교
        while(a < 1) {
            System.out.print(a + " ");
            a++;
        } // 실행횟수 : 1번

        do {
            System.out.print(a + " "); // 0
            a++;
        } while(a < 1); // 실행횟수 : 1번

        // 3. 반복횟수가 10인 경우 do-while과 while 비교
        while(a < 10) {
            System.out.print(a + " ");
            a++;
        } // 실행횟수 : 10번
        System.out.println();

        do {
            System.out.print(a + " ");
            a++;
        } while(a < 10); // 실행횟수 : 10번
    }
}
