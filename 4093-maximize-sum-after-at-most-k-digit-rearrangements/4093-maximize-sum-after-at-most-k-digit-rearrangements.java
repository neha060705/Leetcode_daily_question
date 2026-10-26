class Solution {
    int maximize(int num){
        char[] d= String.valueOf(num).toCharArray();
        Arrays.sort(d);
        int result = 0;
        for(int i=d.length-1;i>=0;i--){
            result = result*10+(d[i]-'0');
        }
        return result;  
    }
    public long maximizeSum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        int[] cp= nums.clone();
        long[] gain= new long[n];
        for(int i=0;i<n;i++){
            sum += cp[i];
            int maxNum = maximize(nums[i]);
            gain[i]=(long) maxNum - cp[i];
        }
        Arrays.sort(gain);
        for(int i= n-1;i>=n-k;i--){
         sum+=gain[i];   
        }
        return sum;
          
            
       
    }
}