package level0.clothing_store_discount;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818#
 */
public class ClothingStoreDiscount {
    public static void main(String[] args) {
        int solution = solution(1000000);
        System.out.println("solution = " + solution);
    }
    public static int solution(int price) {
        return price * getDiscountRate(price) / 100;
    }
    public static int getDiscountRate(int price) {
        if(price >= 100000 && price < 300000) return 95;
        if(price >= 300000 && price < 500000) return 90;
        if(price >= 500000 && price <= 1000000) return 80;
        return 100;
    }
}
