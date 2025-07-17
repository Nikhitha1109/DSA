class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int[] digits=new int[s.length()];
        for(int i=0;i<s.length();i++){
            digits[i]=s.charAt(i)-'0';
        }
        int maxProduct = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                int product = digits[i] * digits[j];
                maxProduct = Math.max(maxProduct, product);
    }
}
    return maxProduct;
    }
}