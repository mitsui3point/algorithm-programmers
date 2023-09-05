package level0.string_array_to_string;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */
public class StringArrayToString {
    public static void main(String[] args) {
        boolean isTrue = "abc".equals(solution(new String[]{"a", "b", "c"}));
        System.out.println("isTrue = " + isTrue);
    }

    private static String  solution(String[] arr) {
        return String.join("", arr);
    }
}
