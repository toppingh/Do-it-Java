package InternalComponents.Method.ex03;

import java.util.Arrays;

public class ArrayArgumentMethod {
    public static void main(String[] args) {

        // 2. 배열을 매개변수로 가지는 메서드 호출
        printArray(new int[] {1, 2, 3});
//        int[]a = new int[] {1, 2, 3};
//        printArray(a);

    }

    // 1. 배열을 매개변수로 갖는 메서드 생성
    public static void printArray(int[] a) { // 배열 객체를 int형으로 만들어서 매개변수로
        System.out.println(Arrays.toString(a));
    }
}
