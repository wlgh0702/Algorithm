class Solution {
    public int removeElement(int[] nums, int val) {
        int endIndex = nums.length - 1;
        int startIndex = 0;
        int count = 0;
        
        while(startIndex <= endIndex) {
            
            if(nums[startIndex] == val) {
                
                int temp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = temp;
                endIndex--;
                
            } else {
                
                startIndex++;
                count++;
            }
        }
        return count;
    }
}