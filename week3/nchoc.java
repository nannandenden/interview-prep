public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        PriorityQueue<Integer> chocolate = new PriorityQueue<>(A, Collections.reverseOrder());
        for(Integer num : B) {
            chocolate.offer(num);
        }
        long total = 0;
        for(int i = 0; i < A; i++) {
            long max = chocolate.poll();
            // modulo 10^9+7
            long mod = (long)(Math.pow(10, 9) + 7);
            total = (total + max) % mod;
            int next = (int)max/2;
            chocolate.offer(next);
        }
        return (int)total;
    }
}
