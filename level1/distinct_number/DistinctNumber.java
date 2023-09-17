package level1.distinct_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class DistinctNumber {
    public static void main(String[] args) {
        boolean isTrue = solution(new int[]{1, 1, 3, 3, 0, 1, 1}) == new int[]{1, 3, 0, 1};
        System.out.println("isTrue = " + isTrue);
    }
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();
        List<Integer> result = new ArrayList();
        stack.push(arr[0]);
        for (Integer num : arr) {
            if (stack.pop() == num) {
                stack.push(num);
                continue;
            }
            stack.push(num);
            result.add(num);
        }
        System.out.println(stack);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
