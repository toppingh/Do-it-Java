package AbstractClassInterface.sec01_abstractClass.ex02;

// 추상 클래스 객체 생성 방법
// 2. 익명 이너클래스로 객체 생성 - 객체를 하나만 만들 경우 적합

abstract class A {
    abstract void abc();
}

public class AbstractClass_2 {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("방법 #2. 익명 이너클래스로 객체 생성");
            }
        };

        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("방법 #2. 익명 이너클래스로 객체 생성");
            }
        };

        a1.abc();
        a2.abc();
    }
}
