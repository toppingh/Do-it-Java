package InheritancePolymorphism.Sec05.ex01;

class A {
    void abc() {
        System.out.println("A 클래스의 abc() 출력!");
    }
}

class B extends A {
    void abc() { // 오버라이딩
        System.out.println("B 클래스의 abc() 출력!");
    }

    void bcd() {
        abc(); // this.abc();
    }
}

public class SuperKeyword_1 {
    public static void main(String[] args) {

        // 1. 객체 생성
        B bb = new B();

        // 2. 메서드 호출
        bb.bcd(); // B 클래스의 abc() 출력!

    }
}
