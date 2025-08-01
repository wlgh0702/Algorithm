class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(lower.length() <= 1) return true;
        
        int j = lower.length() - 1;
        for(int i = 0; i < lower.length() / 2; i++) {
            if(lower.charAt(i) != lower.charAt(j - i)) {
                return false;
            }
        }
        return true;
    }
}