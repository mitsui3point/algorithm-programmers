package level0.flag_calculator;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
public class FlagCalculator {
    public static void main(String[] args) {
        boolean isTrue = solution(-4, 7, true) == 3;
        System.out.println("isTrue = " + isTrue);
    }

    public static int solution(int a, int b, boolean flag) {
        return a + (flag ? b : -b);
    }
}
