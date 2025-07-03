public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("sadbutsad", "sad"));    // Output: 0
        System.out.println(sol.strStr("leetcode", "leeto"));   // Output: -1
    }
}
