class Solution {
    public int maximum69Number (int num) {
        char[] digits=String.valueOf(num).toCharArray();
        int max=num;
        for(int i=0;i<digits.length;i++){
            char original=digits[i];
            digits[i]=(digits[i]=='6')? '9':'6';
            int newmax=Integer.parseInt(new String(digits));
            max=Math.max(max,newmax);
            digits[i]=original;
        }return max;
    }
}