public class Leetcode_1360 {
    public int daysBetweenDates(String date1, String date2) {
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int d1 = Integer.parseInt(date1.substring(8, 10));

        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int d2 = Integer.parseInt(date2.substring(8, 10));

        int days1 = daysFrom1971(y1, m1, d1);
        int days2 = daysFrom1971(y2, m2, d2);

        return Math.abs(days1 - days2);
    }

    private int daysFrom1971(int y, int m, int d) {
        int days = 0;
        for (int year = 1971; year < y; year++) {
            days += isLeapYear(year) ? 366 : 365;
        }
        for (int month = 1; month < m; month++) {
            days += validDaysInMonth(month, y);
        }
        days += d;
        return days;
    }

    private boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    private int validDaysInMonth(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m - 1];
    }

    private boolean validDate(int d, int m, int y) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > validDaysInMonth(m, y)) return false;
        return true;
    }
}
