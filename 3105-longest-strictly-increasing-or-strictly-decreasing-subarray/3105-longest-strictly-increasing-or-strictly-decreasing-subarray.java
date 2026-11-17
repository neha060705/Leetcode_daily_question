class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int c=1;
        int p=1;
        if(nums.length==1) return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++;
                p=1;
            }
            
            else if(nums[i]>nums[i-1]){
                p++;
                c=1;
            }
            else{
                c=1;
                p=1;
            }
            max= Math.max(max,Math.max(c,p));
            
        }
        return max;
    }
}