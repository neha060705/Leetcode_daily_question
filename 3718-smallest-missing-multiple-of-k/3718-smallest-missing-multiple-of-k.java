class Solution {
    public int missingMultiple(int[] nums, int k) {
       Arrays.sort(nums);
       int n = nums.length;
       int t=k;
       int i=0;
       while(i<n){
        if(nums[i]==t){
            t+=k;
        }
        i++;
       }
       return t;


    }
}