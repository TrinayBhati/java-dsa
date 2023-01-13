class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}

//========================================================

// This code is a solution to calculate the running sum of an array of integers.

// It uses a for loop to iterate through the input array of integers, nums.
// Inside the loop, it starts from the second element of the array and it adds the current element with the previous one, and assigns the result to the current element.
// After the loop, it returns the modified array, which now contains the running sum of its elements.
// This solution uses a for loop to iterate over the array, starting from the second element, for each iteration it adds the current element with the previous one, this way at the end of the loop, the elements of the array will contain the running sum of all the previous elements.