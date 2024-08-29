package sec02_primaryDataType.ex03;

public class TypeCasting_2 {
    public static void main(String[] args) {

        // 1. 자동 타입 변환 (UpCasting)
        float value1 = 3; // int를 float으로, 생략 가능(자동)
        long value2 = 5; // int를 long으로, 생략 가능(자동)
        double value3 = 7; // int를 double로, 생략 가능(자동)

        // 저장할 수 있는 값의 범위값을 byte나 short에 입력하는 경우, 정수는 각각 byte나 short로 캐스팅
        byte value4 = 9; // 예외, byte로
        short value5 = 11; // 예외, short로

        System.out.println(value1); // 3.0
        System.out.println(value2); // 5.0
        System.out.println(value3); // 7.0
        System.out.println(value4); // 9
        System.out.println(value5); // 11

        // 2. 수동 타입 변환
        byte value6 = (byte) 128; // byte 범위는 -128 ~ 127까지. 범위를 넘었기 때문에 int로 인식
        int value7 = (int) 3.5; // double
        float value8 = (float) 7.5; // double

        System.out.println(value6); // -128 -> 원으로 되어있고 가운데가 0, 왼쪽이 -128, 오른쪽이 128일때 원을 그려서 가므로 -128이 저장됨 (데이터가 돌기때문에)
        System.out.println(value7); // 3
        System.out.println(value8); //7.5
    }
}
