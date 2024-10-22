package InternalComponents.ex01;

// 필드와 지역 변수 구분

// 1. 클래스 생성
class A {
    int m = 3; // 필드 -> 클래스의 중괄호에서 선언
    int n = 4; // 필드

    void work1() {
        int k = 5; // 지역 변수 -> work1() 메서드의 중괄호에서 선언
        System.out.println(k); // 지역 변수 출력 => 5
        work2(3);
    }

    void work2(int i) { // 지역 변수
        // 매개 변수 => 중괄호 안에서는 실제로 int i를 가장 먼저 실행
        // i = 외부에서 전달된 값
        int j = 4; // 지역 변수
        System.out.println(i + j); // 7
    }
}


public class FieldComponent {
    public static void main(String[] args) {

        // 2. 클래스를 활용한 객체 생성
        A a = new A(); // 클래스 참조변수 = 힙 메모리에 넣어라 생성자, A()를 가리키고있는 a

        // 3. 필드 값 출력
        System.out.println(a.m); // 3
        System.out.println(a.n); // 4

        // 4. 메서드 값 출력
        a.work1(); // 5 7
    }
}
