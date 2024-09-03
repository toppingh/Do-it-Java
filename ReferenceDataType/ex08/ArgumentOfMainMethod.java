package ReferenceDataType.ex08;

public class ArgumentOfMainMethod {
    public static void main(String[] args) {

        // 1. args (main 메서드의 매개변수) 배열의 길이 구하기
        System.out.println(args.length); // 0 -> 현재 데이터를 안넣었으므로
        System.out.println();

        // 2. Run -> Run Configurations -> ArgumentOfMainMethod -> Arguments에 데이터 입력

        // 3. 매개변수 출력1 - for
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();

        // 4. 매개변수 출력2 : for-each
        for(String s : args) {
            System.out.println(s);
        }
        System.out.println();
    }
}
