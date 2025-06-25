import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int maxs=nums[0],mins=nums[0],result=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxs;
                maxs=mins;
                mins=temp;
            }
        maxs=Math.max(curr,maxs*curr);
        mins=Math.min(curr,mins*curr);
        result=Math.max(result,maxs);
        }
        return result;

    }
}