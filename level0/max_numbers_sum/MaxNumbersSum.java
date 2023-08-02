package level0.max_numbers_sum;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */
public class MaxNumbersSum {
    public static void main(String[] args) {
        int[] ints = {0, 31, 31, 10, 1, 9};
        boolean isTrue = solution(ints) == 744;
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
