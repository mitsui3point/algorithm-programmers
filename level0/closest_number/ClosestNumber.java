package level0.closest_number;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */
public class ClosestNumber {
    public static void main(String[] args) {
        boolean isTrue = 28 == solution(new int[]{3, 10, 28}, 20);
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int[] array, int n) {
        Arrays.sort(array);
        int result = 0;
        int min = 0;
        int[][] results = new int[array.length][2];
        // 루프
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int distance = Math.abs(num - n);
            min = (min > distance || i == 0)
                    ? distance
                    : min;

            results[i][0] = num;
            results[i][1] = distance;
        }

        for (int i = 0; i < array.length; i++) {
            if (results[i][1] == min) {
                result = results[i][0];
                break;
            }
        }
        return result;
    }
}
