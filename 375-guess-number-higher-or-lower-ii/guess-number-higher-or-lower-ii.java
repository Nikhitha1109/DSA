class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp=new int[n+1][n+1];
        return calcost(1,n,dp);
    }
    public int calcost(int start,int end,int[][] dp){
        if(start>=end) return 0;
        if(dp[start][end]!=0) return dp[start][end];
        int mincost=Integer.MAX_VALUE;
        for(int guess=(start+end)/2;guess<=end;guess++){
            int cost = guess + Math.max(calcost(start,guess-1,dp),calcost(guess+1,end,dp));
            mincost=Math.min(mincost,cost);
        }
        dp[start][end]=mincost;
        return mincost;
    } 
}