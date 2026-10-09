class Solution {
    void subset(int idx , int[] arr, List<List<Integer>> ans , List<Integer> ds){
        if(idx==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        subset(idx+1, arr, ans, ds);
        ds.remove(ds.size()-1);
        subset(idx+1, arr, ans,ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        subset(0,nums, ans, new ArrayList<>());
        return ans;
    }
}