package level0.condition_string;

import java.util.*;
import java.util.function.BiFunction;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class ConditionString {
    public static void main(String[] args) {
        boolean isTrue = solutionAnother("<", "=", 20, 50) == 1;
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(String ineq, String eq, int n, int m) {
        String compare = new StringBuffer()
                .append(ineq)
                .append(eq.equals("=") ? "=" : "")
                .toString();
        boolean result = false;
        switch (compare) {
            case ">=" : result = n >= m; break;
            case "<=" : result = n <= m; break;
            case "<" : result = n < m; break;
            case ">" : result = n > m; break;
        }
        return result ? 1 : 0;
    }

    private static int solutionAnother(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }

}
