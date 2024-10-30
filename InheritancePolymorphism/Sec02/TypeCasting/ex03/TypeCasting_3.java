package InheritancePolymorphism.Sec02.TypeCasting.ex03;

class A {}
class B extends A {}

public class TypeCasting_3 {
    public static void main(String[] args) {

        // 1. instance of 키워드 : casting 가능 여부
        A aa = new A(); // A까지만 casting 가능, 다른 타입으로 불가능
        A ab = new B(); // B까지 casting 가능

        System.out.println(aa instanceof A); // true
        System.out.println(ab instanceof B); // true

        System.out.println(aa instanceof B); // false
        System.out.println(ab instanceof B); // true

        if (aa instanceof B) { // aa를 B로 Typecasting이 가능한지
            B b = (B)aa;
            System.out.println("aa를 B로 캐스팅 했습니다!!");
        } else {
            System.out.println("B로 캐스팅이 불가능합니다!!");
        }

        if (ab instanceof B) { // ab를 B로 Typecasting이 가능한지
            B b = (B)ab;
            System.out.println("ab를 B로 캐스팅 했습니다!!");
        } else {
            System.out.println("B로 캐스팅이 불가능합니다.!!");
        }

        if ("Hello" instanceof String) {
            System.out.println("\"Hello\"는 String 클래스입니다.");
        }
    }
}
