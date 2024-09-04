package ReferenceDataType.sec01_array.ex08;

public class ReadArrayData2D {
    public static void main(String[] args) {

        // 1. 2차원 데이터의 배열의 길이
        int[][] array1 = new int[2][3]; // 2행 3열 정방행렬
        System.out.println(array1.length); // 2
        System.out.println(array1[0].length); // 3, 첫 번째 행이 가리키는 1차원 배열의 개수
        System.out.println(array1[1].length); // 3, 두 번째 행이 가리키는 1차원 배열의 개수
        System.out.println();

        int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}}; // 2행 3열 비정방행렬
        System.out.println(array2.length); // 2
        System.out.println(array2[0].length); // 2
        System.out.println(array2[1].length); // 3
        System.out.println();

        // 2. 2차원 배열의 출력 방법
        System.out.println(array2[0][0]);
        System.out.println(array2[0][1]);
        System.out.println(array2[1][0]);
        System.out.println(array2[1][1]);
        System.out.println(array2[1][2]);
        System.out.println();

        for (int i = 0; i < array2.length; i++) { // array2의 행의 개수
            for (int j = 0; j < array2[i].length; j++) { // array2[i] = array2의 열의 개수
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] k : array2) {
            for(int j : k) { // k의 현재 값은 int[] k와 같음!
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
