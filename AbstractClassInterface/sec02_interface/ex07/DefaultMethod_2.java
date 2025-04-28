package AbstractClassInterface.sec02_interface.ex07;

interface A {
    default void abc() {
        System.out.println("A 인터페이스의 abc()");
    }
}

class B implements A {
    @Override
    public void abc() {
        A.super.abc(); // 부모 인터페이스의 메서드 호출 - super.abc() : 부모 클래스의 abc() 호출을 의미
        System.out.println("B 클래스의 abc()");
    }
}

public class DefaultMethod_2 {
    public static void main(String[] args) {
        // 1. 객체 생성
        B b = new B();
        A a = new B();

        // 2. 메서드 호출
        b.abc(); // B 클래스의 abc()
        a.abc(); // B 클래스의 abc()
    }
}
