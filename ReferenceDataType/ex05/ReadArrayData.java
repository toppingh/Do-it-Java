package ReferenceDataType.ex05;

import java.util.Arrays;

public class ReadArrayData {
    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5};

        // 1. 배열의 길이 구하기
        System.out.println(array.length); // 읽기전용, array가 가리키고 있는 공간의 개수(길이), 5
        System.out.println();

        // 2. 출력하기 1: 인덱스에 직접 접근
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println();

        // 3. 출력하기 2: for문
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 4. 출력하기 3: for-each : for(꺼낸 하나의 원소를 저장할 수 있는 변수 : 집합 객체) {}
        for(int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();

        // 5. 출력하기 4: Arrays.toString()
        System.out.println(Arrays.toString(array));
    }
}
