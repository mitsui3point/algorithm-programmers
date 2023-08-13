package level0.add_polynomial;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863
 */
public class AddPolynomial {

    public static void main(String[] args) {
        boolean isTrue = "x + 1".equals(solution("x + 1"));
        System.out.println("isTrue = " + isTrue);
    }

    public static String solution(String polynomial) {
        String[] array = polynomial.split(" \\+ ");

        int countX = 0;
        int countN = 0;
        for(String element : array) {
            countX = addX(countX, element);
            countN = addN(countN, element);
        }

        return answer(countX, countN);
    }

    private static String answer(int xAnswer, int nAnswer) {
        boolean isExistX = (xAnswer > 0);
        boolean isVisibleX = (xAnswer > 1);
        boolean isExistN = (nAnswer > 0);
        return new StringBuffer()
                .append(isVisibleX ? xAnswer : "")
                .append(isExistX ? "x" : "")
                .append(isExistX && isExistN ? " + " : "")
                .append(isExistN ? nAnswer : "")
                .toString();
    }

    private static int addN(int nAnswer, String element) {
        if(!element.contains("x")) {
            nAnswer += Integer.parseInt(element);
        }
        return nAnswer;
    }

    private static int addX(int xAnswer, String element) {
        boolean isContainX = element.contains("x");
        if(isContainX) {
            xAnswer += (element.length() > 1)
                    ? Integer.parseInt(element.replaceAll("x", ""))
                    : element.length();
        }
        return xAnswer;
    }
}
