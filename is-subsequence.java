class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() ==0) return true;
        if(t.length() == 0) return false;

        int i = 0; int j = 0;
        while(i<s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
               i++;
            }
            j++;
        }
        return i == s.length();
    }
}

//=========================================================================

 // This is a Java implementation of a function that checks if one
 // string (s) is a subsequence of another string (t). It does this by 
 // iterating through both strings with two pointers, one for each 
 // string. The pointer for the first string (i) is incremented only 
 // when a character from the first string is found in the second 
 // string at the same position. If the pointer for the first string 
 // reaches the end of the string, it means that all characters in the
 // first string were found in the second string in the same order and 
 // the function returns true. If the pointer for the first string does
 // not reach the end of the string, it means that not all characters
 // were found in the second string in the same order, and the function 
 // returns false.