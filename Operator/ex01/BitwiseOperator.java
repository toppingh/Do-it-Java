package Operator.ex01;

public class BitwiseOperator {
    public static void main(String[] args) {

        // 1. Java 코드로 진법 변환
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // data를 2진수 문자열로 바꿔라, 1101
        System.out.println(Integer.toOctalString(data)); // data를 8진수 문자열로 바꿔라, 14
        System.out.println(Integer.toHexString(data)); // data를 16진수 문자열로 바꿔라, D
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 2진수를 10진수(int)로 바꿔라 // 13
        System.out.println(Integer.parseInt("15", 8));
        System.out.println(Integer.parseInt("0D", 16));
        System.out.println();

        // 2. 다양한 진법 표현
        System.out.println(13);
        System.out.println(0b1101); // 0b를 붙이면 숫자로 인식 "1101"은 문자, 0b + 1101은 2진수
        System.out.println(015); // 8진수
        System.out.println(0x0D); // 16진수
        System.out.println();

        // 3. 비트연산자
        // AND 비트 연산자 (둘 다 1일때만 1)
        System.out.println(3 & 10); // 10진수로 표현, 2
        System.out.println(0b0011 & 0b1010); // 2진수로 표현 -> 0b0010 => 2
        System.out.println(0x03 & 0x0A); // 0A, A 똑같음, 16진수, 2
        System.out.println();

        // OR 비트 연산자 (둘 다 0일때만 0)
        System.out.println(3 | 10); // 11
        System.out.println(0b0011 | 0b1010); // 2진수, 0b1011, 11
        System.out.println(0x03 | 0x0A); // 11
        System.out.println();

        // XOR 비트 연산자 (둘 다 다를 떄는 1)
        System.out.println(3 ^ 0); // 9
        System.out.println(0b0011 ^ 0b1010); // 2진수, 0b1001, 9
        System.out.println(0x03 ^ 0x0A); // 9
        System.out.println();

        // NOT 비트 연산자 (반대)
        System.out.println(~3);
        System.out.println(~0b0011); // 2진수, 0b1100 -> -4 (부호바꾸고 +1, 즉 0인 값을 계산하고 +1 후 - 붙임)
        System.out.println(~0x03);
        System.out.println();
    }
}
