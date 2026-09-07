class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        // int right= n;
        // int left=0;
        // int i=0;
        // while(left<n && right<nums.length){
        //     ans[i]=nums[left];
        //     left++;
        //     ans[i+1]=nums[right];
        //     right++;
        //     i+=2;

        // }
        return ans;

        
    }
}