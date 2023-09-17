package level1.did_not_finish_the_race;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class DidNotFinishTheRace {
    public static void main(String[] args) {
        boolean isTrue = "mislav".equals(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
        System.out.println("isTrue = " + isTrue);
    }

    private static String solution(String[] participant, String[] completion) {
        Map<String, Integer> result = new HashMap();
        for (String p : participant) {
            if (result.get(p) != null) {
                int runners = result.get(p);
                result.put(p, ++runners);
                continue;
            }
            result.putIfAbsent(p, 1);
        }
        for (String c : completion) {
            int runners = result.get(c);
            if (runners > 0) {
                result.put(c, --runners);
            }
            if (result.get(c) == 0) {
                result.remove(c);
            }
        }
        return result.keySet().toArray(String[]::new)[0];
    }
}
