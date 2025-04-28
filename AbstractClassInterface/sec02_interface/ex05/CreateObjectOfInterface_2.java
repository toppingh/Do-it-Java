package AbstractClassInterface.sec02_interface.ex05;

// 방법 2. 익명 이너 클래스로 객체 생성

interface A {
    int a = 3;
    void abc();
}

public class CreateObjectOfInterface_2 {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
            }
        };

        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
            }
        };

        // 2. 메서드 호출
        a1.abc();
        a2.abc();
    }
}
