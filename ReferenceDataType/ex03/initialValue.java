package ReferenceDataType.ex03;

import java.util.Arrays;

public class initialValue {
    public static void main(String[] args) {

        // 1. stack 메모리 값 (강제 초기화 되지 않음)
//        int value1;
//        System.out.println(value1); // 오류 : value1이 stack 메모리에 빈칸으로 존재함 -> 값을 읽어 오는 것은 불가능
//
//        int[] value2; // 참조 자료형, 모든 변수는 stack 메모리에 저장됨
//        System.out.println(value2); // 오류 : 빈 값

        int value3 = 0; // 초기화 했으므로 값 출력
        System.out.println(value3); // 0

//        int[] value4 = 0; // int[] : 참조 자료형 -> 번지(위치값) 저장하므로, 실제 값이 아닌 번지에 해당하는 값이 와야함
        int[] value4 = null;
        System.out.println(value4); // null

        // 2. heap 메모리의 초기값 (강제 초기화)
        // 기본 자료형 배열
        boolean[] array1 = new boolean[3]; // boolean type 값을 저장할 수 있는 3개의 공간 생성
        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i] + " "); // 강제 초기화된 값(false) 출력
        }
        System.out.println();

        int[] array2 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i] + " "); // 강제 초기화 된 값(0) 출력
        }
        System.out.println();

        double[] array3 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array3[i] + " "); // 강제 초기화 된 값(0.0) 출력
        }
        System.out.println();

        // 참조 자료형 배열
        String[] array4 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array4[i] + " "); // 아무것도 가리키고 있지 않다는 뜻의 null로 초기화
        }
        System.out.println();

        // Tip! 배열을 쉽게 출력할 수 있는 방법 - Arrays.toString(배열의 객체) : for문을 돌리지 않아도 모든 배열 출력(범위 지정x)
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
