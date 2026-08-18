class Solution {

    private boolean isLeap(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    private int daysFromStart(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int total = 0;

        // Count previous years
        for (int y = 1; y < year; y++) {
            total += isLeap(y) ? 366 : 365;
        }

        // Count previous months
        for (int m = 1; m < month; m++) {

            if (m == 2 && isLeap(year)) {
                total += 29;
            } else {
                total += daysInMonth[m - 1];
            }
        }

        // Count current month's days
        total += day;

        return total;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(
            daysFromStart(date1) - daysFromStart(date2)
        );
    }
}