class Solution {
    public boolean canJump(int[] nums) {
        // 이런 문제는 Greedy Algorithm 사용
        int reached = 0;

        for(int i = 0; i < nums.length; i++) {
            if(reached < i) return false;
            reached = Math.max(reached, i + nums[i]);
        }
        return true;
    }
}