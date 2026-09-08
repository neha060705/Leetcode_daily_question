class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000){
            return c;
        }
         c = n-1000;
        return c+1;
        
    }
}