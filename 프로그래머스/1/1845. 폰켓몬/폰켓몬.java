import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int maxSize = nums.length / 2;
        int count = 0;
        Map<Integer, Integer> myBag = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(count == maxSize) {
                break;
            }
            
            if(!myBag.containsKey(nums[i])) {
                myBag.put(nums[i], myBag.getOrDefault(nums[i], 0) + 1);
                count++;
            }
        }
        int answer = myBag.size();
        return answer;
    }
}