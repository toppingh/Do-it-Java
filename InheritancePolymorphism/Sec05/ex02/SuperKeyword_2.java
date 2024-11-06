package InheritancePolymorphism.Sec05.ex02;

class A {
    void abc() {
        System.out.println("A 클래스 abc() 출력!!");
    }
}

class B extends A {
    void abc() {
        System.out.println("B 클래스의 abc() 출력!!");
    }

    void bcd() {
        super.abc(); // 부모 클래스 객체의 abc() 메서드 호출 -> A 클래스 abc() 출력!!
    }
}


public class SuperKeyword_2 {
    public static void main(String[] args) {

        // 1. 객체 생성
        B bb = new B();

        // 2. 메서드 호출
        bb.bcd(); // super.abc() -> A 클래스 abc() 출력!!

    }
}
