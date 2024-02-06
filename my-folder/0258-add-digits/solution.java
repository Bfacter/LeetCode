class Solution {
    public int addDigits(int num) {
        int count =0;
        return sum(num,count);
    }
    static int sum(int n,int c){
        while(n!=0){
            c=c+n%10;
            n=n/10;
        }
        if(c>9){
            return sum(c,0);
        }else{
            return c;
        }
    }
}
