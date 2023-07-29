package level0.array_average;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811#
 */
public class ArrayAverage {

    public static void main(String[] args) {
        solutionChecker(new int[]{5, 4, 3, 2, 1, 9, -1, 0, 10}, 3);
    }
    
    private static void solutionChecker(int[] array, int result) {
        boolean isTrue1 = solution(array) == result;
        System.out.println("isTrue1: " + isTrue1);
        boolean isTrue2 = solution2(array) == result;
        System.out.println("isTrue2: " + isTrue2);
    }

    public static int solution(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++)
            if(array[j] < array[i]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array[array.length / 2];
    }

    public static int solution2(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

