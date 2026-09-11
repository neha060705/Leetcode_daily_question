class Solution {
    
    public int totalNumbers(int[] d) {
        HashSet<Integer> set = new HashSet<>();
        int n= d.length;
        for( int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || i==k || j==k) continue;
                    int f = d[i];
                    int s= d[j];
                    int t = d[k];
                    if(f ==0) continue;
                    if(t%2 !=0) continue;
                    int num = f*100+s*10+t;
                    set.add(num);
                }
            }
        }
        return set.size();
        
    }
}