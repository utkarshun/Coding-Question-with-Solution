class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int child=0;
        int cookie=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (child<n && cookie<m){
            if(s[cookie] >= g[child]){
                child+=1;
            }
            cookie+=1;
        }
        return child;
    }
}