class Solution {
    public int subtractProductAndSum(int n) {
        return prod(n)-sum(n);
    }
    static int prod(int m){
          if(m==0){
              return 1;
          }
          int x=m%10;
          return x*prod(m/10);
    }
    static int sum(int m){
        if(m==0){
              return 0;
          }
          int x=m%10;
          return x+sum(m/10);
    }
}