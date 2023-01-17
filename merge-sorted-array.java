class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--; 
                i--; //updating pointer for further comparisons
            }else{
                // element at j index of nums2 array is greater than the element at i index of nums1 array 
                // or there is no element left to compare with the nums1 array 
                // and we just have to push the elements of nums2 array in the nums1 array.
                nums1[k] = nums2[j];
                k--; 
                j--; //updating pointer for further comparisons
            }
        }
    }
}

//===========================================================================

// This code is a solution to the problem of merging two sorted arrays, nums1 and nums2, into a single sorted array, nums1. The function takes in four parameters: the first array, nums1, its length, m, the second array, nums2, and its length, n.

// The function starts by initializing three pointers: i, j, and k. i is set to m-1, j is set to n-1, and k is set to the last position of the nums1 array. These pointers will be used to traverse and compare elements from both arrays.

// The function then enters a while loop that continues until all elements from the nums2 array have been compared. Inside the loop, the code compares the element at the i index of nums1 with the element at the j index of nums2. If the element at the i index of nums1 is greater than the element at the j index of nums2, the element at the i index of nums1 is placed at the k index of nums1, and the i and k pointers are decremented. If the element at the i index of nums1 is less than or equal to the element at the j index of nums2, the element at the j index of nums2 is placed at the k index of nums1, and the j and k pointers are decremented.

// The while loop continues until the j pointer reaches the beginning of the nums2 array, at which point all elements from nums2 have been compared and placed in the correct position of nums1, resulting in a single sorted array.