class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {

        int largest = Integer.MIN_VALUE;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int j = 0; j < points.length; j++) {

            // Jo points k distance se bahar hain unhe remove karo
            while (!dq.isEmpty() && points[j][0] - points[dq.peekFirst()][0] > k) {
                dq.pollFirst();
            }

            // Best previous point se answer calculate karo
            if (!dq.isEmpty()) {
                int i = dq.peekFirst();

                int sum = points[i][1] - points[i][0]
                       + points[j][1] + points[j][0];

                largest = Math.max(largest, sum);
            }

            // Deque ko decreasing (yi - xi) order me rakho
            while (!dq.isEmpty()
                    && points[dq.peekLast()][1] - points[dq.peekLast()][0]
                    <= points[j][1] - points[j][0]) {
                dq.pollLast();
            }

            dq.offerLast(j);
        }

        return largest;
    }
}