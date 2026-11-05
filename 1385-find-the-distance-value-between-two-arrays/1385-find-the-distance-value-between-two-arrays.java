class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d){
        Arrays.sort(arr2);
        int c=0;
        for(int i=0;i<arr1.length;i++){
            int t=0;
            for(int j=0;j<arr2.length;j++){
                int diff= Math.abs(arr1[i]-arr2[j]);
                if(diff>d){
                     t++;
                     }
             }
            if(t==arr2.length){
                    c++;
                }
        }
        return c;
        
    }
}