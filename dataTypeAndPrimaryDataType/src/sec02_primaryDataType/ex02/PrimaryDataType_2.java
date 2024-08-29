package sec02_primaryDataType.ex02;

public class PrimaryDataType_2 {
    public static void main(String[] args) {
        // 4. 문자(char) : 문자, 정수
        // 4-1. 문자로 저장하는 방법 -> ''안에 있어야 문자 저장됨
        char value1 = 'A';
        char value2 = '가';
        char value3 = '1'; // 문자 1이 아닌 문자 1이 저장되어있는 것!

        System.out.println(value1); // 읽을때는 문자열로 -> 결과 : A
        System.out.println(value2);
        System.out.println(value3);

        // 4-2. 정수로 저장하는 방법
        char value4 = 65;
        char value5 = 0xac00; // 0x가 붙으면 뒤에 나오는 숫자가 16진수라는 뜻
        char value6 = 49;

        System.out.println(value4); // 유니코드표의 숫자를 char형으로 저장하면 꺼낼때는 해당하는 문자 출력
        System.out.println(value5);
        System.out.println(value6);

        // 4-3. 유니코드로 저장하는 방법
        char value7 = '\u0041'; // 역슬래시u + 유니코드를 직접 입력
        char value8 = '\uac00';
        char value9 = '\u0031';

        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
    }
}
