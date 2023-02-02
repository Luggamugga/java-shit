package longSubStr;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder returnStr = new StringBuilder();
       for(int i = 0;i<s.length()-1;i++){
           if(s.charAt(i) != s.charAt(i+1) && (returnStr.indexOf(String.valueOf(s.charAt(i))) == -1 || returnStr.isEmpty())){
                   returnStr.append(s.charAt(i));
               }
       }
       System.out.println(returnStr);
        return returnStr.length();

    }
    public static void main (String[] args){
        Solution asdf = new Solution();
        System.out.println(asdf.lengthOfLongestSubstring("pwwkew"));
    }
}
