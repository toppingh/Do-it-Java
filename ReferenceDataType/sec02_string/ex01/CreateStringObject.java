package ReferenceDataType.sec02_string.ex01;

public class CreateStringObject {
    public static void main(String[] args) {

        // 1. String 객체 생성1 : 클래스 참조변수 = 힙 메모리에 넣어라 생성자
        String str1 = new String("안녕");
        System.out.println(str1);

        // 2. String 객체 생성2 - 직접 문자열 대입
        String str2 = "안녕하세요";
        System.out.println(str2);


    }
}
