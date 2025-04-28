package AbstractClassInterface.sec02_interface.ex01;

interface A {
    public static final int a = 3;
    public abstract void abc();
}

interface B {
    int b = 4; // 생략시 자동으로 public static final 붙여줌
    void bcd(); // 생략시 자동으로 public abstract 붙여줌
}

public class InterfaceCharacteristics {
    public static void main(String[] args) {
        // 1. static 자동추가 체크
        System.out.println(A.a);
        System.out.println(B.b);

        // 2. final 자동추가 체크 -> final은 값 변경 불가
//        A.a = 5;
//        B.b = 5;
    }
}
