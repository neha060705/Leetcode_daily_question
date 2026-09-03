class Solution {
    public int[] pivotArray(int[] nums, int pivot){
        int n= nums.length;
        List<Integer> ls= new ArrayList<>();
        List<Integer> ps = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                 ls.add(nums[i]);
            }
            else if(nums[i]>pivot){
                ps.add(nums[i]);
            }
        }
        // int[] arr= new int[n];
        int psize=n-(ls.size()+ps.size());
        int k=0;
        while(k<ls.size()){
            nums[k]=ls.get(k);
            k++;
        }
        while(psize!=0){
            nums[k]=pivot;
            psize--;
            k++;
        }
        int i=0;
        while(i<ps.size()){
            nums[k]=ps.get(i);
            k++;
            i++;
        }

       return nums;
        
    }
}