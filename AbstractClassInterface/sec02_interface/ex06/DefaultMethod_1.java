package AbstractClassInterface.sec02_interface.ex06;

interface A {
    void abc(); // 설계
    default void bcd() {
        System.out.println("A 인터페이스의 bcd()");
    };
}

class B implements A {
    @Override
    public void abc() {
        System.out.println("B 클래스의 abc()");
    }
}

class C implements A {
    @Override
    public void abc() {
        System.out.println("C 클래스의 abc()");
    }

    @Override
    public void bcd() {
        System.out.println("C 클래스의 bcd()");
    }
}

public class DefaultMethod_1 {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a1 = new B();
        A a2 = new C();

        // 2. 메서드 호출
        a1.abc(); // B 클래스의 abc()
        a1.bcd(); // A 인터페이스의 bcd() - 오버라이딩 x

        a2.abc(); // C 클래스의 abc()
        a2.bcd(); // C 클래스의 bcd()
    }
}
