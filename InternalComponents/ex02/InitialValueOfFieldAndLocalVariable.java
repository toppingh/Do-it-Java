package InternalComponents.ex02;

// 1. 클래스 생성 (정의)
class A {
    boolean m1;
    int m2;
    double m3;
    String m4;

    void printFieldValue() {
        System.out.println(m1); // false
        System.out.println(m2); // 0
        System.out.println(m3); // 0.0
        System.out.println(m4); // null -> 객체를 가리키고있지 않음
    }

    void printLocalVariable() {
        int k;
        //System.out.println(k); // 문법 오류 -> 지역변수는 stack 메모리에 만들어져 초기값이 없으면 빈칸으로 존재. (stack 메모리는 강제 초기화x)
    }
}


public class InitialValueOfFieldAndLocalVariable {
    public static void main(String[] args) {

        // 2. 클래스를 활용한 객체 생성
        A a = new A();

        // 3. 객체 활용
        a.printFieldValue();
    }
}
