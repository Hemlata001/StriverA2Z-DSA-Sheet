class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // pointer for the position of the next non-zero element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++; // move j to next zero position
            }
        }
    }
}
