class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j]==val){
                j++;
            }
            else{
                nums[i] = nums[j];
                i++;j++;
            }
        }
        return i;
    }
}

//=====================================================================

// Create two pointers, i and j.
// Initialize i to 0, which will keep track of the end of the sub-array that does not contain the val.
// Initialize j to 0, which will iterate over the entire nums array.
// In the while loop, check if the current element (nums[j]) is equal to val.
// If it is equal, increment j and move on to the next element.
// If it is not equal, then copy the current element (nums[j]) to the position i and increment both i and j by 1.
// After the while loop, return i as the new length of the modified array.