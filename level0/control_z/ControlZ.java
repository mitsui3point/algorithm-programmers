package level0.control_z;

import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853?language=java
 */
public class ControlZ {

    public static void main(String[] args) {
        int solution = solution("10 Z 20 Z 1");
        int anotherSolution = anotherSolution("10 Z 20 Z 1");
        boolean isTrue = solution == 1;
        boolean isAnotherTrue = anotherSolution == 1;
        System.out.println("isTrue = " + isTrue);
        System.out.println("isAnotherTrue = " + isAnotherTrue);
    }
    public static int solution(String s) {
        int answer = 0;
        String numbers = s.replaceAll("\\-?\\d?\\d?\\d?\\d [A-Z]", "0");
        for(String number : numbers.split(" ")) {
            answer += Integer.parseInt(number);
        }
        return answer;
    }

    public static int anotherSolution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (String word : s.split(" ")) {
            if (word.equals("Z")) {
                stack.pop();
                continue;
            }
            stack.push(Integer.parseInt(word));
        }
        for (Integer number : stack) {
            answer += number;
        }
        return answer;
    }
}
