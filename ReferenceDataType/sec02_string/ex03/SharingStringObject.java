package ReferenceDataType.sec02_string.ex03;

public class SharingStringObject {
    public static void main(String[] args) {

        // 1. 문자열 객체 공유(리터럴로 객체를 생성한 경우) new 키워드로 객체를 생성한 경우 (별도의 객체 생성) 공유x
        String str1 = new String("안녕"); // new로 만든 객체는 공유 기능이 없으므로
        String str2 = "안녕"; // 리터럴로 만든 객체는 위 객체가 있어도 새로 안녕이라는 객체 생성
        String str3 = "안녕"; // 위 str2는 리터럴로 생성해 공유기능이 있으므로 str2와 같은 위치를 가리킴 (재사용 가능)
        String str4 = new String("안녕"); // new는 무조건 새로운 객체 생성

        // stack 메모리 값 비교 (==)
        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // true
        System.out.println(str3 == str4); // false
        System.out.println(str4 == str1); // false
    }
}
