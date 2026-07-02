// STUDENT NAME: Rafael Castro
// DATE: 2 July 2026

public class Main {

    public static void main(String[] args) {

        int todayMonth = 2, todayDay = 2, todayYear = 2020;
        int bdayMonth = 8, bdayDay = 26, bdayYear = 1918;

        int jdnToday = calculateJDN(todayMonth, todayDay, todayYear);
        int jdnBirthday = calculateJDN(bdayMonth, bdayDay, bdayYear);

        int dayDifference = jdnToday - jdnBirthday;
        int approxAge = dayDifference / 365; // Integer division for age in years

        System.out.printf("Julian Day Number for today's date, %d/%d/%d, is %d%n%n",
                todayMonth, todayDay, todayYear, jdnToday);

        System.out.printf("Julian Day Number for birthday, %d/%d/%d, is %d%n%n",
                bdayMonth, bdayDay, bdayYear, jdnBirthday);

        System.out.printf("The difference in days is %d, which makes you approximately %d years old!%n",
                dayDifference, approxAge);
    }

    public static int calculateJDN(int month, int day, int year) {
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + (12 * a) - 3;

        int jdn = day + ((153 * m + 2) / 5) + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

        return jdn;
    }
}
