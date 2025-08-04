import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(map.get(c) == null) {
                return false;
            } else if(map.get(c) > 1) {
                map.put(c, map.get(c) - 1);
            } else {
                map.remove(c);
            }
        }

        if(map.size() == 0) {
            return true;
        }

        return false;
    }
}