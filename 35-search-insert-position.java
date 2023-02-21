class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = 0; 
        int l = nums.length - 1;
        while(f  <= l){ 
            // incorrect output if I use only lesser than 
            int mid = f + (l-f)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                f = mid + 1;
            }
            else{
                l = mid-1;
            }
        }
        return f;
    }
}

//========================================================

// Initialize low to 0 and high to the last index of the array.
// While low <= high, calculate the mid index as (low + high) / 2.
// If the element at mid index is equal to the target, return mid.
// If the element at mid index is less than the target, search the right half by setting low = mid + 1.
// If the element at mid index is greater than the target, search the left half by setting high = mid - 1.
// If the loop terminates, the target is not in the array, return low which is the index where the target would have been inserted.