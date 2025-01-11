class Solution {
    public boolean isMatch(String s, String p) {
        return isMatchHelper(s, p, 0, 0, new Boolean[s.length() + 1][p.length() + 1]);
    }

    private boolean isMatchHelper(String s, String p, int i, int j, Boolean[][] memo) {
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        if (j == p.length()) {
            return memo[i][j] = (i == s.length());
        }
        boolean firstMatch = (i < s.length() &&
                              (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            memo[i][j] = isMatchHelper(s, p, i, j + 2, memo) ||
                         (firstMatch && isMatchHelper(s, p, i + 1, j, memo));
        } else {
            memo[i][j] = firstMatch && isMatchHelper(s, p, i + 1, j + 1, memo);
        }
        return memo[i][j];
    }
}