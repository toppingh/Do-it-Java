package sec01_datatype.ex03;

public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3;

        {
            int value2 = 5;
            System.out.println(value1); // 3
            System.out.println(value2); // 5
        }

        System.out.println(value1); // 3
//        System.out.println(value2); // 오류, 이미 메모리(스택 영역)에서 value2 삭제됨
    }
}
