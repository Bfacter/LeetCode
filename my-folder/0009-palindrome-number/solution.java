class Solution {
    public boolean isPalindrome(int x) {
        int n =x;
        int r=0;
        if(x<0){
            return false;
        }else{
            while(n>0){
              r=r*10+n%10;
              n=n/10;
            }
            if(r==x){
                return true;
            }else{
                return false;
            }
        }
    }
}
