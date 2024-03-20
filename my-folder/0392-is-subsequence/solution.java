class Solution {
    public boolean isSubsequence(String s, String t) {
   char[] a = s.toCharArray();
		char [] b = t.toCharArray();

		int i = 0;
		int j = 0;
		
		while(i<a.length&&j<b.length) {
			while(j < b.length&&b[j]!=a[i]) {
				j++;
			}if(j < b.length&&a[i]==b[j]){
			i++;
			j++;}
		}
		if(i==a.length) {
			return true;}
		else {
		    return false;
				
		}
	}
}
