class Solution {
    public String reversePrefix(String s, int k) {
        String rev="";
        for(int i=k-1;i>=0;i--){
           rev+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            rev+= s.charAt(i);
        }
        
        return rev;
    }
}