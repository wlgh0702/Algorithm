import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(s.charAt(i) == ')' && stack.size() > 1) {
                stack.pop();
                stack.pop();
            }
        }
        
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}