package AbstractClassInterface.sec02_interface.ex03;

// 접근 지정자 - 부모의 메서드보다 같거나 커야함!

interface A {
    public abstract void abc();
}

interface B {
    void bcd(); // 생략시 public abstract를 붙여줌
}

class C implements A {
    @Override
    public void abc() {
        // ...
    }
}

//class D implements B {
//    void bcd() { // B의 bcd()는 public -> default로
//        // ...
//    }
//}

public class InheritanceOfInterface_2 {

}
