class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int sum =0;
        int  n= nums.size();
        for(int i=0;i<n;i++){
            HashSet<Integer> st = new HashSet<>();
            int s=0;
            for(int j=i;j<n;j++){
                st.add(nums.get(j));
                 s= st.size();
                 sum+= s*s;
                
            }
           
        }
        return sum;
        
    }

}