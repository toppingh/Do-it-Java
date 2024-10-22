package InternalComponents.Method.ex01;

// 클래스의 외부에서 메서드 호출

// 1. 클래스 정의
class A {
    // 1. 리턴 타입 => void + 매개변수 없음
    void print() {
        System.out.println("안녕");
    }

    // 2. 리턴 타입 => int + 매개변수 없음
    int data() {
        return 3;
    }

    // 3. 리턴타입 => double + 매개변수 2개
    double sum(int a, double b) { // 메서드의 타입(double)과
        return a + b; // 리턴 타입(double)이 같아야 함
    }

    // 4. 리턴타입 => void + 내부에 리턴 포함(=함수 종료)
    void printMonth(int m) {
        if (m < 0 || m > 12) {
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m + "월 입니다.");
    }
}


public class ExternalCallMethods {
    public static void main(String[] args) {

        // 2. 객체 생성
        A a = new A();

        // 3. 멤버 활용 - 메서드 호출
        a.print(); // 안녕

        int k = a.data();
        System.out.println(k); // 3

        double result = a.sum(3, 5.2);
        System.out.println(result); // 8.2

        a.printMonth(11); // 11월 입니다.
        a.printMonth(14); // 잘못된 입력
    }
}
