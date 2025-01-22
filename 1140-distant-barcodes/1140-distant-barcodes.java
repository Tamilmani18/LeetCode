class Solution {
    
    class Pair {
        int val, count;
        Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
    
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : barcodes) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.count - a.count);
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));
        }
        int i = 0;
        int[] result = new int[barcodes.length];
        while (pq.size() >= 2) {
            Pair first = pq.poll();
            Pair second = pq.poll();
            result[i++] = first.val;
            if (first.count > 1) {
                pq.offer(new Pair(first.val, first.count - 1));
            }
            result[i++] = second.val;
            if (second.count > 1) {
                pq.offer(new Pair(second.val, second.count - 1));
            }
        }
        if (!pq.isEmpty()) result[i++] = pq.poll().val;
        return result;
    }
}
