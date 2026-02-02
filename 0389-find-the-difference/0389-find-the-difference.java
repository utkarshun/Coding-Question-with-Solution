class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            freq[idx]--;
            if(freq[idx]<0) return t.charAt(i);
        }
        return ' ';
    }
}
// class Solution {
//     public char findTheDifference(String s, String t) {
//         int xor=0;
//         for(char c:s.toCharArray()) xor^=c;
//         for(char c:t.toCharArray()) xor^=c;
//         return (char) xor;
//     }
// }