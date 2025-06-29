class Solution {
    public static int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        boolean found = false;
        int secondMaxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMaxi && nums[i] < maxi) {
                secondMaxi = nums[i];
                found = true;
                
            }
        }

        return found ?secondMaxi : -1;
    }
    public static void main(String[] args){
        int[] nums = {10,10,10,10};
        System.out.println(secondLargestElement(nums));
    }
}  
