import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            if(magazineMap.get(c) != null) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            } else {
                magazineMap.put(c, 1);
            }
        }

        for(char c : ransomNote.toCharArray()) {
            if(magazineMap.get(c) != null && magazineMap.get(c) != 0) {
                magazineMap.put(c, magazineMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}