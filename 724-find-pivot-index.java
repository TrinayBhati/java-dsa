// named as equilibreum index on geeks for geeks

// Runtime: 1 ms, faster than 92.94% of Java online submissions for Find Pivot Index.
// Time Complexity : O(n)
class Solution {
    public int pivotIndex(int[] nums) {
        // Initialize total sum of the given array...
        int totalSum = 0;
        // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
        int leftsum = 0;
        // Traverse the elements and add them to store the totalSum...
        for (int ele : nums)
            totalSum += ele;
        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            // sum to the left == leftsum.
            // sum to the right === totalSum - leftsum - nums[i]..
            // check if leftsum == totalSum - leftsum - nums[i]...
            if (leftsum * 2 == totalSum - nums[i])
                return i;       // Return the pivot index...
        return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }
}

//==========================================================================

class Solution {
    public int pivotIndex(int[] nums) {
      if(nums.length == 0) return - 1;
      int leftSum = 0, rightSum = 0;
      for(int num : nums) 
          rightSum += num;

      for(int i = 0; i < nums.length; i ++) {
        rightSum -= nums[i];
        if(rightSum == leftSum) return i;
        leftSum += nums[i];
      }
      return - 1;
    }
}

//================================================================

// The code is a solution to find the "pivot index" in an array of integers. A pivot index is an index in the array where the sum of the numbers to the left of that index is equal to the sum of the numbers to the right of that index.

// First, the code checks if the input array is empty. If it is, it returns -1.
// Then, it declares two variables, leftSum and rightSum, and initializes them as 0.
// It then uses a for-each loop to add up all the numbers in the input array and store the total in the rightSum variable.
// Next, it uses another for loop to iterate through the input array. For each index, it subtracts the number at that index from the rightSum variable, and then checks if the rightSum is equal to the leftSum variable.
// If it is, then the current index is the pivot index, so it returns that index.
// If it does not find a pivot index, it returns -1 at the end.