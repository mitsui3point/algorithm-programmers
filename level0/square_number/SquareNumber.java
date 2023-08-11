package level0.square_number;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */
public class SquareNumber {
    public static void main(String[] args) {
        boolean isTrue = solution(144) == 2;
        System.out.println("isTrue = " + isTrue);
    }
    public static int solution(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}
