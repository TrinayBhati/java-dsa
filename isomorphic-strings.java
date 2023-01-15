class Solution{
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character,Character> myMap = new HashMap<>();

		for (int i = 0; i<s.length() ; i++ ) {
			char a = s.charAt(i);
			char b = t.charAt(i);

			if(myMap.containsKey(a)){
				if(!myMap.get(a).equals(b)){
					return false;
				}
			}
			else{
				if(myMap.containsValue(b)){
					return false;
				}else{
					myMap.put(a,b);
				}
			}
		}
		return true;
	}
}

//==========================================================================

// This code defines a class called "Solution" that contains a method called "isIsomorphic". This method takes in two strings, "s" and "t", as input and returns a boolean value indicating whether or not the two strings are isomorphic.

// The method uses a HashMap called "myMap" to keep track of the mapping between the characters in the two strings. The method iterates through each character in the first string, "s", and compares it to the corresponding character in the second string, "t".

// The HashMap "myMap" is first checked if the current character in "s" has already been mapped to a character in "t", if it has, it will check if the mapped character is equal to the corresponding character in "t", if they are not equal, the method will return false.

// If the current character in "s" has not yet been mapped, it will check if the corresponding character in "t" has already been mapped to by another character in "s", if it has, the method returns false. If it hasn't, the current character in "s" and "t" will be added to the HashMap as a mapping.

// After iterating through all the characters in both strings, if the method has not yet returned false, it means that the two strings are isomorphic, so the method will return true.