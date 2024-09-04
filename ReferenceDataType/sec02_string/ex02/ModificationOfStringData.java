package ReferenceDataType.sec02_string.ex02;

import java.util.Arrays;

public class ModificationOfStringData {
    public static void main(String[] args) {
        // 내부 데이터 수정 불가능 -> 실제 메모리에서는 새로운 객체 생성(기존의 객체 수정 불가능)

        // 1. 문자열 수정 (객체 내용 변경 불가 -> 새로운 객체 생성)
        String str1 = new String("안녕");
        String str2 = str1; // 대입 연산자(=) : 스택 메모리 copy, 같은 번지수를 가리키고 있음
        str1 = "안녕하세요"; // 새로운 객체 안녕하세요 생성, str2는 여전히 기존에 생성된 안녕의 위치를 가리킴

        System.out.println(str1); // 안녕하세요
        System.out.println(str2); // 안녕

        // 배열 참조 자료형 - 자신의 객체를 바꿀 수 있음 (내부 데이터 변경 가능)
        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1;
        array1[0] = 6;
        array1[1] = 7;
        array1[2] = 8;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
