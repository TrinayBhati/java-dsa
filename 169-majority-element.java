
 // brute force approach

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        for(int i = 0; i <n ; i++){
            int count = 0;
            for(int j = 0; j<n ; j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}

//=====================================================

// public int majorityElement(int[] nums) {: This is the method signature that takes an integer array nums as input and returns an integer.

// int n = nums.length;: Here, we are getting the length of the input array nums and storing it in an integer variable n.

// for(int i = 0; i <n ; i++){: This is a for loop that runs from index 0 to n-1 of the input array.

// int count = 0;: Here, we are initializing a count variable to keep track of the frequency of each element in the array.

// for(int j = 0; j<n ; j++){: This is an inner for loop that runs from index 0 to n-1 of the input array.

// if(nums[i] == nums[j]){: This is a conditional statement that checks if the element at index i and index j are the same.

// count ++;: If the elements at index i and index j are the same, we increment the count variable by 1.

// if(count > n/2){: This is another conditional statement that checks if the count of the element at index i is greater than half the length of the input array.

// return nums[i];: If the count of the element at index i is greater than half the length of the input array, we return the element at index i.

// }: End of the inner if statement.

// }: End of the inner for loop.

// }: End of the outer for loop.

// return -1;: If no element has a count greater than half the length of the input array, we return -1 to indicate that there is no majority element in the array.