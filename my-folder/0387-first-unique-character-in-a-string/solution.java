class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        Map<Character, Integer> charIndex= new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            countMap.put(c,countMap.getOrDefault(c,0)+1);
            charIndex.putIfAbsent(c, i);
           }
           for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) {
                return charIndex.get(c);
            }
        }
        return -1;
    }
}
