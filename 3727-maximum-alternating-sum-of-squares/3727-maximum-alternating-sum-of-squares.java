class Solution {
    public long maxAlternatingSum(int[] nums) {
        long os=0;
        long es =0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        
        for(int i=0;i<n/2;i++){
            os+= nums[i]*nums[i];
        }
        for(int i=n/2 ;i<n;i++){
            es+= nums[i]*nums[i];
        }
        return es-os;
    }
}