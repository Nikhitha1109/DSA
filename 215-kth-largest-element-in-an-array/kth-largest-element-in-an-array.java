class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(k>0){
                pq.offer(arr[i]);
                k--;
            }else if(pq.peek()<arr[i]){
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        return pq.peek();
    }
}