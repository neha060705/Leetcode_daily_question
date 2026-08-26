class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left =0;
        int minlen = Integer.MAX_VALUE;
        int one =0;
        String min=s;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right) == '1'){
                one++;
            }
        while(one>=k){
            int len = right-left+1;
            String current = s.substring(left,right+1);
            if(len < minlen){
                minlen = len;
                min= current;
               
            }
            else if(len ==minlen && current.compareTo(min)<0){
                 min = current;

            }

            
            if(s.charAt(left)=='1'){
                    one--;
             }
            left++;
            }
            
        }
        if(minlen == Integer.MAX_VALUE ) return "";
        return min;
        
    }
   
}