class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
        if(n==1)
            return 0;
        if(arr[0]==0)
            return -1;
        int maxreach=0;
        int curr=0;
        int jump=0;
        for(int i=0;i<n;i++){
            maxreach=Math.max(maxreach,i+arr[i]);
            if(maxreach>=n-1){
                return jump+1;
            }
            if(i==curr){
                if(i==maxreach){
                    return -1;
                }else{
                    jump++;
                    curr=maxreach;
                }
            }
        }
        return -1;
    }
}