package level0.unusual_sort;

import java.util.Arrays;

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
        int[] buffers = new int[numlist.length];

        int i = 0, prev = 0;
        for (int num : numlist) {
            buffers[i] = num - n;
            i++;
        }
        for (int outer = 0; outer < buffers.length; outer++) {
            for (int inner = 0; inner < buffers.length; inner++) {
                int temp = 0;
                boolean biggerInner = Math.abs(buffers[inner]) > Math.abs(buffers[outer]);
                boolean isAbsoluteEquals = Math.abs(buffers[inner]) == Math.abs(buffers[outer]);
                boolean isNegativeInner = buffers[inner] < buffers[outer];
                if (biggerInner || (isAbsoluteEquals && isNegativeInner)) {
                    temp = buffers[inner];
                    buffers[inner] = buffers[outer];
                    buffers[outer] = temp;
                }
            }

        }
        int k = 0;
        for (int buffer : buffers) {
            for (int num : numlist) {
                if (buffer == num - n) {
                    answer[k] = num;
                }
            }
            k++;
        }
        return answer;
    }

}
