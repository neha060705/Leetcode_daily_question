class Solution {
    public int reverseDegree(String s) {
        int n= s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int f= s.charAt(i)-'a';
            int r= 26-f;
            int l= i+1;
            sum += l*r;

        }
        return sum;
        
    }
}