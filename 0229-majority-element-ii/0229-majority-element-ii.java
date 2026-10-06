class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        int n= nums.length;
        int t= (n/3)+1;
        for(int i=0;i<n;i++){
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
            if(m.get(nums[i])==t){
                ans.add(nums[i]);
            }
        }
        return ans;

    }
}