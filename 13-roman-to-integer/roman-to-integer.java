public class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
            if (prev < curr) {
                total -= prev;
            } else {
                total += prev;
            }
            prev = curr;
        }
        total += prev;
        return total;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
