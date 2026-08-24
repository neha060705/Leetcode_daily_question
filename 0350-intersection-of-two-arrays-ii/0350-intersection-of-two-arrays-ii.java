class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int j=0;
        int i=0;
        List<Integer> ls= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n1 && j< n2){
            if(nums1[i]< nums2[j]){
                i++;
                
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ls.add(nums1[i]);
                i++;
                j++;
            }
           

        }
        int[] arr = new int[ls.size()];
        int k=0;
        for(int it: ls){
            arr[k] = it;
            k++;
        }
        return arr;
    }
}