import java.util.Arrays;
class Solution{
    public static void leftrotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        int[] temp=new int[d];
        //we r storing first d elements in temp
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        //we r shifting remaining elements to left (except d elements)
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        // we r storing temp(d) elemnts at the end
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int d=2;
        leftrotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
