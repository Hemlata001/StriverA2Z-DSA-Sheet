class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int first = nums[0]; // store the first element

        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1]; // shift each element to the left
        }

        nums[n - 1] = first; // move first element to last

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
