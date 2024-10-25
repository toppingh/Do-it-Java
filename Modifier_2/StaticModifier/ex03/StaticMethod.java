package Modifier_2.StaticModifier.ex03;

class A {
    void abc() { // 인스턴스 메서드
        System.out.println("Instance Method!");
    }

    static void bcd() { // 정적 메서드
        System.out.println("Static Method!");
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        // 1. 인스턴스 메서드 활용 (객체 생성 후 사용 가능)
        A a1 = new A();
        a1.abc(); // Instance Method!

        // 2. 정적 메서드 활용
        // 방법1. 클래스 이름으로 바로 접근
        A.bcd(); // Static Method!

        // 방법2. 객체 생성 후 사요 (인스턴스 메서드와 동일) - 가능한 지양
        A a2 = new A();
        a2.bcd(); // Static Method!
    }
}
