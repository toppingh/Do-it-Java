package InheritancePolymorphism.Sec03;

class AA {
    void print1() {
        System.out.println("AA 클래스 print1");
    }

    void print2() {
        System.out.println("AA 클래스 print2");
    }
}

class BB extends AA { // BB 클래스는 총 3개의 메서드 사용 가능(오버라이딩 print1(), print2(int a), 상속받은 print2())
    @Override
    void print1() {
        System.out.println("BB 클래스 print1");
    }

    void print2(int a) { // 시그니쳐를 받으므로 오버로딩 (오버라이딩 아님!!)
        System.out.println("BB 클래스 print2");
    }
}


public class MethodOverriding_3 {
    public static void main(String[] args) {

        // 1. AA 타입 선언 + AA 생성자 사용
        AA aa = new AA();
        aa.print1(); // AA 클래스 print1
        aa.print2(); // AA 클래스 print2

        // 2. BB 타입 선언 + BB 생성자 사용
        BB bb = new BB();
        bb.print1(); // BB 클래스 print1
        bb.print2(); // AA 클래스 print2
        bb.print2(1); // BB 클래스 print2

        // 3. AA 타입 선언 / BB 생성자 사용
        AA ab = new BB();
        ab.print1(); // BB 클래스 print1
        ab.print2(); // AA 클래스 print2
    }
}
