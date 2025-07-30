class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
            int maxlength=0;
            int curr=0;
            for(int num:nums){
                if(num==max){
                    curr++;
                    maxlength=Math.max(maxlength,curr);
                }else{
                    curr=0;
                }
            
            }return maxlength;
    }
}