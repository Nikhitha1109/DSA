
class Solution {
    public void reverseString(char[] s) {
        StringBuilder s1 = new StringBuilder();

        for(int i = s.length - 1; i >= 0; i--) {
            s1.append(s[i]);
        }

        for(int i = 0; i < s.length; i++) {
            s[i] = s1.charAt(i);
        }
    }
}