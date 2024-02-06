class Solution {
    public boolean isAnagram(String s, String t) {
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String sorted1=String.valueOf(a);
        String sorted2=String.valueOf(b);
        return sorted1.equals(sorted2);
    }
}
