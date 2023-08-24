package level0.binary_sum;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */
public class BinarySum {
    public static void main(String[] args) {
        boolean isTrue = "11000".equals(solution("1001", "1111"));
        System.out.println("isTrue = " + isTrue);
    }
    public static String solution(String bin1, String bin2) {
//        String answer = "";
//        int binSum = pow(bin1) + pow(bin2);
//        return sqrt(binSum);
         return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
    }

    public static int pow(String bin) {
        int length = bin.length() - 1;
        int sum = 0;
        for(String b : bin.split("")) {
            sum += Integer.parseInt(b) * (int) Math.pow(2, length--);
        }
        return sum;
    }

    public static String sqrt(int sum) {
        StringBuffer result = new StringBuffer();
        while(true) {
            result.insert(0, sum % 2);
            sum /= 2;
            if(sum <= 1) {
                result.insert(0, sum == 1 ? sum : "");
                break;
            }
        }
        return result.toString();
    }
}
