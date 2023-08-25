package level0.a_to_b;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class AToB {
    public static void main(String[] args) {
        boolean a = 0 == solution("allpe", "apple");
        boolean b = 1 == solution("olleh", "hello");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        return Arrays.equals(beforeArray, afterArray) ? 1 : 0;
    }
}
