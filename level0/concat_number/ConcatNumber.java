package level0.concat_number;

public class ConcatNumber {
    public static void main(String[] args) {
        boolean isTrue = solution(new int[]{3, 4, 5, 2, 1}) == 393;
        System.out.println("isTrue = " + isTrue);
    }

    private static int solution(int[] num_list) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0 ; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) sb1.append(num_list[i]);
            if (num_list[i] % 2 != 0) sb2.append(num_list[i]);
        }
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }

}
