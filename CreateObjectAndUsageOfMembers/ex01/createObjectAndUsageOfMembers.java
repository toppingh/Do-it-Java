package CreateObjectAndUsageOfMembers.ex01;

// 1. 클래스 구성 (쩡의) : 붕어빵 기계
class A {
    int m = 3;

    void print() {
        System.out.println("객체 생성 및 활용");
    }
}

public class createObjectAndUsageOfMembers {
    public static void main(String[] args) {

        // 2. 클래스로부터 객체 생성 : 붕어빵
        A a = new A(); // 클래스 참조변수 = 힙 메모리에 집어넣어라 생성자

        // 3. 클래스 멤버(필드) 활용 (값 읽기, 쓰기 / 메서드 활용 : 호출) : 붕어빵 먹기
        a.m = 5;
        System.out.println(a.m); // 5
        a.print();
    }
}
