class Solution {
    public boolean canAliceWin(int n) {
        int t=10;
        int c=0;
        while(n>=t){
            c++;
            n=n-t;
            t= t-1;
        }
        if(c%2==0) return false;
        return true;

    }
}