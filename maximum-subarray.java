class Solution {
    // this solution takes time complexity of 
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i< nums.length; i++) {
            int currSum = 0;

            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }
}

//========================================================================

class Solution {
    // kadane algorithm
    public int maxSubArray(int[] nums) {
        
        int sum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum =0;
            }
        }
        return maxSum;
    }   
}

