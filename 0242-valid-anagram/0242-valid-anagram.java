// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()) return false;
//         int []H=new int[26];
//         for(int i=0;i<s.length();i++){
//             H[s.charAt(i)-'a']++;
//             H[t.charAt(i)-'a']--;
//         }
//         for(int i=0;i<26;i++){
//             if(H[i]!=0) return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            freq[idx]--;
            if(freq[idx]<0) return false;
        }
        return true;
    }
}
