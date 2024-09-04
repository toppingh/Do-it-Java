package ReferenceDataType.sec01_array.ex04;

public class PrimaryAndReferenceType {
    public static void main(String[] args) {

        // 1. 기본 자료형의 stack 값 복사 (=, 대입 연산)
        int value1 = 3;
        int value2 = value1; // stack 값 복사 (기본 자료형은 stack 메모리에 값이 있으므로 값이 복사됨)
        value2 = 7;
        System.out.println(value1); // 3
        System.out.println(value2); // 7

        // 2. 참조 자료형의 stack 값 복사 (=, 대입 연산)
        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1; // [3, 4, 5]를 가리키는 위치(stack) 값을 복사
        array2[0] = 7;

        System.out.println(array1[0]); // 7
        System.out.println(array2[0]); // 7
    }
}
