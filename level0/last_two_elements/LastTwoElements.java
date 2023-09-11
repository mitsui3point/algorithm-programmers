package level0.last_two_elements;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */
public class LastTwoElements {
    public static void main(String[] args) {
        boolean isTrue = solution(new int[]{5, 2, 1, 7, 5}) == new int[]{5, 2, 1, 7, 5, 10};
    }

    private static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = Arrays.copyOf(num_list, length + 1);
        int last = num_list[length - 1];
        int lastBefore = num_list[length - 2];
        answer[length] =  last - lastBefore > 0 ? last - lastBefore : last * 2;

        return answer;
    }
}
