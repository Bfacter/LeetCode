class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String ans="123456789";
        List<Integer> a = new ArrayList<>();
        int len = ans.length();
        for(int l =2;l<=len;l++){
            for(int si=0;si<=len-l;si++){
                String temp=ans.substring(si,si+l);
                if (!temp.isEmpty()) {
                    int poss = Integer.parseInt(temp);
                    if (poss >= low && poss <= high)
                        a.add(poss);
                }
            }
        }
        return a;
    }
}