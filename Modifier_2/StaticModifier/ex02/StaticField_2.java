package Modifier_2.StaticModifier.ex02;

// static 필드 공유 특징
class A {
    int m = 3; // 인스턴스 필드
    static int n = 5; // static(정적) 필드
}

public class StaticField_2 {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        // 인스턴스 필드 - 각각의 저장 공간을 가지므로 값 변화 x
        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m + ", " + a2.m);

        // 정적 필드 - 같은 저장 공간(클래스 영역)을 가지므로 값 변화o
        a1.n = 7;
        a2.n = 8; // A의 n 공간에 있던 7을 8로 변경
        System.out.println(a1.n + ", " + a2.n);

        // 정적 필드 권장 방법
        System.out.println(A.n);

    }
}
