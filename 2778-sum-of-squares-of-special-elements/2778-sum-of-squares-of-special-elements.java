class Solution {
    public int sumOfSquares(int[] nums) {
        int sq=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            int sum =0;
            if(n%(i+1)==0){
                sum += nums[i];
                sq = sq+ sum*sum;
            }
        }
        return sq;
        
    }
}