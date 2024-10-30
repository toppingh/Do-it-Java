package InheritancePolymorphism.Sec02.TypeCasting.ex01;

// 클래스 상속 관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {
    public static void main(String[] args) {

        // 1. 업캐스팅 (자동 변환) : 생략시 컴파일러가 자동 추가
        A ac = new C(); // C -> A 업캐스팅 (자동변환)
//        A ac = (A) new C(); 컴파일러가 이렇게 (A) 자동 추가 해주는 것
        B bc = new C(); // C -> B 업캐스팅 (자동 변환)

        B bb = new B();
        A a = (A)bb; // B -> A 업캐스팅 (자동변환)

        // 2. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외 발생)
        A aa = new A();
//        B b = (B)aa; // A -> B 다운캐스팅 (수동변환) ClassCastException 발생
//        C cc = (C)aa; // A -> C 다운캐스팅 (수동변환) 문법적 오류는 없으나 실행시 ClassCastException 발생

        // 3. 다운캐스팅 (수동변환) : 캐스팅이 가능한 경우
        A ab = new B();
        B b = (B)ab; // A -> B 다운캐스팅 (수동변환)
//        C c = (C)ab; // A -> C 다운캐스팅 (수동변환) : 불가능, B까지 객체를 만들었기 때문에 C로 다운캐스팅 불가능. 문버 오류x 예외 발생

        B bd = new D();
        D d = (D)bd; // B -> D 다운캐스팅 (수동변환)

        A ad = new D();
        B b1 = (B)ad; // A -> B 다운캐스팅 (수동변환)
        D d1 = (D)ad; // A -> D 다운캐스팅 (수동변환)
    }
}
