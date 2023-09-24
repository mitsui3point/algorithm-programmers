package level2.phone_numbers;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PhoneNumbers {

    public static void main(String[] args) {
        boolean isTrue = false == solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println("isTrue = " + isTrue);
        isTrue = true == solution(new String[]{"123", "456", "789"});
        System.out.println("isTrue = " + isTrue);
        isTrue = false == solution(new String[]{"12","123","1235","567","88"});
        System.out.println("isTrue = " + isTrue);
    }
    public static boolean solution(String[] phone_book) {
        return result(hashedPhoneBook(phone_book));
    }
    private static Map<Integer, Set<String>> hashedPhoneBook(String[] phoneBook) {
        Map<Integer, Set<String>> map = new HashMap();
        for (String phoneNum : phoneBook) {
            Integer key = phoneNum.length();
            map.putIfAbsent(key, new LinkedHashSet());
            map.get(key).add(phoneNum);
        }
        return map;
    }
    private static boolean result(Map<Integer, Set<String>> map) {
        Map<Integer, Set<String>> copymap = new HashMap(map);

        for (Integer prefixKey : map.keySet()) {
            for (String prefix : map.get(prefixKey)) {
                copymap.remove(prefixKey);
                for (Integer targetKey : copymap.keySet()) {
                    for (String target : copymap.get(targetKey)) {
                        if (target.indexOf(prefix) == 0) return false;
                    }
                }
            }
        }
        return true;
    }
}
