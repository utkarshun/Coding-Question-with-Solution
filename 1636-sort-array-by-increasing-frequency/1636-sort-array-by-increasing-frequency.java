class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if (fa != fb) {
                return Integer.compare(fa, fb); // increasing frequency
            }
            return Integer.compare(b, a);       // decreasing value
        });

        for (int num : map.keySet()) {
            pq.offer(num);
        }

        int[] res = new int[nums.length];
        int idx = 0;

        while (!pq.isEmpty()) {
            int num = pq.poll();
            int count = map.get(num);
            while (count-- > 0) {
                res[idx++] = num;
            }
        }
        return res;
    }
}
