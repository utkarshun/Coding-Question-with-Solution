// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length()!=t.length()) return false;
//     }
// }
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char duplicate=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(duplicate)){
                    map.put(original,duplicate);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedCharacter=map.get(original);
                if(mappedCharacter!=duplicate){
                    return false;
                }
            }
        }
        return true;
    }
}
