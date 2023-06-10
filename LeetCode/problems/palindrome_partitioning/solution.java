class Solution {
    public List<List<String>> partition(String s) {
        List<String> a = new ArrayList<>();
		List<List<String>> b = new ArrayList<>();
		Partition(s,a,b);
		return b;

    }
    public static void Partition(String ques,List<String> a,List<List<String>> b) {
		if(ques.length()==0) {
		
			b.add(new ArrayList<>(a));
            return;
		}
		
		for(int cut=1;cut<=ques.length();cut++) {
			String s=ques.substring(0,cut);
			if(Palindrome(ques.substring(0,cut))==true) {
				a.add(s);
			Partition(ques.substring(cut),a,b);
			a.remove(a.size()-1);}
		}
	}
	 public static boolean Palindrome(String str){
	        int i=0;
	        int j=str.length()-1;
	        while(i<j){
	            if(str.charAt(i)!=str.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }

}