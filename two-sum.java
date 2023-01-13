class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];
        for(int i = 0; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(target == nums[i]+nums[j]){
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
                
            }
        }
        return sum;
    }
}

//====================================================================

// This code is a solution to find the indices of two numbers in an array of integers that add up to a given target.

// It declares a variable, sum, which is an array of two integers.
// It uses a nested for loop to iterate through the input array of integers, nums. The outer loop iterates through all elements and the inner loop iterates through all elements after the outer loop's current element.
// Inside the nested loops, it compares the current element at index i with the current element at index j and checks if the sum of these two elements is equal to the target.
// If it is, it assigns the indices i and j to the first and second elements of the sum array respectively, and returns the sum array.
// if the solution doesn't find any match, it returns the empty sum array
// This solution checks all possible pairs of elements and returns the indices of the elements that sum up to the target. It has a Time Complexity of O(n^2) due to the nested for loops.