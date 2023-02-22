class Solution {

    public void reverse(int arr[], int i, int j){
         while(i<j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }   
         
        }
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        // to handle the cases where k is greater than nums.length
                         /*k %= nums.length;  // handle k values that are greater than nums.length or negative
                        if (k < 0) {
                            k += nums.length;
                        }
                        // here we handle the negative cases as well*/

        reverse( nums , 0 ,nums.length - k - 1);
        reverse(nums, nums.length -k , nums.length-1);
        reverse(nums, 0 , nums.length-1);
    }
}

//============================================================

// Reverse the first n-k elements of the array.
// Reverse the remaining k elements of the array.
// Reverse the entire array.
// Let's take an example to understand this. Suppose the input array is [1, 2, 3, 4, 5, 6, 7] and k = 3. We need to rotate the array by 3 positions.

// The first step is to reverse the first n-k elements of the array, which in this case is the first 4 elements. After performing this operation, the array becomes [4, 3, 2, 1, 5, 6, 7].

// The second step is to reverse the remaining k elements of the array, which in this case are the last 3 elements. After performing this operation, the array becomes [4, 3, 2, 1, 7, 6, 5].

// The final step is to reverse the entire array. After performing this operation, the array becomes [5, 6, 7, 1, 2, 3, 4], which is the rotated array.

// The reason why this works is because reversing the first n-k elements and the last k elements effectively shifts them to the end of the array, while reversing the entire array brings the elements in the desired order.