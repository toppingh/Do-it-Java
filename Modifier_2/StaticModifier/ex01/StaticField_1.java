package Modifier_2.StaticModifier.ex01;

class A {
    int m = 3; // 인스턴스 필드
    static int n = 5; // static(정적) 필드 : 객체 없이 바로 사용 가능
}

public class StaticField_1 {
    public static void main(String[] args) {

        // 1. 인스턴스 필드 활용  (필드 활용 : 값을 읽거나 쓰기)
        A a1 = new A(); // 객체 생성이 항상 먼저
        System.out.println(a1.m); // 3

        // 2. 정적 필드 활용
        // 방법 1. 객체 생성 없이 바로 사용하는 방법 (클래스 이름)
        System.out.println(A.n); // 5

        // 방법 2. 객체 생성 후 활용 (인스턴스와 동일) - 가능한 지양
        A a2 = new A();
        System.out.println(a2.n); // 5 -> 굳이 힙 메모리를 거쳐서 클래스 영역을 가기 때문에
    }
}
