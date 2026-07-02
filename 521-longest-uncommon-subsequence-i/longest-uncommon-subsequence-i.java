class Solution {
    public int findLUSlength(String a, String b) {
        int m=-1;
        if(!a.equals(b)){
            m=Math.max(a.length(),b.length());
        }
        return m;
    }
}