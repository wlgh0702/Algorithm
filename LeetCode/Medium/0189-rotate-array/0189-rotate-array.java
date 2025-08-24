class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        replace(nums, 0, nums.length - 1);
        replace(nums, 0, k - 1);
        replace(nums, k, nums.length - 1);
    }

    private void replace(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}