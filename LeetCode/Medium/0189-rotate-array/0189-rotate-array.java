import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) return;

        Map<Integer, Integer> map = new HashMap<>();

        while(k > nums.length) {
            k -= nums.length;
        }

        for(int i = 0; i < nums.length; i++) {
            if(i + k >= nums.length) {
                map.put(i + k - nums.length, nums[i]);
            } else {
                map.put(i + k, nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = map.get(i);
        }
    }
}