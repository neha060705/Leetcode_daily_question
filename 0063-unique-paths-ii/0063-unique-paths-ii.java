class Solution {
    int count(int i, int j, int[][] dp,int[][] o){
        if(i>=0 && j>= 0 && o[i][j]==1) return 0;
         if(i<0 || j<0) return 0;
        if(i==0 && j==0) return 1;
       
        if(dp[i][j]!=-1) return dp[i][j];
        int up= count(i-1,j,dp,o);
        int left =count(i,j-1,dp,o);
        return dp[i][j]= up+left;
    }
    public int uniquePathsWithObstacles(int[][] o) {
        int n= o[0].length;
        int m= o.length;
        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return count(m-1,n-1,dp,o);
    }
}