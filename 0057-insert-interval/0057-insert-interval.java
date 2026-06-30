class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();

        for (int[] curr : intervals) {

            // Case 1: Current interval ends before newInterval starts
            if (curr[1] < newInterval[0]) {
                ans.add(curr);
            }

            // Case 2: Current interval starts after newInterval ends
            else if (curr[0] > newInterval[1]) {
                ans.add(newInterval);
                newInterval = curr;
            }

            // Case 3: Intervals overlap, so merge them
            else {
                newInterval[0] = Math.min(newInterval[0], curr[0]);
                newInterval[1] = Math.max(newInterval[1], curr[1]);
            }
        }

        // Add the last pending interval
        ans.add(newInterval);

        // Convert List<int[]> to int[][]
        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}