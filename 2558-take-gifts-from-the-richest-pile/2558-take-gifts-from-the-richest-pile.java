class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int s:gifts){
            pq.add(s);
            sum+=s;
        }
        while(k-->0){
            int y=pq.poll();
            int removed=(int)Math.sqrt(y);
            sum=sum-y+removed;
            pq.add(removed);
            // k--;
        }
        return sum;
    }
}