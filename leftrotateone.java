
class Solution{
    public static void leftrotateone(int[] num){
        if(num.length==0){
            return ;
        }
        int first=num[0];
        for(int i=0;i<num.length-1;i++){
            num[i]=num[i+1];
        }
        num[num.length-1]=first;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        leftrotateone(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
