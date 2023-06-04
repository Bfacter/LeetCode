class Solution {
    public List<String> generateParenthesis(int n) {
        List <String>list=new ArrayList<>();
		Print("",0,0,n,list);
        return list;
    }
    public static void Print(String ans,int open,int close,int n,List <String>list) {
		while(open==n&&close==n) {
			list.add(ans);
			return;
			
		}
		if(open<n) {
			Print(ans+"(",open+1,close,n,list);
		}if(close<open) {
			Print(ans+")",open,close+1,n,list);
		}
		
	}
}