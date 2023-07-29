package level0.addition_of_fractions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 */
public class AdditionOfFractions {

    public static void main(String[] args) {
        solutionChecker(1, 2, 3, 4, new int[]{5, 4});
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int changeNumer1 = numer1 * denom2;
        int changeNumer2 = numer2 * denom1;
        int changeNumer = changeNumer1 + changeNumer2;
        int changeDenom = denom1 * denom2;
        if(changeNumer == changeDenom) {
            return new int[]{1, 1};    
        }
        if(changeNumer == 0 || changeDenom == 0) {
            return new int[]{changeNumer, changeDenom};
        }
        
        int mod = 0;
        if(changeNumer > changeDenom) {
            mod = changeDenom;
        }
        if(changeNumer < changeDenom) {
            mod = changeNumer;
        }
        for(int i = mod; i >= 1; i--) {
            if(changeDenom == 1 || changeNumer == 1) {
                break;
            }
            if(changeDenom % i == 0 && changeNumer % i == 0) {
                changeDenom = changeDenom / i;    
                changeNumer = changeNumer / i;
            }
        }
        
        return new int[]{changeNumer, changeDenom};
    }

    private static void solutionChecker(int numer1, int denom1, int numer2, int denom2, int[] answers) {
        int[] solution = solution(numer1, denom1, numer2, denom2);
        boolean isSolutionTrue = 
            solution[0] == answers[0]
            && solution[1] == answers[1];
        System.out.println(isSolutionTrue);
    }
}