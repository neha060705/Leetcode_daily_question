class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans = new int[2];
        int n= num.length;
        int left = 0;
        int right= n-1;
        while(left < right){
            int sum = num[left]+num[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
           else if(sum == target){
                ans[0]=left+1;
                ans[1]= right+1;
                break;
            }
           
           
        }
        return ans;
        
    }
}