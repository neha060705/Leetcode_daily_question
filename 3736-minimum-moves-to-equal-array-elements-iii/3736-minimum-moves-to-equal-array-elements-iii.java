class Solution {
    public int minMoves(int[] nums) {
        int n= nums.length;
        int max= Integer.MIN_VALUE;
        int d=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max= nums[i];
            d+= nums[i];
        }
        return n*max-d;
        
    }
}