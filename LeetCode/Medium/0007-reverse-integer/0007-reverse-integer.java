import java.util.*;

class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;

        StringBuilder ans = new StringBuilder();
        boolean isAdded = false;
        if(x < 0) {
            ans.append("-");
            x = -x;
        }
        String number = String.valueOf(x);
        for(int i = number.length() - 1; i >= 0; i--) {
            if(number.charAt(i) - '0' == 0 && !isAdded) {
                continue;
            } else {
                ans.append(number.charAt(i) - '0');
                isAdded = true;
            }
        }

        int answer = 0;

        try {
            answer = Integer.parseInt(ans.toString());
        } catch (NumberFormatException e) {
            return answer;
        }
        return answer;
    }
}