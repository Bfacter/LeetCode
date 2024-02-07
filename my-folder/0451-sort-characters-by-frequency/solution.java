class Solution {
    public String frequencySort(String s) { 
        StringBuilder answer = new StringBuilder();
        Map<Character,Integer> hm=new HashMap<>();
        for(char c :s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //fir humne ek list bnyi
        List<Character> list = new ArrayList(hm.keySet());
        list.sort((ob1,ob2)->hm.get(ob2)-hm.get(ob1));
        for(char ch:list){
            for(int i =0;i<hm.get(ch);i++){
                answer.append(ch);
            }
        }
       return answer.toString();
    }
}
