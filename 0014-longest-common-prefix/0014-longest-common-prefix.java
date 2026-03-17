class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String low=strs[0];
        String high=strs[strs.length-1];
        int len=Math.min(low.length(),high.length());
        StringBuilder st=new StringBuilder();
        for(int i=0;i<len;i++){
            if(low.charAt(i)!=high.charAt(i)){
                break;
            }
            else{
                st.append(low.charAt(i));
            }
        }
        return new String(st);
    }
}