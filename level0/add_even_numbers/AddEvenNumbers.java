package level0.add_even_numbers;

import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class AddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("solution = " +solution(10));
    }
    public static int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(o -> o % 2 == 0).sum();
    }
}
