class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        for(int i=0;i<k;i++){
            maxsum+=nums[i];
        }
        double wmaxsum=maxsum;
        for(int i=k;i<nums.length;i++){
            wmaxsum=wmaxsum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,wmaxsum);
        }
        return maxsum/k;
    }
}