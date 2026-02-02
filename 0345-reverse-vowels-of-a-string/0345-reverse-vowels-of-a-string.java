class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        int l=0,r=s.length()-1;
        char[] c=s.toCharArray();
        while(l<r){
            if(vowels.indexOf(c[l])==-1){
                l++;
            }
            else if(vowels.indexOf(c[r])==-1){
                r--;
            }
            else{
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
        }
        return new String(c);
    }
}