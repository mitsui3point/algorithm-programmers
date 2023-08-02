package level0.cut_array;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class CutArray {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        boolean isTrue = Arrays.compare(solution, new int[]{2, 3, 4}) == 0;
        System.out.println("isTrue = " + isTrue);
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
