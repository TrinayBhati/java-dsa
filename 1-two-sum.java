class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[] = new int[2];
        for(int i = 0; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(target == nums[i]+nums[j]){
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
                
            }
        }
        return sum;
    }
}

//====================================================================

// This code is a solution to find the indices of two numbers in an array of integers that add up to a given target.

// It declares a variable, sum, which is an array of two integers.
// It uses a nested for loop to iterate through the input array of integers, nums. The outer loop iterates through all elements and the inner loop iterates through all elements after the outer loop's current element.
// Inside the nested loops, it compares the current element at index i with the current element at index j and checks if the sum of these two elements is equal to the target.
// If it is, it assigns the indices i and j to the first and second elements of the sum array respectively, and returns the sum array.
// if the solution doesn't find any match, it returns the empty sum array
// This solution checks all possible pairs of elements and returns the indices of the elements that sum up to the target. It has a Time Complexity of O(n^2) due to the nested for loops.

//===========================================================================

class Solution {

    // solution using hashmap

    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int index1 = -1;
        int index2 = -1;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            myMap.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++ ){
            int diff = target - nums[i];
            if(myMap.containsKey(diff) && i != myMap.get(diff) ){
                index1 = i;
                index2 = myMap.get(diff);
                break;
            }
        }
        result[0] = index1;
        result[1] = index2;
        return result;
    }
}

//========================================================================

// This code is a solution for the problem of finding two elements in an array that add up to a specific target value.

// It creates an empty HashMap "map" that stores the elements of the input array as keys and their corresponding indices as values.

// It then iterates through the input array, for each element it calculate the complement (diff) which is the target minus the current element.

// Then it checks if the map already contains the complement, if so it means we found a match and the function returns the current index and the index of the complement stored in the map.

// It is a simple solution that uses HashMap to store elements and their indices, and then it iterates over the array once, making the time complexity O(n) and space complexity O(n).