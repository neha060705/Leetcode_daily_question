class Solution {
    int sum(int a){
        int s= 0;
        while(a!=0){
            int x= a%10;
            s+=x;
            a=a/10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(i == sum(nums[i])){
                return i;
                
            }
        }

        return -1;
        
    }
}