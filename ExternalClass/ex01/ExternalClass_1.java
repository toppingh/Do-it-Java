package ExternalClass.ex01;

// 외부 클래스 정의 - public 설정 불가
class A { // 밑에 public 클래스가 있으므로 public 불가 (public은 1개만 가능하고 파일 이름이 같아야함!)
    // 여기서 사용하는 A 클래스는 같은 패키지 안에 있는 A.java 파일에 있는 A 클래스 사용
    int m = 3;
    int n = 5;

    void print() {
        System.out.println(m + ", " + n);
    }
}

public class ExternalClass_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print(); // 3, 5
    }
}
