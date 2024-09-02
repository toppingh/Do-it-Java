package ControlKeyword.ex01;

public class BreakControlKeyword {
    public static void main(String[] args) {

        // 1. 단일 loop break 탈출
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
//            break; 시작하자마자 break을 만나므로 0 출력 후 for문 탈출
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        } //0, 1, 2, 3, 4
        System.out.println();

        // 2. 다중(이중) loop break 탈출
        // case1. 하나의 반복문만 탈출하는 경우
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2)
                    break;
                System.out.println(i + ", " + j);
            }
        } // 0,0 0,1 1,0 1,1 2,0 2,1 ... 4,0 4,1
        System.out.println();

        // case2. 다중 반복문을 한번에 탈출하는 방법 (break LABLE))
        POS1: for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (j == 2) {
                    break POS1;
                }
                System.out.println(i + ", " + j);
            }
        } // 0,0 0,1
        System.out.println();

        // case3. 다중 반복문을 한번에 탈출하는 방법 (변숫값 조정) - 더 자주 사용
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    i = 5; // i++ 증감을 이용해 i < 5 조건에 맞지 않도록 변수값 조정
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
    }
}
