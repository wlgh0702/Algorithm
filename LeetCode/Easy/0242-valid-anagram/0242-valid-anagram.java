import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] alphabet = new int[26];

        for(char c : s.toCharArray()) {
            alphabet[c - 'a'] += 1;
        }

        for(char c : t.toCharArray()) {
            if(alphabet[c - 'a'] == 0) return false;

            alphabet[c - 'a'] -= 1;
        }

        return true;
    }
}