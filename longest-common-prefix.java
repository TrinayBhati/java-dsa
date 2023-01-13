class Solution {
//optimal solution with least t.c
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i =1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() -1);
            }
        }
        return prefix;
    }
}
//===========================================================

class Solution {
// not the best solution but easy to understand, also this might not work for all thetest cases
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0){
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        int n = strs.length - 1;
        String last = strs[n];
        int c = 0;
        while(c < first.length()){
            if(first.charAt(c) == last.charAt(c)){
                c++;
            }
            else{
                break;
            }
            // return c == 0 ? "" : first.substring(0,c);
           
        } 
        if(c==0){
                return "";
            }
            else{
                return first.substring(0,c);
            }
    }
}

//================================================================

// This code is a solution to find the longest common prefix among a group of strings.

// First, it checks if the input array of strings is null or empty. If it is, it returns an empty string.
// Then it sorts the input array of strings alphabetically using the sort() method from the Arrays class
// Next, it assigns the first element of the sorted array to the variable first and the last element of the sorted array to the variable last.
// It then declares a variable c and initializes it to 0.
// Then it uses a while loop to iterate through the first element of the input array.
// Inside the while loop, it checks if the character at index c in both the first and last element of the sorted array is the same. If it is, it increments the value of c. If it's not, it breaks out of the loop.
// Next it checks if the value of c is 0, If it is, it returns an empty string, else it returns the substring of the first element from index 0 to c.
// This solution is not the best one as it only works with the given test cases and can't guarantee a good result for all the test cases.