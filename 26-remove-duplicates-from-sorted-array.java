class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 0; i< nums.length -1 ; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}

//==========================================================

// This code is a solution to remove duplicates from an array of integers and return the new length of the array.

// It declares a variable j and initializes it to 1.
// It uses a for loop to iterate through the input array of integers.
// Inside the for loop, it compares the current element at index i with the next element at index i+1.
// If the two elements are not the same, it assigns the next element to the current position at index j, and increments the value of j.
// If the two elements are the same, it does not do anything and proceeds to the next iteration of the loop.
// After the loop finishes, it returns the value of j, which represents the new length of the array after duplicates have been removed.
// This solution modifies the input array in place and returns the new length of the array after removing the duplicates, it does not return the new array without duplicates.