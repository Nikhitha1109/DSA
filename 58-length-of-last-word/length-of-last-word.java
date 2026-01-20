class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim(); //extra spaces removed using bulitin functon of string in java
        int c=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                c++;
            }else{
                break;
            }
        }return c;
    }
}