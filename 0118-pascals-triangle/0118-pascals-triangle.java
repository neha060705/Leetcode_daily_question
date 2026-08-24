class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int k=0;k<=i;k++){
                if(k==0 || k == i){
                    l.add(1);
                }
                else{
                    List<Integer> prev = ls.get(i-1);
                    l.add(prev.get(k-1)+prev.get(k));
                }
            }
            ls.add(l);
        }
        return ls;

    }
}