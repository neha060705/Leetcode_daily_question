class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        boolean arr[] = new boolean[order.length+1];
        for(int i=0;i<friends.length;i++){
            arr[friends[i]]= true;
        }
        int[] ans =new  int[friends.length];
        int k=0;
        for(int i: order){
            if(arr[i]==true){
                ans[k]=i;
                k++;
            }
        }
        return ans;

    }
}