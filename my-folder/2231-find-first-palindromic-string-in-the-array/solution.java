class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(palin(s)==true){
                return s;
            }

        }
       return "";
    }
    static boolean palin(String s) {
        int l = 0;
        int r = s.length() - 1; 
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false; 
            }
        }
        return true;  
    }
}
