class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversed;
        
        int[] lps = computeLPS(combined);
        
        int longestPrefix = lps[lps.length - 1];
        
        String suffix = s.substring(longestPrefix);
        String prefix = new StringBuilder(suffix).reverse().toString();
        
        return prefix + s;
    }
    
    private int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length > 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}
