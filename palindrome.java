
//palindrome 
class Solution {
    public boolean isPalindrome(int x) {

        // Two-Pointer Approach
        
        
        // Step1: Convert the integer into string.
        // Step2: Point two variable at first and last indices of the string.
        // Step3: Compare the characters at those indices.
        // Step4: Update the variables.

        String s = String.valueOf(x);  // convert integer to string.

        int i = 0;                     // i will initially point to first index.
        int j = s.length() - 1;        // j will initially point to last index. 
        
        // i and j are opposite indices of the string. 
        // 1. If 'i' is first then 'j' is last.
        // 2. Similarly, if 'i' is second then 'j' is second last index of s.
        // This is because they are updated simultaneously.

        while(i <= j)                   // loop will break when i and j cross each other
        {
            if(s.charAt(i) != s.charAt(j))  // characters at indices i and j will be compared.
                // If the characters are unequal then false will be returned.
                return false;
            i++;                                // i is incremented.
            j--;                                // j is decremented.
        }
        
        // If loop ends without returning false, it means that every 'ith' character
        // is equal to every 'jth' character. Thus, the number is palindrome.
        // Hence, return true;
        
        return true;
        
    }
}

//==================================================================================
 
//  This code is a solution to determine whether an integer is a palindrome.

// It converts the input integer to a string using the String.valueOf(x) method.
// It declares two variables i and j, and initializes i to 0 and j to the last index of the string.
// It uses a while loop that runs until i is less than or equal to j.
// Inside the while loop, it compares the characters at indices i and j of the string, if they are not equal, it returns false, indicating that the number is not a palindrome.
// If the characters are equal, it increments i and decrements j.
// After the while loop, if it didn't return false, it means that the number is a palindrome, so it returns true.
// This solution uses the two-pointer approach, where two pointers are pointing to opposite sides of the string and moving towards the middle, comparing the characters at each step. If all the characters are equal on both sides, it means that the number is a palindrome.


//palindrome, not the question from leetCode

 public class java {
    public static void main(String[] args) {

        String str = "madam";
        int n = str.length();

        int s = 0;
        int e = n-1;

        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                break;
            }
            s++;
            e--;
        }
        if(s>=e){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}
