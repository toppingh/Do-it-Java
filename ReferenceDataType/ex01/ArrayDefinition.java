package ReferenceDataType.ex01;

public class ArrayDefinition {
    public static void main(String[] args) {

        // 1. 배열의 선언 방법#1
        int[] array1 = new int[3]; // new : 객체 선언
        int[] array2;
        array2 = new int[3];

        // 2. 배열의 선언 방법#2
        int arra3[] = new int[3];
        int array4[];
        array4 = new int[3];

        // 3. 다양한 배열 선언 (기보 자료형 배열, 참조 자료형 배열)
        boolean[] array5 = new boolean[3];
        int[] array6 = new int[5]; // 하나의 type만 지정가능, 개수 필수
        double[] array7 = new double[7];
        String[] array8 = new String[8];
    }
}
