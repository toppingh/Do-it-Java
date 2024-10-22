package InternalComponents.Method.ex02;

public class InternalCallMethods {
    public static void main(String[] args) {

        // 2. 같은 클래스 안에 있는 (내부)메서드 호출
        print();

        int t = twice(4);
        System.out.println(t); // 8

        double s = sum(t, 5.8);
        System.out.println(s); // 13.8
    }

    // 1. 같은 클래스 내의 메서드 호출
    public static void print() {
        System.out.println("안녕");
    }

    public static int twice(int k) {
        return k * 2;
    }

    public static double sum(int m, double n) {
        return m + n;
    }
}
