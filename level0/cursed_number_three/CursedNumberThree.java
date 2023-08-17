package level0.cursed_number_three;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */
public class CursedNumberThree {
    public static void main(String[] args) {
        boolean isTrue = 25 == solution(15);
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (String.valueOf(answer).contains("3")
                    || answer % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
