class Solution {
    public int search(int[] nums, int target) {
        int f = 0;
        int l = nums.length -1;
        int mid = 0;
       while (f <= l){
            mid = (f + l)/2;
            if(nums[mid] == target){
                return mid;
            } 
            else if(nums[mid]>target){
                l = mid -1;
            }
            else{
                f = mid +1;
            }
            
        }
        return -1;
    }
}

//======================================================
// First, we declare the class and method signature for the solution to the problem.

// We initialize f and l as the first and last indices of the input array, respectively.

// We also initialize mid to zero, but we will calculate its value in the loop.

// We use a while loop to perform binary search on the input array. The loop continues as long as f is less than or equal to l.

// In each iteration of the loop, we calculate the middle index mid as the average of f and l.

// We compare the value at the middle index nums[mid] to the target value target.

// If nums[mid] is equal to target, we return the middle index mid.

// If nums[mid] is greater than target, we search the left half of the array by updating l to mid - 1.

// If nums[mid] is less than target, we search the right half of the array by updating f to mid + 1.

// If we exit the loop without finding the target value, we return -1.