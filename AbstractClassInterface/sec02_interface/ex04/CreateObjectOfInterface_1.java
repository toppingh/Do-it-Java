package AbstractClassInterface.sec02_interface.ex04;

// 방법 1. 자식 클래스 생성 + 자식 클래스 생성자로 객체 생성

interface A {
    int a = 5; // 자동으로 public static final
    void abc(); // 자동으로 public abstract
}

class B implements A {
    @Override
    public void abc() { // 반드시 메서드 오버라이딩
        System.out.println("방법 #1. 자식 클래스 생성 + 자식 클래스 생성자로 객체 생성");
    }
}

public class CreateObjectOfInterface_1 {
    public static void main(String[] args) {
//        A a = new A() {} // 불가능
        // 1. 객체 생성
        A b1 = new B();
        B b2 = new B();

        // 2. 메서드 호출
        b1.abc();
        b2.abc();

    }
}
