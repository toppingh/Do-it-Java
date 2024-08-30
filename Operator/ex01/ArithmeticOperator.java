package Operator.ex01;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // 1. 산술 연산자
        System.out.println(2 + 3);
        System.out.println(8 - 5);
        System.out.println(7 * 2);
        System.out.println(7 / 2);
        System.out.println(8 % 5);
        System.out.println();

        // 2. 증감 연산자 case1
        int value1 = 3;
        value1++;
        System.out.println(value1); // 4

        int value2 = 3;
        ++value2;
        System.out.println(value2); // 4
        System.out.println();

        // 3. 증감 연산자 case2 : 전위, 후위
        int value3 = 3;
        int value4 = value3++; // 1. value4에 값 대입, 2. value3++ 3. value4에 value3값 저장
        System.out.println(value3); // 4
        System.out.println(value4); // 3
        System.out.println();

        int value5 = 3;
        int value6 = ++value5; // 1. value5++ 2. value 5에 value5 값 저장
        System.out.println(value5); // 4
        System.out.println(value6); // 4
        System.out.println();

        // 4. 증감 연산자 case3
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8; // value9 = 10, value7 = 3, value8 = 5

        System.out.println(value7); // 2
        System.out.println(value8); // 5
        System.out.println(value9); // 10
    }
}
