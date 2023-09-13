package level0.number_array_and_query;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */
public class NumberArrayAndQuery {
    public static void main(String[] args) {
        boolean isTrue = Arrays.equals(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{new int[]{0, 4, 2}, new int[]{0, 3, 2}, new int[]{0, 2, 2}}), new int[]{3, 4, -1});
        System.out.println("isTrue = " + isTrue);
    }

    static final int MAX_LENGTH = 1000001;
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int min = MAX_LENGTH;
            for (int i = query[0]; i <= query[1]; i++) {
                if (query[2] >= arr[i]) continue;
                min = Math.min(min, arr[i]);
            }
            answer[idx++] = min == MAX_LENGTH ? -1 : min;
        }
        return answer;
    }
}
