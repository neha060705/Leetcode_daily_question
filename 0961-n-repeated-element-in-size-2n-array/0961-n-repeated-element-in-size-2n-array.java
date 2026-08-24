class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]==nums[i+1] || nums[i]== nums[i+2]){
                return nums[i];
            }
        }
        return nums[n-1];
        // HashMap<Integer ,Integer> mp = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        // }        
        // for(int k : mp.keySet()){
        //     if(mp.get(k) > 1){
        //         return k;
        //     }
        // }
        // return 0;
    }
}