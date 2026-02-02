class Solution {
    public int longestPalindrome(String s) {
        int[] lower=new int[26];
        int[] upper=new int[26];
        for(char c:s.toCharArray()){
            if(c>='a'){
                lower[c-'a']++;
            }
            else{
                upper[c-'A']++;
            } 
        }
        int count=0;
        boolean odd=false;
        for(int i=0;i<26;i++){
            if(lower[i]%2==0){
                count+=lower[i];
            }
            else{
                count+=lower[i]-1;
                odd=true;
            }
            if(upper[i]%2==0){
                count+=upper[i];
            }
            else{
                count+=upper[i]-1;
                odd=true;
            }
        }
        return count+(odd?1:0);
    }
}