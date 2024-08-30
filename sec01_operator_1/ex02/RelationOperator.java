package sec01_operator_1.ex02;

public class RelationOperator {
    public static void main(String[] args) {

        // 1. 크기 비교 (<, >, <=, >=) : true, false
        System.out.println(5 < 2); // false
        System.out.println(5 > 2); // true
        System.out.println(5 > 5); // false
        System.out.println(5 <= 5); // true
        System.out.println(5 >= 5); // true
        System.out.println();

        // 2. 등가비교 (==, !=) : true, false
//        int a = 5;
//        System.out.println(a = 2); // false
        System.out.println(5 == 2); // false
        System.out.println(5 != 2); // true
        System.out.println(5 == 5); // true
        System.out.println(5 != 5); // false
        System.out.println();

        // 3. 참조 자료형 등가비교
        String str1 = new String("안뇽");
        String str2 = new String("안녕");
        System.out.println(str1 == str2); // false
    }
}
