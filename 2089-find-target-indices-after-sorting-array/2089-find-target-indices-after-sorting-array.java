class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        List<Integer> ls= new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ls.add(i);
        //     }
        // }
        // return ls;
        int c =0;
        int  l =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c++;
            }
            else if(nums[i]<target){
                l++;
            }
            
        }
        for(int i=0;i<c;i++){
            ls.add(l+i);
        }
        return ls;
    }
}