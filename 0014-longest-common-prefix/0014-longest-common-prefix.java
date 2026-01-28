class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String low=strs[0];
        String high=strs[strs.length-1];
        StringBuilder str=new StringBuilder();
        int len=Math.min(low.length(),high.length());
        for(int i=0;i<len;i++){
            if(low.charAt(i)!=high.charAt(i)){
                break;
            }
            else{
                str.append(low.charAt(i));
            }
        }
        return new String(str);
    }
}