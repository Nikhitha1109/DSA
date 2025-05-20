class Solution {
    public static int largestElement(int[] nums) {
    int N=nums[0];
    for (int i=1;i<nums.length;i++){
        if (nums[i]>N)
        {
            N=nums[i];
        }
    }
    return N;
    }
    
public static void main(String[] args){
    int[] nums={3, 3, 6, 1};
    int[] nums1={3, 3, 0, 99, -40};
    int[] nums2={-4, -3, 0, 1, -8};
    
    System.out.println(largestElement(nums));
    System.out.println(largestElement(nums1));
    System.out.println(largestElement(nums2));
}
}
