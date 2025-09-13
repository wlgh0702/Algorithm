import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> ponketmon = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            ponketmon.put(nums[i], ponketmon.getOrDefault(nums[i], 0) + 1);
        }
        if(ponketmon.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = ponketmon.size();
        }
        return answer;
    }
}