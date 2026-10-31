class Solution {
    public int alternatingSum(int[] nums) {
        int oddsum=0;
        int evensum =0;
        for(int i=0;i<nums.length;i+=2){
            evensum+=nums[i];
            if(i+1<nums.length)
            oddsum+=nums[i+1];

        }
        return evensum-oddsum;
        
    }
}