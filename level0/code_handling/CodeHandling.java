package level0.code_handling;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */
public class CodeHandling {
    public static void main(String[] args) {
        boolean isTrue = solution("abc1abc1abc").equals("acbac");
        System.out.println("isTrue = " + isTrue);
    }

    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int mode = 0;
        for (char c : code.toCharArray()) {
            if (c == '1') {
                mode = mode == 1 ? 0 : 1;
                idx++;
                continue;
            }
            if (mode == 0 && idx % 2 == 0) sb.append(c);
            if (mode == 1 && idx % 2 != 0) sb.append(c);
            idx++;
        }
        return sb.toString().equals("") ? "EMPTY" : sb.toString();
    }
}
