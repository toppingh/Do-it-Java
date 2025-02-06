package InheritancePolymorphism.Sec05.ex04;

// Title : 짝수는 싫어요
// Q. 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열 return 하는 solution 함수
// 제한. 1 <= n <= 100

class Solution1 {
    String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char text = my_string.charAt(i);

            for (int j = 0; j < n; j++) {
                answer += text;
            }
        }
        return answer;
    }
}

public class test {
    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        System.out.println(solution.solution("hello", 3));
    }
}
