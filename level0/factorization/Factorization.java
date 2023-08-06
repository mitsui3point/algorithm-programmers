package level0.factorization;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */
public class Factorization {
    public static void main(String[] args) {
        int[] solution = solution(420);
        boolean isTrue = Arrays.equals(solution, new int[]{2, 3, 5, 7});
        System.out.println("isTrue = " + isTrue);
    }

    private static int[] solution(int n) {
        Set<Integer> answer = new HashSet();
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                n /= i;
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(value -> (int) value).sorted().toArray();
    }
}
