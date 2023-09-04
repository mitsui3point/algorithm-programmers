package level0.modulo_nine;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */
public class ModuloNine {
    public static void main(String[] args) {
        boolean isTrue = solution("78720646226947352489") == 2;
        System.out.println("isTrue = " + isTrue);
    }
    public static int solution(String number) {
        int result = 0;
        for(String c : number.split("")) {
            result += Integer.parseInt(c);
        }
        return result % 9;
    }
}
