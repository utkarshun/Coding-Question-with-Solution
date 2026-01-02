// class Solution {
//     public List<String> topKFrequent(String[] words, int k) {
//         Map<String,Integer>map=new HashMap<>();
//         for(String w:words){
//             map.put(w,map.getOrDefault(w,0)+1);
//         }
//         List<String>list=new ArrayList<>(map.keySet());
//         Collections.sort(list,(a,b)->{
//             if(map.get(a).equals(map.get(b)))
//                 return a.compareTo(b);
//             return map.get(b)-map.get(a);
//         });
//         return list.subList(0,k);

//     }
// }
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>freq=new HashMap<>();
        for(String w:words){
            freq.put(w,freq.getOrDefault(w,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            int fa = freq.get(a);
            int fb = freq.get(b);
            if(fa!=fb){
                return Integer.compare(fa,fb);
            }
            return b.compareTo(a);
        });
        for(String w:freq.keySet()){
            pq.offer(w);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String>res=new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}
