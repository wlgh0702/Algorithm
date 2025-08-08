class Solution {
    public int myAtoi(String s) {
        final int MAX_INT = Integer.MAX_VALUE;
        final int MIN_INT = Integer.MIN_VALUE;

        int i = 0;
        int len = s.length();

        while(i < len && s.charAt(i) == ' ') {
            i++;
        }

        if(i == len) return 0;

        int abs = 1;
        if(s.charAt(i) == '+') {
            i++;
        } else if(s.charAt(i) == '-') {
            i++;
            abs = -1;
        }

        long res = 0;
        while(i < len && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if(abs * res <= MIN_INT) {
                return MIN_INT;
            }
            if(abs * res >= MAX_INT) {
                return MAX_INT;
            }
            i++;
        }

        return (int) (res * abs);
    }
}