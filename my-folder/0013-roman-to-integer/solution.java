class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("I",1);
        h.put("V",5);
        h.put("X",10);
        h.put("L",50);
        h.put("C",100);
        h.put("D",500);
        h.put("M",1000);
        int ans =0;
        for(int i =1;i<s.length();i++){
            String ch1 = String.valueOf(s.charAt(i));
            String ch2 = String.valueOf(s.charAt(i - 1));
                int value1 = h.get(ch1);
                int value2 = h.get(ch2);
                if(value2>=value1){
                    ans+=value2;
                }else if(value2<value1){
                    ans-=value2;
                }

                if(i==s.length()-1){
                    ans+=value1;
                }
        }
        if(s.length()==1){
             String ch1 = String.valueOf(s.charAt(0));
              int value1 = h.get(ch1);
            return value1;
        }else{
           return ans;
        }

       
    }
}
