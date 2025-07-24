class Solution {
    static {
        for (int i = 0; i < 200; i++) {
            firstUniqChar("a");
        }
    }
    public static int firstUniqChar(String s) {
        int[] charset = new int[26];
        int[] indices = new int[26];
        int ind, i = 0;
        i = 0;
        while (i < s.length()) {
            ind = s.charAt(i) - 'a';
            charset[ind] += 1;
            if (indices[ind] == 0)
                indices[ind] = i;
            i++;
        }
        ind = Integer.MAX_VALUE;
        for (i = 0; i < 26; i++) {
            if (charset[i] == 1 && indices[i] < ind)
                ind = indices[i];
        }
        return ind == Integer.MAX_VALUE ? -1 : ind;


    }
}