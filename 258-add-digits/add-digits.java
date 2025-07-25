class Solution {
    public int addDigits(int num) {
        int res = 0;
        while(true){
            res += num % 10;
            num /= 10;
            if(num == 0 && res < 10){
                break;
            } else if(num == 0 && res >= 10){
                num = res;
                res = 0;
            }
        }
        return res;
    }
}