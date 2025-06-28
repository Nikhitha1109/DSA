class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxl=0;
        int start=0;
        int end=0;
        HashSet<Character> set=new HashSet<>();
        while(end<n){
            char c=s.charAt(end);
            if(!set.contains(c)){
                set.add(c);
                end++;
                maxl=Math.max(maxl,end-start);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }return maxl;
    }
}