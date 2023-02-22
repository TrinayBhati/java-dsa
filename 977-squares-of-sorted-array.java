class Solution {
    // not efficient

    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[i] *= nums[i]; // same as nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

//==================================================================

// square the elements and then sort them uses O(nlogn) time complexity

//==============================================================

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int i = 0; 
        int j = n-1;
        for(int k = n-1; k>=0; k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[k] = nums[i] *  nums[i];
                i++;
            }
            else{
                result[k] = nums[j] *  nums[j];
                j--;
            }
        }
        return result;
    }
}

//==================================================================

// This solution uses two pointers to compare the absolute value of the numbers at the start and end of the input array.
// It then squares the larger number and stores it in a new array at the end of the array, moving the appropriate pointer
// to the next number in the input array. The resulting array is sorted in ascending order since the original input
// array was already sorted.
