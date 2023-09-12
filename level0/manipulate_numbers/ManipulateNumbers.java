package level0.manipulate_numbers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
public class ManipulateNumbers {
    public static void main(String[] args) {
        boolean isTrue = solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}).equals("wsdawsdassw");
        System.out.println("isTrue = " + isTrue);
    }

    private static String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < numLog.length; i++) {
            int flag = numLog[i] - numLog[i - 1];
            switch (flag) {
                case 1:
                    sb.append("w");break;
                case -1:
                    sb.append("s");break;
                case 10:
                    sb.append("d");break;
                case -10:
                    sb.append("a");break;
            }
        }
        return sb.toString();
    }
}
