class Solution {

    public int fib (int n){
        if(n<=1){
            return n;
        }
       int [] map =new int[n+1];
        map[1]=1;
       for(int i=2;i<=n;i++){
            int a=map[i-1];
            int b=map[i-2];
            map[i]=a+b;
       }
       return map[n];
    }
}