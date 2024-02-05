class Solution {
    public void reverseString(char[] s) {
        int n =s.length;
        int i =0;
        int j = n-1;
        if(n==0){
            return;
        }
        while(j>i){
          char temp = s[j];
          s[j]=s[i];
          s[i]=temp;
          i++;
          j--;
        }
}
}
