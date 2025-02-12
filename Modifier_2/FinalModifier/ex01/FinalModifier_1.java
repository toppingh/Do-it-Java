package Modifier_2.FinalModifier.ex01;

class A1 {
    // 필드 (클래스 내부에서 선언)
    int a = 3;
    final int b = 5;

    A1() { // 생성자

    }
}

class A2 {
    int a;
    final int b;

    A2() {
        a = 3;
        b = 5;
    }
}

class A3 {
    int a = 3;
    final int b = 5;

    A3() {
        a = 5;
//        b = 7; final 필드는 한버 정해진 값을 바꿀 수 없다. (최초 선언 이후 값 대입 불가능)
    }
}

class B {
    void bcd() {
        // 지역 변수 (메서드 내부에서 선언)
        int a = 3;
        final int b = 5;

        a = 5;
//        b = 9;
    }
}

public class FinalModifier_1 {
    public static void main(String[] args) {
        // 1. 객체 생성
        A1 a1 = new A1();
        A2 a2 = new A2();

        // 2. 필드 값 변경 : final 필드는 한번 정해진 값을 바꿀 수 없다.
        a1.a = 13;
//        a1.b = 9;
        a2.a = 13;
//        a2.b = 9;
    }
}
