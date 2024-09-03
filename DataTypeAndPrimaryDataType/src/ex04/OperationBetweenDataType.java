package ex04;

public class OperationBetweenDataType {
    public static void main(String[] args) {

        // 1. 같은 자료형간의 연산
        int value1 = 3 + 5; // int + int
        int value2 = 8 / 5; // int / int -> 1 (int형이므로 소수 x)
        float value3 = 3.0f + 5.0f; // float + float
        double value4 = 8.0 / 5.0; // double / double

        byte data1 = 3; // byte
        byte data2 = 5; // byte
        //byte value5 = data1 + data2; // byte + byte -> int형이 되어야 함
        int value5 = data1 + data2;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);

        // 2. 다른 자료형간의 연산
        //int value6 = 5 + 3.5; // int + double -> 결과는 double 타입
        double value6 = 5 + 3.5;
        int value7 = 5 + (int) 3.5; // 직접 downCasting하면 연산 가능
        double value8 = 5 / 2.0;
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // byte + short => int 타입
        double value10 = data3 + data4; // byte + short => int 타입 => double로 자동 업 캐스팅

        System.out.println(value6); // 8.5
        System.out.println(value7); // 8
        System.out.println(value8); // 2.5
        System.out.println(value9); // 8
        System.out.println(value10); // 8.0
    }
}
