class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            int mx=0;
            maxreach=Math.max(maxreach,i+nums[i]);
        }
        return true;
    }
}