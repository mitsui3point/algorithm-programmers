package level0.count_k;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */
public class CountK {
    public static void main(String[] args) {
        boolean isTrue = solution(1, 13, 1) == 6;
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int i, int j, int k) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        for (int index = i; index <= j; index++) {
            sb.append(index);
        }
        for (String str : sb.toString().split("")) {
            if (Integer.parseInt(str) == k) answer++;
        }
        return answer;
    }
}
