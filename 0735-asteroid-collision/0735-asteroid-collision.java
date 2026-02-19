class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            int a=asteroids[i];
            if(a>0) st.push(a);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(a)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(a);
                }
            }
        }
        int [] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}