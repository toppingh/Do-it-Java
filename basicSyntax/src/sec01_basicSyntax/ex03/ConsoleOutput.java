package sec01_basicSyntax.ex03;

public class ConsoleOutput {
    public static void main(String[] args) {
//        System.out.println() - 개행 기능 o
        System.out.println("화면 출력");
        System.out.println("화면" + "출력"); // String + String, 화면출력
        System.out.println(3.8); // float, 3.8
        System.out.println(3 + 5); // int, 8
        System.out.println("화면" + 3); // String + int, 화면3
        System.out.println("화면" + 3 + 5); // String + String + String, 화면35
        System.out.println(3 + 5 + "화면"); // int + int + String, 8화면
        System.out.println(); // 개행, 줄만 띄우기

        int a = 3; // 정수 저장 공간
        String b = "화면"; // 문자 저장 공간

        System.out.println(a); // 3
        System.out.println(b); // 화면
        System.out.println(a + b); // 3화면
        System.out.println(b + "출력"); // 화면출력
        System.out.println(a + b + "출력"); // 3화면출력
        System.out.println();

//        System.out.print() - 개행 기능 x
        System.out.print("화면");
        System.out.print("출력");
        System.out.print("3");
        System.out.print("\n"); // System.out.println()과 같은 의미로 개행하라는 의미

//        System.out.printf() - C에서 사용하는 메서드로 포맷팅 가능
        System.out.printf("%d\n", 30); // 10진수로 출력, 30
        System.out.printf("%o\n", 30); // 8진수로 출력, 36
        System.out.printf("%x\n", 30); // 16진수로 출력, 1E

        System.out.printf("%s\n", "출력"); // 문자열로 출력, 출력
        System.out.printf("%f\n", 3.5); // 실수 출력, 3.500000
    }
}
