package level0.string_reverse;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */
public class StringReverse {
    public static void main(String[] args) {
        boolean isTrue = solution("jaron").equals("noraj");
        System.out.println("isTrue = " + isTrue);
    }

    public static String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
