package level0.unusual_sort;

import java.util.Arrays;
import java.util.Comparator;

public class UnusualSort {
    public static void main(String[] args) {
        boolean isTrue = Arrays.equals(
                new int[]{36, 40, 20, 47, 10, 6, 7000, 10000},
                solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)
        );
        System.out.println("isTrue = " + isTrue);
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Integer[] buffers = new Integer[numlist.length];
        int i = 0;
        for (int num : numlist) {
            buffers[i++] = num - n;
        }
        Arrays.sort(buffers, (a, b) -> b - a);
        Arrays.sort(buffers, (a, b) -> Math.abs(a) - Math.abs(b));
        int k = 0;
        for (int buffer : buffers) {
            for (int num : numlist) {
                if (buffer == num - n) answer[k++] = num;
            }
        }
        return answer;
    }

}
