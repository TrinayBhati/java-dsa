class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(!myMap.containsKey(nums[i])){
                myMap.put(nums[i],i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}

//=====================================================================

// This code is a solution to determine whether an array of integers contains any duplicate elements.

// It creates a HashMap, myMap, that maps integers to their index in the array.
// It uses a for loop to iterate through the input array of integers, nums.
// Inside the loop, it uses the containsKey() method of the HashMap to check if the current integer is already in the map.
// If it's not, it adds the current integer and its index to the map using the put() method.
// If it is, it returns true, indicating that a duplicate element has been found.
// After the loop, if no duplicates are found, it returns false.
// This solution uses a HashMap to store the elements of the array as keys, and the index of the element as the value, in this way when the current element is already in the map it means that it's a duplicate and returns true.