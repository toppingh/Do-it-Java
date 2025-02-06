package ObjectClass.ex01;

class A { // extends Object (컴파일러가 자동 추가)
    int a = 3;
    int b = 4;
}

class B {
    int a = 3;
    int b = 4;

    public String toString() {
        return "필드 값(a, b) = " + a + ", " + b;
    }
}

public class ObjectMethod_toString {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a = new A();
        B b = new B();

        // 2. 메서드 호출
        System.out.printf("%x\n", a.hashCode()); // hashcode a객체가 위치한 위치값 기반으로 만들어진 고유값 -> 16진수로 표현
        System.out.println(a); // a 객체의 정보 출력 (package.class@hashcode) 형식, a.toString() 메서드 자동 추가

        // 두 출력문 모두 결과 같음!
        System.out.println(b);
        System.out.println(b.toString());

    }
}
