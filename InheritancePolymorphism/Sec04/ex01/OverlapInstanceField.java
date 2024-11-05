package InheritancePolymorphism.Sec04.ex01;

class A {
    int m = 3;
}

class B extends A {
    int m = 4;
}

public class OverlapInstanceField {
    public static void main(String[] args) {

        // 1. 객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B(); // 오버라이딩x, 선언된 타입이 중요 (생성자 상관x)

        // 2. 인스턴스 필드
        System.out.println(aa.m); // 3
        System.out.println(bb.m); // 4
        System.out.println(ab.m); // 3
    }
}
