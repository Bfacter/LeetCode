class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ga=new HashMap<>();
        for(String s:strs){
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if(!ga.containsKey(sortedStr)){
                ga.put(sortedStr,new ArrayList<>());
            }
            ga.get(sortedStr).add(s);
        }
        return new ArrayList<>(ga.values());

    }
}
