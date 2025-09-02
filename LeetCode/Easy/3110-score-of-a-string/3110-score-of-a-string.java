class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        for(int i = 1; i < s.length(); i++) {
            int minus = s.charAt(i - 1) - s.charAt(i);
            if(minus < 0) {
                minus = -minus;
            }
            result += minus;
        }
        return result;
    }
}