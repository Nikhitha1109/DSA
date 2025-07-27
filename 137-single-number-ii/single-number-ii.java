class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<32;i++){
            int bitcount=0;
            for(int num:nums){
                if((num>>i &1)==1){
                    bitcount++;
                }
            }
            if(bitcount%3!=0){
                result |=(1<<i);
            }
        }
        return result;
    }
}