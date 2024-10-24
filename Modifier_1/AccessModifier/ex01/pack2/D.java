package Modifier_1.AccessModifier.ex01.pack2;

import Modifier_1.AccessModifier.ex01.pack1.A;

public class D extends A {
    public void print() {
//        // 1. 객체 생성
//        A a = new A(); -> A를 상속받기 때문에 따로 객체 생성할 필요x

        // 2. 멤버 활용
        System.out.print(a + " ");
        System.out.print(b + " ");
//        System.out.println(c);
//        System.out.println(d);
        System.out.println();
    }
}
