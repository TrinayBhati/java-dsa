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