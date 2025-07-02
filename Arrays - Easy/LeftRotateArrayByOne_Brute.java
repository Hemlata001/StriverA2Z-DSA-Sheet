class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];

        // Copy elements from index 1 to n-1 into temp starting from 0
        for (int i = 1; i < n; i++) {
            temp[i - 1] = nums[i];
        }

        // Place the first element of nums at the end of temp
        temp[n - 1] = nums[0];

        // Copy temp back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
