package Modifier_1.AccessModifier.ex03;

import Modifier_1.AccessModifier.ex03.pack.AA;

public class AccessModifierOfClass_2 {
    public static void main(String[] args) {

        // 1. 객체 생성 (가능한지 확인)
        AA aa = new AA(); // 객체 생성 가능 (AA aa) + 생성자 호출 가능 (new A())
//        BB bb = new BB(); 객체 생성 불가능 (BB bb) + 생성자 호출 가능 (new BB())
        //CC cc = new CC(); // 객체 생성 가능 (CC cc) + 생성자 호출 불가능 (new CC())
    }
}
