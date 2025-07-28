class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)return 1;
        int c=0;
        int a[]=new int[128];
        for(char ch:s.toCharArray()){
            a[ch]++;
        }
        boolean o=false;
        for(int i:a){
            if(i%2!=0){
                c+=(i-1);
                o=true;
            }else{
                c+=i;
            }
        }
        if(o)return c+1;
        return c;
    }
}