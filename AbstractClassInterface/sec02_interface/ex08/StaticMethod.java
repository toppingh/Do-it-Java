package AbstractClassInterface.sec02_interface.ex08;

interface A {
    static void abc() {
        System.out.println("A 인터페이스의 정적 메서드 abc()");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 1. 정적 메서드 호출
        A.abc(); // 누가봐도 정적 메서드인 것을 알도록 이렇게 작성해야 함!
    }
}
