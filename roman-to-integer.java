class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> myMap = new HashMap<>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);

        int n = s.length() -1;
        char ch = s.charAt(n);
        int result = myMap.get(ch);

        for(int i = n-1; i>=0;i--){
            if(myMap.get(s.charAt(i))<myMap.get(s.charAt(i+1)) ){
                result = result - myMap.get(s.charAt(i));
            }
            else{
                result = result + myMap.get(s.charAt(i));
            }
        }
        return result;
    }
}

//=======================================================================

// This code is a solution to convert a Roman numeral to an integer.

// It creates a HashMap, myMap, that maps Roman numerals to their corresponding integer values using the put() method.
// It assigns the last character of the input string, s, to the variable ch, and gets the corresponding integer value from the myMap using the get() method, and assigns it to the variable result.
// It uses a for loop to iterate through the input string, s, starting from the second-last character and going backwards.
// Inside the loop, it checks if the current character's integer value is less than the next character's integer value, if it is, it substract the current character's integer value from the result, otherwise it adds it.
// After the loop, it returns the result which is the converted integer of the Roman Numeral
// This solution is based on the Roman numeral's subtraction rule, where if a smaller numeral is before a larger numeral, it is subtracted from the larger numeral.