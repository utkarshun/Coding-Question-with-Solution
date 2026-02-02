// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] temp=new int[26];
//         int r=ransomNote.length(),m=magazine.length();
//         int max=Math.max(m,r);
//         for(int i=0;i<max;i++){
//             if(i<m) temp[magazine.charAt(i)-'a']++;
//             if(i<r){
//                 if(--temp[ransomNote.charAt(i)-'a']<0) return false;
//             }        
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int idx=ransomNote.charAt(i)-'a';
            freq[idx]--;
            if(freq[idx]<0) return false;
        }
        return true;
    }
}
