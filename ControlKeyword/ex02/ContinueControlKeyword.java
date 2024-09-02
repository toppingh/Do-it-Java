package ControlKeyword.ex02;

public class ContinueControlKeyword {
    public static void main(String[] args) {

        // 1. 단일 루프에서의 continue
        for (int i = 0; i < 10; i++) {
//            continue; 닫힌 중괄호의 역할, continue를 만나면 i++(증감식)을 만나서 코드 실행x
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            continue; // 없는 것과 똑같은 결과
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                continue; // pass
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. 다중(이중) 루프에서의 continue
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        POS1: for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue POS1;
                }
                System.out.println(i + ", " + j);
            }
        }

    }
}
