package Modifier_1.AccessModifier.ex01;

import Modifier_1.AccessModifier.ex01.pack1.A;
import Modifier_1.AccessModifier.ex01.pack1.B;
import Modifier_1.AccessModifier.ex01.pack2.C;
import Modifier_1.AccessModifier.ex01.pack2.D;

public class AccessModifierOfMember {
    public static void main(String[] args) {

        // 1. 객체 생성
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
