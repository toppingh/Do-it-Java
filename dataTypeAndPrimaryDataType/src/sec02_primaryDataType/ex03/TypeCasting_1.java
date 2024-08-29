package sec02_primaryDataType.ex03;

public class TypeCasting_1 {
    public static void main(String[] args) {

        // 1. 캐스팅 방법
        // 1-1. 방법1 : (데이터 타입)
        int value1 = (int) 5.3; // double 타입
        long value2 = (long) 10; // int 타입
        float value3 = (float) 5.8; // double 타입
        double value4 = (double) 16; // int 타입

        System.out.println(value1); // 오차발생 -> double을 int 타입에 넣을 수 없으므로 0.3 없어짐
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        // 1-2 방법2 : (L, F)
        long value5 = 10L; // long으로 읽으라는 뜻, 대소문자 상관x
        long value6 = 10l; // (l은 글씨가 헷갈릴수도 있음)
        float value7 = 5.8F;
        float value8 = 5.8f;

        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}
