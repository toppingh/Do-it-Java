package sec02_primaryDataType.ex02;

public class PrimaryDataType_1 {
    public static void main(String[] args) {
        // 1. boolean : true / false
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1); // true
        System.out.println(bool2); // false

        // 2. 정수 (byte, short, int ,long) : 음의 정수 / 0 / 양의 정수
        byte value1 = 10;
        short value2 = -10;
        int value3 = 100;
        long value4 = -100L; // L을 붙이면 long으로 읽으라는 의미. (작은거에서 큰거 들어갈때는 생략 가능 int < long)

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        // 3. 실수 (float, double) : 음의 실수 / 0 / 양의 실수
        float value5 = 1.2F; // f를 붙이지 않으면 double로 읽힘
        double value6 = -1.5;
        double value7 = 5; // 5를 실수로 바꿔서 저장함
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7); // 5.0


    }
}
