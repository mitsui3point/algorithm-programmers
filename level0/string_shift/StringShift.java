package level0.string_shift;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */
public class StringShift {
    public static void main(String[] args) {
        boolean isTrue1 = 1 == solution("hello", "ohell");
        boolean isTrueNegative1 = -1 == solution("apple", "elppa");
        System.out.println("isTrue1 = " + isTrue1);
        System.out.println("isTrueNegative1 = " + isTrueNegative1);
    }
    public static int solution(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}
