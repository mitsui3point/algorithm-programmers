package level0.beads_devide;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */
public class BeadsDivide {
    public static void main(String[] args) {
        int solution = solution(30, 10);
        System.out.println("solution = " + solution);
    }
    public static int solution(int balls, int share) {
        long answer = 1;
        int shareIndex = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            System.out.println("1answer = " + answer);
            answer /= shareIndex;
            System.out.println("2answer = " + answer);
            shareIndex++;
            System.out.println("shareIndex = " + shareIndex);
        }
        return (int)answer;
    }
}