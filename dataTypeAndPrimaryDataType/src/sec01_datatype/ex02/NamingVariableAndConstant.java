package sec01_datatype.ex02;

public class NamingVariableAndConstant {
    // 1. 변수의 이름
    boolean aBcDeFg; // 가능하나 권고사항 위배
    byte 가나다; // 가능
    short _abcd; // 가능, _는 영문자와 동급
    char $ab_cd; // 가능, $는 영문자와 동급
//    int 3abcd; // 불가능, 숫자는 앞에 올 수 없음
    long abcd3; // 가능
//    float int; // 불가능, java에서 사용하는 키워드
    double main; // 가능, 메서드 이름과 변수 이름은 동일해도 무관
//    int my Work; // 불가능, 스페이스바(=특수 키) 포함 특수키는 $, _만 가능
    String myClassName; // 가능, 가장 보편적인 선언 방법, 카멜 케이스
    int ABC; // 가능하나 권고사항 위배, 대문자는 상수에서 사용(상수는 값 대입 및 변경 불가

    // 2. 상수 이름
//    double PI; // 변수 (double 자료형만 넣음)
    final double PI = 3.14; // final만 붙이면 가능
    final int MY_DATA = 5; // 가독성을 위해 언더바 추가
    final float myData = 0; // 변수 선언 방법이므로 final을 빼야함(권고사항 위배)


}
