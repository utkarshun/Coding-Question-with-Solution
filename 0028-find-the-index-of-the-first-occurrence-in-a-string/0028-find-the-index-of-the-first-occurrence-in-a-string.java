class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
        if(needle.equals("")){
            return 0;
        }
        int i=0;
        int j=0;
        while(i<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i+=1;
                j+=1;
                if(j==n){
                    return i-j;
                }
            }
            else{
                i=i-j+1;
                j=0;
            }
        }
        return -1;
    }
}