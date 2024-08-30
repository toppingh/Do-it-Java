package sec01_operator_1.ex02;

public class AssignmentOperator {
    public static void main(String[] args) {

        // 1. 대입 연산자와 축약 표현
        int value1 = 3;
        value1 = value1 + 3;
        System.out.println(value1); // 6

        // 축약 표현
        int value2 = 5;
        value2 += 5;
        System.out.println(value2); // 10
        System.out.println(value2 += 5); // 15
        System.out.println(value2 -= 5); // 10
        System.out.println(value2 *= 5); // 50
        System.out.println(value2 /= 5); // 10
        System.out.println(value2 %= 5); // 0
        System.out.println(value2 |= 5); // 5
        System.out.println(value2 <<= 5); // 160
        System.out.println(value2 >>= 5); // 5
        System.out.println(value2 >>>= 5); // 0

    }
}
