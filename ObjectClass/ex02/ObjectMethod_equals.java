package ObjectClass.ex02;

class A {
    String name;

    A (String name) {
        this.name = name;
    }
}

class B {
    String name;

    B (String name) {
        this.name = name;
    }

    // equals() Overriding
    @Override
    public boolean equals(Object obj) {
        return this.name == ((B)obj).name ? true : false; // Object 안에는 name 이 없으므로 name을 만든 클래스는 A이기 때문에 다운캐스팅을 위해 ((B)obj)로 설정
    }
}

public class ObjectMethod_equals {
    public static void main(String[] args) {
        A a1 = new A("안녕");
        A a2 = new A("안녕");

        B b1 = new B("안녕");
        B b2 = new B("안녕");

        System.out.println(a1 == a2); // false => 참조 변수의 등가연산은 참조하는 객체의 위치값이 같은지 다른지 판단(당연히 다른 위치이므로)
        System.out.println(a1.equals(a2)); // false => 참조 변수의 등가연산은 참조하는 객체의 위치값이 같은지 다른지 판단(당연히 다른 위치이므로)

        System.out.println(b1 == b2); // false => 참조 자료형의 등가 연산 : Stack메모리의 참조자료형의 위치값 비교
        System.out.println(b1.equals(b2)); // true => 오버라이딩한 equals()호출
    }
}
