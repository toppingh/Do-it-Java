package sec01_operator_1.ex01;

public class ShiftOperator {
    public static void main(String[] args) {

        // 1. 산술 쉬프트(부호 변화x *2, /2 효과)
        // << Left Shift : 값이 커짐
        System.out.println(3 << 1); // 값이 커짐, 6
        System.out.println(-3 << 1); // -6
        System.out.println(3 << 2); // 12
        System.out.println(-3 << 2); // -12
        System.out.println();

        // >> Right Shift : +, -가 다름
        System.out.println(5 >> 1); // 한 칸 이동, / 2 즉, 5 / 2, 2
        System.out.println(-5 >> 1); // -일 경우 소수점을 올리기때문에 -3
        System.out.println(5 >> 2); // 1
        System.out.println(-5 >> 2); // -2
        System.out.println();

        // 2. 논리 쉬프트 (>>>) : 비트 이동
        System.out.println(3 >>> 1); // 0000...0011 오른쪽 한칸 이동, 1, 양수일 경우 Right Shift와 동일한 결과값
        System.out.println(-3 >>> 31); // 1111...0011 = 1

    }
}
