package Modifier_1.AccessModifier.ex01.pack2;

import Modifier_1.AccessModifier.ex01.pack1.A;

public class C {
    public void print() {

        // 1. 객체 생성
        A a = new A(); // A class가 public이어야 A a 사용 가능

        // 2. 멤버 활용
        System.out.println(a.a);
    //            System.out.println(a.b); A class의 자식x
    //            System.out.println(a.c); 같은 패키지x
    //            System.out.println(a.d);
    }
}
