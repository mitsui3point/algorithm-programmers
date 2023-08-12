package level0.rectangle_area;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120860
 */
public class RectangleArea {
    public static void main(String[] args) {
        boolean isTrue = 4 == solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}});
        System.out.println("isTrue = " + isTrue);
    }
    public static int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        for (int i = 0; i < dots.length - 1; i++) {
            int tempWidth = Math.abs(dots[i][0] - dots[i + 1][0]);
            int tempHeight = Math.abs(dots[i][1] - dots[i + 1][1]);
            width = tempWidth > 0 ? tempWidth : width;
            height = tempHeight > 0 ? tempHeight : height;
        }
        return width * height;
    }
}
