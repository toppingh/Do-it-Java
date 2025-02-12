package Modifier_2.FinalModifier.ex02;

class A {
    void abc() {}
    final void bcd() {}
}

class B extends A {
    void abc() {} // A 클래스의 abc() 메서드 Overriding

//    void bcd() {} final 메서드는 Overriding 불가능
}

final class C {}

//class D extends C {} final class는 상속자체 불가능

public class FinalModifier_2 {

}
