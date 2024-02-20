class Solution {
    public boolean isPalindrome(String s) {
        String c = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return palin(c);
    }

    private boolean palin(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
