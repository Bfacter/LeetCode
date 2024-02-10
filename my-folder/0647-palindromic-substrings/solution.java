class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans=0;
        for(int i = 0;i< n;i++){
            int even = palin(s,i,i+1);
            int odd = palin(s,i-1,i+1);
            ans += even+odd+1;

        }
        return ans;
    }
    static int palin(String s,int left,int right){
        int count=0;
        while(left>=0&&right<s.length()&&s.charAt(left--)==s.charAt(right++)){
         count++;
        }
        return count;
    }
}
