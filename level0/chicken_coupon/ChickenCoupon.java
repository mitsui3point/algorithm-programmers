package level0.chicken_coupon;

public class ChickenCoupon {
    public static void main(String[] args) {
        boolean isTrue = 222 == solution(1999);
        System.out.println("isTrue = " + isTrue);
    }

    /**
     * 반례 1999 222
     */
    public static int solution(int chicken) {
        int answer = 0;
        double service = 0;
        double coupon = 0;
        while(true) {
            coupon += service == 0 ? chicken : service;
            service = (int) Math.floor(coupon / 10);
            answer += service;
            coupon -= service * 10;
            if (service < 1) break;
        }
        answer += coupon / 10;
        return answer;
    }
}
