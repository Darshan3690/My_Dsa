class Solution {

    int duration(int[] wei, int cap) {
        int day = 0;

        for (int i = 0; i < wei.length;) {
            int weig = 0;

            while (i < wei.length && weig + wei[i] <= cap) {
                weig += wei[i];
                i++;
            }

            day++;
        }

        return day;
    }

    public int shipWithinDays(int[] weights, int days) {

        int l = 0;
        int hi = 0;

        for (int w : weights) {
            l = Math.max(l, w);
            hi += w;
        }

        while (l <= hi) {

            int mid = l + (hi - l) / 2;

            if (duration(weights, mid) <= days) {
                hi = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}