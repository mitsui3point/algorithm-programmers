package level0.ball_throw_rounded_sequence;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120843
 */
public class BallThrowRoundedSequence {

    public static void main(String[] args) {

        boolean isTrue = solution(new int[]{1, 2, 3, 4}, 2) == 3;
        System.out.println("isTrue = " + isTrue);
        boolean isAnotherTrue = another(new int[]{1, 2, 3, 4}, 2) == 3;
        System.out.println("isAnotherTrue = " + isAnotherTrue);
    }

    private static int solution(int[] numbers, int k) {
        int length = numbers.length;
        int sequenceLength = length % 2 == 0 ? length / 2 : length;
        int[] sequences = new int[sequenceLength];
        for(int i = 0, j = 0; i < numbers.length; i++) {
            if(i * 2 > numbers.length) {
                sequences[i] = numbers[(j * 2 + 1)];
                j++;
                continue;
            }
            sequences[i] = numbers[(i * 2)];
            if(numbers.length % 2 == 0 && (i + 1) * 2 == numbers.length) {
                break;
            }
        }
        return sequences[(k - 1) % sequenceLength];
    }

    private static int another(int[] numbers, int k) {
        return (k - 1) * 2 % numbers.length + 1;
    }
}
