package ObjectClass.ex03;

import java.util.HashMap;

class A {
    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((A)obj).name ? true : false;
    }

    @Override
    public String toString() {
        return name;
    }
}

class B {
    String name;

    B (String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((B)obj).name ? true : false;
    }

    @Override
    public int hashCode() { // name이라고 하는 문자열의 hashcode를 가져오므로 동일한 hashcode
        return name.hashCode(); // 즉, 문자열의 hashcode는 동일함
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ObjectMethod_hashcode {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>(); // Key -> Integer, Value -> String
        hm1.put(1, "data1");
        hm1.put(1, "data2"); // Key가 같으면 덮어씌워짐
        hm1.put(3, "data3");
        System.out.println(hm1);

        // Hash관점에서 equal이 true가되려면 hashcode까지 같아야함
        HashMap<A, String> hm2 = new HashMap<>();
        hm2.put(new A("첫번째"), "data1");
        hm2.put(new A("첫번째"), "data2");
        hm2.put(new A("세번째"), "data2");
        System.out.println(hm2); // hashcode를 오버라이딩 하지 않았기 때문에 다른 객체로 봄

        HashMap<B, String> hm3 = new HashMap<>();
        hm3.put(new B("첫번째"), "data1");
        hm3.put(new B("첫번째"), "data2");
        hm3.put(new B("세번째"), "data3");
        System.out.println(hm3);

        // 1. 최상위 클래스인 Object의 hashcode는 객체 위치 기반으로 생성되는 값이다.
        // 2. 별도의 객체가 생성되면 위치가 다르므로 hashcode도 다르다
        // 3. hashcode를 같게 하려면 hashcode를 오버라이딩 해야한다.
    }
}
