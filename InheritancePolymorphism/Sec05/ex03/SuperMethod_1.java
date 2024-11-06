package InheritancePolymorphism.Sec05.ex03;

class A {
    A() {
        System.out.println("A 생성자 출력!");
    }
}

class B extends A {
    B() {
//        super(); // 생략시 컴파일러가 자동 추가 (부모 클래스의 생성자 호출)
        System.out.println("B 생성자 출력!");
    }
}

class C {
    // 생성자가 아예 없으면 컴파일러가 기본 생성자 자동 추가

    C (int a) {
        System.out.println("C 생성자 출력!");
    }
}

// 부모 클래스 C에 기본 생성자가 없으므로 컴파일러가 클래스 D의 생성자를 자동으로 생성할때, 기본 생성자의 조건인 첫 줄에 super()를 가져올 수 없어 오류 발생
class D extends C {
    // D() {            // 1
    //      super();    // 2
    // }                // 3 1 ~3까지 컴파일러가 자동으로 추가해주는 내용

    D() {
        super(3);
    }
}

public class SuperMethod_1 {
    public static void main(String[] args) {

        // 1. A 객체 생성
        A aa = new A(); // A 생성자 호출 -> A 생성자 출력!
        System.out.println();

        // 2. B 객체 생성
        B bb = new B(); // B 생성자 호출 -> 자식 클래스는 부모가 있으므로, 자식 클래스의 생성자 첫 줄에는 항상 this/super 키워드를 추가해야 함 -> 생략시 컴파일러가 자동으로 super() 추가
        // 즉, A 생성자 -> B 생성자
    }
}
