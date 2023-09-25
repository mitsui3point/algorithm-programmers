package level2.phone_numbers;

import java.util.*;

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
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }
        return true;
//        return result(hashedPhoneBook(phone_book));
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
/**








 */