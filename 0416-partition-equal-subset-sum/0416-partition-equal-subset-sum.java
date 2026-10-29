class Solution {
    boolean subsetSum(int idx, int[] arr,int target,int[][] dp ){
        if(target==0) return true;
        if(idx == 0 ) return (arr[0]==target);
        if(dp[idx][target]!=-1) return dp[idx][target]==1;
        
        boolean notTake = subsetSum(idx-1, arr, target, dp);
        boolean take = false;

        if(arr[idx]<=target){
            take = subsetSum(idx-1, arr, target-arr[idx],dp);
        }
        dp[idx][target]=take || notTake ? 1:0;
        return dp[idx][target]==1;

        
    }
    public boolean canPartition(int[] nums) {
        int totsum =0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            totsum+= nums[i];
        }
        if(totsum%2!=0) return false;
        int target = totsum/2;
        int[][] dp = new int[n][target+1];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }

        return subsetSum(n-1, nums, target,dp);
    }
}