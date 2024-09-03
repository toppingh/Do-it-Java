package ReferenceDataType.ex06;

public class RectangleArrayDefinition {
    public static void main(String[] args) {

        // 1. 배열의 선언 방법 1
        int[][] array1 = new int[3][4];
        int[][] array2;
        array2 = new int[3][4];

        // 2. 배열의 선언 방법 2
        int array3[][] = new int[3][4];
        int array4[][];
        array4 = new int[3][4];

        // 3. 배열의 선언 방법 3 : 몇차원 배열인지 괄호를 여러번 봐야하기 때문에 첫번째 방법 사용하는 것이 좋음
        int[] array5[] = new int[3][4];
        int[] array6[];
        array6 = new int[3][4];

        // 4. 다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
        boolean[][] array7 = new boolean[3][4];  // 3행 4열
        int[][] array8 = new int[2][4];
        double[][] array9 = new double[3][5];
        String[][] array10 = new String[2][5]; // 참조 자료형

    }
}
