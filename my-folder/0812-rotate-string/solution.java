class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int k = 0;k<s.length();k++){
            char[] a1 = s.toCharArray();
            int len = s.length();
            reverse(a1,len-k,len-1);
		    reverse(a1, 0, len-k-1);
            reverse(a1, 0,len-1);
            String a2 = new String(a1);
            if(a2.equals(goal)){
                return true;
            }
        }

        return false;
    }
    static void reverse (char[]a,int i,int j) {
		while(i<j) {
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
            j--;
		}
}
}
