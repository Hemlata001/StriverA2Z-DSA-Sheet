class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index<n){
            nums[index] = 0;
            index++;
        }
        
    }
}
// input - 1, 3,0, 7,0,8
//output - 1,3,7,8,0,0
