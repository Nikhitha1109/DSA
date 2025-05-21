class Solution{
    public boolean sorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,1,2};
        int[] nums1={1,2,3,4,5};
        Solution sol=new Solution();
        System.out.println(sol.sorted(nums));
        System.out.println(sol.sorted(nums1));
    }
}
