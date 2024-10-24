package Modifier_1.AccessModifier.ex02;

public class AccessModifierOfClass_1 {
    public static void main(String[] args) {

        // 1. 객체 생성 (가능한지 확인)
        A a = new A(); // public class + public Constructor, 객체 생성 가능 (A a) + 생성자 호출 가능 (new A())
        B b = new B(); // default class + default Constructor, 같은 패키지(ex02)내에서만 가능 - private Constructor는 불가능 - 객체 생성 가능 (B b) + 생성자 호출 가능 (new B())
        C c = new C(); // default class + public Constructor, 객체 생성 가능 (C c) + 생성자 호출 가능 (new C())
    }
}
