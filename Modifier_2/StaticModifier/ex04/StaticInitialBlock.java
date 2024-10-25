package Modifier_2.StaticModifier.ex04;

// static 초기화 블록
class A {
    int a;
    static int b;

    static {
        b = 5; // static 필드 초기화는 static {} 내에서 수행
        System.out.println("클래스 A 로딩 완료!!");
    }

    A() {
        a = 3; // 인스턴스 필드 초기화는 생성자에서 일반적으로 수행
        //b = 5;
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {

        System.out.println(A.b);
    }
}
