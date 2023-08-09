package level0.strings_calculator;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */
public class StringsCalculator {
    public static void main(String[] args) {
        boolean isTrue = 12 == solution("3 + 4 + 5");
        System.out.println("isTrue = " + isTrue);
    }

    public static int solution(String my_string) {
        String[] strings = my_string.split(" ");

        int result = Integer.parseInt(strings[0]);
        for(int i = 1; i <= (strings.length - 1) / 2; i++) {
            result += calculate(strings[i * 2 - 1],
                    Integer.parseInt(strings[i * 2]));
        }
        return result;
    }

    public static int calculate(String operator, int operand) {
        return "+".equals(operator)
                ? operand
                : - operand;
    }
}
