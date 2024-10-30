package InheritancePolymorphism.Sec02.TypeCasting.ex02;

class A {
    int m = 3;
    void abc() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    int n = 10;
    void bcd() {
        System.out.println("B 클래스");
    }
}

public class TypeCasting_2 {
    public static void main(String[] args) {
        // 1. A 타입 / A 생성자
        A aa = new A();
        System.out.println(aa.m); // 3
        aa.abc(); // A 클래스

        // 2. B 타입 / B 생성자
        B bb = new B();
        System.out.println(bb.m); // 3
        System.out.println(bb.n); // 10
        bb.abc(); // A 클래스
        bb.bcd(); // B 클래스

        // 3. A 타입 / B 생성자 : 다형적 표현
        A ab = new B(); // A 타입이므로 A까지만 보여줌
        System.out.println(ab.m); // 3
        ab.abc(); // A 클래스
    }
}
