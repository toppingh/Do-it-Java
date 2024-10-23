package PackageImport.ex01;

// 다른 패키지에 있는 클래스를 가져와 활용하는 방법 1. 클래스 풀네임 사용

public class PackageImport_1 {
    public static void main(String[] args) {
        // 1. 객체 생성
//        A a = new A(); //  오류
        PackageImport.Common.A a = new PackageImport.Common.A();

        // 2. 멤버 활용 (필드 -> 값을 읽거나 쓰기, 메서드 -> 호출)
        System.out.println(a.m); // 3
        System.out.println(a.n); // 5
        a.print(); // 임포트 테스트!
    }
}
