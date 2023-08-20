package level0.overlapping_segment_length;

import java.util.ArrayList;
import java.util.List;
public class OverlappingSegmentLength {
    public static void main(String[] args) {
        boolean isTrue = 2 == solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}});
        System.out.println("isTrue = " + isTrue);
    }
    public static int solution(int[][] lines) {

        List<int[]> results = new ArrayList();

        int size = 0;

        for (int i = 0; i < lines.length; i++) {
            int index1 = i % 3;
            int index2 = ((i + 1) % 3);
            int start = Math.max(lines[index1][0], lines[index2][0]);
            int end = Math.min(lines[index1][1], lines[index2][1]);
            if (start < end) {
                results.add(new int[]{start, end});
            }
        }

        int max, min;

        if (results.size() < 3) {
            max = 100;
            min = -100;
            for (int[] result : results) {
                size += (result[1] - result[0]);
                max = Math.min(max, result[1]);
                min = Math.max(min, result[0]);
            }
        }


        if (results.size() == 3) {
            max = -100;
            min = 100;
            for (int[] result : results) {
                max = Math.max(max, result[1]);
                min = Math.min(min, result[0]);
            }
            size = max - min;
        }

        return size;
    }
}
