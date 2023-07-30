package level0.array_mode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayMode {
    public static void main(String[] args) {
        solutionCorrect();
    }

    private static void solutionCorrect() {
        boolean answer = solution(new int[]{1, 1, 2, 2}) == -1;
        System.out.println("answer = " + answer);
    }

    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : array) {
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }
        Integer max = map.values()
                .stream()
                .max(Integer::compareTo)
                .get();
        List<Map.Entry<Integer, Integer>> collect = map.entrySet()
                .stream()
                .filter(o -> o.getValue() == max)
                .collect(Collectors.toList());

        return collect.size() > 1 ? -1 : collect.get(0).getKey();
    }
}
