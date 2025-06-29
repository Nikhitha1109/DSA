class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];//storing individally nums value
            if(map.containsKey(num)){//if num conatin
                int prev=map.get(num);//storing num in prev
                if(i-prev<=k){//i=index,prev num ,k val
                    return true;
                }
            }
            map.put(num,i);//insert the number
        }
        return false;
    }
}