class Solution {
    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n
        int[] temp = new int[n];

        // Copy elements from index k to end into the beginning of temp
        for (int i = k; i < n; i++) {
            temp[i - k] = nums[i];
        }

        // Copy first k elements to the end of temp
        for (int i = 0; i < k; i++) {
            temp[n - k + i] = nums[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

        // Optional: Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
