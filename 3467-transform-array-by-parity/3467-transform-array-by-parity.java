class Solution {
    public int[] transformArray(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                c++;
            }
            
        }
        int k=0;
       while(k<c){
            nums[k]=0;
            k++;
        }
        while(k<nums.length){
            nums[k]=1;
            k++;
        }
        return nums;
        
    }
}