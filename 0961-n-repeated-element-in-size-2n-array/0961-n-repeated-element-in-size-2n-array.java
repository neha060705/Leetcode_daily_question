class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer ,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }        
        for(int k : mp.keySet()){
            if(mp.get(k) > 1){
                return k;
            }
        }
        return 0;
    }
}