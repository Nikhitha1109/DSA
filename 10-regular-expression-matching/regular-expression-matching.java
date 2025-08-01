class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] memo = new Boolean[s.length() + 1][p.length() + 1];
        return isMatchHelper(s, p, 0, 0, memo);
    }

    private boolean isMatchHelper(String s, String p, int sIndex, int pIndex, Boolean[][] memo) {
        if (memo[sIndex][pIndex] != null) return memo[sIndex][pIndex];

        if (pIndex == p.length()) {
            return memo[sIndex][pIndex] = (sIndex == s.length());
        }

        boolean firstMatch = (sIndex < s.length() &&
                             (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.'));

        boolean result;

        if (pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*') {
            result = isMatchHelper(s, p, sIndex, pIndex + 2, memo) ||
                     (firstMatch && isMatchHelper(s, p, sIndex + 1, pIndex, memo));
        } else {
            result = firstMatch && isMatchHelper(s, p, sIndex + 1, pIndex + 1, memo);
        }

        memo[sIndex][pIndex] = result;
        return result;
    }
}
