import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> ponketmon = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            ponketmon.put(nums[i], ponketmon.getOrDefault(nums[i], 0) + 1);
        }
        return ponketmon.size() >= nums.length / 2? nums.length / 2 : ponketmon.size();
    }
}