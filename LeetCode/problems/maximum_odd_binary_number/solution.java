class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int Count1 = 0;
        int Count0 = 0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                Count1++;
            }else{
                Count0++;
            }
        }
        for(int i =0;i<Count1-1;i++){
            sb.append("1");
        }
        for(int i =0;i<Count0;i++){
            sb.append("0");
        }
        sb.append("1");

        return sb.toString();
        
    }
}