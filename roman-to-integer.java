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