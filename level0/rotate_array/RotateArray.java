package level0.rotate_array;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] expected = {3, 1, 2};
        boolean isTrue = Arrays.equals(solution(new int[]{1, 2, 3}, "right"), expected);
        System.out.println("isTrue = " + isTrue);
    }

    private static int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        int toIndex = 0;
        for(int i = 0; i < length; i++) {
            toIndex = direction.equals("right") ? i + 1 : i - 1;
            if(toIndex < 0) {
                toIndex = length - 1;
                answer[toIndex] = numbers[i];
                continue;
            }
            if(toIndex >= length) {
                toIndex = 0;
                answer[toIndex] = numbers[i];
                continue;
            }
            answer[toIndex] = numbers[i];
        }
        return answer;
    }
}
