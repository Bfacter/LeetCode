class Solution {
    public int hammingDistance(int x, int y) {
        int f = x^y;
        int n =0;
        while(f>0){
            n++;
            f=f&(f-1);
        }
        return n;
        
    }
}