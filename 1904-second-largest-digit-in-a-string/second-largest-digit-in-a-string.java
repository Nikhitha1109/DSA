class Solution {
    public int secondHighest(String s) {
        char[] ch=s.toCharArray();
        int max=-1;
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]>='0' && ch[i]<='9'){
                int digit=ch[i]-'0';
                if(max==-1){
                    max=digit;
                }else if(digit<max){
                    return digit;
                }
            }
        }
        return -1;

    }
}