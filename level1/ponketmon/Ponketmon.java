package level1.ponketmon;

import java.util.HashSet;
import java.util.Set;

/**
 * hash
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Ponketmon {
    public static void main(String[] args) {
        boolean isTrue = solution(new int[]{3, 3, 3, 2, 2, 4}) == 3;
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length / 2 ? set.size() : nums.length / 2;
    }

}
