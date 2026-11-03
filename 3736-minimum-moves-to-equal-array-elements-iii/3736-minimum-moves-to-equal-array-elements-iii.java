class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int max= nums[n-1];
        int d=0;
        for(int i=0;i<n-1;i++){
            d+= max- nums[i];
        }
        return d;

        
    }
}