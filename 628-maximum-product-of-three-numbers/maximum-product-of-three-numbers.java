class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro1=nums[0]*nums[1]*nums[nums.length-1];
        int pro2=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        return pro1>pro2?pro1:pro2;
    }
}