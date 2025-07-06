// leetcode - 268. Missing Number
class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
        }
        int sumNaturalNumber = (n*(n+1))/2;
        return sumNaturalNumber - sum;
        
    }
}
// tc = O(n)
// sc = O(1)
