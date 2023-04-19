class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length -k]; // for kth smallest element it'd be nums[k-1];
    }
}

//====================================================

// The class contains a public method named findKthLargest that takes an integer array nums and an integer k as input, and returns an integer as output.
// The method uses the Arrays.sort method to sort the input array nums in ascending order.
// The method returns the kth largest element in the array, which is found by accessing the element at index nums.length - k. This is because the sorted array has the largest element at the end of the array, so the kth largest element is located at index nums.length - k.

//====================================================

// if we have to find kth largest but numbers should not repeat like [2, 3, 4, 5, 6, 6, 6, 6] this case output should be 5 then

//====================================================

// find the maximum and the minimum element in array

// code for funding the max
public class Solution {
    public int findMax(int[] nums) {
        int max = Integer.MIN_Value;
        for (int i = 0; i<nums.length(); i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}