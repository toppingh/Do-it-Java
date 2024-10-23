package PackageImport.ex02;

// 다른 패키지에 있는 클래스를 가져와 활용하는 방법 2. 임포트(import) 사용

import PackageImport.Common.A;

public class PackageImport_2 {
    public static void main(String[] args) {

        // 1. 객체 생성
        A a = new A();
//        PackageImport.Common.A a = new PackageImport.Common.A();

        // 2. 멤버 활용
        System.out.println(a.m); // 3
        System.out.println(a.n); // 5
        a.print(); // 임포트 테스트!
    }
}
