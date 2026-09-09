class Solution {
    int countdigit(long n){
        int c =0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public long countCommas(long n) {
        int d =countdigit(n);
        if(d<=3) return 0;
        else if(d>=4 && d<=6 ) return n-1000+1;
        else if(d>=7 && d<= 9) return (999999L-1000)+1 +(n-1000000L+1)*2;
        else if(d>=10 && d<=12) return (999999L-1000)+1 +(999999999L-1000000L+1)*2 +(n-1000000000L+1)*3;
        else if(d>=13&& d<=15) return (999999L-1000)+1 +(999999999L-1000000L+1)*2+ (999999999999L-1000000000L+1)*3 +(n-1000000000000L+1)*4;
      
       else if(d >= 16 && d <= 18) return (999999L - 1000 + 1)
            + (999999999L - 1000000L + 1) * 2
            + (999999999999L - 1000000000L + 1) * 3
            + (999999999999999L - 1000000000000L + 1) * 4
            + (n - 1000000000000000L + 1) * 5;
return 0;
        
    }
}