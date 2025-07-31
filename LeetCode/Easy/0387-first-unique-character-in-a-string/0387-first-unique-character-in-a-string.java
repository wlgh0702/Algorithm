import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        char[] string = s.toCharArray();
        for(char c : string) {
            ++alphabet[c - 'a'];
        }

        for(int i = 0; i < string.length; i++) {
            if(alphabet[string[i] - 'a'] == 1) return i;
        }

        return -1;
    }
}