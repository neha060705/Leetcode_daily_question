class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            char next = s.charAt(i+1);

            int c= (int)ch;
            int n = (int)next;
            sum+= Math.abs(ch-n);

        }
        return sum;
        
    }
}