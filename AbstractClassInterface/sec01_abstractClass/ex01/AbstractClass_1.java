package AbstractClassInterface.sec01_abstractClass.ex01;

// 추상 클래스의 객체 생성 방법
// 1. 자식 클래스 생성 + 자식 클래스 생성자로 객체 생성 - 객체를 여러번 만들 경우 적합
abstract class A {
    abstract void abc();
}

class B extends A {
    @Override
    void abc() { // abstract 클래스의 미완성 메서드를 반드시 오버라이딩해야 오류x
        System.out.println("방법 #1. 자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class AbstractClass_1 {
    public static void main(String[] args) {
        // 객체 생성 -> 불가능 abstract 클래스는 미완성 메서드가 있으므로 객체 생성 불가능
//        A a = new A();

        // 1. 자식 클래스 객체 생성
        A b2 = new B();
        B b1 = new B();

        // 2. 메서드 호출
        b1.abc();
        b2.abc();
    }
}
