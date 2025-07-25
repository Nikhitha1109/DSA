class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str==null || str.length==0) return "";
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return"";
            }
        } return prefix;
    }
}