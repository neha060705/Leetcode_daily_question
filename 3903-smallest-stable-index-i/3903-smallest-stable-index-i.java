class Solution {
    int findmax(int[] a, int i, int j){
        int max= a[i];
        for(int k=i;k<=j;k++){
            max= Math.max(max, a[k]);

        }
        return max;
    }
    int findmin(int[] a, int i,int j){
        int min = a[i];
        for(int k=i;k<=j;k++){
            min = Math.min(min,a[k]);
        }
        return min;
    }
     public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            int max= findmax(nums,0,i);
            int min = findmin(nums,i,n-1);
            int c= max- min;
            if(c<=k){
                return i;

            }


        }
        return -1;

        
    }
}