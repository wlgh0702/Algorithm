import java.util.*;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }

       Queue<Character> queue = new ArrayDeque<>();

       for(int i = 0; i < s.length(); i++) {
           if(!queue.isEmpty()) {
               if(s.charAt(i) == '(') {
                   queue.add(s.charAt(i));
               } else {
                   queue.poll();
               }
           } else {
               if(s.charAt(i) == '(') {
                   queue.add(s.charAt(i));
               } else {
                   return false;
               }
           }
       }
    
        return queue.isEmpty();
    }
}