package Modifier_1.AccessModifier.ex01.pack1;

public class B {

    public void print() {
        // 객체 생성
        A a = new A(); // 같은 패키지 안에서는 얼마든지 객체 생성 가능

        // 멤버 활용
        System.out.print(a.a + " "); // o
        System.out.print(a.b + " "); // o
        System.out.print(a.c + " "); // o
//        System.out.println(a.d); // x -> private
        System.out.println();
    }
}
