package ReferenceDataType.sec01_array.ex06;

public class RectangleValueAssignment {
    public static void main(String[] args) {

        // 1. 배열의 원소값 대입 방법1 : 인덱스에 직접 값 대입
        int[][] array1 = new int[2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2]);
        System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
        System.out.println();

        int[][] array2;
        array2 = new int[2][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;

        System.out.println(array2[0][0] + " " + array2[0][1] + " " + array2[0][2]);
        System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
        System.out.println();

        // 2. 배열의 원소값 대입 방법2 : 개수 지정 없이 객체 선언과 동시에 초기값 대입
        int[][] array3 = new int[][] {{1, 2, 3}, {4, 5, 6}}; // 객체 생성 때 초기값을 알 때만 가능

        System.out.println(array3[0][0] + " " + array3[0][1] + " " + array3[0][2]);
        System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
        System.out.println();

        int[][] array4;
        array4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println(array4[0][0] + " " + array4[0][1] + " " + array4[0][2]);
        System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
        System.out.println();

        // 3. 배열의 원소값 대입 방법3 : 초기값만 전달 -> new int[][] 없으므로 분리 불가능
        int[][] array5 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(array5[0][0] + " " + array5[0][1] + " " + array5[0][2]);
        System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);
        System.out.println();
    }
}
