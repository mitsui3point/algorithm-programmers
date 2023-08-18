package level0.parallel_four_dots;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120875
 */
public class ParallelFourDots {
    public static void main(String[] args) {
        boolean isTrue = 1 == solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        System.out.println("isTrue = " + isTrue);
    }

    public static int solution(int[][] dots) {
        int length = dots.length;
        int a, b, c, d;
        double cx1, cx2, cy1, cy2;
        for (int i = 1; i < length; i++) {
            a = (i + 0) % 4;
            b = (i + 1) % 4;
            c = (i + 2) % 4;
            d = (i + 3) % 4;
            cx1 = Math.abs(dots[a][0] - dots[b][0]);
            cx2 = Math.abs(dots[c][0] - dots[d][0]);
            cy1 = Math.abs(dots[a][1] - dots[b][1]);
            cy2 = Math.abs(dots[c][1] - dots[d][1]);
            boolean isEqualIncline = cy1 / cx1 == cy2 / cx2;
            if(isEqualIncline) return 1;
        }
        return 0;
    }
}
