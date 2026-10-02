class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> ls= new ArrayList<>();
        long res=1;
        int n= r+1;
        ls.add((int)res);
        for(int i=1;i<n;i++){
            res= res*(n-i);
            res = res/i;
            ls.add((int)res);
        }
        return ls;

        
    }
}