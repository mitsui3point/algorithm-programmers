package level0.hide_number_sum;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class HideNumberSum {
    public static void main(String[] args) {
        int solution = solution("aAb1B2cC34oOp");
        boolean isTrue = solution == 10;
        System.out.println("isTrue = " + isTrue);
    }
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for(char c : my_string.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }
}
