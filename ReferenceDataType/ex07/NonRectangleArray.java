package ReferenceDataType.ex07;

public class NonRectangleArray {
    public static void main(String[] args) {

        // 1. 비정방행렬의 선언 및 값 대입 방법1
//        int[][] array1 = new int[2][3]; // 정방행렬
        int[][] array1 = new int[2][]; // 행에 몇 줄을 만들지 정함.array1은 a[0]만 가리킴!

        array1[0] = new int[2]; // 첫번째 행이 가리키는 곳에 2칸의 공간 생성
        array1[0][0] = 1;
        array1[0][1] = 2;

        array1[1] = new int[3];
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;

        System.out.println(array1[0][0] + " " + array1[0][1]);
        System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
        System.out.println();

        int[][] array2 = new int[2][];
        array2[0] = new int[] {1, 2};
        array2[1] = new int[] {3, 4, 5};

        System.out.println(array2[0][0] + " " + array2[0][1]);
        System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
        System.out.println();

        // 2. 비정방행렬의 선언 및 값 대입 방법2
        int[][] array3 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array3[0][0] + " " + array3[0][1]);
        System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
        System.out.println();

        int[][] array4;
        array4 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array4[0][0] + " " + array4[0][1]);
        System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
        System.out.println();

        // 3. 비정방행렬의 선언 및 값 대입 방법3 -> new int가 없으므로 분리 불가능!!
        int[][] array5 = {{1, 2}, {3, 4, 5}};
        System.out.println(array5[0][0] + " " + array5[0][1]);
        System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);

    }
}
