package sec01_operator_1.ex02;

public class LogicalOperator {
    public static void main(String[] args) {

        // 1. 논리 연산자
        // AND (&&)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && (5 < 3)); // false
        System.out.println((5 >= 5) && (7 < 10)); // true
        System.out.println();

        // OR (||)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(true || (5 < 3)); // false
        System.out.println((5 >= 5) || (7 < 10)); // true
        System.out.println();

        // XOR (^)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ (5 < 3)); // false
        System.out.println((5 >= 5) ^ (7 < 10)); // false
        System.out.println();

        // NOT (!)
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(false || !(5 < 3)); // true
        System.out.println((5 <= 5) || !(7 < 10)); // true

        // 2. 비트 연산자로 논리 연산 수행
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(true | (5 < 3)); // true
        System.out.println((5 <= 5) | (7 < 10)); // true
        System.out.println();

        // 숏 서킷 사용 여부 (논리 연산자는 O, 비트 연산자는 X)
        int value1 = 3;
        System.out.println(false && ++value1 > 6); // false, false만 읽고 뒤는 아예 안읽음
        System.out.println(value1); // 3

        int value2 = 3;
        System.out.println(false & ++value2 > 6); // 비트 연산자는 뒤에 일단 읽어봄
        System.out.println(value2); // 4

        int value3 = 3;
        System.out.println(true || ++value3 > 6); // true, 논리 연산자는 뒤르 안 읽으므로 true
        System.out.println(value3); // 3

        int value4 = 3;
        System.out.println(true | ++value4 > 6); // 비트 연산자는 뒤를 읽으므로 value4 값 바뀜
        System.out.println(value4); // 4
    }
}
